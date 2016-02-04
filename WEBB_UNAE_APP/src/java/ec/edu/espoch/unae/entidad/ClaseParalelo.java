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
public class ClaseParalelo {
    private int idparalelo;
    private String strnombreparalelo;
    private String strdescripcionparalelo;
    private String strubicacion;

    public ClaseParalelo() {
    }

    public ClaseParalelo(int idparalelo, String strnombreparalelo, String strdescripcionparalelo, String strubicacion) {
        this.idparalelo = idparalelo;
        this.strnombreparalelo = strnombreparalelo;
        this.strdescripcionparalelo = strdescripcionparalelo;
        this.strubicacion = strubicacion;
    }

    public int getIdparalelo() {
        return idparalelo;
    }

    public void setIdparalelo(int idparalelo) {
        this.idparalelo = idparalelo;
    }

    public String getStrnombreparalelo() {
        return strnombreparalelo;
    }

    public void setStrnombreparalelo(String strnombreparalelo) {
        this.strnombreparalelo = strnombreparalelo;
    }

    public String getStrdescripcionparalelo() {
        return strdescripcionparalelo;
    }

    public void setStrdescripcionparalelo(String strdescripcionparalelo) {
        this.strdescripcionparalelo = strdescripcionparalelo;
    }

    public String getStrubicacion() {
        return strubicacion;
    }

    public void setStrubicacion(String strubicacion) {
        this.strubicacion = strubicacion;
    }
    
    
}
