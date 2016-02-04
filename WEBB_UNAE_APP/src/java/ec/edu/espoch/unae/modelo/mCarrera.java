/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseCarrera;
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
            lst.add(new Parametro(4, Carrera.getIdarea()));
            lst.add(new Parametro(5, Carrera.getIdescuela()));
            
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lst);
            while (rs.next()) {
                if (rs.getBoolean(0) == true)
                {
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
            String sql = "SELECT * from unae.fn_select_carrera()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstCarrera= llenarDatos(rs);
            rs=null;

        } catch (Exception e) {
            throw e;
        }
        return lstCarrera;
    }   
    public static ArrayList<ClaseCarrera> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseCarrera> lstCarrera = new ArrayList<>();
        try {
           
            while (rs.next()) {
               ClaseCarrera Carrera= new ClaseCarrera(
                       rs.getInt(0), 
                       rs.getString(1), 
                       rs.getString(2), 
                       rs.getString(3), 
                       rs.getString(4),
                       rs.getString(4));
                lstCarrera.add(Carrera);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstCarrera;
    }
 
}
