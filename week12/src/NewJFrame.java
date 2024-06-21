/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author D2K
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        tblSmpan = new javax.swing.JButton();
        labelNama = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        labelNama2 = new javax.swing.JLabel();
        angka1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        angka2 = new javax.swing.JTextField();
        tblTambah = new javax.swing.JToggleButton();
        tampilHasil = new javax.swing.JLabel();
        labelAngka1 = new javax.swing.JLabel();
        labelAngka2 = new javax.swing.JLabel();
        tblKali = new javax.swing.JToggleButton();
        tblKurang = new javax.swing.JToggleButton();
        tblBagi = new javax.swing.JToggleButton();
        tblModulus = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("P");

        tblSmpan.setBackground(new java.awt.Color(204, 204, 0));
        tblSmpan.setText("Simpan");
        tblSmpan.setAutoscrolls(true);
        tblSmpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblSmpanActionPerformed(evt);
            }
        });

        labelNama.setText("Nama :");

        txtNama.setToolTipText("Masukkan Nama Lengkap");
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        labelNama2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        angka1.setToolTipText("Masukkan Angka Pertama");
        angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("=");

        angka2.setToolTipText("Masukkan Angka Kedua");
        angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angka2ActionPerformed(evt);
            }
        });

        tblTambah.setText("Jumlah");
        tblTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblTambahActionPerformed(evt);
            }
        });

        tampilHasil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        labelAngka1.setText("Angka 1");

        labelAngka2.setText("Angka 2");

        tblKali.setText("Kali");
        tblKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblKaliActionPerformed(evt);
            }
        });

        tblKurang.setText("Kurang");
        tblKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblKurangActionPerformed(evt);
            }
        });

        tblBagi.setText("Bagi");
        tblBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblBagiActionPerformed(evt);
            }
        });

        tblModulus.setText("Modulus");
        tblModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblModulusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelNama)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tblSmpan)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelAngka1)
                                .addGap(196, 196, 196))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAngka2))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblKurang)
                            .addComponent(tblTambah)
                            .addComponent(tblKali)
                            .addComponent(tblBagi))
                        .addGap(44, 44, 44)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNama)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tblSmpan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNama2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tampilHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(labelAngka1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(labelAngka2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tblTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(tblKali)))
                        .addGap(16, 16, 16)
                        .addComponent(tblKurang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tblBagi)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void tblSmpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblSmpanActionPerformed
        // TODO add your handling code here:
        String nama = txtNama.getText();
        labelNama2.setText("Hello, "+nama);
    }//GEN-LAST:event_tblSmpanActionPerformed

    private void angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angka1ActionPerformed

    private void angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angka2ActionPerformed

    private void tblTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblTambahActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) + Double.parseDouble(angka2.getText());
        tampilHasil.setText(Double.toString(hasil));
        tampilHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tblTambahActionPerformed

    private void tblKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblKaliActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) * Double.parseDouble(angka2.getText());
        tampilHasil.setText(Double.toString(hasil));
        tampilHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tblKaliActionPerformed

    private void tblKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblKurangActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) - Double.parseDouble(angka2.getText());
        tampilHasil.setText(Double.toString(hasil));
        tampilHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tblKurangActionPerformed

    private void tblBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblBagiActionPerformed
        // TODO add your handling code here:
        try{
        double hasil = Double.parseDouble(angka1.getText()) / Double.parseDouble(angka2.getText());
        tampilHasil.setText(Double.toString(hasil));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tblBagiActionPerformed

    private void tblModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblModulusActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) % Double.parseDouble(angka2.getText());
        tampilHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_tblModulusActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelAngka1;
    private javax.swing.JLabel labelAngka2;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelNama2;
    private javax.swing.JLabel tampilHasil;
    private javax.swing.JToggleButton tblBagi;
    private javax.swing.JToggleButton tblKali;
    private javax.swing.JToggleButton tblKurang;
    private javax.swing.JButton tblSmpan;
    private javax.swing.JToggleButton tblTambah;
    private javax.swing.JTextField txtNama;
    private javax.swing.JToggleButton tblModulus;
    // End of variables declaration//GEN-END:variables
}