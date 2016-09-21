/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FND
 */
public class AlunoDAO {
    PreparedStatement pst;
    String sql;
    
     public List<Aluno> ListaAluno() throws SQLException{
        List<Aluno> listaAluno;
        listaAluno = new ArrayList<>();
        sql = "select id, nome, email, tipo, ra, curso, turma from participante where tipo = 'Aluno' order by nome";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            listaAluno.add(new Aluno(rs.getInt("id"), rs.getString("nome"), 
                    rs.getString("email"), rs.getString("tipo"), 
                    rs.getString("ra"), rs.getString("curso"), 
                    rs.getString("turma")));
        }
        pst.close();
        return listaAluno;
    }
       
  
    public void salvar(Aluno aluno) throws SQLException{
        sql = "insert into participante (id, nome, email, tipo, ra, curso, turma) values(?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, aluno.getNomeAluno());
        pst.setString(3, aluno.getEmailAluno());
        pst.setString(4, aluno.getCategoriaAluno());
        pst.setString(5, aluno.getRaAluno());
        pst.setString(6, aluno.getCursoAluno());
        pst.setString(7, aluno.getTurmaAluno());
        pst.execute();
        pst.close();    
    }
    
     public void excluir(Aluno aluno) throws SQLException{
        sql = "delete from participante where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, aluno.getCodigoAluno());
        pst.execute();
        pst.close();
    }
     
     public void alterar(Aluno aluno) throws SQLException{
        sql = "update participante set nome=?, email=?, tipo=?, ra=?, curso=?, turma=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, aluno.getNomeAluno());
        pst.setString(2, aluno.getEmailAluno());
        pst.setString(3, aluno.getCategoriaAluno());
        pst.setString(4, aluno.getRaAluno());
        pst.setString(5, aluno.getCursoAluno());
        pst.setString(6, aluno.getTurmaAluno());
        pst.setInt(7, aluno.getCodigoAluno());
        pst.execute();
        pst.close();
    }
     
     public Aluno AlunoById(int id) throws SQLException {
        Aluno aluno = null;
        sql = "Select id, nome, email, tipo, ra, curso, turma from participante where id=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            aluno = new Aluno(rs.getInt("id"), rs.getString("nome"), rs.getString("email"), rs.getString("tipo"),
                     rs.getString("ra"), rs.getString("curso"), rs.getString("turma"));
        }
        pst.close();
        return aluno;
    }
     
    public Aluno recuperar(String strRa) throws SQLException{
        Aluno aluno = null;
        sql = "Select id, nome, email, tipo, ra, curso, turma from participante where ra=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, strRa);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            aluno = new Aluno(rs.getInt("id"), rs.getString("nome"), rs.getString("email"), rs.getString("tipo"),
                     rs.getString("ra"), rs.getString("curso"), rs.getString("turma"));
        }
        pst.close();
        return aluno;
    }
}