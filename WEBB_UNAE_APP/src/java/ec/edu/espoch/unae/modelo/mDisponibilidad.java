/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseDisponibilidad;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mDisponibilidad {

    public static boolean insertarDisponibilidad(ClaseDisponibilidad Disponibilidad) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT unae.fn_insert_disponibilidad(?,?,?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, Disponibilidad.getDiadisponibilidad()));
            lst.add(new Parametro(2, Disponibilidad.getHoradisponibilidad()));
            lst.add(new Parametro(3, Disponibilidad.getJornadadisponibilidad()));
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

    public static ArrayList<ClaseDisponibilidad> obtenerDisponibilidad() throws Exception {
        ArrayList<ClaseDisponibilidad> lstDisponibilidad = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_disponibilidad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstDisponibilidad = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstDisponibilidad;
    }

    public static ArrayList<ClaseDisponibilidad> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseDisponibilidad> lstDisponibilidad = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
                ClaseDisponibilidad Disponibilidad = new ClaseDisponibilidad(
                        rs.getInt(0),
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3));
                lstDisponibilidad.add(Disponibilidad);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstDisponibilidad;
    }

}
