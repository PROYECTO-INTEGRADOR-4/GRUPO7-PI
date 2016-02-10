/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseTipoMateria;
import ec.edu.espoch.unae.entidad.ClaseTipodocente;
import ec.edu.espoch.unae.modelo.mTipodocente;
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
public class tipodocenteControlador {

    private ClaseTipodocente objtipoDocente;
    private ClaseTipodocente selobjttipodocente;
    private ArrayList<ClaseTipodocente> lstTipoDocente;

    public tipodocenteControlador() {
        this.objtipoDocente = new ClaseTipodocente();
        this.selobjttipodocente = new ClaseTipodocente();
        this.lstTipoDocente = new ArrayList<>();
    }

    public ClaseTipodocente getObjtipoDocente() {
        return objtipoDocente;
    }

    public void setObjtipoDocente(ClaseTipodocente objtipoDocente) {
        this.objtipoDocente = objtipoDocente;
    }

    public ClaseTipodocente getSelobjttipodocente() {
        return selobjttipodocente;
    }

    public void setSelobjttipodocente(ClaseTipodocente selobjttipodocente) {
        this.selobjttipodocente = selobjttipodocente;
    }

    public ArrayList<ClaseTipodocente> getLstTipoDocente() {
        return lstTipoDocente;
    }

    public void setLstTipoDocente(ArrayList<ClaseTipodocente> lstTipoDocente) {
        this.lstTipoDocente = lstTipoDocente;
    }
    

    @PostConstruct
    private void reinit() {
        cargarTipoDocente();
    }

    public void cargarTipoDocente() {
        try {

            this.lstTipoDocente= mTipodocente.obtenerTDocente();
        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

    public void insertarTipoDocente() {
        try {

            if (mTipodocente.insertarTipoDocente(objtipoDocente)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarTipoDocente();
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
