/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.AtividadeDAO;
import DAO.EventoDAO;
import Model.Atividade;
import Model.Evento;
import Model.Frequencia;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FND
 */
public class FrequenciaView extends javax.swing.JInternalFrame {
    
    Frequencia frequencia;
    Evento evento;
    Atividade atividade;
    EventoDAO eventoDAO;
    List<Evento> listaEvento;
    AtividadeDAO atividadeDAO;
    List<Atividade> listaAtividade;
    List<Atividade> listaAtividadeEvento;
    
    public FrequenciaView() {
        initComponents();
        this.setVisible(false);
        dialogFrequencia.setVisible(true);
        eventoDAO = new EventoDAO();
        atividadeDAO = new AtividadeDAO();
        listaEvento = new ArrayList<>();
        listaAtividade = new ArrayList<>();
        listaAtividadeEvento = new ArrayList<>();
        preencherComboEvento();
        
        //preencherComboAtividade();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dialogFrequencia = new javax.swing.JDialog();
        cbEvento = new javax.swing.JComboBox();
        cbAtividade = new javax.swing.JComboBox();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        labelCod = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelCod2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        lb3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbEvento = new javax.swing.JLabel();
        lbAtividade = new javax.swing.JLabel();
        lbParticipante = new javax.swing.JLabel();
        cbFrequencia = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        dialogFrequencia.setTitle("Fazer Frequência");
        dialogFrequencia.setMinimumSize(new java.awt.Dimension(500, 500));

        cbEvento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um Evento..."}));
        cbEvento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEventoItemStateChanged(evt);
            }
        });

        cbAtividade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleciona a Atividade..." }));
        cbAtividade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAtividadeItemStateChanged(evt);
            }
        });

        btnConfirmar.setText("Confirmar");

        btnCancelar.setText("Cancelar");

        jLabel2.setText("Codigo evento");

        labelCod.setText("jLabel3");

        jLabel3.setText("Código atividade");

        labelCod2.setText("jLabel4");

        javax.swing.GroupLayout dialogFrequenciaLayout = new javax.swing.GroupLayout(dialogFrequencia.getContentPane());
        dialogFrequencia.getContentPane().setLayout(dialogFrequenciaLayout);
        dialogFrequenciaLayout.setHorizontalGroup(
            dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFrequenciaLayout.createSequentialGroup()
                .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(dialogFrequenciaLayout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbAtividade, 0, 258, Short.MAX_VALUE)))
                        .addGroup(dialogFrequenciaLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dialogFrequenciaLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56)
                        .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCod2)
                            .addComponent(labelCod))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        dialogFrequenciaLayout.setVerticalGroup(
            dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogFrequenciaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(cbEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(cbAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelCod))
                .addGap(21, 21, 21)
                .addGroup(dialogFrequenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelCod2))
                .addContainerGap())
        );

        setClosable(true);
        setTitle("Frequência");

        lb1.setText("Evento:");

        lb2.setText("Atividade:");

        btnSalvar.setText("Salvar");

        lb3.setText("Participante:");

        jLabel1.setText("Frequência:");

        lbEvento.setText("nomeEvento");

        lbAtividade.setText("nomeAtividade");

        lbParticipante.setText("nomeParticipante");

        cbFrequencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Presença","Falta" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        btnAlterar.setText("Alterar Frequência");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lb3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEvento)
                            .addComponent(lbAtividade)
                            .addComponent(lbParticipante)
                            .addComponent(cbFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1)
                    .addComponent(lbEvento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb2)
                    .addComponent(lbAtividade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(lbParticipante))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnAlterar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEventoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEventoItemStateChanged
       preencherComboAtividade();
       atualizarLabel();
    }//GEN-LAST:event_cbEventoItemStateChanged

    private void cbAtividadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAtividadeItemStateChanged
        atualizarLabel();
    }//GEN-LAST:event_cbAtividadeItemStateChanged

    
            
    public void preencherComboEvento(){
     
        try {
            listaEvento = eventoDAO.ListaEvento();
        } catch (SQLException ex) {
            Logger.getLogger(FrequenciaView.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        for (Evento evento : listaEvento){
            cbEvento.addItem(evento.getTituloEvento());
            
        }
        
        
    }

    public void atualizarLabel(){
        
        try {
            evento=eventoDAO.recuperarId((String) cbEvento.getSelectedItem());
        } catch (SQLException ex) {
            Logger.getLogger(FrequenciaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String str = Integer.toString(evento.getCodigoEvento());
        /*frequencia.setAtividadeFrequencia(listaAtividadeEvento.get(cbAtividade.getSelectedIndex()));*/
        String str2 = Integer.toString(cbAtividade.getSelectedIndex());
        
        labelCod.setText(str);
        labelCod2.setText(str2);
    }
    
    public void preencherComboAtividade(){
        Frequencia frequencia = new Frequencia();
        try {
            frequencia.setEventoFrequencia(evento=eventoDAO.recuperarId((String) cbEvento.getSelectedItem()));
        } catch (SQLException ex) {
            Logger.getLogger(FrequenciaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            listaAtividadeEvento = atividadeDAO.ListaAtividadeEvento(frequencia.getEventoFrequencia().getCodigoEvento());
        } catch (SQLException ex) {
            Logger.getLogger(FrequenciaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         
        for (Atividade atividade : listaAtividadeEvento){
            cbAtividade.addItem(atividade.getDescricaoAtividade());
            
        }
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbAtividade;
    private javax.swing.JComboBox cbEvento;
    private javax.swing.JComboBox cbFrequencia;
    private javax.swing.JDialog dialogFrequencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelCod;
    private javax.swing.JLabel labelCod2;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbAtividade;
    private javax.swing.JLabel lbEvento;
    private javax.swing.JLabel lbParticipante;
    // End of variables declaration//GEN-END:variables
}
