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
public class Aluno {
    private int codigoAluno;
    private String nomeAluno;
    private String emailAluno;
    private String categoriaAluno;
    private String raAluno;
    private String cursoAluno;
    private String turmaAluno;

    public Aluno(int codigoAluno, String nomeAluno, String emailAluno, String categoriaAluno, String raAluno, String cursoAluno, String turmaAluno) {
        this.codigoAluno = codigoAluno;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.categoriaAluno = categoriaAluno;
        this.raAluno = raAluno;
        this.cursoAluno = cursoAluno;
        this.turmaAluno = turmaAluno;
    }

    public Aluno() {
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getCategoriaAluno() {
        return categoriaAluno;
    }

    public void setCategoriaAluno(String categoriaAluno) {
        this.categoriaAluno = categoriaAluno;
    }

    public String getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    public String getTurmaAluno() {
        return turmaAluno;
    }

    public void setTurmaAluno(String turmaAluno) {
        this.turmaAluno = turmaAluno;
    }
    
    
    

   
    
    
}

