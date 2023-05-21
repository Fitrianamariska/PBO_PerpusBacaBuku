package home;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.table.*;
import pages.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class home2 extends javax.swing.JFrame {
    
    DefaultTableModel tbl1 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultTableModel tbl2 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    DefaultTableModel tbl3 = new DefaultTableModel() {
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };

    /**
     * Creates new form home
     */
    public home2() {
        super("RakBuku");
        Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screen.width,screen.height);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setResizable(false);
        this.setUndecorated(true);
        
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        timenow();
        copyright();
        
        tampil_peminjaman();
        tampil_buku();

       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        timenow = new javax.swing.JLabel();
        about = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();
        copyright = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        peminjaman = new javax.swing.JPanel();
        search_peminjaman = new placeholder.search();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_peminjaman = new javax.swing.JTable();
        result_peminjaman = new javax.swing.JLabel();
        segarkan1 = new javax.swing.JPanel();
        segarkan1_value = new javax.swing.JLabel();
        kelolabuku = new javax.swing.JPanel();
        search_buku = new placeholder.search();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_buku = new javax.swing.JTable();
        result_buku = new javax.swing.JLabel();
        segarkan2 = new javax.swing.JPanel();
        segarkan2_value = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        header.setBackground(new java.awt.Color(86, 44, 44));

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("BacaBuku");
        title.setToolTipText("TUGAS AKHIR");

        close_btn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        close_btn.setForeground(new java.awt.Color(255, 255, 255));
        close_btn.setText("×");
        close_btn.setToolTipText("Keluar?");
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });
        close_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                close_btnKeyPressed(evt);
            }
        });

        timenow.setForeground(new java.awt.Color(255, 255, 255));
        timenow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timenow.setText("Now");

        about.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        about.setForeground(new java.awt.Color(255, 255, 255));
        about.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        about.setText("?");
        about.setToolTipText("Tentang TUKHIR");
        about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timenow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(about, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addComponent(close_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(about))
            .addComponent(timenow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        footer.setBackground(new java.awt.Color(242, 84, 45));

        copyright.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        copyright.setForeground(new java.awt.Color(255, 255, 255));
        copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copyright.setText("Amikom Purwokerto");

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(copyright, javax.swing.GroupLayout.DEFAULT_SIZE, 951, Short.MAX_VALUE)
                .addContainerGap())
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(copyright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        peminjaman.setBackground(new java.awt.Color(255, 255, 255));

        search_peminjaman.setToolTipText("Cari Data");
        search_peminjaman.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_peminjamanKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_peminjamanKeyTyped(evt);
            }
        });

        tb_peminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan", "Kode Buku", "Judul Buku", "Tanggal Pinjam", "Tanggal Kembali"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_peminjaman);

        result_peminjaman.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        result_peminjaman.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        segarkan1.setBackground(new java.awt.Color(127, 79, 36));

        segarkan1_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        segarkan1_value.setForeground(new java.awt.Color(255, 255, 255));
        segarkan1_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segarkan1_value.setText("Segarkan Tabel");
        segarkan1_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segarkan1_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout segarkan1Layout = new javax.swing.GroupLayout(segarkan1);
        segarkan1.setLayout(segarkan1Layout);
        segarkan1Layout.setHorizontalGroup(
            segarkan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(segarkan1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(segarkan1_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        segarkan1Layout.setVerticalGroup(
            segarkan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(segarkan1_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout peminjamanLayout = new javax.swing.GroupLayout(peminjaman);
        peminjaman.setLayout(peminjamanLayout);
        peminjamanLayout.setHorizontalGroup(
            peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(peminjamanLayout.createSequentialGroup()
                        .addComponent(result_peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addGroup(peminjamanLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(segarkan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        peminjamanLayout.setVerticalGroup(
            peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(peminjamanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(result_peminjaman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segarkan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab.addTab("Peminjaman", null, peminjaman, "Peminjaman");

        kelolabuku.setBackground(new java.awt.Color(255, 255, 255));

        search_buku.setToolTipText("Cari Data");
        search_buku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_bukuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_bukuKeyTyped(evt);
            }
        });

        tb_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Jenis", "Tanggal Terbit", "Pengarang", "Penerbit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tb_buku);

        result_buku.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        result_buku.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        segarkan2.setBackground(new java.awt.Color(127, 79, 36));

        segarkan2_value.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        segarkan2_value.setForeground(new java.awt.Color(255, 255, 255));
        segarkan2_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segarkan2_value.setText("Segarkan Tabel");
        segarkan2_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segarkan2_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout segarkan2Layout = new javax.swing.GroupLayout(segarkan2);
        segarkan2.setLayout(segarkan2Layout);
        segarkan2Layout.setHorizontalGroup(
            segarkan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(segarkan2_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        segarkan2Layout.setVerticalGroup(
            segarkan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(segarkan2_value, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kelolabukuLayout = new javax.swing.GroupLayout(kelolabuku);
        kelolabuku.setLayout(kelolabukuLayout);
        kelolabukuLayout.setHorizontalGroup(
            kelolabukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kelolabukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kelolabukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kelolabukuLayout.createSequentialGroup()
                        .addComponent(result_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                    .addComponent(segarkan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        kelolabukuLayout.setVerticalGroup(
            kelolabukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kelolabukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kelolabukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_buku, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(result_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(segarkan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tab.addTab("Daftar Buku", null, kelolabuku, "Kelola Buku");

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tab, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE)
                    .addGap(20, 20, 20)))
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 527, Short.MAX_VALUE)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bodyLayout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(tab)
                    .addGap(55, 55, 55)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar dari program?", "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
            dispose();
        }
    }//GEN-LAST:event_close_btnMouseClicked

    private void close_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_close_btnKeyPressed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Anda yakin ingin keluar dari program?", "Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        if (x == JOptionPane.YES_OPTION) {
            System.exit(0);
            dispose();
        }
    }//GEN-LAST:event_close_btnKeyPressed

    private void aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMouseClicked
        // TODO add your handling code here:
        new pages.about(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_aboutMouseClicked

    private void segarkan2_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segarkan2_valueMouseClicked
        // TODO add your handling code here:
        search_buku.setText("");
        result_buku.setText("");
        tampil_buku();
    }//GEN-LAST:event_segarkan2_valueMouseClicked

    private void search_bukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_bukuKeyTyped
        // TODO add your handling code here:
        search_buku();
    }//GEN-LAST:event_search_bukuKeyTyped

    private void search_bukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_bukuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search_buku();
        }
    }//GEN-LAST:event_search_bukuKeyPressed

    private void segarkan1_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segarkan1_valueMouseClicked
        // TODO add your handling code here:
        search_peminjaman.setText("");
        result_peminjaman.setText("");
        tampil_peminjaman();
    }//GEN-LAST:event_segarkan1_valueMouseClicked

    private void search_peminjamanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_peminjamanKeyTyped
        // TODO add your handling code here:
        search_peminjaman();
    }//GEN-LAST:event_search_peminjamanKeyTyped

    private void search_peminjamanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_peminjamanKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search_peminjaman();
        }
    }//GEN-LAST:event_search_peminjamanKeyPressed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }
    
    private void timenow() {
    // ActionListener untuk Keperluan Timer
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "";
                String nol_menit = "";
                String nol_detik = "";
                // Membuat Date
                java.util.Date dt = new java.util.Date();
                // Membuat date format
                java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("EEEE, dd MMMMM yyyy") ;
                // Mengambil nilaj JAM, MENIT, dan DETIK Sekarang
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                // Jika nilai JAM lebih kecil dari 10 (hanya 1 digit)
                if (nilai_jam <= 9) {
                    // Tambahkan "0" didepannya
                    nol_jam = "0";
                }
                // Jika nilai MENIT lebih kecil dari 10 (hanya 1 digit)
                if (nilai_menit <= 9) {
                    // Tambahkan "0" didepannya
                    nol_menit = "0";
                }
                // Jika nilai DETIK lebih kecil dari 10 (hanya 1 digit)
                if (nilai_detik <= 9) {
                    // Tambahkan "0" didepannya
                    nol_detik = "0";
                }
                // Membuat String JAM, MENIT, DETIK
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                // Menampilkan pada Layar
                timenow.setText(kal.format(dt)+"     "+jam + ":" + menit + ":" + detik+"                                   ");
            }
        };
        // Timer
        new javax.swing.Timer(1000, taskPerformer).start();
    }
    
    private void copyright() {
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy") ;
        copyright.setText("© "+kal.format(sekarang)+" Tugas Akhir. All Right Reserved.");
    }
    
    private void tampil_peminjaman() {
        Object []baris = {"NIM", "Nama", "Jurusan", "Kode Buku", "Judul Buku", "Tanggal Peminjaman", "Tanggal Pengembalian"};
        tbl1 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tb_peminjaman.setModel(tbl1);
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM peminjaman ORDER BY id ASC";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            
            while (hasil.next()) {
                String nim = hasil.getString("nim");
                String nama = hasil.getString("nama");
                String jurusan = hasil.getString("jurusan");
                String kode = hasil.getString("kode");
                String judul = hasil.getString("judul");
                String pinjam = hasil.getString("pinjam");
                String kembali = hasil.getString("kembali");
                
                String[] data = {nim, nama, jurusan, kode, judul, pinjam, kembali};
                tbl1.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan DATA!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            dispose();
        }
    }
    
    private void tampil_buku() {
        Object []baris = {"Kode Buku", "Judul Buku", "Jenis", "Tanggal Terbit", "Pengarang", "Penerbit"};
        tbl2 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tb_buku.setModel(tbl2);
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM buku ORDER BY id ASC";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            
            while (hasil.next()) {
                String jenis = null;
                String kode = hasil.getString("kode");
                String judul = hasil.getString("judul");
                String tanggal = hasil.getString("tanggal");
                String pengarang = hasil.getString("pengarang");
                String penerbit = hasil.getString("penerbit");
                
                if (hasil.getString("jenis").equals("1")) {
                    jenis = "Novel";
                } else if (hasil.getString("jenis").equals("2")) {
                    jenis = "Jurnal";
                } else if (hasil.getString("jenis").equals("3")) {
                    jenis = "Majalah";
                } else if (hasil.getString("jenis").equals("4")) {
                    jenis = "Komik";
                } else if (hasil.getString("jenis").equals("5")) {
                    jenis = "Biografi";
                } else if (hasil.getString("jenis").equals("6")) {
                    jenis = "Ensiklopedia";
               }
                
                String[] data = {kode, judul, jenis, tanggal, pengarang, penerbit};
                tbl2.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan DATA!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
            dispose();
        }
    }

    
    
    private void search_peminjaman() {
        String query = search_peminjaman.getText();
        
        Object []baris = {"NIM", "Nama", "Jurusan", "Kode Buku", "Judul Buku", "Tanggal Peminjaman", "Tanggal Pengembalian"};
        tbl1 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tb_peminjaman.setModel(tbl1);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM peminjaman WHERE BINARY "
                    + "nim LIKE '%"+query+"%' "
                    + "OR nama LIKE '%"+query+"%' "
                    + "OR jurusan LIKE '%"+query+"%' "
                    + "OR kode LIKE '%"+query+"%' "
                    + "OR judul LIKE '%"+query+"%' "
                    + "OR pinjam LIKE '%"+query+"%' "
                    + "OR kembali LIKE '%"+query+"%' "
                    + "ORDER BY id ASC";
            java.sql.Statement stmt = con.createStatement();
            java.sql.ResultSet hasil = stmt.executeQuery(sql);
            
            while (hasil.next()) {
                String nim = hasil.getString("nim");
                String nama = hasil.getString("nama");
                String jurusan = hasil.getString("jurusan");
                String kode = hasil.getString("kode");
                String judul = hasil.getString("judul");
                String pinjam = hasil.getString("pinjam");
                String kembali = hasil.getString("kembali");
                
                String[] data = {nim, nama, jurusan, kode, judul, pinjam, kembali};
                tbl1.addRow(data);
            }
            
            if (!query.equals("")) {
                result_peminjaman.setText("Hasil pencarian dari: '"+query+"'");
            } else {
                result_peminjaman.setText("");
            }
        } catch (Exception e) {}
    }
    
    private void search_buku() {
        String query = search_buku.getText();
        
        Object []baris = {"Kode Buku", "Judul Buku", "Jenis", "Tanggal Terbit", "Pengarang", "Penerbit"};
        tbl2 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tb_buku.setModel(tbl2);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM buku WHERE BINARY "
                    + "kode LIKE '%"+query+"%' "
                    + "OR judul LIKE '%"+query+"%' "
                    + "OR tanggal LIKE '%"+query+"%' "
                    + "OR pengarang LIKE '%"+query+"%' "
                    + "OR penerbit LIKE '%"+query+"%' "
                    + "ORDER BY id ASC";
            java.sql.Statement stmt = con.createStatement();
            java.sql.ResultSet hasil = stmt.executeQuery(sql);
            
            while (hasil.next()) {
                String jenis = null;
                String kode = hasil.getString("kode");
                String judul = hasil.getString("judul");
                String tanggal = hasil.getString("tanggal");
                String pengarang = hasil.getString("pengarang");
                String penerbit = hasil.getString("penerbit");

                
                if (hasil.getString("jenis").equals("1")) {
                    jenis = "Novel";
                } else if (hasil.getString("jenis").equals("2")) {
                    jenis = "Jurnal";
                } else if (hasil.getString("jenis").equals("3")) {
                    jenis = "Majalah";
                } else if (hasil.getString("jenis").equals("4")) {
                    jenis = "Komik";
                } else if (hasil.getString("jenis").equals("5")) {
                    jenis = "Biografi";
                } else if (hasil.getString("jenis").equals("6")) {
                    jenis = "Ensiklopedia";
               }
                
                String[] data = {kode, judul, jenis, tanggal, pengarang, penerbit};
                tbl2.addRow(data);
            }
            
            if (!query.equals("")) {
                result_buku.setText("Hasil pencarian dari: '"+query+"'");
            } else {
                result_buku.setText("");
            }
        } catch (Exception e) {}
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel about;
    private javax.swing.JPanel body;
    private javax.swing.JLabel close_btn;
    private javax.swing.JLabel copyright;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel kelolabuku;
    private javax.swing.JPanel peminjaman;
    private javax.swing.JLabel result_buku;
    private javax.swing.JLabel result_peminjaman;
    private javax.swing.JTextField search_buku;
    private javax.swing.JTextField search_peminjaman;
    private javax.swing.JPanel segarkan1;
    private javax.swing.JLabel segarkan1_value;
    private javax.swing.JPanel segarkan2;
    private javax.swing.JLabel segarkan2_value;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tb_buku;
    private javax.swing.JTable tb_peminjaman;
    private javax.swing.JLabel timenow;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
