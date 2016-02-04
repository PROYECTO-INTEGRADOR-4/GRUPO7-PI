/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClasePeriodoAcademico;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mPeriodoAcademico {
    
    public static boolean insertarPeriodoAcademico(ClasePeriodoAcademico Periodo) throws Exception {
        boolean respuesta = false;
        try {
           
            String sql = "SELECT * from unae.fn_insert_periodo_academico(?,?,?,?)";
            java.sql.Date Fechainicio= new java.sql.Date(Periodo.getFechainicioClasePeriodoAcademico().getTime());
            java.sql.Date Fechafin= new java.sql.Date(Periodo.getFechafinClasePeriodoAcademico().getTime());            
            ArrayList<Parametro> lst = new ArrayList<>();            
            lst.add(new Parametro(1, Periodo.getNombreClasePeriodoAcademico()));
            lst.add(new Parametro(2, Periodo.isEstadoClasePeriodoAcademico()));
            lst.add(new Parametro(3, Fechainicio));
            lst.add(new Parametro(4, Fechafin));
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

  
    public static ArrayList<ClasePeriodoAcademico> obtenerPeriodoAcademico() throws Exception {
        ArrayList<ClasePeriodoAcademico> lstPeriodoAcademico = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_periodoacademico()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstPeriodoAcademico= llenarDatos(rs);
            rs=null;

        } catch (Exception e) {
            throw e;
        }
        return lstPeriodoAcademico;
    }


    
     public static boolean eliminarPeriodoAcademico(int cod) throws Exception {
        boolean respuesta = false;

        try {
            
            String sql = "select * from lavadora.fn_deleteautomovil(?)";
            //transfroma 
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, cod));
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
    
    
     
     
     public static boolean actualizarPeriodoAcademico(ClasePeriodoAcademico Periodo, int cod) throws Exception {
        boolean respuesta = false;

        try {
           
            String sql = "select * from lavadora.fn_automovilupdate(?,?,?,?,?)";
            
            ArrayList<Parametro> lst = new ArrayList<>();
            /*lst.add(new Parametro(1, cod));
            lst.add(new Parametro(2, Periodo.getStrnombre()));
            lst.add(new Parametro(3, Periodo.getStrfechainicio()));
            lst.add(new Parametro(4, Periodo.getStrfechafin()));
            lst.add(new Parametro(5, Periodo.getBlnestado()));*/
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
     
     
     
    
    public static ArrayList<ClasePeriodoAcademico> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClasePeriodoAcademico> lstPeriodoAcadmeico = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
                ClasePeriodoAcademico Periodo = new ClasePeriodoAcademico(
                        rs.getInt(0),
                        rs.getString(1),
                        rs.getBoolean(2),
                        rs.getDate(3),
                        rs.getDate(4));
                lstPeriodoAcadmeico.add(Periodo);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstPeriodoAcadmeico;
    }
    
}
