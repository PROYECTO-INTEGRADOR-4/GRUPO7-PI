/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.entidad;
import ec.edu.espoch.unae.entidad.ClaseFacultad;

/**
 *
 * @author PC
 */
public class ClaseEscuela {
    
    private int idesceula;
    private String codigoescuela;
    private  String nombreescuela;
    private String descripcionescuela;
    private ClaseFacultad objFacultad;

    public ClaseEscuela() {
    }

    public ClaseEscuela(int idesceula, String codigoescuela, String nombreescuela, String descripcionescuela, ClaseFacultad objFacultad) {
        this.idesceula = idesceula;
        this.codigoescuela = codigoescuela;
        this.nombreescuela = nombreescuela;
        this.descripcionescuela = descripcionescuela;
        this.objFacultad = objFacultad;
    }
    
    

    public int getIdesceula() {
        return idesceula;
    }

    public void setIdesceula(int idesceula) {
        this.idesceula = idesceula;
    }

    public String getNombreescuela() {
        return nombreescuela;
    }

    public void setNombreescuela(String nombreescuela) {
        this.nombreescuela = nombreescuela;
    }


    public String getCodigoescuela() {
        return codigoescuela;
    }

    public void setCodigoescuela(String codigoescuela) {
        this.codigoescuela = codigoescuela;
    }

    public String getDescripcionescuela() {
        return descripcionescuela;
    }

    public void setDescripcionescuela(String descripcionescuela) {
        this.descripcionescuela = descripcionescuela;
    }

    public ClaseFacultad getObjFacultad() {
        return objFacultad;
    }

    public void setObjFacultad(ClaseFacultad objFacultad) {
        this.objFacultad = objFacultad;
    }
    
    
}
