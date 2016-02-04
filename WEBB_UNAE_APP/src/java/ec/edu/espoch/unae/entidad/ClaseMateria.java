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
public class ClaseMateria {
    private int idmateria;
    private String strnombremateria;
    private String strdescripcion;
    private int numerohorastotales;
    private int numerohorasemanales;
    private String strperiodo;
    private int idtipomateria;
    private int iddocente;

    public ClaseMateria() {
    }

    public ClaseMateria(int idmateria, String strnombremateria, String strdescripcion, int numerohorastotales, int numerohorasemanales, String strperiodo, int idtipomateria, int iddocente) {
        this.idmateria = idmateria;
        this.strnombremateria = strnombremateria;
        this.strdescripcion = strdescripcion;
        this.numerohorastotales = numerohorastotales;
        this.numerohorasemanales = numerohorasemanales;
        this.strperiodo = strperiodo;
        this.idtipomateria = idtipomateria;
        this.iddocente = iddocente;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public String getStrnombremateria() {
        return strnombremateria;
    }

    public void setStrnombremateria(String strnombremateria) {
        this.strnombremateria = strnombremateria;
    }

    public String getStrdescripcion() {
        return strdescripcion;
    }

    public void setStrdescripcion(String strdescripcion) {
        this.strdescripcion = strdescripcion;
    }

    public int getNumerohorastotales() {
        return numerohorastotales;
    }

    public void setNumerohorastotales(int numerohorastotales) {
        this.numerohorastotales = numerohorastotales;
    }

    public int getNumerohorasemanales() {
        return numerohorasemanales;
    }

    public void setNumerohorasemanales(int numerohorasemanales) {
        this.numerohorasemanales = numerohorasemanales;
    }

    public String getStrperiodo() {
        return strperiodo;
    }

    public void setStrperiodo(String strperiodo) {
        this.strperiodo = strperiodo;
    }

    public int getIdtipomateria() {
        return idtipomateria;
    }

    public void setIdtipomateria(int idtipomateria) {
        this.idtipomateria = idtipomateria;
    }

    public int getIddocente() {
        return iddocente;
    }

    public void setIddocente(int iddocente) {
        this.iddocente = iddocente;
    }
    
}
