/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseArea;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mArea {
       public static boolean insertarArea(ClaseArea Area) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT unae.fn_insert_area(?,?)";
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

    public static ArrayList<ClaseArea> obtenerArea() throws Exception {
        ArrayList<ClaseArea> lstArea = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_area()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstArea = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstArea;
    }

    public static ArrayList<ClaseArea> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseArea> lstArea = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
                ClaseArea Area = new ClaseArea(
                        rs.getInt(0),
                        rs.getString(1),
                        rs.getString(2));

                lstArea.add(Area);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstArea;
    }


}
