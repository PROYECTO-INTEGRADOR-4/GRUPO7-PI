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
import ec.edu.espoch.unae.entidad.ClasePeriodoAcademico;
import ec.edu.espoch.unae.entidad.ClasePeriodoCarrera;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mPeriodoCarrera {

    public static boolean insertarPCarrera(ClasePeriodoCarrera PCarrera) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT * from unae.fn_insert_periodo_carrera(?,?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, PCarrera.getObjPeriodoAcademico().getIdClasePeriodoAcademico()));
            lst.add(new Parametro(2, PCarrera.getObjCarrera().getIdcarrera()));

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

    public static ArrayList<ClasePeriodoCarrera> obtenerPCarrera() throws Exception {
        ArrayList<ClasePeriodoCarrera> lstPCarrera = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_periodocarrera()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstPCarrera = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstPCarrera;
    }

    public static ArrayList<ClasePeriodoCarrera> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClasePeriodoCarrera> lstPCarrera = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
                ClasePeriodoCarrera objPeriodocarrera= new ClasePeriodoCarrera();
                ClasePeriodoAcademico objPeriodo= new ClasePeriodoAcademico();
                ClaseCarrera objCarrera = new ClaseCarrera();
                objPeriodocarrera.setIdPeriodoCarrera(rs.getInt(0));
                objPeriodo.setNombreClasePeriodoAcademico(rs.getString(1));
                objPeriodocarrera.setObjPeriodoAcademico(objPeriodo);
                objCarrera.setStrnombrecarrera(rs.getString(2));
                objPeriodocarrera.setObjCarrera(objCarrera);
                lstPCarrera.add(objPeriodocarrera);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstPCarrera;
    }

}
