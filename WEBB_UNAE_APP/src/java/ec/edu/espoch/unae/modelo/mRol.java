/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseRol;
import java.util.ArrayList;

/**
 *
 * @author LUIGUI
 */
public class mRol {
    
    public static ClaseRol cargarRolPorId(int intRolCod) throws Exception {
        ClaseRol objRol = new ClaseRol();
        try {
            String sql = "select *from unae.fn_select_rolxid(?)";
            ArrayList lstParam = new ArrayList();
            lstParam.add(new Parametro(1, intRolCod));
            ConjuntoResultado rs = AccesoDatos.ejecutaQuery(sql, lstParam);
            while (rs.next()) {
                objRol.setIntRolCod(rs.getInt(0));
                objRol.setStrRolDescripcion(rs.getString(1));
            }
        } catch (Exception e) {
            objRol = null;
            throw e;
        }
        
        return objRol;
    }
    
}
