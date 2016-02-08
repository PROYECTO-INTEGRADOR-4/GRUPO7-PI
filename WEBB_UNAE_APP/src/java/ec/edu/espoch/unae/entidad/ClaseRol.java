/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.entidad;

/**
 *
 * @author LUIGUI
 */
public class ClaseRol {

    private int intRolCod;
    private String strRolDescripcion;

    public ClaseRol() {
    }

    public ClaseRol(int intRolCod, String strRolDescripcion) {
        this.intRolCod = intRolCod;
        this.strRolDescripcion = strRolDescripcion;
    }

    public int getIntRolCod() {
        return intRolCod;
    }

    public void setIntRolCod(int intRolCod) {
        this.intRolCod = intRolCod;
    }

    public String getStrRolDescripcion() {
        return strRolDescripcion;
    }

    public void setStrRolDescripcion(String strRolDescripcion) {
        this.strRolDescripcion = strRolDescripcion;
    }

}
