/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Package.Azkar_Pages;

import Gui_Package.Azkary_Frame;
import javax.swing.JOptionPane;


/**
 *
 * @author AhmedTalal
 */
public class SalatALestkara_frame extends javax.swing.JFrame {

    /**
     * Creates new form Alestekas_frame
     */
   int  counter = 0;
   int NumberOfAlZeker = 1;
    public SalatALestkara_frame() {
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
        DeskPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        counter_Label = new javax.swing.JLabel();
        Number_TextField = new javax.swing.JTextField();
        NumbeAlzeker_Label1 = new javax.swing.JLabel();
        Final_TextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Numbe_Label2 = new javax.swing.JLabel();
        NumberAlzeker_TextField1 = new javax.swing.JTextField();
        final_Label1 = new javax.swing.JLabel();
        Counter_TextField2 = new javax.swing.JTextField();
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
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Sahm_LabelAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1173, Short.MAX_VALUE)
                .addComponent(Hesan_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );
        Top_PanelLayout.setVerticalGroup(
            Top_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Top_PanelLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(Sahm_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Hesan_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Top_Panel, java.awt.BorderLayout.PAGE_START);

        jButton1.setBackground(new java.awt.Color(153, 141, 141));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(18, 81, 143));
        jButton1.setText("اضغط");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        counter_Label.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        counter_Label.setForeground(new java.awt.Color(18, 81, 143));
        counter_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counter_Label.setText("العداد");

        Number_TextField.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Number_TextField.setForeground(new java.awt.Color(18, 81, 143));
        Number_TextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Number_TextField.setText("1");
        Number_TextField.setEnabled(false);

        NumbeAlzeker_Label1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        NumbeAlzeker_Label1.setForeground(new java.awt.Color(18, 81, 143));
        NumbeAlzeker_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumbeAlzeker_Label1.setText("الذكر رقم");

        Final_TextField1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Final_TextField1.setForeground(new java.awt.Color(18, 81, 143));
        Final_TextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Final_TextField1.setText("1");
        Final_TextField1.setEnabled(false);
        Final_TextField1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Final_TextField1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Final_TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Final_TextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        Numbe_Label2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        Numbe_Label2.setForeground(new java.awt.Color(18, 81, 143));
        Numbe_Label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Numbe_Label2.setText("عدد مرات الذكر");

        NumberAlzeker_TextField1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        NumberAlzeker_TextField1.setForeground(new java.awt.Color(18, 81, 143));
        NumberAlzeker_TextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NumberAlzeker_TextField1.setText("1");
        NumberAlzeker_TextField1.setEnabled(false);

        final_Label1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        final_Label1.setForeground(new java.awt.Color(18, 81, 143));
        final_Label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        final_Label1.setText("من");

        Counter_TextField2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        Counter_TextField2.setForeground(new java.awt.Color(18, 81, 143));
        Counter_TextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Counter_TextField2.setEnabled(false);
        Counter_TextField2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Counter_TextField2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Counter_TextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Counter_TextField2ActionPerformed(evt);
            }
        });

        jTextPane2.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jTextPane2.setText("                                                         قال جابر بن عبدالله رض الله عنهما \n                                                        كان رسول الله صلي الله عليه وسلم \n                                     يعلمنا الاستخاره في الامور كلها كما يعلمنا السوره  \n                                   من القران , ويقول : اذا اهم احدكم بالامر فليركع ركعتين\n                             من غير الفريضه , ثم ليقل : اللهم اني استخيرك بعلمك \n                             واستقدرك بقدرتك , واسالك من فضلك العظيم فانك تقدر\n                         ولا اقدر , وتعلم ولا اعلم , وانت علام الغيوب , اللهم ان كنت \n                        تعلم هذا الامر ويسمي حاجته خير لي في ديني ومعاشي \n                      وعاقبه امري -او قال : عاجله واجله -فاقدره لي ويسره لي ثم\n                   بارك لي فيه وان كنت تعلم ان هذا الامر شر لي في ديني ومعاشي \n                 وعاقبه امري -او قال: عاجله واجله -فاصرفه عني واصرفني عنه واقدر لي\n                                        الخير حيث كان ثم ارضني به   \n                                --------------------------------------------------\n                                وما ندم من استخاره الخالق وشاور المخلوقين المؤمنين\n                             فقد قال الله سبحانه وتعالي \"وشاورهم في الامر فاذا عزمت \n                                           فتوكل علي الله\"");
        jTextPane2.setDisabledTextColor(new java.awt.Color(9, 125, 123));
        jTextPane2.setEnabled(false);
        jScrollPane2.setViewportView(jTextPane2);

        javax.swing.GroupLayout DeskPanelLayout = new javax.swing.GroupLayout(DeskPanel);
        DeskPanel.setLayout(DeskPanelLayout);
        DeskPanelLayout.setHorizontalGroup(
            DeskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskPanelLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(DeskPanelLayout.createSequentialGroup()
                .addGroup(DeskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeskPanelLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(Counter_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(counter_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(Number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(Numbe_Label2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DeskPanelLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(Final_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(final_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(NumberAlzeker_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(NumbeAlzeker_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DeskPanelLayout.setVerticalGroup(
            DeskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DeskPanelLayout.createSequentialGroup()
                .addGroup(DeskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DeskPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE))
                    .addGroup(DeskPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addGroup(DeskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumbeAlzeker_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumberAlzeker_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(final_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Final_TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(DeskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(DeskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Number_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(counter_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Counter_TextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Numbe_Label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        getContentPane().add(DeskPanel, java.awt.BorderLayout.CENTER);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(counter < Integer.parseInt(Number_TextField.getText()))
        {
             counter++;
             Counter_TextField2.setText(String.valueOf(counter));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Final_TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Final_TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Final_TextField1ActionPerformed

    private void Final_TextField1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Final_TextField1AncestorAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Final_TextField1AncestorAdded

    private void Counter_TextField2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Counter_TextField2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_Counter_TextField2AncestorAdded

    private void Counter_TextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Counter_TextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Counter_TextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(SalatALestkara_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalatALestkara_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalatALestkara_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalatALestkara_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalatALestkara_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Counter_TextField2;
    private javax.swing.JPanel DeskPanel;
    private javax.swing.JTextField Final_TextField1;
    private javax.swing.JLabel Hesan_Label;
    private javax.swing.JLabel NumbeAlzeker_Label1;
    private javax.swing.JLabel Numbe_Label2;
    private javax.swing.JTextField NumberAlzeker_TextField1;
    private javax.swing.JTextField Number_TextField;
    private javax.swing.JLabel Sahm_Label;
    private javax.swing.JPanel Top_Panel;
    private javax.swing.JLabel counter_Label;
    private javax.swing.JLabel final_Label1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
