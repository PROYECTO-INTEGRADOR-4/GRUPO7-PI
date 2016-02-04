/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseParalelo;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mParalelo {

    public static boolean insertarParalelo(ClaseParalelo Paralelo) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT unae.fn_insert_paralelo(?,?,?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, Paralelo.getStrnombreparalelo()));
            lst.add(new Parametro(2, Paralelo.getStrdescripcionparalelo()));
            lst.add(new Parametro(3, Paralelo.getStrubicacion()));
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

    public static ArrayList<ClaseParalelo> obtenerParalelo() throws Exception {
        ArrayList<ClaseParalelo> lstParalelo = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_paralelo()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstParalelo = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstParalelo;
    }

    public static ArrayList<ClaseParalelo> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseParalelo> lstParalelo = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
               ClaseParalelo Paralelo= new ClaseParalelo(
                       rs.getInt(0), 
                       rs.getString(1), 
                       rs.getString(2), 
                       rs.getString(3));

                lstParalelo.add(Paralelo);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstParalelo;
    }

}
