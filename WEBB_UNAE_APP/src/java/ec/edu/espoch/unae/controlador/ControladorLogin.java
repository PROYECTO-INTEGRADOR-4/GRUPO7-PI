/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espoch.unae.controlador;

import ec.edu.espoch.unae.entidad.ClaseDocente;
import ec.edu.espoch.unae.entidad.ClaseRol;
import ec.edu.espoch.unae.modelo.mLogin;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;

@ManagedBean
@SessionScoped
@Named("controladorLogin")
public class ControladorLogin implements Serializable {

    /**
     * Creates a new instance of ControladorLogin
     */
    private String username;
    private String password;
    private ClaseDocente objLogin;
    private ClaseRol objRol;
    private boolean loggedIn = false;

    public ControladorLogin() {
        this.objLogin = new ClaseDocente();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ClaseDocente getObjLogin() {
        return objLogin;
    }

    public void setObjLogin(ClaseDocente objLogin) {
        this.objLogin = objLogin;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }

    public ClaseRol getObjRol() {
        return objRol;
    }

    public void setObjRol(ClaseRol objRol) {
        this.objRol = objRol;
    }

    public void login(ActionEvent event) throws Exception {
        RequestContext context = RequestContext.getCurrentInstance();
        FacesMessage message = null;

        if (username != null && password != null) {
            objLogin = mLogin.login(username, password);
            if (objLogin != null) {
                loggedIn = true;
                message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienbenido",
                        objLogin.getObjRol().getStrRolDescripcion() + objLogin.getStrnombre());
            } else {
                loggedIn = false;
                message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Credenciales incorrectas");
            }
        }
        FacesContext.getCurrentInstance().addMessage(null, message);
        context.addCallbackParam("loggedIn", loggedIn);
        if (loggedIn) {
            redireccionarPaginas(context);
            
        }
    }

    private void redireccionarPaginas(RequestContext context) {
        switch (this.objLogin.getObjRol().getStrRolDescripcion()) {
            case "Coordinador":
                context.addCallbackParam("view", "Coordinador/frmCoordinador.xhtml");
                break;
            case "Docente":
                context.addCallbackParam("view", "Docente/frmDocente.xhtml");
                break;

        }
            }

    public void logout() {
        HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        loggedIn = false;
        objLogin = null;
    }
}
