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
public class Categoria {
    private int codigoCategoria;
    private String nomeCategoria;

    public Categoria(int codigoCategoria, String nomeCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public Categoria() {
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    
    
}
