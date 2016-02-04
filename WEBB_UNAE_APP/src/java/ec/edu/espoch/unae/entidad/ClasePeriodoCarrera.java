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
public class ClasePeriodoCarrera {
    private int idPeriodoCarrera;
    private int idPeriodo;
    private int idCarrera;

    public ClasePeriodoCarrera() {
    }

    public ClasePeriodoCarrera(int idPeriodoCarrera, int idPeriodo, int idCarrera) {
        this.idPeriodoCarrera = idPeriodoCarrera;
        this.idPeriodo = idPeriodo;
        this.idCarrera = idCarrera;
    }

    public int getIdPeriodoCarrera() {
        return idPeriodoCarrera;
    }

    public void setIdPeriodoCarrera(int idPeriodoCarrera) {
        this.idPeriodoCarrera = idPeriodoCarrera;
    }

    public int getIdPeriodo() {
        return idPeriodo;
    }

    public void setIdPeriodo(int idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }
    
    
}
