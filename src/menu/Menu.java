package menu;

import backEnd.MenuBack;
import telas.Favoritos;
import telas.Imagens;
import telas.ListarFavoritos;

public class Menu extends javax.swing.JFrame {
    MenuBack menuBack = new MenuBack();
    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        menuBack.CarregaFavoritos();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLTitulo = new javax.swing.JLabel();
        jBConsultarSalvos = new javax.swing.JButton();
        jBInsereNovaImagem = new javax.swing.JButton();
        jBInsereNovoFavorito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));

        jLTitulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLTitulo.setText("BookMark");

        jBConsultarSalvos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBConsultarSalvos.setText("Consultar salvos ");
        jBConsultarSalvos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarSalvosActionPerformed(evt);
            }
        });

        jBInsereNovaImagem.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBInsereNovaImagem.setText("Inserir Nova Imagem   ");
        jBInsereNovaImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsereNovaImagemActionPerformed(evt);
            }
        });

        jBInsereNovoFavorito.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBInsereNovoFavorito.setText("Inserir Novo Favorito");
        jBInsereNovoFavorito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsereNovoFavoritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jBInsereNovaImagem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jBInsereNovoFavorito)
                .addGap(81, 81, 81))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jBConsultarSalvos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLTitulo)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInsereNovoFavorito)
                    .addComponent(jBInsereNovaImagem))
                .addGap(18, 18, 18)
                .addComponent(jBConsultarSalvos)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBConsultarSalvosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarSalvosActionPerformed
        ListarFavoritos telaListaFavoritos = new ListarFavoritos();
        telaListaFavoritos.setVisible(true);
    }//GEN-LAST:event_jBConsultarSalvosActionPerformed

    private void jBInsereNovoFavoritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsereNovoFavoritoActionPerformed
        Favoritos telaFavoritos = new Favoritos();
        telaFavoritos.setVisible(true);
    }//GEN-LAST:event_jBInsereNovoFavoritoActionPerformed

    private void jBInsereNovaImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsereNovaImagemActionPerformed
        Imagens telaImagens = new Imagens();
        telaImagens.setVisible(true);
    }//GEN-LAST:event_jBInsereNovaImagemActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultarSalvos;
    private javax.swing.JButton jBInsereNovaImagem;
    private javax.swing.JButton jBInsereNovoFavorito;
    private javax.swing.JLabel jLTitulo;
    // End of variables declaration//GEN-END:variables
}
