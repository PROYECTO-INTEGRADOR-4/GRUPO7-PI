/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseDisponibilidad;
import ec.edu.espoch.unae.modelo.mDisponibilidad;
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
public class disponibilidadControldaor {

    private ClaseDisponibilidad objDisponibilidad;
    private ClaseDisponibilidad selobjDisponibilidad;
    private ArrayList<ClaseDisponibilidad> lstdisponibilidad;

    public disponibilidadControldaor() {
        this.objDisponibilidad = new ClaseDisponibilidad();
        this.selobjDisponibilidad = new ClaseDisponibilidad();
        this.lstdisponibilidad = new ArrayList<>();
    }

    public ClaseDisponibilidad getObjDisponibilidad() {
        return objDisponibilidad;
    }

    public void setObjDisponibilidad(ClaseDisponibilidad objDisponibilidad) {
        this.objDisponibilidad = objDisponibilidad;
    }

    public ClaseDisponibilidad getSelobjDisponibilidad() {
        return selobjDisponibilidad;
    }

    public void setSelobjDisponibilidad(ClaseDisponibilidad selobjDisponibilidad) {
        this.selobjDisponibilidad = selobjDisponibilidad;
    }

    public ArrayList<ClaseDisponibilidad> getLstdisponibilidad() {
        return lstdisponibilidad;
    }

    public void setLstdisponibilidad(ArrayList<ClaseDisponibilidad> lstdisponibilidad) {
        this.lstdisponibilidad = lstdisponibilidad;
    }

    @PostConstruct
    private void reinit() {
        cargarDisponibilidad();
    }

    public void cargarDisponibilidad() {
        try {

            this.lstdisponibilidad = mDisponibilidad.obtenerDisponibilidad();

        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

    public void insertarDisponibilidad() {
        try {

            if (mDisponibilidad.insertarDisponibilidad(objDisponibilidad)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarDisponibilidad();
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
