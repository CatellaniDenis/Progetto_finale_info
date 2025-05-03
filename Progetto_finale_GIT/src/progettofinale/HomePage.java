package progettofinale;

import javax.swing.*;

/**
 *
 * @author Catellani, Gambetti, Maschio, Moretti
 */
public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carrello = new javax.swing.JButton();
        donna = new javax.swing.JButton();
        uomo = new javax.swing.JButton();
        titolo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        carrello.setBackground(new java.awt.Color(0, 102, 204));
        carrello.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettofinale/img_carrello_bianca.png"))); // NOI18N
        carrello.setBorder(null);
        carrello.setBorderPainted(false);
        carrello.setContentAreaFilled(false);
        carrello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrelloActionPerformed(evt);
            }
        });

        donna.setBackground(new java.awt.Color(0, 102, 204));
        donna.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        donna.setForeground(new java.awt.Color(255, 255, 255));
        donna.setText("DONNA");
        donna.setBorder(null);
        donna.setBorderPainted(false);
        donna.setContentAreaFilled(false);
        donna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donnaActionPerformed(evt);
            }
        });

        uomo.setBackground(new java.awt.Color(0, 102, 204));
        uomo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uomo.setForeground(new java.awt.Color(255, 255, 255));
        uomo.setText("UOMO");
        uomo.setBorder(null);
        uomo.setBorderPainted(false);
        uomo.setContentAreaFilled(false);
        uomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uomoActionPerformed(evt);
            }
        });

        titolo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/progettofinale/dropZone.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(uomo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donna, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(titolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(carrello, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(carrello, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(uomo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(donna, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titolo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carrelloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrelloActionPerformed

    }//GEN-LAST:event_carrelloActionPerformed

    private void donnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donnaActionPerformed

    private void uomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uomoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uomoActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carrello;
    private javax.swing.JButton donna;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel titolo;
    private javax.swing.JButton uomo;
    // End of variables declaration//GEN-END:variables
}
