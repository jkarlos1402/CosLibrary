package com.cossystem.core.util;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.CossException;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.pojos.TblAccesoPantallas;
import com.cossystem.core.pojos.TblAccesoPantallasCampos;
import com.monitorjbl.xlsx.StreamingReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
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
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.hibernate.ScrollableResults;
import org.hibernate.StaleStateException;
import org.hibernate.Transaction;
import org.hibernate.TransientObjectException;
import org.hibernate.exception.ConstraintViolationException;

public class ManagerXLSX {

    public static String generaArchivoExcel(Class claseEntidad, Class claseDAOEntidad, List<Filtro> filtros, String rutaDestino, TblAccesoPantallas menu, Properties propiedades) throws DAOException, CossException {
        GenericDAO genericDAO = null;
        SXSSFWorkbook workBook = new SXSSFWorkbook();
        workBook.setCompressTempFiles(true);
        FileOutputStream out = null;
        String nombreArchivoSalida = "";
        File directorioBase;
        try {
            if (claseDAOEntidad != null) {
                genericDAO = (GenericDAO) claseDAOEntidad.newInstance();
            } else {
                genericDAO = new GenericDAO();
            }
            List<TblAccesoPantallasCampos> configuracion = Configuracion.obtieneConfiguracion(claseEntidad);
            System.out.println("clase para excel: " + claseEntidad.getName());
            System.out.println("filtros: " + filtros.size());
            ScrollableResults results = genericDAO.findByComponents(claseEntidad, filtros, 200);
            creaHojaExcel(workBook, claseEntidad, results, configuracion, menu, filtros, propiedades);
            directorioBase = new File(rutaDestino);
            if (!directorioBase.isDirectory()) {
                directorioBase.mkdirs();
            }
            nombreArchivoSalida = "tempsxssf" + Calendar.getInstance().getTime().getTime() + ".xlsx";
            out = new FileOutputStream(rutaDestino + File.separator + nombreArchivoSalida);
            workBook.write(out);
        } catch (IOException ex) {
            throw new CossException(ex.getMessage());
        } catch (DataBaseException | CossException | InstantiationException | IllegalAccessException ex) {
            throw new CossException(ex.getMessage());
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

    private static void creaHojaExcel(SXSSFWorkbook workBook, Class claseEntidad, ScrollableResults results, List<TblAccesoPantallasCampos> configuracion, TblAccesoPantallas menu, List<Filtro> filtros, Properties propiedades) throws CossException {
        Field[] camposClase = claseEntidad.getDeclaredFields();
        List<Field> camposColumnas = new ArrayList<>();
        List<Method> metodosColumnas = new ArrayList<>();
        List<String> encabezadosHoja;
        List<String> encabezadosHojaRelacion;
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
        Map<String, List<TblAccesoPantallasCampos>> configuracionRelaciones = new TreeMap<>();
        encabezadosHoja = obtieneDescripcionEncabezados(claseEntidad, configuracion);
        SXSSFSheet sheetRelacion;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int contadorRow = 0;
        if (encabezadosHoja != null && !encabezadosHoja.isEmpty()) {
//            row = sheet.createRow(sheet.getLastRowNum());
//            cell = row.createCell(encabezadosHoja.size() / 2);
//            cell.setCellValue(menu.getTituloExcel());
//            row = sheet.createRow(sheet.getLastRowNum());
//            cell = row.createCell(0);
//            if (filtros != null && !filtros.isEmpty()) {
//                cell.setCellValue("Filtros:");
//                if(filtros.size() == 1 && (filtros.get(0).getComparador() == null || "".equals(filtros.get(0).getComparador().trim()))){
//                    cell = row.createCell(row.getLastCellNum());
//                    cell.setCellValue("*Todos los registros");
//                }
//                for (Filtro filtro : filtros) {
//                    if (filtro.getComparador() != null && !"".equals(filtro.getComparador().trim())) {
//                        cell = row.createCell(row.getLastCellNum());
//                        if (filtro.isCampoFecha()) {
//                            sdf = new SimpleDateFormat(filtro.getConfCampo() != null && filtro.getConfCampo().getFormatoCampo() != null && !"".equals(filtro.getConfCampo().getFormatoCampo().trim()) ? filtro.getConfCampo().getFormatoCampo().trim() : "dd/MM/yyyy");
//                        }
//                        String valorFiltro = filtro.isCampoString() ? filtro.getValorString() : filtro.isCampoNumerico() ? filtro.getValorNumerico() + "" : filtro.isCampoFecha() ? sdf.format(filtro.getValorFecha()) : filtro.isCampoBooleano() ? (filtro.getValorBooleano().equalsIgnoreCase("true") ? "1" : "0") : filtro.isCampoCatalogo() ? filtro.getValorCatalogo().toString() : "";
//                        if (filtro.isIntervalo()) {
//                            valorFiltro += " - ";
//                            valorFiltro += filtro.isCampoNumerico() ? filtro.getValorNumericoFinal() : filtro.isCampoFecha() ? sdf.format(filtro.getValorFechaFinal()) : "";
//                        }
//                        cell.setCellValue(filtro.getDescCampo() + " " + filtro.getComparador() + " " + valorFiltro);
//                    }
//                }
//            }
            int indexRowInicio = propiedades != null && propiedades.containsKey("rowInicioExcel") ? Integer.parseInt(propiedades.getProperty("rowInicioExcel")) : 0;
            row = sheet.createRow(sheet.getLastRowNum());// agregra +1 cuando si hay titulo y filtros
            while (contadorRow < indexRowInicio) {
                row = sheet.createRow(sheet.getLastRowNum() + 1);
                contadorRow++;
            }
            for (String encabezado : encabezadosHoja) {
                cell = row.createCell(row.getLastCellNum() != -1 ? row.getLastCellNum() : 0);
                cell.setCellValue(encabezado);
            }
        }
        for (Field campo : camposClase) {
            if (campo.isAnnotationPresent(OneToMany.class)) {
                listClass = obtieneTipoListaDeCampo(campo);
                configuracionRelaciones.put(listClass.getSimpleName(), Configuracion.obtieneConfiguracion(listClass));
                nombreTablaRelacion = ((Table) listClass.getAnnotation(Table.class)).name();
            } else {
                nombreTablaRelacion = null;
            }
            if (nombreTablaRelacion != null) {
                sheetRelacion = workBook.getSheet(nombreTablaRelacion);
                if (sheetRelacion == null) {
                    sheetRelacion = workBook.createSheet(nombreTablaRelacion);
                    sheetRelacion.setRandomAccessWindowSize(200);
                    encabezadosHojaRelacion = obtieneDescripcionEncabezados(listClass, configuracionRelaciones.get(listClass.getSimpleName()));
                    if (encabezadosHojaRelacion != null && !encabezadosHojaRelacion.isEmpty()) {
                        row = sheetRelacion.createRow(sheetRelacion.getLastRowNum());
                        for (String encabezado : encabezadosHojaRelacion) {
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
                            obtieneCamposMetodosColumnas(listClass, configuracionRelaciones.get(listClass.getSimpleName()), metodosRelaciones, camposRelaciones);
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

    private static List<String> obtieneDescripcionEncabezados(Class claseEntidad, List<TblAccesoPantallasCampos> configuracion) {
        List<String> encabezados = new ArrayList<>();
        Field[] camposClase = claseEntidad.getDeclaredFields();
        String nombreCampoTabla;
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        for (TblAccesoPantallasCampos config : configuracion) {
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
                        if (campo.isAnnotationPresent(Id.class)) {
                            Method metodoTemp;
                            Field campoTemp;
                            if (!metodos.isEmpty()) {
                                metodoTemp = metodos.get(0);
                                campoTemp = campos.get(0);
                                metodos.set(0, method);
                                campos.set(0, campo);
                                metodos.add(metodoTemp);
                                campos.add(campoTemp);
                            } else {
                                metodos.add(method);
                                campos.add(campo);
                            }
                        } else {
                            metodos.add(method);
                            campos.add(campo);
                        }
                        break;
                    }
                }
            }
        }
    }

    private static void obtieneCamposMetodosColumnas(Class claseEntidad, List<TblAccesoPantallasCampos> configuracion, List<Method> metodos, List<Field> campos) {
        metodos.clear();
        campos.clear();
        Field[] camposClase = claseEntidad.getDeclaredFields();
        Method[] metodosClase = claseEntidad.getDeclaredMethods();
        String nombreCampoTabla;
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        for (TblAccesoPantallasCampos config : configuracion) {
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

    public static void cargaCatalogoExcel(Class claseEntidad, String pathFile, String paqueteDao, Integer indexRowInicial) throws CossException, IOException {
        List<TblAccesoPantallasCampos> configuracion = null;
        Map<String, List<TblAccesoPantallasCampos>> configuracionRelaciones = new TreeMap<>();
        Map<String, String> nombreCampoRelacionClase = new TreeMap<>();
        //Class claseEntidadTemp;
        Field[] camposClaseEntidad = claseEntidad != null ? claseEntidad.getDeclaredFields() : null;
        List<String> nombreHojasRelacion = null;
        List<Class> clasesRelacion = null;
        List<Field> camposColumnas = new ArrayList<>();
        List<Method> metodosColumnas = new ArrayList<>();
        List<Integer> indicesColumnas = new ArrayList<>();
        List<Field> camposRelaciones = new ArrayList<>();
        List<Method> metodosRelaciones = new ArrayList<>();
        List<Integer> indicesColumnasRelaciones = new ArrayList<>();
        String nombreHoja = null;
        Sheet sheet;
        Sheet sheetRelacion;
        Cell celdaExcel;
        Method metodo;
        Method metodoId = null;
        Integer idABuscar = null;
        Integer idRelacion = null;
        String nuevoABuscar;
//        String nombreColumnaId = null;
        Class claseDAO = null;
        Class claseRelacion = null;
        GenericDAO genericDAO = null;
        Transaction transaction = null;
        boolean bndRelacion;
        boolean bndEliminar;
        int contadorBatch = 0;
        Object objEntidad = null;
        Object objEntidadRelacion = null;
        String nombreTablaRelacion;
        String nombreTabla = claseEntidad != null ? ((Table) claseEntidad.getAnnotation(Table.class)).name() : null;
        nombreHoja = (((Table) claseEntidad.getAnnotation(Table.class)).name());
//        try {
//            configuracion = Configuracion.obtieneConfiguracion(claseEntidad);
//            if (claseEntidad != null && claseEntidad.isAnnotationPresent(Table.class)) {
//                nombreHoja = (((Table) claseEntidad.getAnnotation(Table.class)).name());
//                nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
//                claseEntidadTemp = Class.forName(claseEntidad.getName() + "Temp");
//                claseEntidad = claseEntidadTemp;
//            }
//        } catch (ClassNotFoundException | AuxiliarException ex) {
//            //nothing
//        }
        if (camposClaseEntidad != null) {
            nombreHojasRelacion = new ArrayList<>();
            clasesRelacion = new ArrayList<>();
            configuracion = Configuracion.obtieneConfiguracion(claseEntidad);
            for (Field field : camposClaseEntidad) {
                if (field.isAnnotationPresent(OneToMany.class)) {
                    nombreHojasRelacion.add(((Table) obtieneTipoListaDeCampo(field).getAnnotation(Table.class)).name());
                    claseRelacion = obtieneTipoListaDeCampo(field);
                    clasesRelacion.add(claseRelacion);
                    configuracionRelaciones.put(claseRelacion.getSimpleName(), Configuracion.obtieneConfiguracion(claseRelacion));
                    nombreCampoRelacionClase.put(claseRelacion.getSimpleName(), ((OneToMany) field.getAnnotation(OneToMany.class)).mappedBy());
                }
            }
        }
        InputStream stream = new FileInputStream(pathFile);
        try (Workbook workbook = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(stream)) {
            if (nombreHoja != null && nombreHoja.length() > 31) {
                nombreHoja = nombreHoja.substring(0, 31);
            }
            try {
                sheet = workbook.getSheet(nombreHoja);
                obtieneCamposMetodosColumnas(claseEntidad, metodosColumnas, camposColumnas, false);
                for (int i = 0; i < camposColumnas.size(); i++) {
                    if (camposColumnas.get(i).isAnnotationPresent(Id.class)) {
                        claseDAO = Class.forName(paqueteDao + "." + claseEntidad.getSimpleName() + "DAO");
                        break;
                    }
                }
                if (claseDAO != null) {
                    genericDAO = (GenericDAO) claseDAO.newInstance();
                } else {
                    genericDAO = new GenericDAO();
                }
                transaction = genericDAO.getSession().beginTransaction();
                Integer indexColumnaExcelId = null;
                for (Row row : sheet) {
                    if (row.getRowNum() == indexRowInicial) {
                        for (int i = 0; i < camposColumnas.size(); i++) {
                            indicesColumnas.add(null);
                        }
                        labelColumna:
                        for (Cell cell : row) {
                            if (cell.getCellType() == Cell.CELL_TYPE_STRING && cell.getStringCellValue() != null && !"".equals(cell.getStringCellValue().trim())) {
                                for (TblAccesoPantallasCampos config : configuracion) {
                                    if (config.getNTabla().equalsIgnoreCase(nombreTabla) && config.getDescripcion().trim().equalsIgnoreCase(cell.getStringCellValue().trim())) {
                                        for (int i = 0; i < camposColumnas.size(); i++) {
                                            if ((camposColumnas.get(i).isAnnotationPresent(JoinColumn.class) && ((JoinColumn) camposColumnas.get(i).getAnnotation(JoinColumn.class)).name().equalsIgnoreCase(config.getNColumna()))
                                                    || (camposColumnas.get(i).isAnnotationPresent(Column.class) && ((Column) camposColumnas.get(i).getAnnotation(Column.class)).name().equalsIgnoreCase(config.getNColumna()))) {
                                                indicesColumnas.set(i, cell.getColumnIndex());
                                                if (camposColumnas.get(i).isAnnotationPresent(Id.class)) {
                                                    indexColumnaExcelId = cell.getColumnIndex();
                                                }
                                                continue labelColumna;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (row.getRowNum() > indexRowInicial) {
                        if (indicesColumnas.isEmpty()) {
                            throw new IllegalArgumentException("Hoja no v\u00e1lida, encabezados err\u00f3neos");
                        }
                        nuevoABuscar = null;
                        bndEliminar = false;
                        objEntidad = claseEntidad.newInstance();
                        celdaExcel = row.getCell(indexColumnaExcelId);
                        for (int i = 0; i < indicesColumnas.size(); i++) {
                            if (camposColumnas.get(i).isAnnotationPresent(Id.class)) {
                                metodoId = metodosColumnas.get(i);
                                if (celdaExcel.getCellType() == Cell.CELL_TYPE_STRING) {
                                    if (celdaExcel.getStringCellValue().trim().matches("[Nn].*")) {
                                        nuevoABuscar = celdaExcel.getStringCellValue().trim();
                                        break;
                                    } else {
                                        idABuscar = Integer.parseInt(celdaExcel.getStringCellValue().trim());
                                        if (idABuscar < 0) {
                                            idABuscar = Math.abs(idABuscar);
                                            bndEliminar = true;
                                        }
                                        //metodoId.invoke(objEntidad, idABuscar);
                                        objEntidad = genericDAO.findById(claseEntidad, idABuscar); // para mantener los campos no incluidos en el excel descomentar esta linea, de lo contrario se colocara null en los campos no incluidos en el excel
                                        break;
                                    }
                                } else if (celdaExcel.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                                    if (celdaExcel.getNumericCellValue() < 0) {
                                        bndEliminar = true;
                                    }
                                    idABuscar = Math.abs(new Double(celdaExcel.getNumericCellValue()).intValue());
                                    //metodoId.invoke(objEntidad, idABuscar);
                                    objEntidad = genericDAO.findById(claseEntidad, idABuscar); // para mantener los campos no incluidos en el excel descomentar esta linea, de lo contrario se colocara null en los campos no incluidos en el excel
                                    break;
                                }
                            }
                        }
                        for (int i = 0; i < indicesColumnas.size(); i++) {
                            if (indicesColumnas.get(i) != null && !camposColumnas.get(i).isAnnotationPresent(Id.class)) {
                                celdaExcel = row.getCell(indicesColumnas.get(i));
                                metodo = metodosColumnas.get(i);
                                if (camposColumnas.get(i).isAnnotationPresent(Column.class)) {
                                    seteaCampoAObjeto(celdaExcel, objEntidad, camposColumnas.get(i), metodo);
                                } else if (camposColumnas.get(i).isAnnotationPresent(ManyToOne.class)) {
                                    seteaIdCatalogoAObjeto(celdaExcel, objEntidad, camposColumnas.get(i), metodo);
                                }
                            }
                        }
                        if (bndEliminar) {
                            objEntidad = genericDAO.findById(claseEntidad, idABuscar);
                            if (objEntidad != null) {
                                genericDAO.delete((Serializable) objEntidad, false);                              
                                contadorBatch++;
                            } else {
                                throw new IllegalArgumentException("Identificador no v\u00e1alido");
                            }
                            continue;
                        } else if (objEntidad != null) {
                            genericDAO.saveOrUpdate((Serializable) objEntidad, false);
                            contadorBatch++;
                        } else {
                            throw new IllegalArgumentException("Identificador no v\u00e1alido");
                        }
                        if (contadorBatch >= 99) {
                            genericDAO.getSession().flush();
                            contadorBatch = 0;
                        }
                        idABuscar = claseEntidad.getMethod(metodoId.getName().replaceFirst("set", "get")).invoke(objEntidad) != null ? (Integer) claseEntidad.getMethod(metodoId.getName().replaceFirst("set", "get")).invoke(objEntidad) : null;
                        // a partir de aqui se guardan las relaciones
                        System.out.println("id a buscar en las hojas de relacion: " + idABuscar + " o nuevo a buscar: " + nuevoABuscar);
                        InputStream streamRelaciones = new FileInputStream(pathFile);
                        try (Workbook workbookRelacion = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(streamRelaciones)) {
                            if (nombreHojasRelacion != null && clasesRelacion != null) {
                                for (int i = 0; i < nombreHojasRelacion.size(); i++) {
                                    try {
                                        indicesColumnasRelaciones.clear();
                                        nombreTablaRelacion = clasesRelacion.get(i) != null ? ((Table) clasesRelacion.get(i).getAnnotation(Table.class)).name() : null;
                                        sheetRelacion = workbookRelacion.getSheet(nombreHojasRelacion.get(i));
                                        obtieneCamposMetodosColumnas(clasesRelacion.get(i), metodosRelaciones, camposRelaciones, false);
                                        int contadorRowRelacion = 0;
                                        for (int j = 0; j < camposRelaciones.size(); j++) {
                                            indicesColumnasRelaciones.add(null);
                                        }
                                        Integer indexLlaveforanea = null;
                                        Integer indexIdRelacion = null;
                                        labelRowRelacion:
                                        for (Row rowRelacion : sheetRelacion) {
                                            if (contadorRowRelacion == 0) {
                                                labelColumna:
                                                for (Cell cellRelacion : rowRelacion) {
                                                    if (cellRelacion.getCellType() == Cell.CELL_TYPE_STRING && cellRelacion.getStringCellValue() != null && !"".equals(cellRelacion.getStringCellValue().trim())) {
                                                        for (TblAccesoPantallasCampos config : configuracionRelaciones.get(clasesRelacion.get(i).getSimpleName())) {
                                                            if (config.getNTabla().equalsIgnoreCase(nombreTablaRelacion) && config.getDescripcion().trim().equalsIgnoreCase(cellRelacion.getStringCellValue().trim())) {
                                                                for (int j = 0; j < camposRelaciones.size(); j++) {
                                                                    if ((camposRelaciones.get(j).isAnnotationPresent(JoinColumn.class) && ((JoinColumn) camposRelaciones.get(j).getAnnotation(JoinColumn.class)).name().equalsIgnoreCase(config.getNColumna())) || (camposRelaciones.get(j).isAnnotationPresent(Column.class) && ((Column) camposRelaciones.get(j).getAnnotation(Column.class)).name().equalsIgnoreCase(config.getNColumna()))) {
                                                                        indicesColumnasRelaciones.set(j, cellRelacion.getColumnIndex());
                                                                        if (camposRelaciones.get(j).getName().equals(nombreCampoRelacionClase.get(clasesRelacion.get(i).getSimpleName()))) {
                                                                            indexLlaveforanea = cellRelacion.getColumnIndex();
                                                                        }
                                                                        if (camposRelaciones.get(j).isAnnotationPresent(Id.class)) {
                                                                            indexIdRelacion = cellRelacion.getColumnIndex();
                                                                        }
                                                                        continue labelColumna;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                contadorRowRelacion++;
                                            } else {
                                                objEntidadRelacion = clasesRelacion.get(i) != null ? clasesRelacion.get(i).newInstance() : null;
                                                bndRelacion = false;
                                                celdaExcel = rowRelacion.getCell(indexLlaveforanea);
                                                if (celdaExcel == null || (celdaExcel.getCellType() == Cell.CELL_TYPE_STRING && !celdaExcel.getStringCellValue().trim().equalsIgnoreCase(nuevoABuscar)) || (celdaExcel.getCellType() == Cell.CELL_TYPE_NUMERIC && new Double(celdaExcel.getNumericCellValue()).intValue() != idABuscar) || (celdaExcel.getCellType() == Cell.CELL_TYPE_BLANK)) {
                                                    contadorRowRelacion++;
                                                    continue;
                                                }
                                                celdaExcel = rowRelacion.getCell(indexIdRelacion);
                                                System.out.println("celda de idRelacion: " + celdaExcel);
                                                System.out.println("objEntidadRelacion clase: " + objEntidadRelacion.getClass().getSimpleName());
                                                for (int j = 0; j < indicesColumnasRelaciones.size(); j++) {
                                                    System.out.println("j: "+j);
                                                    if (camposRelaciones.get(j).isAnnotationPresent(Id.class)) {
                                                        System.out.println("entro al campo id");
                                                        metodoId = metodosRelaciones.get(j);
                                                        if (celdaExcel.getCellType() == Cell.CELL_TYPE_STRING) {
                                                            if (celdaExcel.getStringCellValue().trim().matches("[Nn].*")) {
                                                                break;
                                                            } else {                                                                
                                                                idRelacion = Integer.parseInt(celdaExcel.getStringCellValue().trim());                                                                
                                                                if (idRelacion < 0) {
                                                                    
                                                                    idRelacion = Math.abs(idRelacion);
                                                                    bndEliminar = true;
                                                                }
                                                                //metodoId.invoke(objEntidadRelacion, idRelacion);
                                                                objEntidadRelacion = genericDAO.findById(clasesRelacion.get(i), idRelacion);
                                                                System.out.println("objeto encontrado;");
                                                                break;
                                                            }
                                                        } else if (celdaExcel.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                                                            if (celdaExcel.getNumericCellValue() < 0) {
                                                                bndEliminar = true;
                                                            }
                                                            idRelacion = Math.abs(new Double(celdaExcel.getNumericCellValue()).intValue());
                                                            //metodoId.invoke(objEntidadRelacion, idRelacion);
                                                            objEntidadRelacion = genericDAO.findById(clasesRelacion.get(i), idRelacion);
                                                            break;
                                                        }
                                                    }
                                                    System.out.println("objeto relacion encontrado: "+objEntidadRelacion);
                                                }
                                                for (int j = 0; j < indicesColumnasRelaciones.size(); j++) {
                                                    if (indicesColumnasRelaciones.get(j) != null && !camposRelaciones.get(j).isAnnotationPresent(Id.class)) {
                                                        celdaExcel = rowRelacion.getCell(indicesColumnasRelaciones.get(j));
                                                        metodo = metodosRelaciones.get(j);
                                                        if (camposRelaciones.get(j).getName().equals(nombreCampoRelacionClase.get(clasesRelacion.get(i).getSimpleName()))) {
                                                            if (celdaExcel.getCellType() == Cell.CELL_TYPE_STRING && celdaExcel.getStringCellValue().trim().equalsIgnoreCase(nuevoABuscar) || (celdaExcel.getCellType() == Cell.CELL_TYPE_NUMERIC && new Double(celdaExcel.getNumericCellValue()).intValue() == idABuscar)) {
                                                                bndRelacion = true;
                                                                if (metodo.getParameterTypes()[0].getName().equals(claseEntidad.getName())) {
                                                                    metodo.invoke(objEntidadRelacion, objEntidad);
                                                                } else {
                                                                    metodo.invoke(objEntidadRelacion, idABuscar != null ? idABuscar : null);
                                                                }
                                                                continue;
                                                            }
                                                        }
//                                                        if (camposRelaciones.get(j).isAnnotationPresent(Id.class)) {
//                                                            
//                                                        }
//                                                        if (camposRelaciones.get(j).isAnnotationPresent(JoinColumn.class) && ((JoinColumn) camposRelaciones.get(j).getAnnotation(JoinColumn.class)).referencedColumnName().equals(nombreColumnaId)) {
//                                                            
//                                                        }
                                                        if (camposRelaciones.get(j).isAnnotationPresent(Column.class)) {
                                                            seteaCampoAObjeto(celdaExcel, objEntidadRelacion, camposRelaciones.get(j), metodo);
                                                        } else if (camposRelaciones.get(j).isAnnotationPresent(ManyToOne.class)) {
                                                            System.out.println("clase de la relacion: " + objEntidadRelacion.getClass().getSimpleName());
                                                            System.out.println("objeto de la relacion: " + objEntidadRelacion);
                                                            seteaIdCatalogoAObjeto(celdaExcel, objEntidadRelacion, camposRelaciones.get(j), metodo);
                                                        }
                                                    }
                                                }
                                                if (bndRelacion) {
                                                    if (bndEliminar) {
                                                        objEntidadRelacion = genericDAO.findById(clasesRelacion.get(i), idRelacion);
                                                        if (objEntidadRelacion != null) {
                                                            genericDAO.delete((Serializable) objEntidadRelacion, false);
                                                            bndEliminar = false;
                                                            contadorBatch++;
                                                        } else {
                                                            throw new IllegalArgumentException("Identificador no v\u00e1alido");
                                                        }
                                                    } else if (objEntidadRelacion != null) {
                                                        genericDAO.saveOrUpdate((Serializable) objEntidadRelacion, false);
                                                        contadorBatch++;
                                                    } else {
                                                        throw new IllegalArgumentException("Identificador no v\u00e1alido");
                                                    }
                                                }
                                                if (contadorBatch >= 99) {
                                                    genericDAO.getSession().flush();
                                                    contadorBatch = 0;
                                                }
                                                contadorRowRelacion++;
//                                            break;
                                            }
                                        }
                                    } catch (ArrayIndexOutOfBoundsException ex) {
                                        //no hace nada
                                    }
                                }
                            }
                        }
//                        break;
                    }
                }
                if (transaction.isActive()) {
                    transaction.commit();
                }
            } catch (ArrayIndexOutOfBoundsException ex) {
                throw new IllegalArgumentException("Archivo inv\u00e1lido");
            } catch (TransientObjectException | InstantiationException | IllegalAccessException | ParseException | DataBaseException | DAOException | NoSuchMethodException | SecurityException | StaleStateException | IllegalArgumentException | InvocationTargetException | ConstraintViolationException ex) {
                if (transaction != null && transaction.isActive()) {
                    transaction.rollback();
                }
                ex.printStackTrace();
                throw new CossException(ex.getClass().getSimpleName() + ": " + ex.getMessage() + ", objEntidad: " + objEntidad + ", objeto relacion: " + objEntidadRelacion);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ManagerXLSX.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (genericDAO != null) {
                    genericDAO.closeDAO();
                }
            }
        } catch (IOException ex) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new CossException(ex.getMessage());
        } finally {
            if (genericDAO != null) {
                genericDAO.closeDAO();
            }
        }
    }

    private static Class obtieneTipoListaDeCampo(Field campoLista) {
        ParameterizedType listType = campoLista != null ? (ParameterizedType) campoLista.getGenericType() : null;
        Class<?> listClass = listType != null ? (Class<?>) listType.getActualTypeArguments()[0] : null;
        return listClass;
    }

    private static void seteaCampoAObjeto(Cell celdaExcel, Object objeto, Field campo, Method metodo) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        if (celdaExcel != null) {
            switch (celdaExcel.getCellType()) {
                case Cell.CELL_TYPE_NUMERIC:
                    if (campo.getType().getName().equals(Date.class.getName()) && HSSFDateUtil.isCellDateFormatted(celdaExcel)) {
                        metodo.invoke(objeto, celdaExcel.getDateCellValue());
                    } else if (campo.getType().getName().equalsIgnoreCase(Boolean.class.getName())) {
                        metodo.invoke(objeto, celdaExcel.getNumericCellValue() == 1);
                    } else if (campo.getType().getName().equals(Integer.class.getName())) {
                        metodo.invoke(objeto, new Double(celdaExcel.getNumericCellValue()).intValue());
                    } else if (campo.getType().getName().equals(Double.class.getName())) {
                        metodo.invoke(objeto, celdaExcel.getNumericCellValue());
                    } else if (campo.getType().getName().equals(Float.class.getName())) {
                        metodo.invoke(objeto, new Double(celdaExcel.getNumericCellValue()).floatValue());
                    }
                    break;
                case Cell.CELL_TYPE_STRING:
                    if (campo.getType().getName().equals(Integer.class.getName()) && !"".equals(celdaExcel.getStringCellValue().trim())) {
                        metodo.invoke(objeto, new Integer(celdaExcel.getStringCellValue().trim()));
                    } else if (campo.getType().getName().equals(Double.class.getName()) && !"".equals(celdaExcel.getStringCellValue().trim())) {
                        metodo.invoke(objeto, new Double(celdaExcel.getStringCellValue().trim()));
                    } else if (campo.getType().getName().equals(Float.class.getName()) && !"".equals(celdaExcel.getStringCellValue().trim())) {
                        metodo.invoke(objeto, new Float(celdaExcel.getStringCellValue().trim()));
                    } else if (campo.getType().getName().equals(Date.class.getName()) && !"".equals(celdaExcel.getStringCellValue().trim())) {
                        metodo.invoke(objeto, dateFormat.parse(celdaExcel.getStringCellValue().trim()));
                    } else if (campo.getType().getName().equalsIgnoreCase(Boolean.class.getName()) && !"".equals(celdaExcel.getStringCellValue().trim())) {
                        metodo.invoke(objeto, "1".equals(celdaExcel.getStringCellValue().trim()));
                    } else {
                        metodo.invoke(objeto, celdaExcel.getStringCellValue().trim());
                    }
                    break;
            }
        }
    }

    private static void seteaIdCatalogoAObjeto(Cell celdaExcel, Object objeto, Field campo, Method metodo) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (celdaExcel != null && (celdaExcel.getCellType() == Cell.CELL_TYPE_STRING || celdaExcel.getCellType() == Cell.CELL_TYPE_NUMERIC)) {
            Class claseCampo = campo != null ? campo.getType() : null;
            Field[] camposClase = claseCampo != null ? claseCampo.getDeclaredFields() : null;
            Object objCampo = null;
            if (camposClase != null && claseCampo != null) {
                for (Field field : camposClase) {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(Id.class)) {
                        objCampo = claseCampo.newInstance();
                        switch (celdaExcel.getCellType()) {
                            case Cell.CELL_TYPE_STRING:
                                if (!"".equals(celdaExcel.getStringCellValue().trim())) {
                                    field.set(objCampo, new Integer(celdaExcel.getStringCellValue().trim()));
                                    metodo.invoke(objeto, objCampo);
                                }
                                break;
                            case Cell.CELL_TYPE_NUMERIC:
                                System.out.println("id a setear: " + new Double(celdaExcel.getNumericCellValue()).intValue());
                                field.set(objCampo, new Double(celdaExcel.getNumericCellValue()).intValue());
                                metodo.invoke(objeto, objCampo);
                                break;
                        }
                        break;
                    }
                }
            }
        }
    }
}
