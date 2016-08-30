package com.cossystem.core.util;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.pojos.catalogos.TblConfiguracionCossAdmin;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.hibernate.ScrollableResults;

public class ManagerXLSX {

    public static String generaArchivoExcel(Class claseEntidad, Map filtros, String rutaDestino, final List<TblConfiguracionCossAdmin> configuracion) throws DAOException {
        GenericDAO genericDAO = null;
        SXSSFWorkbook workBook = new SXSSFWorkbook();
        workBook.setCompressTempFiles(true);
        workBook.createSheet();
        SXSSFSheet sheet = (SXSSFSheet) workBook.getSheetAt(0);
        sheet.setRandomAccessWindowSize(201);
        int indexRow = 0;
        Row row = sheet.createRow(indexRow);
        Cell cell;
        FileOutputStream out = null;
        Field[] camposClase = claseEntidad.getDeclaredFields();
        Method[] metodos = claseEntidad.getDeclaredMethods();
        List<Field> camposColumnas = new ArrayList<>();
        List<Method> metodosColumnas = new ArrayList<>();
        String nombreArchivoSalida;
        File directorioBase;
        int indexCell = 0;
        String nombreTabla = ((Table) claseEntidad.getAnnotation(Table.class)).name();
        String nombreCampoTabla;
        for (Field campo : camposClase) {
            if (campo.isAnnotationPresent(Column.class)) {
                nombreCampoTabla = ((Column) campo.getAnnotation(Column.class)).name();
            } else if (campo.isAnnotationPresent(JoinColumn.class)) {
                nombreCampoTabla = ((JoinColumn) campo.getAnnotation(JoinColumn.class)).name();
            } else {
                nombreCampoTabla = null;
            }
            if (nombreCampoTabla != null) {
                labelCampo:
                for (TblConfiguracionCossAdmin config : configuracion) {
                    if (nombreTabla.equalsIgnoreCase(config.getNTabla()) && nombreCampoTabla.equalsIgnoreCase(config.getNColumna()) && config.getDescargaExcel()) {
                        for (Method metodo : metodos) {
                            if (metodo.getName().equalsIgnoreCase("get" + campo.getName())) {
                                cell = row.createCell(indexCell);
                                cell.setCellValue(config.getDescripcion());
                                camposColumnas.add(campo);
                                metodosColumnas.add(metodo);
                                System.out.println("metodo: " + metodo.getName());
                                indexCell++;
                                break labelCampo;
                            }
                        }
                    }
                }
            }
        }
        indexRow++;
        Field[] camposCatalogo;
        Class claseColumna;
        CreationHelper createHelper = workBook.getCreationHelper();
        CellStyle cellStyle = workBook.createCellStyle();
        cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("yyyy/MM/dd"));
        try {
            genericDAO = new GenericDAO();
            ScrollableResults results = genericDAO.findByComponents(claseEntidad, filtros, 200);
            while (results.next()) {
                row = sheet.createRow(indexRow);
                for (int i = 0; i < metodosColumnas.size(); i++) {
                    cell = row.createCell(i);
                    try {
                        if (camposColumnas.get(i).isAnnotationPresent(ManyToOne.class) || camposColumnas.get(i).isAnnotationPresent(OneToOne.class)) {
                            camposCatalogo = camposColumnas.get(i).getType().getDeclaredFields();
                            for (Field fieldCatalogo : camposCatalogo) {
                                fieldCatalogo.setAccessible(true);
                                if (fieldCatalogo.isAnnotationPresent(Id.class)) {
                                    cell.setCellValue(Double.parseDouble(fieldCatalogo.get(metodosColumnas.get(i).invoke(results.get(0))).toString()));
                                }
                            }
                        } else {
                            claseColumna = camposColumnas.get(i).getType();
                            if (Date.class.isAssignableFrom(claseColumna)) {
                                Calendar calendar = Calendar.getInstance();
                                calendar.setTime((Date) metodosColumnas.get(i).invoke(results.get(0)));
                                System.out.println(calendar.getTimeZone().getDisplayName());
                                cell.setCellValue(calendar);
                                cell.setCellStyle(cellStyle);
                            } else if (String.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue((String) metodosColumnas.get(i).invoke(results.get(0)));
                            } else if (Boolean.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue((Boolean) metodosColumnas.get(i).invoke(results.get(0)));
                            } else if (double.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue((double) metodosColumnas.get(i).invoke(results.get(0)));
                            } else if (Number.class.isAssignableFrom(claseColumna)) {
                                cell.setCellValue(new Double(metodosColumnas.get(i).invoke(results.get(0)).toString()));
                            } else {
                                System.out.println("no entro en ninguno " + camposColumnas.get(i).getName());
                            }
                        }
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NullPointerException ex) {
                        //to do
                    }
                }
                indexRow++;
            }
            directorioBase = new File(rutaDestino);
            if (!directorioBase.isDirectory()) {
                directorioBase.mkdirs();
            }
            nombreArchivoSalida = "tempsxssf" + Calendar.getInstance().getTime().getTime() + ".xlsx";
            out = new FileOutputStream(rutaDestino + File.separator + nombreArchivoSalida);
            workBook.write(out);
        } catch (DataBaseException | IOException ex) {
            throw new DAOException(ex.getMessage());
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
}
