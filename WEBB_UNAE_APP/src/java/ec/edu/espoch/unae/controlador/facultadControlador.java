/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espoch.unae.controlador;
import ec.edu.espoch.unae.entidad.ClaseFacultad;
import ec.edu.espoch.unae.modelo.mFacultad;
import java.util.ArrayList;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author PC
 */
@ManagedBean
@RequestScoped
public class facultadControlador {

    private ClaseFacultad objFacultad;
    private ClaseFacultad seobjFacultad;
    private ArrayList<ClaseFacultad> lstFacultad;
    
    public facultadControlador() {
        this.objFacultad= new ClaseFacultad();
        this.seobjFacultad= new ClaseFacultad();
        this.lstFacultad= new ArrayList<>();
    }

    public ClaseFacultad getObjFacultad() {
        return objFacultad;
    }

    public void setObjFacultad(ClaseFacultad objFacultad) {
        this.objFacultad = objFacultad;
    }

    public ClaseFacultad getSeobjFacultad() {
        return seobjFacultad;
    }

    public void setSeobjFacultad(ClaseFacultad seobjFacultad) {
        this.seobjFacultad = seobjFacultad;
    }

    public ArrayList<ClaseFacultad> getLstFacultad() {
        return lstFacultad;
    }

    public void setLstFacultad(ArrayList<ClaseFacultad> lstFacultad) {
        this.lstFacultad = lstFacultad;
    }
   @PostConstruct
   private void reinit()
   {
       cargarFacultad();
   }
    public  void cargarFacultad()
    {
        try {
            this.lstFacultad=mFacultad.obtenerFacultad();
        } catch (Exception e) {
            System.out.println("e" + e.getMessage().toString());
        }
    }
}
