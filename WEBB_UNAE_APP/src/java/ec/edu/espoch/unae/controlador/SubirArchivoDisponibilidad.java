/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;
//package org.primefaces.showcase.view.file;

import ec.edu.espoch.unae.entidad.ClaseDocente;
import ec.edu.espoch.unae.modelo.mIngresarDocente;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import jxl.Sheet;
import jxl.Workbook;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import recursos.Util;

/**
 *
 * @author LUIGUI
 */
@Named(value = "SubirArchivo")
@ManagedBean
@ViewScoped
public class SubirArchivoDisponibilidad {

    private String nombreArchivo = "";
    private ClaseDocente objDocente;
    private List<ClaseDocente> Lista = new ArrayList();

    public List<ClaseDocente> getLista() {
        return Lista;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setLista(List<ClaseDocente> Lista) {
        this.Lista = Lista;
    }

    public SubirArchivoDisponibilidad() {

        this.objDocente = new ClaseDocente();
    }

    private UploadedFile file;

    public UploadedFile getFile() {
        return file;
    }

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public void listar(FileUploadEvent event) {
        int x = 1; //Contador de columna interno
        try {

            Workbook archivoExcel = null;

            InputStream file1;
            file1 = event.getFile().getInputstream();
            //this.nombreArchivo = event.getFile().getFileName();

            archivoExcel = Workbook.getWorkbook(file1);

            for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++) // Recorre 
            // cada    
            // hoja                                                                                                                                                       
            {
                Sheet hoja = archivoExcel.getSheet(sheetNo);
                int numColumnas = hoja.getColumns();
                int numFilas = hoja.getRows();
                String data;
                for (int fila = 1; fila < numFilas; fila++) { // Recorre cada 
// fila de la 
// hoja 
                    ClaseDocente per = new ClaseDocente();
                    for (int columna = 0; columna < numColumnas; columna++) {

                        data = hoja.getCell(columna, fila).getContents();
                        switch (x) {

                            case 1:
                                per.setStrccdocente(data);
                                x++;
                                break;
                            case 2:
                                per.setStrapellido(data);
                                x++;
                                break;
                            case 3:
                                per.setStrnombre(data);
                                x++;
                                break;
                            case 4:
                                per.setStrhabilitacion(data);
                                x++;
                                break;
                            case 5:
                                per.setStrlugartrabajo(data);
                                x++;
                                break;
                            case 6:
                                per.setStrcargo(data);
                                x++;
                                break;
                            case 7:
                                per.setStrdireccionpostal(data);
                                x++;
                                break;
                            case 8:
                                per.setStremail(data);
                                x++;
                                break;
                            case 9:
                                per.setStrtitulotercernivel(data);
                                x++;
                                break;
                            case 10:
                                per.setStrtitulocuartonivel(data);
                                x++;
                                break;
                            case 11:
                                per.setStrareaconocimiento(data);
                                x++;
                                break;
                            case 12:
                                per.setStrciudadtrabajo(data);
                                x++;
                                break;
                            case 13:
                                per.setStrtelefonodomicilio(data);
                                x++;
                                break;
                            case 14:
                                per.setStrtelefonooficina(data);
                                x++;
                                break;
                            case 15:
                                per.setNumerocelular(data);
                                x++;
                                break;
                            case 16:
                                per.setStrfax(data);
                                x++;
                                break;
                            case 17:
                                per.setId_disponibilidad(Integer.parseInt(data));
                                x++;
                                break;
                            case 18:
                                per.setId_docentecentralizada(Integer.parseInt(data));
                                x++;
                                break;
                            case 19:
                                per.setId_tipodocente(Integer.parseInt(data));
                                x++;
                                break;
                            case 20:
                                per.setIntrol(Integer.parseInt(data));
                                x++;
                                break;
                            case 21:
                                per.setStrClave(data);
                                Lista.add(per);
                                x = 1;
                                break;
                        }
                    }
                }
            }
        } catch (Exception ioe) {
            ioe.printStackTrace();

        }
    }

    public void subirBD() {

        Iterator<ClaseDocente> it = Lista.iterator();
        while (it.hasNext()) {
            objDocente = it.next();
            try {
                if (mIngresarDocente.insertarDocente(objDocente)) {
                    Util.addSuccessMessage("Datos Insertados");
//                      FacesMessage message = new FacesMessage("Succesful subido .");
//                       FacesContext.getCurrentInstance().addMessage(null, message);
                }
            } catch (Exception ex) {
                Logger.getLogger(SubirArchivoDisponibilidad.class.getName()).log(Level.SEVERE, null, ex);
                FacesMessage message = new FacesMessage("fALLO  .");
                FacesContext.getCurrentInstance().addMessage(null, message);
            }

        }
    }

}
