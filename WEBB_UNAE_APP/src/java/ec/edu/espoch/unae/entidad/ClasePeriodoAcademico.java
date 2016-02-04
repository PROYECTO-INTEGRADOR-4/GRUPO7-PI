/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.entidad;

import java.util.Date;



/**
 *
 * @author PC
 */
public class ClasePeriodoAcademico {
    private int idClasePeriodoAcademico;
    private String nombreClasePeriodoAcademico;
    private boolean estadoClasePeriodoAcademico;
    private Date fechainicioClasePeriodoAcademico;
    private Date fechafinClasePeriodoAcademico;

    public ClasePeriodoAcademico() {
    }

    public ClasePeriodoAcademico(int idClasePeriodoAcademico, String nombreClasePeriodoAcademico, Boolean estadoClasePeriodoAcademico, Date fechainicioClasePeriodoAcademico, Date fechafinClasePeriodoAcademico) {
        this.idClasePeriodoAcademico = idClasePeriodoAcademico;
        this.nombreClasePeriodoAcademico = nombreClasePeriodoAcademico;
        this.estadoClasePeriodoAcademico = estadoClasePeriodoAcademico;
        this.fechainicioClasePeriodoAcademico = fechainicioClasePeriodoAcademico;
        this.fechafinClasePeriodoAcademico = fechafinClasePeriodoAcademico;
    }

    public int getIdClasePeriodoAcademico() {
        return idClasePeriodoAcademico;
    }

    public void setIdClasePeriodoAcademico(int idClasePeriodoAcademico) {
        this.idClasePeriodoAcademico = idClasePeriodoAcademico;
    }

    public String getNombreClasePeriodoAcademico() {
        return nombreClasePeriodoAcademico;
    }

    public void setNombreClasePeriodoAcademico(String nombreClasePeriodoAcademico) {
        this.nombreClasePeriodoAcademico = nombreClasePeriodoAcademico;
    }

    public boolean isEstadoClasePeriodoAcademico() {
        return estadoClasePeriodoAcademico;
    }

    public void setEstadoClasePeriodoAcademico(boolean estadoClasePeriodoAcademico) {
        this.estadoClasePeriodoAcademico = estadoClasePeriodoAcademico;
    }
    
    

    public Date getFechainicioClasePeriodoAcademico() {
        return fechainicioClasePeriodoAcademico;
    }

    public void setFechainicioClasePeriodoAcademico(Date fechainicioClasePeriodoAcademico) {
        this.fechainicioClasePeriodoAcademico = fechainicioClasePeriodoAcademico;
    }

    public Date getFechafinClasePeriodoAcademico() {
        return fechafinClasePeriodoAcademico;
    }

    public void setFechafinClasePeriodoAcademico(Date fechafinClasePeriodoAcademico) {
        this.fechafinClasePeriodoAcademico = fechafinClasePeriodoAcademico;
    }

  
    
    
    
    
    
}
