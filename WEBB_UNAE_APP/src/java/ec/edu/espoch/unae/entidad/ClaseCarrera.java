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
public class ClaseCarrera {

    private int idcarrera;
    private String strnombrecarrera;
    private String strdescripcioncarrera;
    private String strnivel;

    private ClaseArea objArea;
    private ClaseEscuela objEscuela;

    public ClaseCarrera() {
    }

    public ClaseCarrera(int idcarrera, String strnombrecarrera, String strdescripcioncarrera, String strnivel, ClaseEscuela objEscuela, ClaseArea objArea) {
        this.idcarrera = idcarrera;
        this.strnombrecarrera = strnombrecarrera;
        this.strdescripcioncarrera = strdescripcioncarrera;
        this.strnivel = strnivel;
        this.objEscuela = objEscuela;
        this.objArea = objArea;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getStrnombrecarrera() {
        return strnombrecarrera;
    }

    public void setStrnombrecarrera(String strnombrecarrera) {
        this.strnombrecarrera = strnombrecarrera;
    }

    public String getStrdescripcioncarrera() {
        return strdescripcioncarrera;
    }

    public void setStrdescripcioncarrera(String strdescripcioncarrera) {
        this.strdescripcioncarrera = strdescripcioncarrera;
    }

    public String getStrnivel() {
        return strnivel;
    }

    public void setStrnivel(String strnivel) {
        this.strnivel = strnivel;
    }

    public ClaseEscuela getObjEscuela() {
        return objEscuela;
    }

    public void setObjEscuela(ClaseEscuela objEscuela) {
        this.objEscuela = objEscuela;
    }

    public ClaseArea getObjArea() {
        return objArea;
    }

    public void setObjArea(ClaseArea objArea) {
        this.objArea = objArea;
    }

}
