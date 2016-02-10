/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseTipoMateria;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mTipoMateria {

    public static boolean insertarTipoMateria(ClaseTipoMateria TMateria) throws Exception {
        boolean respuesta = false;
        try {

            String sql = "SELECT * from unae.fn_insert_tipomateria(?,?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, TMateria.getStrdescripcion()));
            lst.add(new Parametro(2, TMateria.getPesomateria()));

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

    public static ArrayList<ClaseTipoMateria> obtenerTMateria() throws Exception {
        ArrayList<ClaseTipoMateria> lstTMateria = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            String sql = "SELECT * from unae.fn_select_tipomateria()";
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql);
            lstTMateria = llenarDatos(rs);
            rs = null;

        } catch (Exception e) {
            throw e;
        }
        return lstTMateria;
    }

    public static ArrayList<ClaseTipoMateria> llenarDatos(ConjuntoResultado rs) throws Exception {
        ArrayList<ClaseTipoMateria> lstTMateria = new ArrayList<>();
        try {
            //inicializamos la sentncia ssql
            while (rs.next()) {
                ClaseTipoMateria TMateria = new ClaseTipoMateria(
                        rs.getInt(0), 
                        rs.getString(1), 
                        rs.getInt(2));

                lstTMateria.add(TMateria);
            }

        } catch (Exception e) {
            throw e;
        }
        return lstTMateria;
    }

}
