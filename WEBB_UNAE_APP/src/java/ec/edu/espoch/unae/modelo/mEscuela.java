/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseEscuela;
import ec.edu.espoch.unae.entidad.ClaseFacultad;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mEscuela {
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

    public static ArrayList<ClaseEscuela> obtenerEscuela() throws Exception {
        ArrayList<ClaseEscuela> lstEscuela = new ArrayList<>();
        try {
           
            String sql = "SELECT * from unae.fn_select_escuela()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstEscuela = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstEscuela;
    }

    public static ArrayList<ClaseEscuela> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseEscuela> lstEscuela = new ArrayList<>();
        try {

            while (rs.next()) {
                ClaseEscuela Escuela= new ClaseEscuela();
                ClaseFacultad objFacultad= new ClaseFacultad();
                Escuela.setIdesceula(rs.getInt(0));
                Escuela.setCodigoescuela(rs.getString(1));
                Escuela.setNombreescuela(rs.getString(2));
                Escuela.setDescripcionescuela(rs.getString(3));
                objFacultad.setCodigonombreFacultad(rs.getString(4));
                Escuela.setObjFacultad(objFacultad);
                lstEscuela.add(Escuela);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstEscuela;
    }

    
}
