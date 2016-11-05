package com.cossystem.core.util;

import com.cossystem.core.dao.GenericDAO;
import com.cossystem.core.exception.DAOException;
import com.cossystem.core.exception.DataBaseException;
import com.cossystem.core.pojos.TblAccesoPantallasCampos;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Filtro implements Serializable {

    public static final String FILTRO_AND = "y";
    public static final String FILTRO_OR = "o";

    public static final String COMPARADOR_IGUAL = "igual";
    public static final String COMPARADOR_DIFERENTE = "diferente";
    public static final String COMPARADOR_CONTENGA = "contenga";
    public static final String COMPARADOR_MAYOR = "mayor";
    public static final String COMPARADOR_MAYOR_IGUAL = "mayorIgual";
    public static final String COMPARADOR_MENOR = "menor";
    public static final String COMPARADOR_MENOR_IGUAL = "menorIgual";
    public static final String COMPARADOR_ENTRE = "entre";
    public static final String COMPARADOR_IGUAL_BASE = " = ";
    public static final String COMPARADOR_DIFERENTE_BASE = " <> ";
    public static final String COMPARADOR_CONTENGA_BASE = " LIKE ";
    public static final String COMODIN_CONTENGA_BASE_MYSQL = "%";
    public static final String MASCARA_FECHA_BASE_MYSQL = "yyyy-MM-dd";
    public static final String MASCARA_FECHA_HORA_BASE_MYSQL = "yyyy-MM-dd hh:mm:ss";
    public static final String COMPARADOR_MAYOR_BASE = " > ";
    public static final String COMPARADOR_MAYOR_IGUAL_BASE = " >= ";
    public static final String COMPARADOR_MENOR_BASE = " < ";
    public static final String COMPARADOR_MENOR_IGUAL_BASE = " <= ";
    public static final String COMPARADOR_ENTRE_BASE = " BETWEEN ";
    public static final String COMODIN_ENTRE_BASE = " AND ";

    private String nombreCampoClase;
    private String comparador;
    private String valorString;
    private Double valorNumerico;
    private Double valorNumericoFinal;
    private Date valorFecha;
    private Date valorFechaFinal;
    private String valorBooleano;
    private Object valorCatalogo;
    private String agregar;
    private Field campoEntidad;
    private String descCampo;
    private TblAccesoPantallasCampos confCampo;
    private boolean campoFecha = false;
    private boolean campoNumerico = false;
    private boolean campoString = true;
    private boolean campoCatalogo = false;
    private boolean campoBooleano = false;
    private boolean intervalo = false;
    private boolean visible = true;
    private boolean eliminable = true;

    private List<Object> componentesComboCatalogo = new ArrayList<>();

    public String getNombreCampoClase() {
        return nombreCampoClase;
    }

    public void setNombreCampoClase(String nombreCampoClase) {
        this.nombreCampoClase = nombreCampoClase;
    }

    public String getComparador() {
        return comparador;
    }

    public void setComparador(String comparador) {
        this.comparador = comparador;
    }

    public String getAgregar() {
        return agregar;
    }

    public void setAgregar(String agregar) {
        this.agregar = agregar;
    }

    public String getValorString() {
        return valorString;
    }

    public void setValorString(String valorString) {
        this.valorString = valorString;
    }

    public Double getValorNumerico() {
        return valorNumerico;
    }

    public void setValorNumerico(Double valorNumerico) {
        this.valorNumerico = valorNumerico;
    }

    public Double getValorNumericoFinal() {
        return valorNumericoFinal;
    }

    public void setValorNumericoFinal(Double valorNumericoFinal) {
        this.valorNumericoFinal = valorNumericoFinal;
    }

    public Date getValorFecha() {
        return valorFecha;
    }

    public void setValorFecha(Date valorFecha) {
        this.valorFecha = valorFecha;
    }

    public Date getValorFechaFinal() {
        return valorFechaFinal;
    }

    public void setValorFechaFinal(Date valorFechaFinal) {
        this.valorFechaFinal = valorFechaFinal;
    }

    public boolean isCampoFecha() {
        return campoFecha;
    }

    public void setCampoFecha(boolean campoFecha) {
        this.campoFecha = campoFecha;
    }

    public boolean isCampoNumerico() {
        return campoNumerico;
    }

    public void setCampoNumerico(boolean campoNumerico) {
        this.campoNumerico = campoNumerico;
    }

    public boolean isCampoString() {
        return campoString;
    }

    public void setCampoString(boolean campoString) {
        this.campoString = campoString;
    }

    public boolean isIntervalo() {
        return intervalo;
    }

    public void setIntervalo(boolean intervalo) {
        this.intervalo = intervalo;
    }

    public Object getValorCatalogo() {
        return valorCatalogo;
    }

    public void setValorCatalogo(Object valorCatalogo) {
        this.valorCatalogo = valorCatalogo;
    }

    public Field getCampoEntidad() {
        return campoEntidad;
    }

    public void setCampoEntidad(Field campoEntidad) {
        if (campoEntidad != null && campoEntidad.isAnnotationPresent(ManyToOne.class)) {
            GenericDAO genericDAO = null;
            try {
                genericDAO = new GenericDAO();
                Map filtros = new TreeMap();
                componentesComboCatalogo = genericDAO.findByComponents(campoEntidad.getType(), filtros);
            } catch (DataBaseException | DAOException ex) {
                Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                if (genericDAO != null) {
                    genericDAO.closeDAO();
                }
            }
        }
        this.campoEntidad = campoEntidad;
    }

    public boolean isCampoCatalogo() {
        return campoCatalogo;
    }

    public void setCampoCatalogo(boolean campoCatalogo) {
        this.campoCatalogo = campoCatalogo;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public String getValorBooleano() {
        return valorBooleano;
    }

    public void setValorBooleano(String valorBooleano) {
        this.valorBooleano = valorBooleano;
    }

    public boolean isCampoBooleano() {
        return campoBooleano;
    }

    public void setCampoBooleano(boolean campoBooleano) {
        this.campoBooleano = campoBooleano;
    }

    public String getDescCampo() {
        return descCampo;
    }

    public void setDescCampo(String descCampo) {
        this.descCampo = descCampo;
    }

    public TblAccesoPantallasCampos getConfCampo() {
        return confCampo;
    }

    public void setConfCampo(TblAccesoPantallasCampos confCampo) {
        this.confCampo = confCampo;
    }

    public boolean isEliminable() {
        return eliminable;
    }

    public void setEliminable(boolean eliminable) {
        this.eliminable = eliminable;
    }

    public List<Object> getComponentesComboCatalogo() {
        return componentesComboCatalogo;
    }

    public void setComponentesComboCatalogo(List<Object> componentesComboCatalogo) {
        this.componentesComboCatalogo = componentesComboCatalogo;
    }

    public static Filtro generaFiltro(Field campoClase, Object valor, TblAccesoPantallasCampos confCampo) throws ParseException {
        Filtro filtro = null;
        if (campoClase != null) {
            filtro = new Filtro();
            filtro.setComparador(COMPARADOR_IGUAL);
            filtro.setNombreCampoClase(campoClase.getName());
            filtro.setCampoEntidad(campoClase);
            filtro.setDescCampo(confCampo != null && confCampo.getDescripcion() != null ? confCampo.getDescripcion() : campoClase.getName());
            filtro.setConfCampo(confCampo);
            if (String.class.getSimpleName().equals(campoClase.getType().getSimpleName())) {
                filtro.setCampoString(true);
                filtro.setCampoFecha(false);
                filtro.setCampoNumerico(false);
                filtro.setCampoCatalogo(false);
                filtro.setCampoBooleano(false);
                filtro.setValorString((String) valor);
            } else if (Date.class.getSimpleName().equals(campoClase.getType().getSimpleName())) {
                SimpleDateFormat sdf = new SimpleDateFormat(confCampo != null && confCampo.getFormatoCampo() != null && !"".equals(confCampo.getFormatoCampo().trim()) ? confCampo.getFormatoCampo().trim() : "dd/MM/yyyy");
                filtro.setCampoString(false);
                filtro.setCampoFecha(true);
                filtro.setCampoNumerico(false);
                filtro.setCampoCatalogo(false);
                filtro.setCampoBooleano(false);
                filtro.setValorFecha(sdf.parse((String) valor));
            } else if (Number.class.isAssignableFrom(campoClase.getType())) {
                filtro.setCampoString(false);
                filtro.setCampoFecha(false);
                filtro.setCampoNumerico(true);
                filtro.setCampoCatalogo(false);
                filtro.setCampoBooleano(false);
                filtro.setValorNumerico(new Double((String) valor));
            } else if (Boolean.class.getSimpleName().equals(campoClase.getType().getSimpleName())) {
                filtro.setCampoString(false);
                filtro.setCampoFecha(false);
                filtro.setCampoNumerico(false);
                filtro.setCampoCatalogo(false);
                filtro.setCampoBooleano(true);
                filtro.setValorBooleano(((String) valor).trim().equals("1") ? "true" : ((String) valor).trim().equals("true") ? ((String) valor).trim() : "false");
            } else if (campoClase.isAnnotationPresent(ManyToOne.class)) {
                filtro.setCampoString(false);
                filtro.setCampoFecha(false);
                filtro.setCampoNumerico(false);
                filtro.setCampoCatalogo(true);
                filtro.setCampoBooleano(false);
                if (valor.getClass().getSimpleName().equals(campoClase.getType().getSimpleName())) {
                    filtro.setValorCatalogo(valor);
                }else {
                    GenericDAO genericDAO = null;
                    try{
                        genericDAO = new GenericDAO();
                        valor = genericDAO.findById(campoClase.getType(), Integer.parseInt(valor.toString().trim()));
                    } catch (DataBaseException | DAOException | IllegalArgumentException ex) {
                        valor = null;
                    } finally{
                        if(genericDAO != null){
                            genericDAO.closeDAO();
                        }
                    }
                    filtro.setValorCatalogo(valor);
                }
            }
            filtro.setAgregar(FILTRO_AND);
        }
        return filtro;
    }

    public static String generaClausulaWhere(List<Filtro> filtros) throws IllegalAccessException {
        String sentenciaWhere = "";
        if (filtros != null) {
            for (int i = 0; i < filtros.size(); i++) {
                if (i == 0 && filtros.get(i).getComparador() != null && !"".equals(filtros.get(i).getComparador().trim())) {
                    sentenciaWhere += " where ";
                }
                if (filtros.get(i).getComparador() != null && !"".equals(filtros.get(i).getComparador().trim())) {
                    sentenciaWhere += obtieneFiltroSQL(filtros.get(i));
                    if (i < filtros.size() - 1 && filtros.get(i).getAgregar() != null && filtros.get(filtros.size() - 1).getComparador() != null && !"".equals(filtros.get(filtros.size() - 1).getComparador().trim())) {
                        if ("y".equalsIgnoreCase(filtros.get(i).getAgregar())) {
                            sentenciaWhere += " AND ";
                        } else {
                            sentenciaWhere += " OR ";
                        }
                    } else if (i < filtros.size() - 1 && filtros.get(i).getAgregar() == null) {
                        break;
                    }
                }
            }
        }
        return sentenciaWhere;
    }

    private static String obtieneFiltroSQL(Filtro filtro) throws IllegalArgumentException, IllegalAccessException {
        String filtroSQL = "";
        filtroSQL += filtro.getCampoEntidad().isAnnotationPresent(Column.class) ? ((Column) filtro.getCampoEntidad().getAnnotation(Column.class)).name() : filtro.getCampoEntidad().isAnnotationPresent(JoinColumn.class) ? ((JoinColumn) filtro.getCampoEntidad().getAnnotation(JoinColumn.class)).name() : filtro.getCampoEntidad().getName();
        if (filtro.campoBooleano) {
            switch (filtro.comparador) {
                case Filtro.COMPARADOR_DIFERENTE:
                    filtroSQL += Filtro.COMPARADOR_DIFERENTE_BASE + filtro.getValorBooleano();
                    break;
                case Filtro.COMPARADOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_IGUAL_BASE + filtro.getValorBooleano();
                    break;
            }
        } else if (filtro.campoString) {
            switch (filtro.comparador) {
                case Filtro.COMPARADOR_DIFERENTE:
                    filtroSQL += Filtro.COMPARADOR_DIFERENTE_BASE + " '" + filtro.getValorString() + "' ";
                    break;
                case Filtro.COMPARADOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_IGUAL_BASE + " '" + filtro.getValorString() + "' ";
                    break;
                case Filtro.COMPARADOR_CONTENGA:
                    filtroSQL += Filtro.COMPARADOR_CONTENGA_BASE + " '" + Filtro.COMODIN_CONTENGA_BASE_MYSQL + filtro.getValorString() + Filtro.COMODIN_CONTENGA_BASE_MYSQL + "' ";
                    break;
            }
        } else if (filtro.campoCatalogo) {
            Field[] camposCatalogo = filtro.getValorCatalogo().getClass().getDeclaredFields();
            Field campoId = null;
            for (Field campoCatalogoTmp : camposCatalogo) {
                if (campoCatalogoTmp.isAnnotationPresent(Id.class)) {
                    campoCatalogoTmp.setAccessible(true);
                    campoId = campoCatalogoTmp;
                }
            }
            switch (filtro.comparador) {
                case Filtro.COMPARADOR_DIFERENTE:
                    if (campoId != null) {
                        filtroSQL += Filtro.COMPARADOR_DIFERENTE_BASE + campoId.get(filtro.getValorCatalogo());
                    } else {
                        filtroSQL = "";
                    }
                    break;
                case Filtro.COMPARADOR_IGUAL:
                    if (campoId != null) {
                        filtroSQL += Filtro.COMPARADOR_IGUAL_BASE + campoId.get(filtro.getValorCatalogo());
                    } else {
                        filtroSQL = "";
                    }
                    break;
            }
        } else if (filtro.campoFecha) {
            SimpleDateFormat sdf = new SimpleDateFormat(Filtro.MASCARA_FECHA_BASE_MYSQL);
            switch (filtro.comparador) {
                case Filtro.COMPARADOR_DIFERENTE:
                    filtroSQL += Filtro.COMPARADOR_DIFERENTE_BASE + "'" + sdf.format(filtro.getValorFecha()) + "'";
                    break;
                case Filtro.COMPARADOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_IGUAL_BASE + "'" + sdf.format(filtro.getValorFecha()) + "'";
                    break;
                case Filtro.COMPARADOR_MAYOR:
                    filtroSQL += Filtro.COMPARADOR_MAYOR_BASE + "'" + sdf.format(filtro.getValorFecha()) + "'";
                    break;
                case Filtro.COMPARADOR_MAYOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_MAYOR_IGUAL_BASE + "'" + sdf.format(filtro.getValorFecha()) + "'";
                    break;
                case Filtro.COMPARADOR_MENOR:
                    filtroSQL += Filtro.COMPARADOR_MENOR_BASE + "'" + sdf.format(filtro.getValorFecha()) + "'";
                    break;
                case Filtro.COMPARADOR_MENOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_MENOR_IGUAL_BASE + "'" + sdf.format(filtro.getValorFecha()) + "'";
                    break;
                case Filtro.COMPARADOR_ENTRE:
                    filtroSQL += Filtro.COMPARADOR_ENTRE_BASE + "'" + sdf.format(filtro.getValorFecha()) + "'" + Filtro.COMODIN_ENTRE_BASE + "'" + sdf.format(filtro.getValorFechaFinal()) + "'";
                    break;
            }
        } else if (filtro.campoNumerico) {
            switch (filtro.comparador) {
                case Filtro.COMPARADOR_DIFERENTE:
                    filtroSQL += Filtro.COMPARADOR_DIFERENTE_BASE + filtro.getValorNumerico();
                    break;
                case Filtro.COMPARADOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_IGUAL_BASE + filtro.getValorNumerico();
                    break;
                case Filtro.COMPARADOR_MAYOR:
                    filtroSQL += Filtro.COMPARADOR_MAYOR_BASE + filtro.getValorNumerico();
                    break;
                case Filtro.COMPARADOR_MAYOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_MAYOR_IGUAL_BASE + filtro.getValorNumerico();
                    break;
                case Filtro.COMPARADOR_MENOR:
                    filtroSQL += Filtro.COMPARADOR_MENOR_BASE + filtro.getValorNumerico();
                    break;
                case Filtro.COMPARADOR_MENOR_IGUAL:
                    filtroSQL += Filtro.COMPARADOR_MENOR_IGUAL_BASE + filtro.getValorNumerico();
                    break;
                case Filtro.COMPARADOR_ENTRE:
                    filtroSQL += Filtro.COMPARADOR_ENTRE_BASE + filtro.getValorNumerico() + Filtro.COMODIN_ENTRE_BASE + filtro.getValorNumericoFinal();
                    break;
            }
        }
        return filtroSQL;
    }

    @Override
    public String toString() {
        return "Filtro{" + "nombreCampoClase=" + nombreCampoClase + ", comparador=" + comparador + ", valorString=" + valorString + ", valorNumerico=" + valorNumerico + ", valorNumericoFinal=" + valorNumericoFinal + ", valorFecha=" + valorFecha + ", valorFechaFinal=" + valorFechaFinal + ", valorBooleano=" + valorBooleano + ", valorCatalogo=" + valorCatalogo + ", agregar=" + agregar + ", campoEntidad=" + campoEntidad + ", descCampo=" + descCampo + ", confCampo=" + confCampo + ", campoFecha=" + campoFecha + ", campoNumerico=" + campoNumerico + ", campoString=" + campoString + ", campoCatalogo=" + campoCatalogo + ", campoBooleano=" + campoBooleano + ", intervalo=" + intervalo + ", visible=" + visible + ", eliminable=" + eliminable + '}';
    }

}
