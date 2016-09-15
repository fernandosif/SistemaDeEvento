/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FND
 */
public class CategoriaDAO {
    PreparedStatement pst;
    String sql;
    
    public List<Categoria> ListaCategoria() throws SQLException{
        List<Categoria> listaCategoria;
        listaCategoria= new ArrayList<>();
        sql = "select id, nome from categoria order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            listaCategoria.add(new Categoria(rs.getInt("id"), rs.getString("nome")));
        }
        pst.close();
        return listaCategoria;
    }
    
   public void salvar(Categoria categoria) throws SQLException{
       sql = "insert into categoria values(?,?)";
       pst = Conexao.getInstance().prepareStatement(sql);
       pst.setInt(1, 0);
       pst.setString(2, categoria.getNomeCategoria());
       pst.execute();
       pst.close();
   }
   
   public void excluir(Categoria categoria) throws SQLException{
        sql = "delete from categoria where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, categoria.getCodigoCategoria());
        pst.execute();
        pst.close();
    }
   
   public void alterar(Categoria categoria) throws SQLException{
        sql = "update categoria set nome=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, categoria.getNomeCategoria());
        pst.setInt(2, categoria.getCodigoCategoria());
        pst.execute();
        pst.close();
    }
}
