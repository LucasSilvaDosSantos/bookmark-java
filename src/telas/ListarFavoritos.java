/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import backEnd.FavoritosBack;
import backEnd.ListaBack;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author santo
 */
public class ListarFavoritos extends javax.swing.JFrame {
    
    /**
     * Creates new form ListarFavoritos
     */
    public ListarFavoritos() {
        initComponents();
        this.setLocationRelativeTo(null);

        DefaultTableModel dtmFavoritos = (DefaultTableModel) jTListaDeFavoritos.getModel();

        
        for (FavoritosBack fav: ListaBack.favoritos) {
            if (fav.getTamanho() == 0){
                Object[] dados = {fav.getNome(), fav.getUrl(), "sem informação", fav.getUltimoAcesso()};
                dtmFavoritos.addRow(dados);
            }else{
                Object[] dados = {fav.getNome(), fav.getUrl(), fav.getTamanho(), fav.getUltimoAcesso()};
                dtmFavoritos.addRow(dados);
            }          
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

        jLListaDeFavoritos = new javax.swing.JLabel();
        jBRetornar = new javax.swing.JButton();
        scrollPane1 = new java.awt.ScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaDeFavoritos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLListaDeFavoritos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLListaDeFavoritos.setText("Lista de Favoritos");

        jBRetornar.setText("Retornar");
        jBRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRetornarActionPerformed(evt);
            }
        });

        jTListaDeFavoritos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Url", "Tamanho", "Ultimo Acesso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTListaDeFavoritos);

        scrollPane1.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLListaDeFavoritos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(593, Short.MAX_VALUE)
                        .addComponent(jBRetornar))
                    .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLListaDeFavoritos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRetornar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRetornarActionPerformed
        dispose();
    }//GEN-LAST:event_jBRetornarActionPerformed

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
            java.util.logging.Logger.getLogger(ListarFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarFavoritos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarFavoritos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRetornar;
    private javax.swing.JLabel jLListaDeFavoritos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTListaDeFavoritos;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
