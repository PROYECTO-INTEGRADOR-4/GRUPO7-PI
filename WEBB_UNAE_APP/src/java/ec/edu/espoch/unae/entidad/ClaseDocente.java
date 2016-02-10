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
public class ClaseDocente {

    private int int_iddocente;
    private String strccdocente;
    private String strapellido;
    private String strnombre;
    private String strhabilitacion;
    private String strlugartrabajo;
    private String strcargo;
    private String strdireccionpostal;
    private String stremail;
    private String strtitulotercernivel;
    private String strtitulocuartonivel;
    private String strareaconocimiento;
    private String strtipodocente;
    private String strciudadtrabajo;
    private String strtelefonodomicilio;
    private String strtelefonooficina;
    private String numerocelular;
    private String strfax;
    private Integer id_disponibilidad;
    private Integer id_docentecentralizada;
    private Integer id_tipodocente;
    private String strUsuario;
    private String strClave;
    private ClaseRol ObjRol;
    private int introl;

    public ClaseDocente() {
    }

    public ClaseDocente(int int_iddocente, String strccdocente, String strapellido, String strnombre, String strhabilitacion, String strlugartrabajo, String strcargo, String strdireccionpostal, String stremail, String strtitulotercernivel, String strtitulocuartonivel, String strareaconocimiento, String strtipodocente, String strciudadtrabajo, String strtelefonodomicilio, String strtelefonooficina, String numerocelular, String strfax, Integer id_disponibilidad, Integer id_docentecentralizada, Integer id_tipodocente, String strUsuario, String strClave, ClaseRol ObjRol, String strrol) {
        this.int_iddocente = int_iddocente;
        this.strccdocente = strccdocente;
        this.strapellido = strapellido;
        this.strnombre = strnombre;
        this.strhabilitacion = strhabilitacion;
        this.strlugartrabajo = strlugartrabajo;
        this.strcargo = strcargo;
        this.strdireccionpostal = strdireccionpostal;
        this.stremail = stremail;
        this.strtitulotercernivel = strtitulotercernivel;
        this.strtitulocuartonivel = strtitulocuartonivel;
        this.strareaconocimiento = strareaconocimiento;
        this.strtipodocente = strtipodocente;
        this.strciudadtrabajo = strciudadtrabajo;
        this.strtelefonodomicilio = strtelefonodomicilio;
        this.strtelefonooficina = strtelefonooficina;
        this.numerocelular = numerocelular;
        this.strfax = strfax;
        this.id_disponibilidad = id_disponibilidad;
        this.id_docentecentralizada = id_docentecentralizada;
        this.id_tipodocente = id_tipodocente;
        this.strUsuario = strUsuario;
        this.strClave = strClave;
        this.ObjRol = ObjRol;
        this.introl = introl;
    }

    public int getIntrol() {
        return introl;
    }

    public void setIntrol(int introl) {
        this.introl = introl;
    }

   

    
    public int getInt_iddocente() {
        return int_iddocente;
    }

    public void setInt_iddocente(int int_iddocente) {
        this.int_iddocente = int_iddocente;
    }

    public String getStrccdocente() {
        return strccdocente;
    }

    public void setStrccdocente(String strccdocente) {
        this.strccdocente = strccdocente;
    }

    public String getStrapellido() {
        return strapellido;
    }

    public void setStrapellido(String strapellido) {
        this.strapellido = strapellido;
    }

    public String getStrnombre() {
        return strnombre;
    }

    public void setStrnombre(String strnombre) {
        this.strnombre = strnombre;
    }

    public String getStrhabilitacion() {
        return strhabilitacion;
    }

    public void setStrhabilitacion(String strhabilitacion) {
        this.strhabilitacion = strhabilitacion;
    }

    public String getStrlugartrabajo() {
        return strlugartrabajo;
    }

    public void setStrlugartrabajo(String strlugartrabajo) {
        this.strlugartrabajo = strlugartrabajo;
    }

    public String getStrcargo() {
        return strcargo;
    }

    public void setStrcargo(String strcargo) {
        this.strcargo = strcargo;
    }

    public String getStrdireccionpostal() {
        return strdireccionpostal;
    }

    public void setStrdireccionpostal(String strdireccionpostal) {
        this.strdireccionpostal = strdireccionpostal;
    }

    public String getStremail() {
        return stremail;
    }

    public void setStremail(String stremail) {
        this.stremail = stremail;
    }

    public String getStrtitulotercernivel() {
        return strtitulotercernivel;
    }

    public void setStrtitulotercernivel(String strtitulotercernivel) {
        this.strtitulotercernivel = strtitulotercernivel;
    }

    public String getStrtitulocuartonivel() {
        return strtitulocuartonivel;
    }

    public void setStrtitulocuartonivel(String strtitulocuartonivel) {
        this.strtitulocuartonivel = strtitulocuartonivel;
    }

    public String getStrareaconocimiento() {
        return strareaconocimiento;
    }

    public void setStrareaconocimiento(String strareaconocimiento) {
        this.strareaconocimiento = strareaconocimiento;
    }

    public String getStrtipodocente() {
        return strtipodocente;
    }

    public void setStrtipodocente(String strtipodocente) {
        this.strtipodocente = strtipodocente;
    }

    public String getStrciudadtrabajo() {
        return strciudadtrabajo;
    }

    public void setStrciudadtrabajo(String strciudadtrabajo) {
        this.strciudadtrabajo = strciudadtrabajo;
    }

    public String getStrtelefonodomicilio() {
        return strtelefonodomicilio;
    }

    public void setStrtelefonodomicilio(String strtelefonodomicilio) {
        this.strtelefonodomicilio = strtelefonodomicilio;
    }

    public String getStrtelefonooficina() {
        return strtelefonooficina;
    }

    public void setStrtelefonooficina(String strtelefonooficina) {
        this.strtelefonooficina = strtelefonooficina;
    }

    public String getNumerocelular() {
        return numerocelular;
    }

    public void setNumerocelular(String numerocelular) {
        this.numerocelular = numerocelular;
    }

    public String getStrfax() {
        return strfax;
    }

    public void setStrfax(String strfax) {
        this.strfax = strfax;
    }

    public Integer getId_disponibilidad() {
        return id_disponibilidad;
    }

    public void setId_disponibilidad(Integer id_disponibilidad) {
        this.id_disponibilidad = id_disponibilidad;
    }

    public Integer getId_docentecentralizada() {
        return id_docentecentralizada;
    }

    public void setId_docentecentralizada(Integer id_docentecentralizada) {
        this.id_docentecentralizada = id_docentecentralizada;
    }

    public Integer getId_tipodocente() {
        return id_tipodocente;
    }

    public void setId_tipodocente(Integer id_tipodocente) {
        this.id_tipodocente = id_tipodocente;
    }

    public String getStrUsuario() {
        return strUsuario;
    }

    public void setStrUsuario(String strUsuario) {
        this.strUsuario = strUsuario;
    }

    public String getStrClave() {
        return strClave;
    }

    public void setStrClave(String strClave) {
        this.strClave = strClave;
    }

    public ClaseRol getObjRol() {
        return ObjRol;
    }

    public void setObjRol(ClaseRol ObjRol) {
        this.ObjRol = ObjRol;
    }

}
