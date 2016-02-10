/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseTipoMateria;
import ec.edu.espoch.unae.modelo.mTipoMateria;
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
public class tipomateriaControlador {

    private ClaseTipoMateria objtipoMateria;
    private ClaseTipoMateria selobjTipoMateria;
    private ArrayList<ClaseTipoMateria> lstTipoMateria;

    public tipomateriaControlador() {
        this.objtipoMateria = new ClaseTipoMateria();
        this.selobjTipoMateria = new ClaseTipoMateria();
        this.lstTipoMateria = new ArrayList<>();
    }

    public ClaseTipoMateria getObjtipoMateria() {
        return objtipoMateria;
    }

    public void setObjtipoMateria(ClaseTipoMateria objtipoMateria) {
        this.objtipoMateria = objtipoMateria;
    }

    public ClaseTipoMateria getSelobjTipoMateria() {
        return selobjTipoMateria;
    }

    public void setSelobjTipoMateria(ClaseTipoMateria selobjTipoMateria) {
        this.selobjTipoMateria = selobjTipoMateria;
    }

    public ArrayList<ClaseTipoMateria> getLstTipoMateria() {
        return lstTipoMateria;
    }

    public void setLstTipoMateria(ArrayList<ClaseTipoMateria> lstTipoMateria) {
        this.lstTipoMateria = lstTipoMateria;
    }

    @PostConstruct
    private void reinit() {
        cargarTipoMateria();
    }

    public void cargarTipoMateria() {
        try {

            this.lstTipoMateria= mTipoMateria.obtenerTMateria();

        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

    public void insertarTipoMateria() {
        try {

            if (mTipoMateria.insertarTipoMateria(objtipoMateria)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarTipoMateria();
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
