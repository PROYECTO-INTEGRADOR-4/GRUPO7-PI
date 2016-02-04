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
public class ClaseTipoMateria {
    private int idtipomateria;
    private String strdescripcion;
    private int pesomateria;

    public ClaseTipoMateria() {
    }

    public ClaseTipoMateria(int idtipomateria, String strdescripcion, int pesomateria) {
        this.idtipomateria = idtipomateria;
        this.strdescripcion = strdescripcion;
        this.pesomateria = pesomateria;
    }

    public int getIdtipomateria() {
        return idtipomateria;
    }

    public void setIdtipomateria(int idtipomateria) {
        this.idtipomateria = idtipomateria;
    }

    public String getStrdescripcion() {
        return strdescripcion;
    }

    public void setStrdescripcion(String strdescripcion) {
        this.strdescripcion = strdescripcion;
    }

    public int getPesomateria() {
        return pesomateria;
    }

    public void setPesomateria(int pesomateria) {
        this.pesomateria = pesomateria;
    }
    
    
}
