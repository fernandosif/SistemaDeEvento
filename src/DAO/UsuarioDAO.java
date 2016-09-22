/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FND
 */
public class UsuarioDAO {
    PreparedStatement pst;
    String sql;
    
    public List<Usuario> ListaUsuario() throws SQLException{
        List<Usuario> listaUsuario;
        listaUsuario = new ArrayList<>();
        sql = "select* from usuario order by login";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            listaUsuario.add(new Usuario(rs.getInt("id"), rs.getString("login"), 
                    rs.getString("senha"), rs.getInt("nivel"), 
                    rs.getString("statu")));
        }
        pst.close();
        return listaUsuario;
    }
    
    
    public void salvar(Usuario usuario) throws SQLException{
        sql = "insert into usuario values(?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, usuario.getLoginUsuario());
        pst.setString(3, usuario.getSenhaUsuario());
        pst.setInt(4, usuario.getNivelUsuario());
        pst.setString(5, usuario.getStatusUsuario());
        pst.execute();
        pst.close();    
    }
    
     public void excluir(Usuario usuario) throws SQLException{
        sql = "delete from participante where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, usuario.getCodigoUsuario());
        pst.execute();
        pst.close();
    }
     
    public void alterar(Usuario usuario) throws SQLException{
        sql = "update participante set login=?, senha=?, nivel=?, statu=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, usuario.getLoginUsuario());
        pst.setString(2, usuario.getSenhaUsuario());
        pst.setInt(3, usuario.getNivelUsuario());
        pst.setString(4, usuario.getStatusUsuario());
        pst.setInt(5, usuario.getCodigoUsuario());
        pst.execute();
        pst.close();
    }
    
    public Usuario UsuarioById(int id) throws SQLException {
        Usuario usuario = null;
        sql = "Select * from usuario where id=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            usuario = new Usuario(rs.getInt("id"), rs.getString("login"), rs.getString("senha"), rs.getInt("nivel"),
                    rs.getString("statu"));
        }
        pst.close();
        return usuario;
    }
    
    public Usuario getLogin(String login, String senha) throws SQLException{
        Usuario usuario = null;
        sql = "select *from usuario where login= ? and senha=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, login);
        pst.setString(2, senha);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            usuario = new Usuario(rs.getInt("id"), rs.getString("login"), rs.getString("senha"), rs.getInt("nivel"),
                    rs.getString("statu"));
        }
        pst.close();
        return usuario;
    }
}
