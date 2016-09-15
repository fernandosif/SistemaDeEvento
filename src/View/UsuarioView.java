/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.UsuarioDAO;
import Model.Usuario;
import Util.LimiteDigitos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FND
 */
public class UsuarioView extends javax.swing.JInternalFrame {

    Usuario usuario;
    UsuarioDAO usuarioDAO;
    List<Usuario> listaUsuario;
    
    public UsuarioView() {
        
        usuarioDAO = new UsuarioDAO();
        listaUsuario = new ArrayList<>();
        initComponents();
        this.setVisible(true);
        txtUsuario.setDocument(new LimiteDigitos(15));
        txtSenha.setDocument(new LimiteDigitos(15));
        atualizarTabelaUsuario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbUsuario = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbNivel = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        cbNivel = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuario = new javax.swing.JTable();
        lbStatus = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox();
        lbInfo = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setTitle("Usuário");

        lbUsuario.setText("Usuário:");
        lbUsuario.setEnabled(false);

        lbSenha.setText("Senha:");
        lbSenha.setEnabled(false);

        lbNivel.setText("Nível:");
        lbNivel.setEnabled(false);

        txtUsuario.setEnabled(false);

        txtSenha.setEnabled(false);

        cbNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));
        cbNivel.setEnabled(false);

        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbUsuario);

        lbStatus.setText("Status:");
        lbStatus.setEnabled(false);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativo", "Inativo" }));
        cbStatus.setEnabled(false);

        lbInfo.setText("1: Administrador / 2: Convidado");
        lbInfo.setEnabled(false);

        lbId.setText("ID:");
        lbId.setEnabled(false);

        txtId.setEnabled(false);

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbId)
                            .addComponent(lbUsuario)
                            .addComponent(lbSenha)
                            .addComponent(lbNivel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbInfo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbStatus)
                        .addGap(18, 18, 18)
                        .addComponent(cbStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbStatus)
                            .addComponent(lbId)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbUsuario)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSenha)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNivel)
                            .addComponent(cbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbInfo))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void atualizarTabelaUsuario(){
        usuario = new Usuario();
        
        
        try {
            listaUsuario = usuarioDAO.ListaUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
 
        String dados[][] = new String[listaUsuario.size()][4];
        int i = 0;
        for(Usuario usuario : listaUsuario){
            dados[i][0] = String.valueOf(usuario.getCodigoUsuario());
            dados[i][1] = usuario.getLoginUsuario();
            dados[i][2] = String.valueOf(usuario.getNivelUsuario());
            dados[i][3] = usuario.getStatusUsuario();
            
            i++;
        }
        
        String tituloColuna[] = {"ID", "Usuário", "Nível", "Status"};
        DefaultTableModel tabelaUsuario = new DefaultTableModel();
        tabelaUsuario.setDataVector(dados, tituloColuna);
        tbUsuario.setModel(new DefaultTableModel(dados, tituloColuna){
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };
            
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return canEdit[columnIndex];
            }
        });
        
        tbUsuario.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbUsuario.getColumnModel().getColumn(1).setPreferredWidth(200);
        tbUsuario.getColumnModel().getColumn(2).setPreferredWidth(30);
        tbUsuario.getColumnModel().getColumn(3).setPreferredWidth(100);
      
        
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        tbUsuario.getColumnModel().getColumn(0).setCellRenderer(centralizado);
        tbUsuario.setRowHeight(25);
        tbUsuario.updateUI();
    }
    
    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposUsuario();
        preparaNovo();
        ativaCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        preparaAlterar();
        ativaCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCamposUsuario();
        preparaSalvareCancelar();
        desativaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtId.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um usuário!");
        } else{
            usuario = new Usuario();
            usuario.setCodigoUsuario(Integer.parseInt(txtId.getText()));
            int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: " +txtUsuario.getText());
            
            if(confirma ==0){
                
                
                try {
                    usuarioDAO.excluir(usuario);
                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
                }
               
               
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                
                atualizarTabelaUsuario();
                limpaCamposUsuario();
                preparaExcluir();
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(txtUsuario.getText().isEmpty()||txtSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha os campos");
            txtUsuario.requestFocusInWindow();
        } else if(txtId.getText().isEmpty()){
            usuario = new Usuario();
            usuario.setLoginUsuario(txtUsuario.getText());
            usuario.setSenhaUsuario(txtSenha.getText());
            usuario.setNivelUsuario(Integer.parseInt((String) cbNivel.getSelectedItem()));
            usuario.setStatusUsuario((String) cbStatus.getSelectedItem());
            
            try {
                usuarioDAO.salvar(usuario);
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
           
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            atualizarTabelaUsuario();
            preparaSalvareCancelar();
            desativaCampos();
            limpaCamposUsuario();
            
        } else{
            usuario = new Usuario();
            usuario.setCodigoUsuario(Integer.parseInt(txtId.getText()));
            usuario = new Usuario();
            usuario.setLoginUsuario(txtUsuario.getText());
            usuario.setSenhaUsuario(txtSenha.getText());
            usuario.setNivelUsuario(Integer.parseInt((String) cbNivel.getSelectedItem()));
            usuario.setStatusUsuario((String) cbStatus.getSelectedItem());
            
            try {
                usuarioDAO.alterar(usuario);
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
          
           
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
            atualizarTabelaUsuario();
            preparaSalvareCancelar();
            desativaCampos();
            
            
        } 
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void tbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuarioMouseClicked
        txtId.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(),0).toString());
        txtUsuario.setText(tbUsuario.getValueAt(tbUsuario.getSelectedRow(),1).toString());
        txtSenha.setText("********");
        cbStatus.setSelectedItem(tbUsuario.getValueAt(tbUsuario.getSelectedRow(),2).toString());
        cbNivel.setSelectedItem(tbUsuario.getValueAt(tbUsuario.getSelectedRow(),2).toString());
        preparaSelecaoTabela();
        
    }//GEN-LAST:event_tbUsuarioMouseClicked

    public void limpaCamposUsuario(){
        txtUsuario.setText("");
        txtSenha.setText("");
    }
     
    public void ativaCampos(){
        lbUsuario.setEnabled(true);
        txtUsuario.setEnabled(true);
        lbSenha.setEnabled(true);
        txtSenha.setEnabled(true);
        lbStatus.setEnabled(true);
        cbStatus.setEnabled(true);
        lbNivel.setEnabled(true);
        cbNivel.setEnabled(true);
        lbInfo.setEnabled(true);
    }
    
    public void desativaCampos(){
        lbUsuario.setEnabled(false);
        txtUsuario.setEnabled(false);
        lbSenha.setEnabled(false);
        txtSenha.setEnabled(false);
        lbStatus.setEnabled(false);
        cbStatus.setEnabled(false);
        lbNivel.setEnabled(false);
        cbNivel.setEnabled(false);
        lbInfo.setEnabled(false);
    }
    
    public void preparaNovo(){
        btnNovo.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tbUsuario.setEnabled(false);
        tbUsuario.clearSelection();
    }
    
    public void preparaSalvareCancelar(){
        btnNovo.setEnabled(true);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(false);
        tbUsuario.setEnabled(true);
    }
    
    public void preparaSelecaoTabela(){
        btnNovo.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnAlterar.setEnabled(true);
    }
    
    public void preparaAlterar(){
        btnNovo.setEnabled(false);
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        tbUsuario.setEnabled(false);
        tbUsuario.clearSelection();
    }
    
    public void preparaExcluir(){
        btnExcluir.setEnabled(false);
        btnAlterar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbNivel;
    private javax.swing.JComboBox cbStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbNivel;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JTable tbUsuario;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
