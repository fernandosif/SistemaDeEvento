/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;
import javax.swing.JFrame;

/**
 *
 * @author FND
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal(Usuario user) {
        if(user.getNivelUsuario()==1){
        
        initComponents();
        ativa();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        } else{
            initComponents();
            jmSair.setEnabled(true);
            this.setVisible(true);
            this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiAluno = new javax.swing.JMenuItem();
        jmiComunidade = new javax.swing.JMenuItem();
        jmiCursos = new javax.swing.JMenuItem();
        jmiUsuário = new javax.swing.JMenuItem();
        jmEventos = new javax.swing.JMenu();
        jmiAtividades = new javax.swing.JMenuItem();
        jmiCategoria = new javax.swing.JMenuItem();
        jmiEventos = new javax.swing.JMenuItem();
        jmInscricao = new javax.swing.JMenu();
        jmiInscricao = new javax.swing.JMenuItem();
        jmFrequencia = new javax.swing.JMenu();
        jmiFrequencia = new javax.swing.JMenuItem();
        jmRelatorios = new javax.swing.JMenu();
        jmSair = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jmArquivo.setText("Arquivo");
        jmArquivo.setEnabled(false);

        jmiAluno.setText("Aluno");
        jmiAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlunoActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiAluno);

        jmiComunidade.setText("Comunidade");
        jmiComunidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiComunidadeActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiComunidade);

        jmiCursos.setText("Curso");
        jmiCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCursosActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiCursos);

        jmiUsuário.setText("Usuário");
        jmiUsuário.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuárioActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiUsuário);

        jMenuBar1.add(jmArquivo);

        jmEventos.setText("Eventos");
        jmEventos.setEnabled(false);

        jmiAtividades.setText("Atividades");
        jmiAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAtividadesActionPerformed(evt);
            }
        });
        jmEventos.add(jmiAtividades);

        jmiCategoria.setText("Categoria de Atividade");
        jmiCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCategoriaActionPerformed(evt);
            }
        });
        jmEventos.add(jmiCategoria);

        jmiEventos.setText("Eventos");
        jmiEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEventosActionPerformed(evt);
            }
        });
        jmEventos.add(jmiEventos);

        jMenuBar1.add(jmEventos);

        jmInscricao.setText("Inscrição");
        jmInscricao.setEnabled(false);

        jmiInscricao.setText("Inscrições");
        jmiInscricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiInscricaoActionPerformed(evt);
            }
        });
        jmInscricao.add(jmiInscricao);

        jMenuBar1.add(jmInscricao);

        jmFrequencia.setText("Frequência");
        jmFrequencia.setEnabled(false);

        jmiFrequencia.setText("Frequências");
        jmiFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFrequenciaActionPerformed(evt);
            }
        });
        jmFrequencia.add(jmiFrequencia);

        jMenuBar1.add(jmFrequencia);

        jmRelatorios.setText("Relatórios");
        jmRelatorios.setEnabled(false);
        jMenuBar1.add(jmRelatorios);

        jmSair.setText("Sair");
        jmSair.setEnabled(false);

        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmSair.add(jmiSair);

        jMenuBar1.add(jmSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Sistemas de Eventos - UEMG");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEventosActionPerformed
        EventoView evento = new EventoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(evento);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiEventosActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiComunidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiComunidadeActionPerformed
        ComunidadeView comunidade = new ComunidadeView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(comunidade);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiComunidadeActionPerformed

    private void jmiAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlunoActionPerformed
        AlunoView aluno = new AlunoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(aluno);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiAlunoActionPerformed

    private void jmiCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCursosActionPerformed
        CursoView curso = new CursoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(curso);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiCursosActionPerformed

    private void jmiCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCategoriaActionPerformed
        CategoriaView categoria = new CategoriaView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(categoria);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiCategoriaActionPerformed

    private void jmiAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAtividadesActionPerformed
        AtividadeView atividade = new AtividadeView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(atividade);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiAtividadesActionPerformed

    private void jmiUsuárioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuárioActionPerformed
        UsuarioView usuario = new UsuarioView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(usuario);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiUsuárioActionPerformed

    private void jmiFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFrequenciaActionPerformed
        FrequenciaView frequencia = new FrequenciaView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(frequencia);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiFrequenciaActionPerformed

    private void jmiInscricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiInscricaoActionPerformed
        InscricaoView inscricao = new InscricaoView();
        pnlPrincipal.removeAll();
        pnlPrincipal.add(inscricao);
        pnlPrincipal.updateUI();
    }//GEN-LAST:event_jmiInscricaoActionPerformed

    public void ativa(){
        jmArquivo.setEnabled(true);
        jmEventos.setEnabled(true);
        jmInscricao.setEnabled(true);
        jmFrequencia.setEnabled(true);
        jmRelatorios.setEnabled(true);
        jmSair.setEnabled(true);
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmEventos;
    private javax.swing.JMenu jmFrequencia;
    private javax.swing.JMenu jmInscricao;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmSair;
    private javax.swing.JMenuItem jmiAluno;
    private javax.swing.JMenuItem jmiAtividades;
    private javax.swing.JMenuItem jmiCategoria;
    private javax.swing.JMenuItem jmiComunidade;
    private javax.swing.JMenuItem jmiCursos;
    private javax.swing.JMenuItem jmiEventos;
    private javax.swing.JMenuItem jmiFrequencia;
    private javax.swing.JMenuItem jmiInscricao;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiUsuário;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
