/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;
import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseDocente;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mDocente {

    /*public static boolean insertarDocente(ClaseDocente Docente) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT ";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, Area.getStrarea()));
            lst.add(new Parametro(2, Area.getStrdescripcion()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lst);
            while (rs.next()) {
                if (rs.getBoolean(0) == true) {
                    respuesta = true;
                }
            }
            rs = null;
            lst = null;

        } catch (Exception e) {
            throw e;
        }
        return respuesta;
    }

    public static ArrayList<ClaseDocente> obtenerDocente() throws Exception {
        ArrayList<ClaseDocente> lstDocente = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_area()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstDocente = llenarDatos(rs);
            rs = null;
        } catch (Exception e) {
            throw e;
        }
        return lstDocente;
    }

    public static ArrayList<ClaseDocente> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseDocente> lstDocente = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
               
                lstDocente.add(Area);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstDocente;
    }*/
}
