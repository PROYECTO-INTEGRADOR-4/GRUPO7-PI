/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.entidad;

/**
 *
 * @author PC
 */
public class ClaseNota {

    private int idnota;
    private int idestudiante;
    private Double notaexamenparcial;
    private Double notaexamenfinal;
    private Double notaproyectoaula;
    private Double notagestion1;
    private Double notagestion2;
    private Double notasubtotal;
    private Double notaexamenrecuperacion;
    private Double notapromediofinal;
    private Double notaporcentajeasistencia;

    public ClaseNota() {
    }

    public ClaseNota(int idnota, int idestudiante, Double notaexamenparcial, Double notaexamenfinal, Double notaproyectoaula, Double notagestion1, Double notagestion2, Double notasubtotal, Double notaexamenrecuperacion, Double notapromediofinal, Double notaporcentajeasistencia) {
        this.idnota = idnota;
        this.idestudiante = idestudiante;
        this.notaexamenparcial = notaexamenparcial;
        this.notaexamenfinal = notaexamenfinal;
        this.notaproyectoaula = notaproyectoaula;
        this.notagestion1 = notagestion1;
        this.notagestion2 = notagestion2;
        this.notasubtotal = notasubtotal;
        this.notaexamenrecuperacion = notaexamenrecuperacion;
        this.notapromediofinal = notapromediofinal;
        this.notaporcentajeasistencia = notaporcentajeasistencia;
    }

    public int getIdnota() {
        return idnota;
    }

    public void setIdnota(int idnota) {
        this.idnota = idnota;
    }

    public int getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(int idestudiante) {
        this.idestudiante = idestudiante;
    }

    public Double getNotaexamenparcial() {
        return notaexamenparcial;
    }

    public void setNotaexamenparcial(Double notaexamenparcial) {
        this.notaexamenparcial = notaexamenparcial;
    }

    public Double getNotaexamenfinal() {
        return notaexamenfinal;
    }

    public void setNotaexamenfinal(Double notaexamenfinal) {
        this.notaexamenfinal = notaexamenfinal;
    }

    public Double getNotaproyectoaula() {
        return notaproyectoaula;
    }

    public void setNotaproyectoaula(Double notaproyectoaula) {
        this.notaproyectoaula = notaproyectoaula;
    }

    public Double getNotagestion1() {
        return notagestion1;
    }

    public void setNotagestion1(Double notagestion1) {
        this.notagestion1 = notagestion1;
    }

    public Double getNotagestion2() {
        return notagestion2;
    }

    public void setNotagestion2(Double notagestion2) {
        this.notagestion2 = notagestion2;
    }

    public Double getNotasubtotal() {
        return notasubtotal;
    }

    public void setNotasubtotal(Double notasubtotal) {
        this.notasubtotal = notasubtotal;
    }

    public Double getNotaexamenrecuperacion() {
        return notaexamenrecuperacion;
    }

    public void setNotaexamenrecuperacion(Double notaexamenrecuperacion) {
        this.notaexamenrecuperacion = notaexamenrecuperacion;
    }

    public Double getNotapromediofinal() {
        return notapromediofinal;
    }

    public void setNotapromediofinal(Double notapromediofinal) {
        this.notapromediofinal = notapromediofinal;
    }

    public Double getNotaporcentajeasistencia() {
        return notaporcentajeasistencia;
    }

    public void setNotaporcentajeasistencia(Double notaporcentajeasistencia) {
        this.notaporcentajeasistencia = notaporcentajeasistencia;
    }
    
    
    

}
