/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Atividade;
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
public class AtividadeDAO {
    PreparedStatement pst;
    String sql;
    
    public List<Atividade> ListaAtividade() throws SQLException{
        List<Atividade> listaAtividade;
        listaAtividade = new ArrayList<>();
        sql = "select * from atividade order by titulo";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            listaAtividade.add(new Atividade(rs.getInt("id"), rs.getString("titulo"), rs.getInt("vagasTotal"),
                    rs.getInt("vagasDisp"), rs.getString("ministrante"), rs.getString("dataa"), rs.getString("inicio"),
                    rs.getString("termino"), rs.getString("locall"), rs.getString("descricao"),
                    rs.getInt("codEvento"), rs.getInt("codCategoria")));
        }
        pst.close();
        return listaAtividade;
    }
    
    
    //Ver onde está sendo usado...
    public Atividade selectId(int codigoAtividadeId) throws SQLException{
        Atividade atividadeId = new Atividade();
        
        sql = "select * from atividade where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, codigoAtividadeId);
        
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            atividadeId = new Atividade(rs.getInt("id"), rs.getString("titulo"), rs.getInt("vagasTotal"),
                    rs.getInt("vagasDisp"), rs.getString("ministrante"), rs.getString("dataa"), rs.getString("inicio"),
                    rs.getString("termino"), rs.getString("locall"), rs.getString("descricao"),
                    rs.getInt("codEvento"), rs.getInt("codCategoria"));
        }
        pst.close();
        return atividadeId;
    }
    
    public void salvar(Atividade atividade) throws SQLException{
        sql = "insert into atividade values(?,?,?,?,?,?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, atividade.getDescricaoAtividade());
        pst.setString(3, atividade.getDataAtividade());
        pst.setString(4, atividade.getHoraiAtividade());
        pst.setString(5, atividade.getHorafAtividade());
        pst.setString(6, atividade.getMinistranteAtividade());
        pst.setString(7, atividade.getLocalAtividade());
        pst.setInt(8, atividade.getVagastAtividade());
        pst.setInt(9, atividade.getVagasdAtividade());
        pst.setString(10, atividade.getResumoAtividade());
        pst.setInt(11, atividade.getCategoriaAtividade().getCodigoCategoria());
        pst.setInt(12, atividade.getEventoAtividade().getCodigoEvento());
        pst.execute();
        pst.close();    
    }
    
    public void excluir(Atividade atividade) throws SQLException{
        sql = "delete from atividade where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, atividade.getCodigoAtividade());
        pst.execute();
        pst.close();
    }
    
    public void alterar(Atividade atividade) throws SQLException{
        sql = "update atividade set titulo=?, dataa=?, inicio=?, termino=?, ministrante=?, locall=?, vagasTotal=?, vagasDisp=?, descricao=?, codEvento=?, codCategoria=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, atividade.getDescricaoAtividade());
        pst.setString(2, atividade.getDataAtividade());
        pst.setString(3, atividade.getHoraiAtividade());
        pst.setString(4, atividade.getHorafAtividade());
        pst.setString(5, atividade.getMinistranteAtividade());
        pst.setString(6, atividade.getLocalAtividade());
        pst.setInt(7, atividade.getVagastAtividade());
        pst.setInt(8, atividade.getVagasdAtividade());
        pst.setString(9, atividade.getResumoAtividade());
        pst.setInt(10, atividade.getCategoriaAtividade().getCodigoCategoria());
        pst.setInt(11, atividade.getEventoAtividade().getCodigoEvento());
        pst.setInt(12, atividade.getCodigoAtividade());
        pst.execute();
        pst.close();
    }
    
    
    public Atividade AtividadeById(int id) throws SQLException {
        Atividade atividade = null;
        sql = "select* from atividade where id=?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            atividade = new Atividade(rs.getInt("id"), rs.getString("titulo"),rs.getInt("vagasTotal"), 
                    rs.getInt("vagasDisp"), rs.getString("ministrante"), rs.getString("dataa"),
                    rs.getString("inicio"), rs.getString("termino"), rs.getString("locall"),rs.getString("descricao"),
                    rs.getInt("codEvento"), rs.getInt("codCategoria"));
        }
        pst.close();
        return atividade;
    }
}
