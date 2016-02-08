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
public class ClaseUsuario {

    private int intUsuarioCod;
    private String strUsuarioUsu;
    private String strUsuarioClav;
    private int intUsuarioTipo;

    public ClaseUsuario() {
    }

    
    
    public ClaseUsuario(int intUsuarioCod, String strUsuarioUsu, String strUsuarioClav, int intUsuarioTipo) {
        this.intUsuarioCod = intUsuarioCod;
        this.strUsuarioUsu = strUsuarioUsu;
        this.strUsuarioClav = strUsuarioClav;
        this.intUsuarioTipo = intUsuarioTipo;
    }

    public int getIntUsuarioCod() {
        return intUsuarioCod;
    }

    public void setIntUsuarioCod(int intUsuarioCod) {
        this.intUsuarioCod = intUsuarioCod;
    }

    public String getStrUsuarioUsu() {
        return strUsuarioUsu;
    }

    public void setStrUsuarioUsu(String strUsuarioUsu) {
        this.strUsuarioUsu = strUsuarioUsu;
    }

    public String getStrUsuarioClav() {
        return strUsuarioClav;
    }

    public void setStrUsuarioClav(String strUsuarioClav) {
        this.strUsuarioClav = strUsuarioClav;
    }

    public int getIntUsuarioTipo() {
        return intUsuarioTipo;
    }

    public void setIntUsuarioTipo(int intUsuarioTipo) {
        this.intUsuarioTipo = intUsuarioTipo;
    }

    

}
