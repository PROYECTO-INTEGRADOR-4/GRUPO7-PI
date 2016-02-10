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
    
    private ClasePeriodoAcademico objPeriodoAcademico;
    private ClaseCarrera objCarrera;

    public ClasePeriodoCarrera() {
    }

    public ClasePeriodoCarrera(int idPeriodoCarrera, int idPeriodo, int idCarrera, ClasePeriodoAcademico objPeriodoAcademico, ClaseCarrera objCarrera) {
        this.idPeriodoCarrera = idPeriodoCarrera;
        this.idPeriodo = idPeriodo;
        this.idCarrera = idCarrera;
        this.objPeriodoAcademico = objPeriodoAcademico;
        this.objCarrera = objCarrera;
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

    public ClasePeriodoAcademico getObjPeriodoAcademico() {
        return objPeriodoAcademico;
    }

    public void setObjPeriodoAcademico(ClasePeriodoAcademico objPeriodoAcademico) {
        this.objPeriodoAcademico = objPeriodoAcademico;
    }

    public ClaseCarrera getObjCarrera() {
        return objCarrera;
    }

    public void setObjCarrera(ClaseCarrera objCarrera) {
        this.objCarrera = objCarrera;
    }

    
}
