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
public class Frequencia {
    private int codigoFrequencia;
    private Evento eventoFrequencia;
    private Atividade atividadeFrequencia;
    private String frequenciaFrequencia;
    private int codEvento;
    private int codAtividade;

    public Frequencia(int codigoFrequencia, Evento eventoFrequencia, Atividade atividadeFrequencia, String frequenciaFrequencia, int codEvento, int codAtividade) {
        this.codigoFrequencia = codigoFrequencia;
        this.eventoFrequencia = eventoFrequencia;
        this.atividadeFrequencia = atividadeFrequencia;
        this.frequenciaFrequencia = frequenciaFrequencia;
        this.codEvento = codEvento;
        this.codAtividade = codAtividade;
    }

    public Frequencia(int codigoFrequencia, String frequenciaFrequencia, int codEvento, int codAtividade) {
        this.codigoFrequencia = codigoFrequencia;
        this.frequenciaFrequencia = frequenciaFrequencia;
        this.codEvento = codEvento;
        this.codAtividade = codAtividade;
    }

    public Frequencia() {
    }

    public int getCodigoFrequencia() {
        return codigoFrequencia;
    }

    public void setCodigoFrequencia(int codigoFrequencia) {
        this.codigoFrequencia = codigoFrequencia;
    }

    public Evento getEventoFrequencia() {
        return eventoFrequencia;
    }

    public void setEventoFrequencia(Evento eventoFrequencia) {
        this.eventoFrequencia = eventoFrequencia;
    }

    public Atividade getAtividadeFrequencia() {
        return atividadeFrequencia;
    }

    public void setAtividadeFrequencia(Atividade atividadeFrequencia) {
        this.atividadeFrequencia = atividadeFrequencia;
    }

    public String getFrequenciaFrequencia() {
        return frequenciaFrequencia;
    }

    public void setFrequenciaFrequencia(String frequenciaFrequencia) {
        this.frequenciaFrequencia = frequenciaFrequencia;
    }

    public int getCodEvento() {
        return codEvento;
    }

    public void setCodEvento(int codEvento) {
        this.codEvento = codEvento;
    }

    public int getCodAtividade() {
        return codAtividade;
    }

    public void setCodAtividade(int codAtividade) {
        this.codAtividade = codAtividade;
    }
    
    
}
