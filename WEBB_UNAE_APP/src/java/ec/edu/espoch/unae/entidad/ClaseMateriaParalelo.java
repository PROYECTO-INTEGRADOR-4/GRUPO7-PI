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
public class ClaseMateriaParalelo {
    private int idmateriaparalelo;
    private int idmateria;
    private  int idparalelo;

    public ClaseMateriaParalelo() {
    }

    public ClaseMateriaParalelo(int idmateriaparalelo, int idmateria, int idparalelo) {
        this.idmateriaparalelo = idmateriaparalelo;
        this.idmateria = idmateria;
        this.idparalelo = idparalelo;
    }

    public int getIdmateriaparalelo() {
        return idmateriaparalelo;
    }

    public void setIdmateriaparalelo(int idmateriaparalelo) {
        this.idmateriaparalelo = idmateriaparalelo;
    }

    public int getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(int idmateria) {
        this.idmateria = idmateria;
    }

    public int getIdparalelo() {
        return idparalelo;
    }

    public void setIdparalelo(int idparalelo) {
        this.idparalelo = idparalelo;
    }
    
    
}
