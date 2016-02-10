/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseDocente;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mIngresarDocente {

    //metodo para insertar un periodo academico  
    public static boolean insertarDocente(ClaseDocente objDocente) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<>();
            String sql = "SELECT FROM unae.fn_insert_docente(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, objDocente.getStrccdocente()));
            lstP.add(new Parametro(2, objDocente.getStrapellido()));
            lstP.add(new Parametro(3, objDocente.getStrnombre()));
            lstP.add(new Parametro(4, objDocente.getStrhabilitacion()));
            lstP.add(new Parametro(5, objDocente.getStrlugartrabajo()));
            lstP.add(new Parametro(6, objDocente.getStrcargo()));
            lstP.add(new Parametro(7, objDocente.getStrdireccionpostal()));
            lstP.add(new Parametro(8, objDocente.getStremail()));
            lstP.add(new Parametro(9, objDocente.getStrtitulotercernivel()));
            lstP.add(new Parametro(10, objDocente.getStrtitulocuartonivel()));
            lstP.add(new Parametro(11, objDocente.getStrareaconocimiento()));
            lstP.add(new Parametro(12, objDocente.getStrciudadtrabajo()));
            lstP.add(new Parametro(13, objDocente.getStrtelefonodomicilio()));
            lstP.add(new Parametro(14, objDocente.getStrtelefonooficina()));
            lstP.add(new Parametro(15, objDocente.getNumerocelular()));
            lstP.add(new Parametro(16, objDocente.getStrfax()));
            lstP.add(new Parametro(17, objDocente.getId_disponibilidad()));
            lstP.add(new Parametro(18, objDocente.getId_docentecentralizada()));
            lstP.add(new Parametro(19, objDocente.getId_tipodocente()));
            lstP.add(new Parametro(20, objDocente.getIntrol()));
            lstP.add(new Parametro(21, objDocente.getStrClave()));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstP);
            while (rs.next()) {
                if (rs.getBoolean(0) == true) {
                    respuesta = true;
                }
            }
            rs = null;

        } catch (SQLException e) {
            System.out.println("error" + e.getMessage());
        }
        return respuesta;

    }

}
