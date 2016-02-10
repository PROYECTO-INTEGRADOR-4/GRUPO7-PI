/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;
//package org.primefaces.showcase.view.file;

import ec.edu.espoch.unae.entidad.ClaseEstudiante;
import ec.edu.espoch.unae.modelo.mIngresarEstudiante;
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
public class SubirArchivoMTN {

    private String nombreArchivo = "";
    private ClaseEstudiante objEtudiante;
    private List<ClaseEstudiante> Lista = new ArrayList();

    public List<ClaseEstudiante> getLista() {
        return Lista;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setLista(List<ClaseEstudiante> Lista) {
        this.Lista = Lista;
    }

    public SubirArchivoMTN() {

        this.objEtudiante = new ClaseEstudiante();
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
                for (int fila = 2; fila < numFilas; fila++) { // Recorre cada 
// fila de la 
// hoja 
                    ClaseEstudiante per = new ClaseEstudiante();
                    for (int columna = 0; columna < numColumnas; columna++) {

                        data = hoja.getCell(columna, fila).getContents();
                        switch (x) {

                            case 1:
                                per.setCcestudiante(data);
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
                                per.setStrfechadenacimiento(data);
                                x++;
                                break;
                            case 5:
                                per.setStrgenero(data);
                                x++;
                                break;
                            case 6:
                                per.setStrcarnetconadis(data);
                                x++;
                                break;
                            case 7:
                                per.setIntporcentajediscapacidad(Integer.parseInt(data));
                                x++;
                                break;
                            case 8:
                                per.setBlngarestudiante(Boolean.parseBoolean(data));
                                x++;
                                break;
                            case 9:
                                per.setStremail(data);
                                x++;
                                break;
                            case 10:
                                per.setNumerotelefono(data);
                                x++;
                                break;
                            case 11:
                                per.setNumerocelular(data);
                                x++;
                                break;
                            case 12:
                                per.setStretnia(data);
                                x++;
                                break;
                            case 13:
                                per.setStrunidadeducativa(data);
                                x++;
                                break;
                            case 14:
                                per.setStrfinanciamiento_ue(data);
                                x++;
                                break;
                            case 15:
                                per.setStrdireccion(data);
                                x++;
                                break;
                            case 16:
                                per.setId_estudiantecentralizada(Integer.parseInt(data));
                                x++;
                                break;
                            case 17:
                                per.setIdcanton(Integer.parseInt(data));
                                x++;
                                break;
                            case 18:
                                per.setId_periodocarrera(Integer.parseInt(data));
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

        Iterator<ClaseEstudiante> it = Lista.iterator();
        while (it.hasNext()) {
            objEtudiante = it.next();
            try {
                if (mIngresarEstudiante.insertarEstudiante(objEtudiante)) {
                    FacesContext context = FacesContext.getCurrentInstance();
                    context.addMessage("Exito", new FacesMessage("Datos insertados correctamente"));
                } else {
                    FacesContext context = FacesContext.getCurrentInstance();
                    context.addMessage("Fracaso", new FacesMessage("Datos no insertados"));
                }
            } catch (Exception ex) {
                Logger.getLogger(SubirArchivoMTN.class.getName()).log(Level.SEVERE, null, ex);
                FacesContext context = FacesContext.getCurrentInstance();
                context.addMessage("Exito", new FacesMessage(ex.getMessage()));

            }

        }
    }

}
