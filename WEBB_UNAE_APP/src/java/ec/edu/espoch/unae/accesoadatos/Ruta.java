/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.accesoadatos;
import java.net.URL;
/**
 *
 * @author root
 */
public class Ruta {
    //OJO AQUI VA EL PATH RELATIVO DEL ARCHIVO PROPERTIES
    private final String dbOracle="/ec/edu/espoch/unae/accesoadatos/dboracle.properties";
    private final String dbMysql="/ec/edu/espoch/unae/accesoadatos/dbmysql.properties";
    private final String dbPostgres="/ec/edu/espoch/unae/accesoadatos/dbpostgres.properties";
    private final String dbSqlServer="/ec/edu/espoch/unae/accesoadatos/dbsqlserver.properties";
    
    public URL getFileDbOracle(){
        return getClass().getResource(dbOracle);
    }
    
    public URL getFileDbMysql(){
        return getClass().getResource(dbMysql);
    }
    
    public URL getFileDbPostgres(){
        return getClass().getResource(dbPostgres);
    }
    
    public URL getFileDbSqlServer(){
        return getClass().getResource(dbSqlServer);
    }
}
