/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author PC
 */
@ManagedBean
@RequestScoped
public class menuControldador {

    private String ruta;

    public menuControldador() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void frmCoordinador() {
        this.ruta = "../Coordinador/frmCoordinador.xhtml";
    }

    public void frmPeriodoAcademico() throws IOException {

        String evento = "";
        this.ruta = "faces/Coordinador/frmPeriodoAcademico.xhtml";
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().redirect(ruta);
    }
}
