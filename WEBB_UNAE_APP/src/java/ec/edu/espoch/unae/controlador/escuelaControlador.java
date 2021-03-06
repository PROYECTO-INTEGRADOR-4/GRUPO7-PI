/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseEscuela;
import ec.edu.espoch.unae.modelo.mEscuela;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author PC
 */
@ManagedBean
@ViewScoped
public class escuelaControlador {

    private ClaseEscuela objEscuela;
    private ClaseEscuela seolbjEscuela;
    private ArrayList<ClaseEscuela> lstEscuela;

    public escuelaControlador() {
        this.objEscuela = new ClaseEscuela();
        this.seolbjEscuela = new ClaseEscuela();
        this.lstEscuela = new ArrayList<>();
    }

    public ClaseEscuela getObjEscuela() {
        return objEscuela;
    }

    public void setObjEscuela(ClaseEscuela objEscuela) {
        this.objEscuela = objEscuela;
    }

    public ClaseEscuela getSeolbjEscuela() {
        return seolbjEscuela;
    }

    public void setSeolbjEscuela(ClaseEscuela seolbjEscuela) {
        this.seolbjEscuela = seolbjEscuela;
    }

    public ArrayList<ClaseEscuela> getLstEscuela() {
        return lstEscuela;
    }

    public void setLstEscuela(ArrayList<ClaseEscuela> lstEscuela) {
        this.lstEscuela = lstEscuela;
    }

    @PostConstruct
    private void reinit() {
        cargarEscuela();
    }

    public void cargarEscuela() {
        try {
            this.lstEscuela = mEscuela.obtenerEscuela();
        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

}
