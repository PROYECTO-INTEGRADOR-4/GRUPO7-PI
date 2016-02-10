/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseCarrera;
import ec.edu.espoch.unae.entidad.ClasePeriodoAcademico;
import ec.edu.espoch.unae.entidad.ClasePeriodoCarrera;
import ec.edu.espoch.unae.modelo.mPeriodoCarrera;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author PC
 */
@ManagedBean
@RequestScoped
public class periodocarreraControlador {
    
    private ClasePeriodoCarrera objPeriodoCarrera;
    private ClasePeriodoCarrera selobjPeriodoCarrera;
    private ArrayList<ClasePeriodoCarrera> lstPeriodoCarrera;

    public periodocarreraControlador() {
        this.objPeriodoCarrera = new ClasePeriodoCarrera();
        this.selobjPeriodoCarrera = new ClasePeriodoCarrera();
        this.lstPeriodoCarrera = new ArrayList<>();
    }
    
    public ClasePeriodoCarrera getObjPeriodoCarrera() {
        return objPeriodoCarrera;
    }
    
    public void setObjPeriodoCarrera(ClasePeriodoCarrera objPeriodoCarrera) {
        this.objPeriodoCarrera = objPeriodoCarrera;
    }
    
    public ClasePeriodoCarrera getSelobjPeriodoCarrera() {
        return selobjPeriodoCarrera;
    }
    
    public void setSelobjPeriodoCarrera(ClasePeriodoCarrera selobjPeriodoCarrera) {
        this.selobjPeriodoCarrera = selobjPeriodoCarrera;
    }
    
    public ArrayList<ClasePeriodoCarrera> getLstPeriodoCarrera() {
        return lstPeriodoCarrera;
    }
    
    public void setLstPeriodoCarrera(ArrayList<ClasePeriodoCarrera> lstPeriodoCarrera) {
        this.lstPeriodoCarrera = lstPeriodoCarrera;
    }

    @PostConstruct
    private void reinit() {
        
        ClasePeriodoAcademico objPeriodo = new ClasePeriodoAcademico();
        this.objPeriodoCarrera.setObjPeriodoAcademico(objPeriodo);
        this.selobjPeriodoCarrera.setObjPeriodoAcademico(objPeriodo);
        
        ClaseCarrera objCarrera = new ClaseCarrera();
        this.objPeriodoCarrera.setObjCarrera(objCarrera);
        this.selobjPeriodoCarrera.setObjCarrera(objCarrera);
        
        cargarPeriodoCarrera();
    }
    
    public void cargarPeriodoCarrera() {
        try {
            
            this.lstPeriodoCarrera=mPeriodoCarrera.obtenerPCarrera();
            
        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

    public void insertarCarrera() {
        try {
            
            if (mPeriodoCarrera.insertarPCarrera(objPeriodoCarrera)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarPeriodoCarrera();
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Fracaso", new FacesMessage("Datos no insertados"));
            }
        } catch (Exception e) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage("Exito", new FacesMessage(e.getMessage()));
            
        }
    }
    
}
