/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.modelo;

import ec.edu.espoch.unae.accesoadatos.AccesoDatos;
import ec.edu.espoch.unae.accesoadatos.ConjuntoResultado;
import ec.edu.espoch.unae.accesoadatos.Parametro;
import ec.edu.espoch.unae.entidad.ClaseEstudiante;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class mIngresarEstudiante {

    //metodo para insertar un periodo academico  
    public static boolean insertarEstudiante(ClaseEstudiante objEstudiante) throws Exception {
        boolean respuesta = false;
        try {
            ArrayList<Parametro> lstP = new ArrayList<>();
            String sql = "SELECT FROM unae.fn_insert_estudiante(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            lstP.add(new Parametro(1, objEstudiante.getCcestudiante()));
            lstP.add(new Parametro(2, objEstudiante.getStrapellido()));
            lstP.add(new Parametro(3, objEstudiante.getStrnombre()));
            lstP.add(new Parametro(4, objEstudiante.getStrfechadenacimiento()));
            lstP.add(new Parametro(5, objEstudiante.getStrgenero()));
            lstP.add(new Parametro(6, objEstudiante.getStrcarnetconadis()));
            lstP.add(new Parametro(7, objEstudiante.getIntporcentajediscapacidad()));
            lstP.add(new Parametro(8, objEstudiante.getBlngarestudiante()));
            lstP.add(new Parametro(9, objEstudiante.getStremail()));
            lstP.add(new Parametro(10, objEstudiante.getNumerotelefono()));
            lstP.add(new Parametro(11, objEstudiante.getNumerocelular()));
            lstP.add(new Parametro(12, objEstudiante.getStretnia()));
            lstP.add(new Parametro(13, objEstudiante.getStrunidadeducativa()));
            lstP.add(new Parametro(14, objEstudiante.getStrfinanciamiento_ue()));
            lstP.add(new Parametro(15, objEstudiante.getStrdireccion()));
            lstP.add(new Parametro(16, objEstudiante.getId_estudiantecentralizada()));
            lstP.add(new Parametro(17, objEstudiante.getIdcanton()));
            lstP.add(new Parametro(18, objEstudiante.getId_periodocarrera()));

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
