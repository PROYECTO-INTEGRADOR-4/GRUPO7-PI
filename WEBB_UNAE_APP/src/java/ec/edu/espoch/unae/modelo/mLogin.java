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
import ec.edu.espoch.unae.entidad.ClaseRol;
import java.util.ArrayList;

/**
 *
 * @author LUIGUI
 */
public class mLogin {

    public static ClaseDocente login(String user, String password) throws Exception {
        ClaseDocente objLogin = new ClaseDocente();
        try {
            String sql = "SELECT * from unae.fn_select_usuario(?,?)";
            ArrayList<Parametro> lst = new ArrayList<>();
            lst.add(new Parametro(1, user));
            lst.add(new Parametro(2, password));

            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lst);
            if (rs.next()) // found
            {
                objLogin.setStrccdocente(rs.getString(0));
                objLogin.setStrClave(rs.getString(1));
                objLogin.setStrnombre(rs.getString(2));
                objLogin.setStrapellido(rs.getString(3));

                ClaseRol objRol = mRol.cargarRolPorId(rs.getInt(4));
                objLogin.setObjRol(objRol);

            } else {
                objLogin = null;
            }
        } catch (Exception e) {
            objLogin = null;
            throw e;
        }
        return objLogin;
    }

}
