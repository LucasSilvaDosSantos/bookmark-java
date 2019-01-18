
package telas;

import backEnd.ListaBack;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Imagens extends javax.swing.JFrame {
    ListaBack lista = new ListaBack();
    
    public Imagens() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLAdicionarImagens = new javax.swing.JLabel();
        jTFNomeImagem = new javax.swing.JTextField();
        jTFUrlImagem = new javax.swing.JTextField();
        jTFTamanhoImagem = new javax.swing.JTextField();
        jBOkImagem = new javax.swing.JButton();
        jBRetornar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLAdicionarImagens.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLAdicionarImagens.setText("Adicionar Imagens");

        jTFNomeImagem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTFNomeImagem.setText("Insira o Nome");
        jTFNomeImagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFNomeImagemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFNomeImagemFocusLost(evt);
            }
        });
        jTFNomeImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFNomeImagemMouseClicked(evt);
            }
        });
        jTFNomeImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNomeImagemActionPerformed(evt);
            }
        });

        jTFUrlImagem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTFUrlImagem.setText("Insira a URL");
        jTFUrlImagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFUrlImagemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFUrlImagemFocusLost(evt);
            }
        });
        jTFUrlImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFUrlImagemMouseClicked(evt);
            }
        });

        jTFTamanhoImagem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTFTamanhoImagem.setText("Insira o Tamanho");
        jTFTamanhoImagem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTFTamanhoImagemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTFTamanhoImagemFocusLost(evt);
            }
        });
        jTFTamanhoImagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTFTamanhoImagemMouseClicked(evt);
            }
        });

        jBOkImagem.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jBOkImagem.setText("Salvar");
        jBOkImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkImagemActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(jLAdicionarImagens))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTFNomeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFUrlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTamanhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jBOkImagem)))
                        .addGap(0, 79, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBRetornar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLAdicionarImagens)
                .addGap(50, 50, 50)
                .addComponent(jTFNomeImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFUrlImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFTamanhoImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBOkImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBRetornar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNomeImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNomeImagemActionPerformed
        jTFNomeImagem.transferFocus();
    }//GEN-LAST:event_jTFNomeImagemActionPerformed

    private void jTFNomeImagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNomeImagemFocusGained
        if (jTFNomeImagem.getText().equals("Insira o Nome")){
            jTFNomeImagem.setText("");
        }
    }//GEN-LAST:event_jTFNomeImagemFocusGained

    private void jTFUrlImagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUrlImagemFocusGained
        jTFUrlImagem.setBackground(Color.white);
        if (jTFUrlImagem.getText().equals("Insira a URL")){
            jTFUrlImagem.setText("");
        }
        jTFUrlImagem.setBackground(Color.white);     
    }//GEN-LAST:event_jTFUrlImagemFocusGained

    private void jTFTamanhoImagemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTamanhoImagemFocusGained
        jTFTamanhoImagem.setBackground(Color.white);
        if (jTFTamanhoImagem.getText().equals("Insira o Tamanho")){
            jTFTamanhoImagem.setText("");
        }
        jTFTamanhoImagem.setBackground(Color.white);  
    }//GEN-LAST:event_jTFTamanhoImagemFocusGained

    private void jTFNomeImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFNomeImagemMouseClicked
        if (jTFNomeImagem.getText().equals("Insira o Nome")){
            jTFNomeImagem.setText("");
        }
        jTFNomeImagem.setBackground(Color.white);
    }//GEN-LAST:event_jTFNomeImagemMouseClicked

    private void jTFUrlImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFUrlImagemMouseClicked
        if (jTFUrlImagem.getText().equals("Insira a URL")){
            jTFUrlImagem.setText("");
        }
        jTFUrlImagem.setBackground(Color.white);
    }//GEN-LAST:event_jTFUrlImagemMouseClicked

    private void jTFTamanhoImagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFTamanhoImagemMouseClicked
        if (jTFTamanhoImagem.getText().equals("Insira o Tamanho")){
            jTFTamanhoImagem.setText("");
        }
        jTFTamanhoImagem.setBackground(Color.white);
    }//GEN-LAST:event_jTFTamanhoImagemMouseClicked

    private void jTFNomeImagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFNomeImagemFocusLost
        if (jTFNomeImagem.getText().isEmpty()) {
            jTFNomeImagem.setText("Insira o Nome");
        }
    }//GEN-LAST:event_jTFNomeImagemFocusLost

    private void jTFUrlImagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFUrlImagemFocusLost
        if (jTFUrlImagem.getText().isEmpty()) {
            jTFUrlImagem.setText("Insira a URL");
        }
    }//GEN-LAST:event_jTFUrlImagemFocusLost

    private void jTFTamanhoImagemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTFTamanhoImagemFocusLost
        if (jTFTamanhoImagem.getText().isEmpty()) {
            jTFTamanhoImagem.setText("Insira o Tamanho");
        }
    }//GEN-LAST:event_jTFTamanhoImagemFocusLost
    
    public void JOptionPaneShow(String msg){
        JFrame frame = new JFrame("Pop-up");

        // exibe a msg que for enviada 
        JOptionPane.showMessageDialog(frame, msg);
    }
  
    private void jBOkImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkImagemActionPerformed
        int aux = 0;
        if ((jTFNomeImagem.getText().isEmpty()) || (jTFNomeImagem.getText().equals("Insira o Nome"))){
            jTFNomeImagem.setBackground(Color.red);
        }else{
            aux ++; 
        }
        if ((jTFUrlImagem.getText().isEmpty()) || (jTFUrlImagem.getText().equals("Insira a URL"))){
            jTFUrlImagem.setBackground(Color.red);
        }else{
            aux ++; 
        }
        if ((jTFTamanhoImagem.getText().isEmpty()) || (jTFTamanhoImagem.getText().equals("Insira o Tamanho"))){
            jTFTamanhoImagem.setBackground(Color.red);
        }else{
            // Teste para ver se é um numero inteiro valido
            try{
                int teste = Integer.parseInt(jTFTamanhoImagem.getText());
                aux ++; 
            }catch(Exception e){
                jTFTamanhoImagem.setBackground(Color.red);
            }
        }
        
        if (aux == 3){
            int tamanhoInt = Integer.parseInt(jTFTamanhoImagem.getText());

            //verifica retorno
            String mensagem = lista.addImagem(jTFNomeImagem.getText(), jTFUrlImagem.getText(), tamanhoInt);
            
            // exibe msg de retorno
            JOptionPaneShow(mensagem);
   
            dispose();
        }
    }//GEN-LAST:event_jBOkImagemActionPerformed

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
            java.util.logging.Logger.getLogger(Imagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Imagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Imagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Imagens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Imagens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOkImagem;
    private javax.swing.JButton jBRetornar;
    private javax.swing.JLabel jLAdicionarImagens;
    private javax.swing.JTextField jTFNomeImagem;
    private javax.swing.JTextField jTFTamanhoImagem;
    private javax.swing.JTextField jTFUrlImagem;
    // End of variables declaration//GEN-END:variables
}
