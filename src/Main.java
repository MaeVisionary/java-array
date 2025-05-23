/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Program_1 = new javax.swing.JButton();
        Program_2 = new javax.swing.JButton();
        Program_3 = new javax.swing.JButton();
        Program_4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME, PLAYER ONE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 450, 50));

        Program_1.setBackground(new java.awt.Color(51, 0, 102));
        Program_1.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Program_1.setForeground(new java.awt.Color(255, 255, 255));
        Program_1.setText("SUM AND AVERAGE");
        Program_1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Program_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Program_1ActionPerformed(evt);
            }
        });
        getContentPane().add(Program_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 330, 60));

        Program_2.setBackground(new java.awt.Color(51, 0, 102));
        Program_2.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Program_2.setForeground(new java.awt.Color(255, 255, 255));
        Program_2.setText("REVERSING AN ARRAY");
        Program_2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Program_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Program_2ActionPerformed(evt);
            }
        });
        getContentPane().add(Program_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 330, 60));

        Program_3.setBackground(new java.awt.Color(51, 0, 102));
        Program_3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Program_3.setForeground(new java.awt.Color(255, 255, 255));
        Program_3.setText("FINDING A SPECIFIC ELEMENT");
        Program_3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Program_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Program_3ActionPerformed(evt);
            }
        });
        getContentPane().add(Program_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 330, 60));

        Program_4.setBackground(new java.awt.Color(51, 0, 102));
        Program_4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        Program_4.setForeground(new java.awt.Color(255, 255, 255));
        Program_4.setText("SORTING AN ARRAY");
        Program_4.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        Program_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Program_4ActionPerformed(evt);
            }
        });
        getContentPane().add(Program_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 330, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 920, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Program_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Program_3ActionPerformed
        Program_3 program = new Program_3();
        program.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Program_3ActionPerformed

    private void Program_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Program_1ActionPerformed
        Program_1 program = new Program_1();
        program.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Program_1ActionPerformed

    private void Program_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Program_2ActionPerformed
        Program_2 program = new Program_2();
        program.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Program_2ActionPerformed

    private void Program_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Program_4ActionPerformed
        Program_4 program = new Program_4();
        program.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Program_4ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Program_1;
    private javax.swing.JButton Program_2;
    private javax.swing.JButton Program_3;
    private javax.swing.JButton Program_4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
