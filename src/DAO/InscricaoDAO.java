/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Inscricao;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author FND
 */
public class InscricaoDAO {
    PreparedStatement pst;
    String sql;
    AtividadeDAO atividadeDAO;
    AlunoDAO alunoDAO;
    
    
    public void salvar(Inscricao inscricao) throws SQLException{
        sql = "insert into inscricao values ?, ?, ?,";
        pst = Conexao.getInstance().prepareStatement(sql);
        pst.setInt(1, 0);
        pst.setInt(2, inscricao.getAtividadeInscricao().getCodEvento());
        pst.setInt(3, inscricao.getAlunoInscricao().getCodigoAluno());
        pst.execute();
        pst.close();  
    }
    
}
