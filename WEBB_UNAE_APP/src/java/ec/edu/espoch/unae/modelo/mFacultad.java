/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.entidad.ClaseEscuela;
import ec.edu.espoch.unae.entidad.ClaseFacultad;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mFacultad {
      /* 
    public static boolean insertarArea(ClaseEscuela Escuela) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT * from unae.fn_insert_carrera(?,?,?,?,?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1,Escuela.getIdesceula()));
            lst.add(new Parametro(2,Escuela.getCodigoescuela()));
            lst.add(new Parametro(3,Escuela.getNombreescuela()));
            lst.add(new Parametro(4,Escuela.getDescripcionescuela()));
            lst.add(new Parametro(5,Escuela.getObjFacultad().getIdfacultad()));

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
    }*/

    public static ArrayList<ClaseFacultad> obtenerFacultad() throws Exception {
        ArrayList<ClaseFacultad> lstFacultad = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_faultad()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstFacultad = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstFacultad;
    }

    public static ArrayList<ClaseFacultad> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseFacultad> lstFacultad = new ArrayList<>();
        try {

            while (rs.next()) {
                ClaseFacultad Facultad= new ClaseFacultad();
                Facultad.setIdfacultad(rs.getInt(0));
                Facultad.setCodigoFacultad(rs.getString(1));
                Facultad.setCodigonombreFacultad(rs.getString(2));
                Facultad.setDescripcionFacultad(rs.getString(4));
                lstFacultad.add(Facultad);
                      
            }

        } catch (Exception e) {
            throw e;
        }
        return lstFacultad;
    }

  
    
}
