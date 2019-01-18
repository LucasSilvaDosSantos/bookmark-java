package telas;

import java.awt.Color;
import backEnd.ListaBack;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Favoritos extends javax.swing.JFrame {
    ListaBack lista = new ListaBack();
    
    public Favoritos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLAdicionarFavoritos = new javax.swing.JLabel();
        jTFNomeFavorito = new javax.swing.JTextField();
        jTFUrlFavorito = new javax.swing.JTextField();
        jBOkFavorito = new javax.swing.JButton();
        jBRetornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLAdicionarFavoritos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLAdicionarFavoritos.setText("Adicionar Favoritos");

        jTFNomeFavorito.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTFNomeFavorito.setText("Insira o Nome");
        jTFNomeFavorito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFNomeFavoritoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNomeFavoritoFocusLost(evt);
            }
        });
        jTFNomeFavorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFNomeFavoritoMouseClicked(evt);
            }
        });
        jTFNomeFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeFavoritoActionPerformed(evt);
            }
        });

        jTFUrlFavorito.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTFUrlFavorito.setText("Insira a URL");
        jTFUrlFavorito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFUrlFavoritoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFUrlFavoritoFocusLost(evt);
            }
        });
        jTFUrlFavorito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFUrlFavoritoMouseClicked(evt);
            }
        });
        jTFUrlFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUrlFavoritoActionPerformed(evt);
            }
        });

        jBOkFavorito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBOkFavorito.setText("Salvar");
        jBOkFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkFavoritoActionPerformed(evt);
            }
        });
        jBOkFavorito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBOkFavoritoKeyPressed(evt);
            }
        });

        jBRetornar.setText("Retornar");
        jBRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTFUrlFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNomeFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jBOkFavorito)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLAdicionarFavoritos)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBRetornar)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLAdicionarFavoritos)
                .addGap(29, 29, 29)
                .addComponent(jTFNomeFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFUrlFavorito, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jBOkFavorito)
                .addGap(16, 16, 16)
                .addComponent(jBRetornar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUrlFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUrlFavoritoActionPerformed
        jTFUrlFavorito.transferFocus();
    }//GEN-LAST:event_jTFUrlFavoritoActionPerformed
    
    // Açoes de foco -------------------------------------------------------------
    private void jTFNomeFavoritoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNomeFavoritoFocusGained
        if (jTFNomeFavorito.getText().equals("Insira o Nome")){
            jTFNomeFavorito.setText("");
        }
    }//GEN-LAST:event_jTFNomeFavoritoFocusGained

    private void jTFUrlFavoritoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUrlFavoritoFocusGained
        jTFNomeFavorito.setBackground(Color.white);
        if (jTFUrlFavorito.getText().equals("Insira a URL")){
            jTFUrlFavorito.setText("");
        }
        jTFUrlFavorito.setBackground(Color.white);       
    }//GEN-LAST:event_jTFUrlFavoritoFocusGained

    private void jTFNomeFavoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNomeFavoritoMouseClicked
        if (jTFNomeFavorito.getText().equals("Insira o Nome")){
            jTFNomeFavorito.setText("");
        }
        jTFNomeFavorito.setBackground(Color.white);
    }//GEN-LAST:event_jTFNomeFavoritoMouseClicked

    private void jTFUrlFavoritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFUrlFavoritoMouseClicked
        if (jTFUrlFavorito.getText().equals("Insira a URL")){
            jTFUrlFavorito.setText("");
        }
        jTFUrlFavorito.setBackground(Color.white);
    }//GEN-LAST:event_jTFUrlFavoritoMouseClicked

    private void jTFNomeFavoritoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNomeFavoritoFocusLost
        if (jTFNomeFavorito.getText().isEmpty()) {
            jTFNomeFavorito.setText("Insira o Nome");
        }
    }//GEN-LAST:event_jTFNomeFavoritoFocusLost

    private void jTFUrlFavoritoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUrlFavoritoFocusLost
        if (jTFUrlFavorito.getText().isEmpty()){
            jTFUrlFavorito.setText("Insira a URL");
        }
    }//GEN-LAST:event_jTFUrlFavoritoFocusLost
    
    // pop up para msg 
    public void JOptionPaneShow(String msg){
        JFrame frame = new JFrame("Pop-up");

        // exibe a msg que for enviada 
        JOptionPane.showMessageDialog(frame, msg);
    }

    
    // Açao de salvar
    private void jBOkFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkFavoritoActionPerformed
        int aux = 0;
        if ((jTFNomeFavorito.getText().isEmpty()) || (jTFNomeFavorito.getText().equals("Insira o Nome"))){
            jTFNomeFavorito.setBackground(Color.red);
        }else{
            aux ++; }
        if ((jTFUrlFavorito.getText().isEmpty()) || (jTFUrlFavorito.getText().equals("Insira a URL"))){
            jTFUrlFavorito.setBackground(Color.red);
        }else{
            aux ++; }
        
        if (aux == 2){
            String mensagem = lista.addFavorito(jTFNomeFavorito.getText(), jTFUrlFavorito.getText());

            // exibe msg de retorno
            JOptionPaneShow(mensagem);

            dispose();
        }
    }//GEN-LAST:event_jBOkFavoritoActionPerformed

    private void jTFNomeFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeFavoritoActionPerformed
        jTFNomeFavorito.transferFocus();
    }//GEN-LAST:event_jTFNomeFavoritoActionPerformed

    private void jBOkFavoritoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBOkFavoritoKeyPressed
        // nao usado
    }//GEN-LAST:event_jBOkFavoritoKeyPressed

    private void jBRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetornarActionPerformed
        dispose();
    }//GEN-LAST:event_jBRetornarActionPerformed

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
            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Favoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Favoritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOkFavorito;
    private javax.swing.JButton jBRetornar;
    private javax.swing.JLabel jLAdicionarFavoritos;
    private javax.swing.JTextField jTFNomeFavorito;
    private javax.swing.JTextField jTFUrlFavorito;
    // End of variables declaration//GEN-END:variables
}
