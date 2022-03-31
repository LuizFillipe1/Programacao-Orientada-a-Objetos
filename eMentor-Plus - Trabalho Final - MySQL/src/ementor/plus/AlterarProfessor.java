/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ementor.plus;

import javax.swing.JOptionPane;

/**
 *
 * @author Luiz Fillipe
 */
public class AlterarProfessor extends javax.swing.JFrame {

    /**
     * Creates new form AlterarProfessor
     */
    public AlterarProfessor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoBuscar = new javax.swing.JButton();
        campoCPF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoSalarioBruto = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoDataNascimento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoDataAdmissao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alterar Professores");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Buscar Professor");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 27, 242, 22));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/us.jpg"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 0, 200, 440));

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setForeground(new java.awt.Color(51, 0, 102));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(0, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botaoSalvar.setBackground(new java.awt.Color(0, 0, 51));
        botaoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        botaoSalvar.setText("Salvar Alterações");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoBuscar.setBackground(new java.awt.Color(0, 0, 51));
        botaoBuscar.setForeground(new java.awt.Color(255, 255, 255));
        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(botaoBuscar)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addGap(41, 41, 41)
                .addComponent(botaoSalvar)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoBuscar))
                .addContainerGap())
        );

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, 60));
        jPanel6.add(campoCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 200, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefone:");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 30));
        jPanel6.add(campoSalarioBruto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 200, 20));
        jPanel6.add(campoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 200, 20));
        jPanel6.add(campoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 200, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nome:");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data Admissão:");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 30));

        campoDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDataNascimentoActionPerformed(evt);
            }
        });
        jPanel6.add(campoDataNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 200, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CPF:");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 30));
        jPanel6.add(campoDataAdmissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 200, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Nascimento:");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Salario Bruto:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDataNascimentoActionPerformed

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        ConexaoMySQL conec = new ConexaoMySQL();
        if(campoCPF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Digite um cpf para realizar a busca","ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            Professor Encontrou = conec.buscaProfesor(campoCPF.getText());
            if(Encontrou != null){
                campoNome.setText(Encontrou.nome);
                campoSalarioBruto.setText(Double.toString(Encontrou.getSalarioBruto()));
                campoTelefone.setText(Encontrou.telefone);
                campoDataAdmissao.setText(Encontrou.getDataDeAdmissao());
                campoDataNascimento.setText(Encontrou.dataDeNascimento);
            }
            else
            JOptionPane.showMessageDialog(null,"Registro nao encontrado","ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        dispose();        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        ConexaoMySQL conec = new ConexaoMySQL();
        conec.atualizarProfessorDadosNoMySQL(campoCPF.getText(),campoDataAdmissao.getText(),campoNome.getText(),campoTelefone.getText(),campoDataNascimento.getText(),Double.parseDouble(campoSalarioBruto.getText()));
    }//GEN-LAST:event_botaoSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlterarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JTextField campoDataAdmissao;
    private javax.swing.JTextField campoDataNascimento;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoSalarioBruto;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
