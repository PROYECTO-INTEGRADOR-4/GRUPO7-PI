/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseParalelo;
import ec.edu.espoch.unae.modelo.mParalelo;
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
public class paraleloControlador {

    private ClaseParalelo objParalelo;
    private ClaseParalelo selobjParalelo;
    private ArrayList<ClaseParalelo> lstparalelo;

    public paraleloControlador() {
        this.objParalelo = new ClaseParalelo();
        this.selobjParalelo = new ClaseParalelo();
        this.lstparalelo = new ArrayList<>();
    }

    public ClaseParalelo getObjParalelo() {
        return objParalelo;
    }

    public void setObjParalelo(ClaseParalelo objParalelo) {
        this.objParalelo = objParalelo;
    }

    public ClaseParalelo getSelobjParalelo() {
        return selobjParalelo;
    }

    public void setSelobjParalelo(ClaseParalelo selobjParalelo) {
        this.selobjParalelo = selobjParalelo;
    }

    public ArrayList<ClaseParalelo> getLstparalelo() {
        return lstparalelo;
    }

    public void setLstparalelo(ArrayList<ClaseParalelo> lstparalelo) {
        this.lstparalelo = lstparalelo;
    }

    @PostConstruct
    private void reinit() {
        cargarParalelo();
    }

    public void cargarParalelo() {
        try {

            this.lstparalelo = mParalelo.obtenerParalelo();
        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

    public void insertarParalelo() {
        try {

            if (mParalelo.insertarParalelo(objParalelo)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarParalelo();
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
