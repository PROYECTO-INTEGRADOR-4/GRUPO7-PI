/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.entidad;

/**
 *
 * @author PC
 */
public class ClaseArea {
    private int idarea;
    private String strarea;
    private String strdescripcion;

    public ClaseArea() {
    }

    public ClaseArea(int idarea, String strarea, String strdescripcion) {
        this.idarea = idarea;
        this.strarea = strarea;
        this.strdescripcion = strdescripcion;
    }

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public String getStrarea() {
        return strarea;
    }

    public void setStrarea(String strarea) {
        this.strarea = strarea;
    }

    public String getStrdescripcion() {
        return strdescripcion;
    }

    public void setStrdescripcion(String strdescripcion) {
        this.strdescripcion = strdescripcion;
    }
    
    
}
