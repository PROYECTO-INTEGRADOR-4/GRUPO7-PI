/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseArea;
import ec.edu.espoch.unae.modelo.mArea;
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
public class areaControlador {

    private ClaseArea objtArea;
    private ClaseArea seolbjtArea;
    private ArrayList<ClaseArea> lstarea;

    /**
     * Creates a new instance of areaControlador
     */
    public areaControlador() {
        this.objtArea= new ClaseArea();
        this.seolbjtArea= new  ClaseArea();
        this.lstarea= new ArrayList<>();
    }

    public ClaseArea getObjtArea() {
        return objtArea;
    }

    public void setObjtArea(ClaseArea objtArea) {
        this.objtArea = objtArea;
    }

    public ClaseArea getSeolbjtArea() {
        return seolbjtArea;
    }

    public void setSeolbjtArea(ClaseArea seolbjtArea) {
        this.seolbjtArea = seolbjtArea;
    }

    public ArrayList<ClaseArea> getLstarea() {
        return lstarea;
    }

    public void setLstarea(ArrayList<ClaseArea> lstarea) {
        this.lstarea = lstarea;
    }
   @PostConstruct
    private void reinit() {
        cargarArea();
    }

    public void cargarArea() {
        try {

            this.lstarea= mArea.obtenerArea();

        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

    public void insertarArea() {
        try {
            
            if (mArea.insertarArea(objtArea)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarArea();
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
