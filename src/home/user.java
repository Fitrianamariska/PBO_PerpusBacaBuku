package home;


import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class user extends javax.swing.JDialog {

    /**
     * Creates new form userinfo
     */
    public user(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        setSize(319, 235);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setUndecorated(true);
        
        initComponents();
        
        username.setEditable(false);
        password.setEditable(false);
        userlawas.setVisible(false);
        passlawas.setVisible(false);
        tampil();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header2 = new javax.swing.JPanel();
        close_btn2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        esbtn = new javax.swing.JPanel();
        edit_save = new javax.swing.JLabel();
        userlawas = new javax.swing.JLabel();
        passlawas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        header2.setBackground(new java.awt.Color(242, 84, 45));
        header2.setPreferredSize(new java.awt.Dimension(718, 47));

        close_btn2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        close_btn2.setForeground(new java.awt.Color(255, 255, 255));
        close_btn2.setText("×");
        close_btn2.setToolTipText("Keluar?");
        close_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btn2MouseClicked(evt);
            }
        });
        close_btn2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                close_btn2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout header2Layout = new javax.swing.GroupLayout(header2);
        header2.setLayout(header2Layout);
        header2Layout.setHorizontalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        header2Layout.setVerticalGroup(
            header2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close_btn2)
        );

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel1.setText("Nama Pengguna");

        username.setFont(new java.awt.Font("Futura Md BT", 0, 16)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        jLabel2.setText("Kata Sandi");

        password.setFont(new java.awt.Font("Futura Md BT", 0, 16)); // NOI18N

        esbtn.setBackground(new java.awt.Color(86, 44, 44));

        edit_save.setFont(new java.awt.Font("Futura Md BT", 1, 16)); // NOI18N
        edit_save.setForeground(new java.awt.Color(255, 255, 255));
        edit_save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        edit_save.setText("Ubah");
        edit_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit_saveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout esbtnLayout = new javax.swing.GroupLayout(esbtn);
        esbtn.setLayout(esbtnLayout);
        esbtnLayout.setHorizontalGroup(
            esbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(edit_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        esbtnLayout.setVerticalGroup(
            esbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, esbtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(esbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passlawas))
                        .addComponent(username)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userlawas))
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(header2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userlawas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passlawas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(esbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btn2MouseClicked
        // TODO add your handling code here:
        home n = new home();
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_close_btn2MouseClicked

    private void close_btn2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_close_btn2KeyPressed
        // TODO add your handling code here:
        home n = new home();
        this.setVisible(false);
        n.setVisible(true);
    }//GEN-LAST:event_close_btn2KeyPressed

    private void edit_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit_saveMouseClicked
        // TODO add your handling code here:
        if (edit_save.getText().equals("Ubah")) {
            username.setEditable(true);
            password.setEditable(true);
            edit_save.setText("Simpan");
        } else if (edit_save.getText().equals("Simpan")) {
            String pengguna = userlawas.getText();
            String sandi = passlawas.getText();
            String user = username.getText();
            String pass = password.getText();
            
            try {
                Connection con = new database.connection().configDB();
                String sql = "UPDATE admin SET username = ?, password = ? WHERE username = '"+pengguna+"' AND password = '"+sandi+"'";
                java.sql.PreparedStatement stat = con.prepareStatement(sql);
                stat.setString(1, user);
                stat.setString(2, pass);
                stat.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Data login BERHASIL Diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                
                login n = new login();
                this.setVisible(false);
                n.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data login GAGAL Diubah", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                
                home n = new home();
                this.setVisible(false);
                n.setVisible(true);
            }
        }
    }//GEN-LAST:event_edit_saveMouseClicked

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

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
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                user dialog = new user(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    private void tampil() {
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM admin";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            
            if (hasil.next()) {
                username.setText(hasil.getString("username"));
                password.setText(hasil.getString("password"));
                userlawas.setText(hasil.getString("username"));
                passlawas.setText(hasil.getString("password"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan DATA!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_btn2;
    private javax.swing.JLabel edit_save;
    private javax.swing.JPanel esbtn;
    private javax.swing.JPanel header2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passlawas;
    private javax.swing.JTextField password;
    private javax.swing.JLabel userlawas;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
