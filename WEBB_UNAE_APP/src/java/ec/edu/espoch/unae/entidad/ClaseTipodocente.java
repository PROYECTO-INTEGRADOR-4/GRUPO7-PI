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
public class ClaseTipodocente {
    private int idTipodocente;
    private String strdescripcion;

    public ClaseTipodocente() {
    }

    public ClaseTipodocente(int idTipodocente, String strdescripcion) {
        this.idTipodocente = idTipodocente;
        this.strdescripcion = strdescripcion;
    }

    public int getIdTipodocente() {
        return idTipodocente;
    }

    public void setIdTipodocente(int idTipodocente) {
        this.idTipodocente = idTipodocente;
    }

    public String getStrdescripcion() {
        return strdescripcion;
    }

    public void setStrdescripcion(String strdescripcion) {
        this.strdescripcion = strdescripcion;
    }
    
    
}
