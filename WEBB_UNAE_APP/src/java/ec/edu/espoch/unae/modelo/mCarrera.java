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
import ec.edu.espoch.unae.entidad.ClaseCarrera;
import ec.edu.espoch.unae.entidad.ClaseEscuela;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mCarrera {

    public static boolean insertarArea(ClaseCarrera Carrera) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT * from unae.fn_insert_carrera(?,?,?,?,?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, Carrera.getStrnombrecarrera()));
            lst.add(new Parametro(2, Carrera.getStrdescripcioncarrera()));
            lst.add(new Parametro(3, Carrera.getStrnivel()));
            lst.add(new Parametro(4, Carrera.getObjArea().getIdarea()));
            lst.add(new Parametro(5, Carrera.getObjEscuela().getIdesceula()));

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

    public static ArrayList<ClaseCarrera> obtenerCarrera() throws Exception {
        ArrayList<ClaseCarrera> lstCarrera = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_carrera1()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstCarrera = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstCarrera;
    }

    public static ArrayList<ClaseCarrera> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseCarrera> lstCarrera = new ArrayList<>();
        try {

            while (rs.next()) {
                ClaseArea objArea= new ClaseArea();
                ClaseEscuela objEscuela= new ClaseEscuela();
                ClaseCarrera Carrera = new ClaseCarrera();
                Carrera.setIdcarrera(rs.getInt(0));
                Carrera.setStrnombrecarrera(rs.getString(1));
                Carrera.setStrdescripcioncarrera(rs.getString(2));
                Carrera.setStrnivel(rs.getString(3));
                objArea.setStrarea(rs.getString(4));
                Carrera.setObjArea(objArea);
                objEscuela.setNombreescuela(rs.getString(5));
                Carrera.setObjEscuela(objEscuela);       
                lstCarrera.add(Carrera);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstCarrera;
    }

}
