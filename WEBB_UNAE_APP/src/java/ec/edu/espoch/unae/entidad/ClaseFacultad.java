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
public class ClaseFacultad {
   private int idfacultad;
   private String codigoFacultad;
   private String codigonombreFacultad;
   private String descripcionFacultad;

    public ClaseFacultad() {
    }

    public ClaseFacultad(int idfacultad, String codigoFacultad, String codigonombreFacultad, String descripcionFacultad) {
        this.idfacultad = idfacultad;
        this.codigoFacultad = codigoFacultad;
        this.codigonombreFacultad = codigonombreFacultad;
        this.descripcionFacultad = descripcionFacultad;
    }

    public int getIdfacultad() {
        return idfacultad;
    }

    public void setIdfacultad(int idfacultad) {
        this.idfacultad = idfacultad;
    }

    public String getCodigoFacultad() {
        return codigoFacultad;
    }

    public void setCodigoFacultad(String codigoFacultad) {
        this.codigoFacultad = codigoFacultad;
    }

    public String getCodigonombreFacultad() {
        return codigonombreFacultad;
    }

    public void setCodigonombreFacultad(String codigonombreFacultad) {
        this.codigonombreFacultad = codigonombreFacultad;
    }

    public String getDescripcionFacultad() {
        return descripcionFacultad;
    }

    public void setDescripcionFacultad(String descripcionFacultad) {
        this.descripcionFacultad = descripcionFacultad;
    }
   
}
