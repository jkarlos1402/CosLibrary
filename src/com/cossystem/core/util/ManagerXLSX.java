package com.cossystem.core.util;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.CossException;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.pojos.catalogos.TblConfiguracionCossAdmin;
import com.monitorjbl.xlsx.StreamingReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.hibernate.ScrollableResults;

public class ManagerXLSX {

    public static String generaArchivoExcel(Class claseEntidad, Map filtros, String rutaDestino) throws DAOException {
        GenericDAO genericDAO = null;
        SXSSFWorkbook workBook = new SXSSFWorkbook();
        workBook.setCompressTempFiles(true);
        FileOutputStream out = null;
        String nombreArchivoSalida = "";
        File directorioBase;
        try {
            genericDAO = new GenericDAO();
            List<TblConfiguracionCossAdmin> configuracion = obtieneConfiguracion(claseEntidad);
            ScrollableResults results = genericDAO.findByComponents(claseEntidad, filtros, 200);
            creaHojaExcel(workBook, claseEntidad, results, configuracion);
            directorioBase = new File(rutaDestino);
            if (!directorioBase.isDirectory()) {
                directorioBase.mkdirs();
            }
            nombreArchivoSalida = "tempsxssf" + Calendar.getInstance().getTime().getTime() + ".xlsx";
            out = new FileOutputStream(rutaDestino + File.separator + nombreArchivoSalida);
            workBook.write(out);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DataBaseException | CossException ex) {
            Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    throw new DAOException(ex.getMessage());
                }
            }
        }
        return nombreArchivoSalida;
    }

    private static void creaHojaExcel(SXSSFWorkbook workBook, Class claseEntidad, ScrollableResults results, List<TblConfiguracionCossAdmin> configuracion) throws CossException {
        Field[] camposClase = claseEntidad.getDeclaredFields();
        List<Field> camposColumnas = new ArrayList<>();
        List<Method> metodosColumnas = new ArrayList<>();
        List<String> encabezadosHoja;
        List<Field> camposRelaciones = new ArrayList<>();
        List<Method> metodosRelaciones = new ArrayList<>();
        List<Field> camposManyToOne = new ArrayList<>();
        List<Method> metodosManyToOne = new ArrayList<>();
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        String nombreTablaRelacion;
        SXSSFSheet sheet = workBook.createSheet(nombreTabla);
        sheet.setRandomAccessWindowSize(200);
        Row row;
        Cell cell;
        Class<?> listClass = null;
        encabezadosHoja = obtieneDescripcionEncabezados(claseEntidad, configuracion);
        SXSSFSheet sheetRelacion;
        if (encabezadosHoja != null && !encabezadosHoja.isEmpty()) {
            row = sheet.createRow(sheet.getLastRowNum());
            for (String encabezado : encabezadosHoja) {
                cell = row.createCell(row.getLastCellNum() != -1 ? row.getLastCellNum() : 0);
                cell.setCellValue(encabezado);
            }
        }
        for (Field campo : camposClase) {
            if (campo.isAnnotationPresent(OneToMany.class)) {
                listClass = obtieneTipoListaDeCampo(campo);
                nombreTablaRelacion = ((Table) listClass.getAnnotation(Table.class)).name();
            } else {
                nombreTablaRelacion = null;
            }
            if (nombreTablaRelacion != null) {
                sheetRelacion = workBook.getSheet(nombreTablaRelacion);
                if (sheetRelacion == null) {
                    sheetRelacion = workBook.createSheet(nombreTablaRelacion);
                    sheetRelacion.setRandomAccessWindowSize(200);
                    encabezadosHoja = obtieneDescripcionEncabezados(listClass, configuracion);
                    if (encabezadosHoja != null && !encabezadosHoja.isEmpty()) {
                        row = sheetRelacion.createRow(sheetRelacion.getLastRowNum());
                        for (String encabezado : encabezadosHoja) {
                            cell = row.createCell(row.getLastCellNum() != -1 ? row.getLastCellNum() : 0);
                            cell.setCellValue(encabezado);
                        }
                    }
                }
            }
        }
        if (encabezadosHoja != null && !encabezadosHoja.isEmpty()) {
            Class claseColumna;
            CreationHelper createHelper = workBook.getCreationHelper();
            CellStyle cellStyleFecha = workBook.createCellStyle();
            cellStyleFecha.setDataFormat(createHelper.createDataFormat().getFormat("dd/MM/yyyy"));
            CellStyle cellStyleFechaHora = workBook.createCellStyle();
            cellStyleFechaHora.setDataFormat(createHelper.createDataFormat().getFormat("dd/MM/yyyy  HH:mm:ss"));
            obtieneCamposMetodosColumnas(claseEntidad, configuracion, metodosColumnas, camposColumnas);
            while (results.next()) {
                row = sheet.createRow(sheet.getLastRowNum() + 1);
                for (int i = 0; i < metodosColumnas.size(); i++) {
                    try {
                        if (camposColumnas.get(i).isAnnotationPresent(ManyToOne.class) || camposColumnas.get(i).isAnnotationPresent(OneToOne.class)) {
                            cell = row.createCell(i);
                            obtieneCamposMetodosColumnas(camposColumnas.get(i).getType(), metodosManyToOne, camposManyToOne, true);
                            for (int j = 0; j < camposManyToOne.size(); j++) {
                                if (camposManyToOne.get(j).isAnnotationPresent(Id.class)) {
                                    cell.setCellValue(Double.parseDouble(metodosManyToOne.get(j).invoke(metodosColumnas.get(i).invoke(results.get(0))).toString()));
                                    break;
                                }
                            }
                        } else if (camposColumnas.get(i).isAnnotationPresent(Column.class)) {
                            cell = row.createCell(i);
                            claseColumna = camposColumnas.get(i).getType();
                            if (Date.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue((Date) metodosColumnas.get(i).invoke(results.get(0)));
                                if (((Temporal) camposColumnas.get(i).getAnnotation(Temporal.class)).value().equals(TemporalType.DATE)) {
                                    cell.setCellStyle(cellStyleFecha);
                                } else {
                                    cell.setCellStyle(cellStyleFechaHora);
                                }
                            } else if (String.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue((String) metodosColumnas.get(i).invoke(results.get(0)));
                            } else if (Boolean.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue((Boolean) metodosColumnas.get(i).invoke(results.get(0)) ? 1 : 0);
                            } else if (double.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue((double) metodosColumnas.get(i).invoke(results.get(0)));
                            } else if (Number.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue(new Double(metodosColumnas.get(i).invoke(results.get(0)).toString()));
                            }
                        } else if (camposColumnas.get(i).isAnnotationPresent(OneToMany.class)) {
                            listClass = obtieneTipoListaDeCampo(camposColumnas.get(i));
                            nombreTablaRelacion = ((Table) listClass.getAnnotation(Table.class)).name();
                            sheetRelacion = workBook.getSheet(nombreTablaRelacion);
                            List<?> registrosRelacion = (List<?>) metodosColumnas.get(i).invoke(results.get(0));
                            metodosRelaciones.clear();
                            camposRelaciones.clear();
                            obtieneCamposMetodosColumnas(listClass, configuracion, metodosRelaciones, camposRelaciones);
                            for (Object relacion : registrosRelacion) {
                                row = sheetRelacion.createRow(sheetRelacion.getLastRowNum() + 1);
                                for (int j = 0; j < metodosRelaciones.size(); j++) {
                                    cell = row.createCell(j);
                                    try {
                                        if (camposRelaciones.get(j).isAnnotationPresent(ManyToOne.class) || camposRelaciones.get(j).isAnnotationPresent(OneToOne.class)) {
                                            obtieneCamposMetodosColumnas(camposRelaciones.get(j).getType(), metodosManyToOne, camposManyToOne, true);
                                            for (int k = 0; k < camposManyToOne.size(); k++) {
                                                if (camposManyToOne.get(k).isAnnotationPresent(Id.class)) {
                                                    cell.setCellValue(Double.parseDouble(metodosManyToOne.get(k).invoke(metodosRelaciones.get(j).invoke(relacion)).toString()));
                                                    break;
                                                }
                                            }
                                        } else if (camposRelaciones.get(j).isAnnotationPresent(Column.class)) {
                                            claseColumna = camposRelaciones.get(j).getType();
                                            if (Date.class.isAssignableFrom(claseColumna)) {
                                                cell.setCellValue((Date) metodosRelaciones.get(j).invoke(relacion));
                                                if (((Temporal) camposRelaciones.get(j).getAnnotation(Temporal.class)).value().equals(TemporalType.DATE)) {
                                                    cell.setCellStyle(cellStyleFecha);
                                                } else {
                                                    cell.setCellStyle(cellStyleFechaHora);
                                                }
                                            } else if (String.class.isAssignableFrom(claseColumna)) {
                                                cell.setCellValue((String) metodosRelaciones.get(j).invoke(relacion));
                                            } else if (Boolean.class.isAssignableFrom(claseColumna)) {
                                                cell.setCellValue((Boolean) metodosRelaciones.get(j).invoke(relacion) ? 1 : 0);
                                            } else if (double.class.isAssignableFrom(claseColumna)) {
                                                cell.setCellValue((double) metodosRelaciones.get(j).invoke(relacion));
                                            } else if (Number.class.isAssignableFrom(claseColumna)) {
                                                cell.setCellValue(new Double(metodosRelaciones.get(j).invoke(relacion).toString()));
                                            }
                                        }
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NullPointerException ex) {
                                        //no hacer nada
                                    }
                                }
                            }
                        }
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NullPointerException ex) {
                        // no hacer nada
                    }
                }
            }
        }
    }

    private static List<String> obtieneDescripcionEncabezados(Class claseEntidad, List<TblConfiguracionCossAdmin> configuracion) {
        List<String> encabezados = new ArrayList<>();
        Field[] camposClase = claseEntidad.getDeclaredFields();
        String nombreCampoTabla;
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        for (TblConfiguracionCossAdmin config : configuracion) {
            if (config.getNTabla().equalsIgnoreCase(nombreTabla)) {
                for (Field campo : camposClase) {
                    if (campo.isAnnotationPresent(Column.class)) {
                        nombreCampoTabla = ((Column) campo.getAnnotation(Column.class)).name();
                    } else if (campo.isAnnotationPresent(JoinColumn.class)) {
                        nombreCampoTabla = ((JoinColumn) campo.getAnnotation(JoinColumn.class)).name();
                    } else {
                        nombreCampoTabla = null;
                    }
                    if (nombreCampoTabla != null && config.getNColumna().equalsIgnoreCase(nombreCampoTabla) && config.getDescargaExcel()) {
                        encabezados.add(config.getDescripcion());
                        break;
                    }
                }
            }
        }
        return encabezados;
    }

    private static void obtieneCamposMetodosColumnas(Class claseEntidad, List<Method> metodos, List<Field> campos, boolean get) {
        metodos.clear();
        campos.clear();
        Field[] camposClase = claseEntidad.getDeclaredFields();
        Method[] metodosClase = claseEntidad.getDeclaredMethods();
        String nombreCampoTabla;
        String pre = get ? "get" : "set";
        for (Field campo : camposClase) {
            if (campo.isAnnotationPresent(Column.class)) {
                nombreCampoTabla = ((Column) campo.getAnnotation(Column.class)).name();
            } else if (campo.isAnnotationPresent(JoinColumn.class)) {
                nombreCampoTabla = ((JoinColumn) campo.getAnnotation(JoinColumn.class)).name();
            } else {
                nombreCampoTabla = null;
            }
            if (nombreCampoTabla != null) {
                for (Method method : metodosClase) {
                    if (method.getName().equalsIgnoreCase(pre + campo.getName())) {
                        metodos.add(method);
                        campos.add(campo);
                        break;
                    }
                }
            }
        }
    }

    private static void obtieneCamposMetodosColumnas(Class claseEntidad, List<TblConfiguracionCossAdmin> configuracion, List<Method> metodos, List<Field> campos) {
        metodos.clear();
        campos.clear();
        Field[] camposClase = claseEntidad.getDeclaredFields();
        Method[] metodosClase = claseEntidad.getDeclaredMethods();
        String nombreCampoTabla;
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        for (TblConfiguracionCossAdmin config : configuracion) {
            if (config.getNTabla().equalsIgnoreCase(nombreTabla)) {
                campoLabel:
                for (Field campo : camposClase) {
                    if (campo.isAnnotationPresent(Column.class)) {
                        nombreCampoTabla = ((Column) campo.getAnnotation(Column.class)).name();
                    } else if (campo.isAnnotationPresent(JoinColumn.class)) {
                        nombreCampoTabla = ((JoinColumn) campo.getAnnotation(JoinColumn.class)).name();
                    } else {
                        nombreCampoTabla = null;
                    }
                    if (nombreCampoTabla != null && config.getNColumna().equalsIgnoreCase(nombreCampoTabla) && config.getDescargaExcel()) {
                        for (Method method : metodosClase) {
                            if (method.getName().equalsIgnoreCase("get" + campo.getName())) {
                                metodos.add(method);
                                campos.add(campo);
                                break campoLabel;
                            }
                        }
                    }
                }
            }
        }
        for (Field campo : camposClase) {
            if (campo.isAnnotationPresent(OneToMany.class)) {
                for (Method method : metodosClase) {
                    if (method.getName().equalsIgnoreCase("get" + campo.getName())) {
                        metodos.add(method);
                        campos.add(campo);
                        break;
                    }
                }
            }
        }
    }

    public static void cargaCatalogoExcel(Class claseEntidad, InputStream archivoCargado) throws IOException {
        List<TblConfiguracionCossAdmin> configuracion = null;
        Field[] camposClaseEntidad = claseEntidad != null ? claseEntidad.getDeclaredFields() : null;
        List<String> nombreHojasRelacion;
        List<Class> clasesRelacion;
        List<Field> camposColumnas = new ArrayList<>();
        List<Method> metodosColumnas = new ArrayList<>();
        List<Integer> indicesMetodos = new ArrayList<>();
        List<Field> camposRelaciones = new ArrayList<>();
        List<Method> metodosRelaciones = new ArrayList<>();
        List<Integer> indicesMetodosRelaciones = new ArrayList<>();
        String nombreHoja = null;
        Sheet sheet;
        Cell celdaExcel;
        Method metodo;
        List<String> encabezados = new ArrayList<>();
        List<String> encabezadosRelacion = new ArrayList<>();
        String nombreTabla = claseEntidad != null ? ((Table) claseEntidad.getAnnotation(Table.class)).name() : null;
        if (camposClaseEntidad != null) {
            configuracion = obtieneConfiguracion(claseEntidad);
            nombreHojasRelacion = new ArrayList<>();
            clasesRelacion = new ArrayList<>();
            if (claseEntidad != null && claseEntidad.isAnnotationPresent(Table.class)) {
                nombreHoja = (((Table) claseEntidad.getAnnotation(Table.class)).name());
            }
            for (Field field : camposClaseEntidad) {
                if (field.isAnnotationPresent(OneToMany.class)) {
                    nombreHojasRelacion.add(((Table) obtieneTipoListaDeCampo(field).getAnnotation(Table.class)).name());
                    clasesRelacion.add(obtieneTipoListaDeCampo(field));
                }
            }
        }
        try (Workbook workbook = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(archivoCargado)) {
            if (nombreHoja != null && nombreHoja.length() > 31) {
                nombreHoja = nombreHoja.substring(0, 31);
            }
            try {
                sheet = workbook.getSheet(nombreHoja);
                obtieneCamposMetodosColumnas(claseEntidad, metodosColumnas, camposColumnas, false);
                int contadorRow = 0;
                for (Row row : sheet) {
                    if (contadorRow == 0) {
                        for (Cell cell : row) {
                            if (cell.getCellType() == Cell.CELL_TYPE_STRING && cell.getStringCellValue() != null && !"".equals(cell.getStringCellValue().trim())) {
                                encabezados.add(cell.getStringCellValue().trim());
                                labelMetodo:
                                for (TblConfiguracionCossAdmin config : configuracion) {
                                    if (config.getNTabla().equalsIgnoreCase(nombreTabla) && config.getDescripcion().trim().equalsIgnoreCase(cell.getStringCellValue().trim())) {
                                        for (int i = 0; i < camposColumnas.size(); i++) {
                                            if (camposColumnas.get(i).isAnnotationPresent(JoinColumn.class) && ((JoinColumn) camposColumnas.get(i).getAnnotation(JoinColumn.class)).name().equalsIgnoreCase(config.getNColumna())) {
                                                indicesMetodos.add(i);
                                                break labelMetodo;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        contadorRow++;
                    } else {
                        for (int i = 0; i < row.getLastCellNum() - 1; i++) {
                            celdaExcel = row.getCell(i);
                            metodo = metodosColumnas.get(i);
                           
                            System.out.println("clase parametro:"+camposColumnas.get(i).getType().getName());
                        }
                        break;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                sheet = null;
            }

        }
//        try (Workbook workbook = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(archivoCargado)) {
//            for (Sheet sheet : workbook) {
//                System.out.println("nombre hoja: " + sheet.getSheetName());
//                int contador = 0;
//                for (Row row : sheet) {
//                    contador++;
//                }
//                System.out.println("la hoja " + sheet.getSheetName() + " tiene " + contador + " numero de renglones");
//            }
//            System.out.println("termino de recorrer archivo");
//        }
    }

    private static List<TblConfiguracionCossAdmin> obtieneConfiguracion(Class claseEntidad) {
        GenericDAO genericDAO = null;
        List<TblConfiguracionCossAdmin> configuracion = null;
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        try {
            genericDAO = new GenericDAO();
            configuracion = genericDAO.findByQuery(TblConfiguracionCossAdmin.class, "select c from TblConfiguracionCossAdmin c where c.tablaPadre = '" + nombreTabla + "' order by c.nTabla,c.idColumna asc");
        } catch (DataBaseException | DAOException ex) {
            Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
        }
        return configuracion;
    }

    private static Class obtieneTipoListaDeCampo(Field campoLista) {
        ParameterizedType listType = campoLista != null ? (ParameterizedType) campoLista.getGenericType() : null;
        Class<?> listClass = listType != null ? (Class<?>) listType.getActualTypeArguments()[0] : null;
        return listClass;
    }
}
