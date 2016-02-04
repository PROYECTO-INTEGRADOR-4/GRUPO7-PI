/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseCarrera;
import ec.edu.espoch.unae.modelo.mCarrera;
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
public class carreraControlador {

    private ClaseCarrera objCarrera;
    private ClaseCarrera selobjCarrera;
    private ArrayList<ClaseCarrera> lstcarrea;

    public carreraControlador() {
        this.objCarrera = new ClaseCarrera();
        this.selobjCarrera = new ClaseCarrera();
        this.lstcarrea = new ArrayList<>();
    }

    public ClaseCarrera getObjCarrera() {
        return objCarrera;
    }

    public void setObjCarrera(ClaseCarrera objCarrera) {
        this.objCarrera = objCarrera;
    }

    public ClaseCarrera getSelobjCarrera() {
        return selobjCarrera;
    }

    public void setSelobjCarrera(ClaseCarrera selobjCarrera) {
        this.selobjCarrera = selobjCarrera;
    }

    public ArrayList<ClaseCarrera> getLstcarrea() {
        return lstcarrea;
    }

    public void setLstcarrea(ArrayList<ClaseCarrera> lstcarrea) {
        this.lstcarrea = lstcarrea;
    }

 
     @PostConstruct
    private void reinit() {
        cargarCarrera();
    }

    public void cargarCarrera() {
        try {

            this.lstcarrea= mCarrera.obtenerCarrera();

        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }
    public void insertarCarrera() {
        try {
        
            if (mCarrera.insertarArea(objCarrera)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarCarrera();
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
