/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Package.aboutApp;

import Gui_Package.Azkary_Frame;

/**
 *
 * @author AhmedTalal
 */
public class AboutApp_frame extends javax.swing.JFrame {

    /**
     * Creates new form AboutApp_frame
     */
    public AboutApp_frame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Top_Panel = new javax.swing.JPanel();
        Hesan_Label = new javax.swing.JLabel();
        Sahm_Label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Top_Panel.setBackground(new java.awt.Color(0, 133, 157));

        Hesan_Label.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        Hesan_Label.setForeground(new java.awt.Color(204, 223, 200));
        Hesan_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hesan_Label.setText("حصن المسلم");

        Sahm_Label.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        Sahm_Label.setForeground(new java.awt.Color(204, 223, 200));
        Sahm_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sahm_Label.setText("<-");
        Sahm_Label.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Sahm_LabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Sahm_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sahm_LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Sahm_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Sahm_LabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Top_PanelLayout = new javax.swing.GroupLayout(Top_Panel);
        Top_Panel.setLayout(Top_PanelLayout);
        Top_PanelLayout.setHorizontalGroup(
            Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Top_PanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Sahm_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 945, Short.MAX_VALUE)
                .addComponent(Hesan_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        Top_PanelLayout.setVerticalGroup(
            Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sahm_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Hesan_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Top_Panel, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(225, 222, 222));

        jTextPane1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTextPane1.setText("       ما اجمل ان تسخر العلم الذي تعلمته من اجل إفاده دينك وافاده البشريه \n          لقد قمت بضم معظم الاذكار التي اعرفها  في هذا التطبيق واسال الله \nالعظيم ان يجعلني دايما في خدمه الاسلام ويحعل عملي خالصا لوجه الكريم ");
        jTextPane1.setDisabledTextColor(new java.awt.Color(9, 125, 123));
        jTextPane1.setDoubleBuffered(true);
        jTextPane1.setEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);

        jTextPane2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jTextPane2.setText("         designed by :Ahmed talal\n         m/01065418129\n         m/01111077944");
        jTextPane2.setDisabledTextColor(new java.awt.Color(9, 125, 123));
        jTextPane2.setEnabled(false);
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(369, 369, 369))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Sahm_LabelAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Sahm_LabelAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Sahm_LabelAncestorAdded

    private void Sahm_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sahm_LabelMouseClicked
        Azkary_Frame Azker = new Azkary_Frame();
        this.setVisible(false);
        Azker.setVisible(true);
    }//GEN-LAST:event_Sahm_LabelMouseClicked

    private void Sahm_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sahm_LabelMouseEntered

    }//GEN-LAST:event_Sahm_LabelMouseEntered

    private void Sahm_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sahm_LabelMouseExited

    }//GEN-LAST:event_Sahm_LabelMouseExited

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
            java.util.logging.Logger.getLogger(AboutApp_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutApp_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutApp_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutApp_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutApp_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hesan_Label;
    private javax.swing.JLabel Sahm_Label;
    private javax.swing.JPanel Top_Panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
