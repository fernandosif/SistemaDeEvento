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
public class Evento {
    private int codigoEvento;
    private String tituloEvento;
    private String inicioEvento;
    private String terminoEvento;
    private String responsavelEvento;
    private int codCurso;
    private String statusEvento;
    private Curso cursoEvento;

    public Evento(int codigoEvento, String tituloEvento, String inicioEvento, String terminoEvento, String responsavelEvento, int codCurso, String statusEvento, Curso cursoEvento) {
        this.codigoEvento = codigoEvento;
        this.tituloEvento = tituloEvento;
        this.inicioEvento = inicioEvento;
        this.terminoEvento = terminoEvento;
        this.responsavelEvento = responsavelEvento;
        this.codCurso = codCurso;
        this.statusEvento = statusEvento;
        this.cursoEvento = cursoEvento;
    }

    public Evento() {
    }

  
    public Evento(int codigoEvento, String tituloEvento, String inicioEvento, String terminoEvento, String responsavelEvento, int codCurso, String statusEvento) {
        this.codigoEvento = codigoEvento;
        this.tituloEvento = tituloEvento;
        this.inicioEvento = inicioEvento;
        this.terminoEvento = terminoEvento;
        this.responsavelEvento = responsavelEvento;
        this.codCurso = codCurso;
        this.statusEvento = statusEvento;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

   

  

    public String getStatusEvento() {
        return statusEvento;
    }

    public void setStatusEvento(String statusEvento) {
        this.statusEvento = statusEvento;
    }

    

    public int getCodigoEvento() {
        return codigoEvento;
    }

    public void setCodigoEvento(int codigoEvento) {
        this.codigoEvento = codigoEvento;
    }

    public String getTituloEvento() {
        return tituloEvento;
    }

    public void setTituloEvento(String tituloEvento) {
        this.tituloEvento = tituloEvento;
    }

    public String getInicioEvento() {
        return inicioEvento;
    }

    public void setInicioEvento(String inicioEvento) {
        this.inicioEvento = inicioEvento;
    }

    public String getTerminoEvento() {
        return terminoEvento;
    }

    public void setTerminoEvento(String terminoEvento) {
        this.terminoEvento = terminoEvento;
    }

    public String getResponsavelEvento() {
        return responsavelEvento;
    }

    public void setResponsavelEvento(String responsavelEvento) {
        this.responsavelEvento = responsavelEvento;
    }

    public Curso getCursoEvento() {
        return cursoEvento;
    }

    public void setCursoEvento(Curso cursoEvento) {
        this.cursoEvento = cursoEvento;
    }

   
    
    
}
