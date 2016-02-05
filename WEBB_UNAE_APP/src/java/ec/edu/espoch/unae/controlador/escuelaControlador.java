/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseEscuela;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author PC
 */
@ManagedBean
@RequestScoped
public class escuelaControlador {

    private ClaseEscuela objEscuela;
    private ClaseEscuela seolbjEscuela;
    private ArrayList<ClaseEscuela> lstEscuela;

    public escuelaControlador() {
        this.objEscuela= new ClaseEscuela();
        this.seolbjEscuela= new ClaseEscuela();
        this.lstEscuela= new ArrayList<>();
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
    

}
