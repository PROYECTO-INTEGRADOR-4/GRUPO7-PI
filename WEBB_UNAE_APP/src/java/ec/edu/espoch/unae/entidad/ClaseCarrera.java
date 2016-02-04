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
    private int idarea;
    private int idescuela;
    private String strarea;
    private String strescuela;

    public ClaseCarrera() {
    }

    public ClaseCarrera(int idcarrera, String strnombrecarrera, String strdescripcioncarrera, String strnivel, int idarea, int idescuela, String strarea, String strescuela) {
        this.idcarrera = idcarrera;
        this.strnombrecarrera = strnombrecarrera;
        this.strdescripcioncarrera = strdescripcioncarrera;
        this.strnivel = strnivel;
        this.idarea = idarea;
        this.idescuela = idescuela;
        this.strarea = strarea;
        this.strescuela = strescuela;
    }

    public ClaseCarrera(int idcarrera, String strnombrecarrera, String strdescripcioncarrera, String strnivel, String strarea, String strescuela) {
        this.idcarrera = idcarrera;
        this.strnombrecarrera = strnombrecarrera;
        this.strdescripcioncarrera = strdescripcioncarrera;
        this.strnivel = strnivel;
        this.strarea = strarea;
        this.strescuela = strescuela;
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

    public int getIdarea() {
        return idarea;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public int getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(int idescuela) {
        this.idescuela = idescuela;
    }

    public String getStrarea() {
        return strarea;
    }

    public void setStrarea(String strarea) {
        this.strarea = strarea;
    }

    public String getStrescuela() {
        return strescuela;
    }

    public void setStrescuela(String strescuela) {
        this.strescuela = strescuela;
    }

    

}
