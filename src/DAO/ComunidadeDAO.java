/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import Model.Comunidade;
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
public class ComunidadeDAO {
    PreparedStatement pst;
    String sql;
    
    
    
    public Comunidade ComunidadeById(int id) throws SQLException {
        Comunidade comunidade = null;
        sql = "Select * from participante where id=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            comunidade = new Comunidade(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("instituicao"),
                    rs.getString("email"), rs.getString("tipo"), rs.getString("telefone"));
        }
        pst.close();
        return comunidade;
    }
    
    public List<Comunidade> ListaComunidade() throws SQLException{
        List<Comunidade> listaComunidade;
        listaComunidade = new ArrayList<>();
        sql = "select id, nome, email, tipo, cpf, instituicao, telefone from participante where tipo = 'Comunidade' order by nome";
        
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            listaComunidade.add(new Comunidade(rs.getInt("id"), rs.getString("nome"),
                    rs.getString("email"), rs.getString("tipo"),
                    rs.getString("cpf"), rs.getString("instituicao"),
                    rs.getString("telefone")));
        }
        pst.close();
        return listaComunidade;
    }
    
    
    public void salvar(Comunidade comunidade) throws SQLException{
        sql = "insert into participante (id, nome, email, tipo, cpf, instituicao, telefone) values(?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, comunidade.getNomeComunidade());
        pst.setString(3, comunidade.getEmailComunidade());
        pst.setString(4, comunidade.getTipoComunidade());
        pst.setString(5, comunidade.getCpfComunidade());
        pst.setString(6, comunidade.getInstituicaoComunidade());
        pst.setString(7, comunidade.getTelefoneComunidade());
        pst.execute();
        pst.close();    
    }
    
    public void excluir(Comunidade comunidade) throws SQLException{
        sql = "delete from participante where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, comunidade.getCodigoComunidade());
        pst.execute();
        pst.close();
    }
    
    public void alterar(Comunidade comunidade) throws SQLException{
        sql = "update participante set nome=?, email=?, tipo=?, cpf=?, instituicao=?, telefone=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, comunidade.getNomeComunidade());
        pst.setString(2, comunidade.getEmailComunidade());
        pst.setString(3, comunidade.getTipoComunidade());
        pst.setString(4, comunidade.getCpfComunidade());
        pst.setString(5, comunidade.getInstituicaoComunidade());
        pst.setString(6, comunidade.getTelefoneComunidade());
        pst.setInt(7, comunidade.getCodigoComunidade());
        pst.execute();
        pst.close();
    }
}
