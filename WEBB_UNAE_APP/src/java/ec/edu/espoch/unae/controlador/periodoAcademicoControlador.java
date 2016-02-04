/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClasePeriodoAcademico;
import ec.edu.espoch.unae.modelo.mPeriodoAcademico;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.DefaultRequestContext;

/**
 *
 * @author PC
 */
@ManagedBean
@ViewScoped
public class periodoAcademicoControlador {

    private ClasePeriodoAcademico objperiodo;
    private ClasePeriodoAcademico selOfperiodo;
    private ArrayList<ClasePeriodoAcademico> lstperiodo;

    public periodoAcademicoControlador() {
        this.objperiodo = new ClasePeriodoAcademico();
        this.selOfperiodo = new ClasePeriodoAcademico();
        this.lstperiodo = new ArrayList<>();
    }

    public ClasePeriodoAcademico getObjperiodo() {
        return objperiodo;
    }

    public void setObjperiodo(ClasePeriodoAcademico objperiodo) {
        this.objperiodo = objperiodo;
    }

    public ClasePeriodoAcademico getSelOfperiodo() {
        return selOfperiodo;
    }

    public void setSelOfperiodo(ClasePeriodoAcademico selOfperiodo) {
        this.selOfperiodo = selOfperiodo;
    }

    public ArrayList<ClasePeriodoAcademico> getLstperiodo() {
        return lstperiodo;
    }

    public void setLstperiodo(ArrayList<ClasePeriodoAcademico> lstperiodo) {
        this.lstperiodo = lstperiodo;
    }

    @PostConstruct
    private void reinit() {
        cargarPeriodoAcademico();
    }

    public void cargarPeriodoAcademico() {
        try {

            this.lstperiodo = mPeriodoAcademico.obtenerPeriodoAcademico();

        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }

    public void insertarPeriodoAcademico() {
        try {
            String a="a";
            if (mPeriodoAcademico.insertarPeriodoAcademico(objperiodo)) {
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                cargarPeriodoAcademico();
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
