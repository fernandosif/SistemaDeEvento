/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FND
 */
public class Usuario {
    private int codigoUsuario;
    private String loginUsuario;
    private String senhaUsuario;
    private int nivelUsuario;
    private String statusUsuario;

    public Usuario(int codigoUsuario, String loginUsuario, String senhaUsuario, int nivelUsuario, String statusUsuario) {
        this.codigoUsuario = codigoUsuario;
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
        this.nivelUsuario = nivelUsuario;
        this.statusUsuario = statusUsuario;
    }

    public Usuario() {
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public int getNivelUsuario() {
        return nivelUsuario;
    }

    public void setNivelUsuario(int nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    public String getStatusUsuario() {
        return statusUsuario;
    }

    public void setStatusUsuario(String statusUsuario) {
        this.statusUsuario = statusUsuario;
    }
    
    
    
}
