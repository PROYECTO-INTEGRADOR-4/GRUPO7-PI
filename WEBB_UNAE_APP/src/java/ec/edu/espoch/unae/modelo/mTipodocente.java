/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseTipodocente;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mTipodocente {

    public static boolean insertarTipoDocente(ClaseTipodocente TDocente) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT * from  unae.fn_insert_tipodocente(?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, TDocente.getStrdescripcion()));            
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

    public static ArrayList<ClaseTipodocente> obtenerTDocente() throws Exception {
        ArrayList<ClaseTipodocente> lstTDocente = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_tipodocente()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstTDocente = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstTDocente;
    }

    public static ArrayList<ClaseTipodocente> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseTipodocente> lstTDocente = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
                ClaseTipodocente TDocente = new ClaseTipodocente(
                        rs.getInt(0), 
                        rs.getString(1));

                lstTDocente.add(TDocente);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstTDocente;
    }
}
