/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Curso;
import Model.Evento;
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
public class EventoDAO {
    PreparedStatement pst;
    String sql;
    CursoDAO cursoDAO;
    
    public List<Evento> ListaEvento() throws SQLException{
        List<Evento> listaEvento;
        listaEvento = new ArrayList<>();
        sql = "select * from evento order by titulo";
        pst = Conexao.getInstance().prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            listaEvento.add(new Evento(rs.getInt("id"), rs.getString("titulo"), rs.getString("inicio"),
                    rs.getString("termino"), rs.getString("responsavel"),rs.getInt("codCurso"), rs.getString("statuss")));
        }
        pst.close();
        return listaEvento;
    }
    
    
    
    public void salvar(Evento evento) throws SQLException{
        sql = "insert into evento values(?,?,?,?,?,?,?)";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setString(2, evento.getTituloEvento());
        pst.setString(3, evento.getInicioEvento());
        pst.setString(4, evento.getTerminoEvento());
        pst.setString(5, evento.getResponsavelEvento());
        pst.setInt(6, evento.getCursoEvento().getCodigoCurso());
        pst.setString(7, evento.getStatusEvento());
        pst.execute();
        pst.close();    
    }
    
    public void excluir(Evento evento) throws SQLException{
        sql = "delete from evento where id = ?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, evento.getCodigoEvento());
        pst.execute();
        pst.close();
    }
    
    public void alterar(Evento evento) throws SQLException{
        sql = "update evento set titulo=?, inicio=?, termino=?, responsavel=?, codCurso=?, statuss=? where id=?";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setString(1, evento.getTituloEvento());
        pst.setString(2, evento.getInicioEvento());
        pst.setString(3, evento.getTerminoEvento());
        pst.setString(4, evento.getResponsavelEvento());
        pst.setInt(5, evento.getCursoEvento().getCodigoCurso());
        pst.setString(6, evento.getStatusEvento());
        pst.setInt(7, evento.getCodigoEvento());
        pst.execute();
        pst.close();
    }
    
    public Evento EventoById(int id) throws SQLException {
        Evento evento = null;
        sql = "select* from evento where id = ?";
        Statement st;
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, id);
        pst.executeQuery();
        ResultSet rs = pst.getResultSet();
        while (rs.next()) {
            evento = new Evento(rs.getInt("id"), rs.getString("titulo"), rs.getString("inicio"), rs.getString("termino"),
                    rs.getString("responsavel"), rs.getInt("codCurso"), rs.getString("statuss"));
        }
        pst.close();
        return evento;
    }
    
    public Evento recuperarEvento(int id) throws SQLException{
       Evento evento= null;
       sql = "select * from evento where id= ?";
       pst = Conexao.getInstance().prepareStatement(sql);
       pst.setInt(1, id);
       ResultSet rs = pst.executeQuery();
        while(rs.next()){
            
            evento = new Evento(rs.getInt("id"), rs.getString("titulo"), rs.getString("inicio"), rs.getString("termino"),
                    rs.getString("responsavel"), rs.getInt("codCurso"), rs.getString("statuss"));
        }
        pst.close();
        return evento;
    }
}
