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
public class Inscricao {
    int codigoInscricao;
    Atividade atividadeInscricao;
    Aluno alunoInscricao;
    int codigoAtividade;
    int codigoParticipante;

    public Inscricao(int codigoInscricao, Atividade atividadeInscricao, Aluno alunoInscricao, int codigoAtividade, int codigoParticipante) {
        this.codigoInscricao = codigoInscricao;
        this.atividadeInscricao = atividadeInscricao;
        this.alunoInscricao = alunoInscricao;
        this.codigoAtividade = codigoAtividade;
        this.codigoParticipante = codigoParticipante;
    }

    public Inscricao() {
    }

    public Inscricao(int codigoInscricao, int codigoAtividade, int codigoParticipante) {
        this.codigoInscricao = codigoInscricao;
        this.codigoAtividade = codigoAtividade;
        this.codigoParticipante = codigoParticipante;
    }

    public int getCodigoInscricao() {
        return codigoInscricao;
    }

    public void setCodigoInscricao(int codigoInscricao) {
        this.codigoInscricao = codigoInscricao;
    }

    public Atividade getAtividadeInscricao() {
        return atividadeInscricao;
    }

    public void setAtividadeInscricao(Atividade atividadeInscricao) {
        this.atividadeInscricao = atividadeInscricao;
    }

    public Aluno getAlunoInscricao() {
        return alunoInscricao;
    }

    public void setAlunoInscricao(Aluno alunoInscricao) {
        this.alunoInscricao = alunoInscricao;
    }

    public int getCodigoAtividade() {
        return codigoAtividade;
    }

    public void setCodigoAtividade(int codigoAtividade) {
        this.codigoAtividade = codigoAtividade;
    }

    public int getCodigoParticipante() {
        return codigoParticipante;
    }

    public void setCodigoParticipante(int codigoParticipante) {
        this.codigoParticipante = codigoParticipante;
    }
    
    
    
}
