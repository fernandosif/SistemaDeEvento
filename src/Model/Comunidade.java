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
public class Comunidade {
    private int codigoComunidade;
    private String nomeComunidade;
    private String cpfComunidade;
    private String instituicaoComunidade;
    private String emailComunidade;
    private String tipoComunidade;
    private String telefoneComunidade;

    public Comunidade(int codigoComunidade, String nomeComunidade, String cpfComunidade, String instituicaoComunidade, String emailComunidade, String tipoComunidade, String telefoneComunidade) {
        this.codigoComunidade = codigoComunidade;
        this.nomeComunidade = nomeComunidade;
        this.cpfComunidade = cpfComunidade;
        this.instituicaoComunidade = instituicaoComunidade;
        this.emailComunidade = emailComunidade;
        this.tipoComunidade = tipoComunidade;
        this.telefoneComunidade = telefoneComunidade;
    }

    public Comunidade() {
    }

    public int getCodigoComunidade() {
        return codigoComunidade;
    }

    public void setCodigoComunidade(int codigoComunidade) {
        this.codigoComunidade = codigoComunidade;
    }

    public String getNomeComunidade() {
        return nomeComunidade;
    }

    public void setNomeComunidade(String nomeComunidade) {
        this.nomeComunidade = nomeComunidade;
    }

    public String getCpfComunidade() {
        return cpfComunidade;
    }

    public void setCpfComunidade(String cpfComunidade) {
        this.cpfComunidade = cpfComunidade;
    }

    public String getInstituicaoComunidade() {
        return instituicaoComunidade;
    }

    public void setInstituicaoComunidade(String instituicaoComunidade) {
        this.instituicaoComunidade = instituicaoComunidade;
    }

    public String getEmailComunidade() {
        return emailComunidade;
    }

    public void setEmailComunidade(String emailComunidade) {
        this.emailComunidade = emailComunidade;
    }

    public String getTipoComunidade() {
        return tipoComunidade;
    }

    public void setTipoComunidade(String tipoComunidade) {
        this.tipoComunidade = tipoComunidade;
    }

    public String getTelefoneComunidade() {
        return telefoneComunidade;
    }

    public void setTelefoneComunidade(String telefoneComunidade) {
        this.telefoneComunidade = telefoneComunidade;
    }
    
    
}
