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
public class ClaseDisponibilidad {
    
    private int iddisponibilidad;
    private String diadisponibilidad;
    private String horadisponibilidad;
    private String jornadadisponibilidad;

    public ClaseDisponibilidad() {
    }

    public ClaseDisponibilidad(int iddisponibilidad, String diadisponibilidad, String horadisponibilidad, String jornadadisponibilidad) {
        this.iddisponibilidad = iddisponibilidad;
        this.diadisponibilidad = diadisponibilidad;
        this.horadisponibilidad = horadisponibilidad;
        this.jornadadisponibilidad = jornadadisponibilidad;
    }

    public int getIddisponibilidad() {
        return iddisponibilidad;
    }

    public void setIddisponibilidad(int iddisponibilidad) {
        this.iddisponibilidad = iddisponibilidad;
    }

    public String getDiadisponibilidad() {
        return diadisponibilidad;
    }

    public void setDiadisponibilidad(String diadisponibilidad) {
        this.diadisponibilidad = diadisponibilidad;
    }

    public String getHoradisponibilidad() {
        return horadisponibilidad;
    }

    public void setHoradisponibilidad(String horadisponibilidad) {
        this.horadisponibilidad = horadisponibilidad;
    }

    public String getJornadadisponibilidad() {
        return jornadadisponibilidad;
    }

    public void setJornadadisponibilidad(String jornadadisponibilidad) {
        this.jornadadisponibilidad = jornadadisponibilidad;
    }
    
            
}
