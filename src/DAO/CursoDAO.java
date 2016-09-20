/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FND
 */
public class CursoDAO {
    PreparedStatement pst;
    String sql;
    
    public List<Curso> ListaCurso() throws SQLException{
        List<Curso> listaCurso;
        listaCurso = new ArrayList<>();
        sql = "select id, nome from curso order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            listaCurso.add(new Curso(rs.getInt("id"), rs.getString("nome")));
        }
        pst.close();
        return listaCurso;
    }
    
    public Curso recuperarArea(int id) throws SQLException{
        Curso curso= null;
       sql = "select * from curso where id= ?";
       pst = Conexao.getInstance().prepareStatement(sql);
       pst.setInt(1, id);
       ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            curso = new Curso(rs.getInt("id"), rs.getString("nome"));
        }
        pst.close();
        return curso;
    }
    
   public void salvar(Curso curso) throws SQLException{
       sql = "insert into curso values(?,?)";
       pst = Conexao.getInstance().prepareStatement(sql);
       pst.setInt(1, 0);
       pst.setString(2, curso.getNomeCurso());
       pst.execute();
       pst.close();
   }
   
   public void excluir(Curso curso) throws SQLException{
        sql = "delete from curso where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, curso.getCodigoCurso());
        pst.execute();
        pst.close();
    }
   
   public void alterar(Curso curso) throws SQLException{
        sql = "update curso set nome=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, curso.getNomeCurso());
        pst.setInt(2, curso.getCodigoCurso());
        pst.execute();
        pst.close();
    }
}
