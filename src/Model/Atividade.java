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
public class Atividade {
    private int codigoAtividade;
    private String descricaoAtividade;
    private int vagastAtividade;
    private int vagasdAtividade;
    private String ministranteAtividade;
    private String dataAtividade;
    private String horaiAtividade;
    private String horafAtividade;
    private String localAtividade;
    private String resumoAtividade;
    private int codCategoria;
    private int codEvento;
    private Categoria categoriaAtividade;
    private Evento eventoAtividade;

    public Atividade(int codigoAtividade, String descricaoAtividade, int vagastAtividade, int vagasdAtividade, String ministranteAtividade, String dataAtividade, String horaiAtividade, String horafAtividade, String localAtividade, String resumoAtividade,int codCategoria, int codEvento,Categoria categoriaAtividade, Evento eventoAtividade) {
        this.codigoAtividade = codigoAtividade;
        this.descricaoAtividade = descricaoAtividade;
        this.vagastAtividade = vagastAtividade;
        this.vagasdAtividade = vagasdAtividade;
        this.ministranteAtividade = ministranteAtividade;
        this.dataAtividade = dataAtividade;
        this.horaiAtividade = horaiAtividade;
        this.horafAtividade = horafAtividade;
        this.localAtividade = localAtividade;
        this.resumoAtividade = resumoAtividade;
        this.codCategoria = codCategoria;
        this.codEvento = codEvento;
        this.categoriaAtividade = categoriaAtividade;
        this.eventoAtividade = eventoAtividade;
    }

     
    public Atividade() {
    }

    public Atividade(int codigoAtividade, String descricaoAtividade, int vagastAtividade, int vagasdAtividade, String ministranteAtividade, String dataAtividade, String horaiAtividade, String horafAtividade, String localAtividade, String resumoAtividade, int codCategoria, int codEvento) {
        this.codigoAtividade = codigoAtividade;
        this.descricaoAtividade = descricaoAtividade;
        this.vagastAtividade = vagastAtividade;
        this.vagasdAtividade = vagasdAtividade;
        this.ministranteAtividade = ministranteAtividade;
        this.dataAtividade = dataAtividade;
        this.horaiAtividade = horaiAtividade;
        this.horafAtividade = horafAtividade;
        this.localAtividade = localAtividade;
        this.resumoAtividade = resumoAtividade;
        this.codCategoria = codCategoria;
        this.codEvento = codEvento;
    }

    public int getCodCategoria() {
        return codCategoria;
    }

    public void setCodCategoria(int codCategoria) {
        this.codCategoria = codCategoria;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public int getCodigoAtividade() {
        return codigoAtividade;
    }

    public void setCodigoAtividade(int codigoAtividade) {
        this.codigoAtividade = codigoAtividade;
    }

    public String getDescricaoAtividade() {
        return descricaoAtividade;
    }

    public void setDescricaoAtividade(String descricaoAtividade) {
        this.descricaoAtividade = descricaoAtividade;
    }

    public int getVagastAtividade() {
        return vagastAtividade;
    }

    public void setVagastAtividade(int vagastAtividade) {
        this.vagastAtividade = vagastAtividade;
    }

    public int getVagasdAtividade() {
        return vagasdAtividade;
    }

    public void setVagasdAtividade(int vagasdAtividade) {
        this.vagasdAtividade = vagasdAtividade;
    }

    public String getMinistranteAtividade() {
        return ministranteAtividade;
    }

    public void setMinistranteAtividade(String ministranteAtividade) {
        this.ministranteAtividade = ministranteAtividade;
    }

    public String getDataAtividade() {
        return dataAtividade;
    }

    public void setDataAtividade(String dataAtividade) {
        this.dataAtividade = dataAtividade;
    }

    public String getHoraiAtividade() {
        return horaiAtividade;
    }

    public void setHoraiAtividade(String horaiAtividade) {
        this.horaiAtividade = horaiAtividade;
    }

    public String getHorafAtividade() {
        return horafAtividade;
    }

    public void setHorafAtividade(String horafAtividade) {
        this.horafAtividade = horafAtividade;
    }

    public String getLocalAtividade() {
        return localAtividade;
    }

    public void setLocalAtividade(String localAtividade) {
        this.localAtividade = localAtividade;
    }

    public String getResumoAtividade() {
        return resumoAtividade;
    }

    public void setResumoAtividade(String resumoAtividade) {
        this.resumoAtividade = resumoAtividade;
    }

    public Categoria getCategoriaAtividade() {
        return categoriaAtividade;
    }

    public void setCategoriaAtividade(Categoria categoriaAtividade) {
        this.categoriaAtividade = categoriaAtividade;
    }

    public Evento getEventoAtividade() {
        return eventoAtividade;
    }

    public void setEventoAtividade(Evento eventoAtividade) {
        this.eventoAtividade = eventoAtividade;
    }
    
    
}
