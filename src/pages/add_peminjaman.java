/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author User
 */
public class add_peminjaman extends javax.swing.JDialog {
    
    private static Point point = new Point();
    
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

    /**
     * Creates new form add_peminjaman
     */
    public add_peminjaman(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        setSize(760, 578);
        setResizable(false);
        setLocationRelativeTo(null);
        this.setUndecorated(true);
        
        this.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                point.x = e.getX();
                point.y = e.getY();
            }
        });
        this.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                Point p = getLocation();
                setLocation(p.x + e.getX() - point.x, p.y + e.getY() - point.y);
            }
        });
        
        initComponents();
        
        nim.setEnabled(false);
        nama.setEnabled(false);
        jurusan.setEnabled(false);
        kode.setEnabled(false);
        judul.setEnabled(false);
        jenis.setEnabled(false);
        
        tampil_buku();
        tampil_mahasiswa();
        thisdate();
        afterdate();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        close_btn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mahasiswa = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_buku = new javax.swing.JTable();
        cari_mahasiswa = new placeholder.search_student();
        cari_buku = new placeholder.search_book();
        data_mahasiswa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jurusan = new javax.swing.JTextField();
        data_buku = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        kode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jenis = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        judul = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pinjam = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        kembali = new javax.swing.JTextField();
        save_btn = new javax.swing.JPanel();
        save = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        header.setBackground(new java.awt.Color(242, 84, 45));
        header.setPreferredSize(new java.awt.Dimension(718, 47));

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(732, Short.MAX_VALUE)
                .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close_btn)
        );

        tbl_mahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan"
            }
        ));
        tbl_mahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_mahasiswa);

        tbl_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode Buku", "Judul Buku", "Tanggal Terbit"
            }
        ));
        tbl_buku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_buku);

        cari_mahasiswa.setToolTipText("Cari Mahasiswa");
        cari_mahasiswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_mahasiswaActionPerformed(evt);
            }
        });
        cari_mahasiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cari_mahasiswaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cari_mahasiswaKeyTyped(evt);
            }
        });

        cari_buku.setToolTipText("Cari Buku");
        cari_buku.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cari_bukuKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cari_bukuKeyTyped(evt);
            }
        });

        data_mahasiswa.setBackground(new java.awt.Color(255, 255, 255));
        data_mahasiswa.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Mahasiswa"));

        jLabel1.setText("NIM");

        nim.setBackground(new java.awt.Color(204, 204, 204));
        nim.setDoubleBuffered(true);

        jLabel2.setText("Nama");

        nama.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setText("Jurusan");

        jurusan.setBackground(new java.awt.Color(204, 204, 204));
        jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurusanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout data_mahasiswaLayout = new javax.swing.GroupLayout(data_mahasiswa);
        data_mahasiswa.setLayout(data_mahasiswaLayout);
        data_mahasiswaLayout.setHorizontalGroup(
            data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nim)
            .addComponent(nama)
            .addGroup(data_mahasiswaLayout.createSequentialGroup()
                .addGroup(data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jurusan)
        );
        data_mahasiswaLayout.setVerticalGroup(
            data_mahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_mahasiswaLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nim, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        data_buku.setBackground(new java.awt.Color(255, 255, 255));
        data_buku.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Buku"));

        jLabel4.setText("Kode Buku");

        kode.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("Jenis Buku");

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novel", "Jurnal", "Majalah", "Komik", "Biografi", "Ensiklopedia" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        jLabel6.setText("Judul Buku");

        judul.setBackground(new java.awt.Color(204, 204, 204));

        jLabel7.setText("Tanggal Peminjaman (YYYY-MM-DD)");

        jLabel8.setText("Tanggal Pengembalian (YYYY-MM-DD)");

        javax.swing.GroupLayout data_bukuLayout = new javax.swing.GroupLayout(data_buku);
        data_buku.setLayout(data_bukuLayout);
        data_bukuLayout.setHorizontalGroup(
            data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kode)
            .addComponent(jenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(judul)
            .addComponent(pinjam)
            .addGroup(data_bukuLayout.createSequentialGroup()
                .addGroup(data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(data_bukuLayout.createSequentialGroup()
                        .addGroup(data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 169, Short.MAX_VALUE))
                    .addGroup(data_bukuLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE))
                    .addComponent(kembali))
                .addContainerGap())
        );
        data_bukuLayout.setVerticalGroup(
            data_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_bukuLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        save_btn.setBackground(new java.awt.Color(86, 44, 44));

        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        save.setText("Simpan");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout save_btnLayout = new javax.swing.GroupLayout(save_btn);
        save_btn.setLayout(save_btnLayout);
        save_btnLayout.setHorizontalGroup(
            save_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, save_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        save_btnLayout.setVerticalGroup(
            save_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(save_btnLayout.createSequentialGroup()
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cari_mahasiswa)
                    .addComponent(cari_buku)
                    .addComponent(data_mahasiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(data_buku, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(cari_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_mahasiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(data_buku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bodyLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        data_mahasiswa.getAccessibleContext().setAccessibleDescription("");

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
        this.setVisible(false);
    }//GEN-LAST:event_close_btnMouseClicked

    private void close_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_close_btnKeyPressed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_close_btnKeyPressed

    private void tbl_mahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mahasiswaMouseClicked
        // TODO add your handling code here:
        clicktbl_mahasiswa();
    }//GEN-LAST:event_tbl_mahasiswaMouseClicked

    private void cari_mahasiswaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_mahasiswaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search_mahasiswa();
        }
    }//GEN-LAST:event_cari_mahasiswaKeyPressed

    private void cari_mahasiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_mahasiswaKeyTyped
        // TODO add your handling code here:
        search_mahasiswa();
    }//GEN-LAST:event_cari_mahasiswaKeyTyped

    private void cari_bukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_bukuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search_book();
        }
    }//GEN-LAST:event_cari_bukuKeyPressed

    private void cari_bukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cari_bukuKeyTyped
        // TODO add your handling code here:
        search_book();
    }//GEN-LAST:event_cari_bukuKeyTyped

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_saveMouseClicked

    private void tbl_bukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bukuMouseClicked
        // TODO add your handling code here:
        clicktbl_buku();
    }//GEN-LAST:event_tbl_bukuMouseClicked

    private void jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jurusanActionPerformed

    private void cari_mahasiswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_mahasiswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cari_mahasiswaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

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
            java.util.logging.Logger.getLogger(add_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                add_peminjaman dialog = new add_peminjaman(new javax.swing.JFrame(), true);
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
    
    private void thisdate() {
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd") ;
        pinjam.setText(""+kal.format(sekarang));
        //kembali.setText("0000-00-00");
    }
    
     private void afterdate() {
        //java.util.Date seminggu = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        Calendar c = Calendar.getInstance();        
        c.add(Calendar.DATE, 7);
        kembali.setText(""+kal.format(c.getTime()));
    }
    
    
    
    private void tampil_buku() {
        Object []baris = {"Kode Buku", "Judul Buku", "Tanggal Terbit"};
        tbl1 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_buku.setModel(tbl1);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM buku ORDER BY id ASC";
            java.sql.Statement st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                String kode = rs.getString("kode");
                String judul = rs.getString("judul");
                String tanggal = rs.getString("tanggal");
                
                String[] data = {kode, judul, tanggal};
                tbl1.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan DATA!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            this.setVisible(false);
        }
    }
    
    private void tampil_mahasiswa() {
        Object []baris = {"NIM", "Nama", "Jurusan"};
        tbl2 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_mahasiswa.setModel(tbl2);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM mahasiswa ORDER BY id ASC";
            java.sql.Statement st = con.createStatement();
            java.sql.ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                String jurusan = rs.getString("jurusan");
                
                String[] data = {nim, nama, jurusan};
                tbl2.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menampilkan DATA!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            this.setVisible(false);
        }
    }
    
    private void search_book() {
        String query = cari_buku.getText();
        
        Object []baris = {"Kode Buku", "Judul Buku", "Tanggal Terbit"};
        tbl1 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_buku.setModel(tbl1);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM buku WHERE BINARY "
                    + "kode LIKE '%"+query+"%' "
                    + "OR judul LIKE '%"+query+"%' "
                    + "OR tanggal LIKE '%"+query+"%' "
                    + "OR pengarang LIKE '%"+query+"%' "
                    + "ORDER BY id ASC";
            java.sql.Statement stmt = con.createStatement();
            java.sql.ResultSet hasil = stmt.executeQuery(sql);
            
            while (hasil.next()) {
                String kode = hasil.getString("kode");
                String judul = hasil.getString("judul");
                String tanggal = hasil.getString("tanggal");
                
                String[] data = {kode, judul, tanggal};
                tbl1.addRow(data);
            }
        } catch (Exception e) {}
    }
    
    private void search_mahasiswa() {
        String query = cari_mahasiswa.getText();
        
        Object []baris = {"NIM", "Nama", "Jurusan"};
        tbl2 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbl_mahasiswa.setModel(tbl2);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM mahasiswa WHERE BINARY "
                    + "nim LIKE '%"+query+"%' "
                    + "OR nama LIKE '%"+query+"%' "
                    + "OR jurusan LIKE '%"+query+"%' "
                    + "ORDER BY id ASC";
            java.sql.Statement stmt = con.createStatement();
            java.sql.ResultSet hasil = stmt.executeQuery(sql);
            
            while (hasil.next()) {
                String nim = hasil.getString("nim");
                String nama = hasil.getString("nama");
                String jurusan = hasil.getString("jurusan");
                
                String[] data = {nim, nama, jurusan};
                tbl2.addRow(data);
            }
        } catch (Exception e) {}
    }
    
    private void clicktbl_mahasiswa() {
        int baris = tbl_mahasiswa.getSelectedRow();
        
        nim.setText((String)tbl2.getValueAt(baris, 0));
        nama.setText((String)tbl2.getValueAt(baris, 1));
        jurusan.setText((String)tbl2.getValueAt(baris, 2));
    }
    
    private void clicktbl_buku() {
        int baris = tbl_buku.getSelectedRow();
        
        kode.setText((String)tbl1.getValueAt(baris, 0));
        judul.setText((String)tbl1.getValueAt(baris, 1));
        thisdate();
        afterdate();
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM buku WHERE kode = '"+(String)tbl1.getValueAt(baris, 0)+"'";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet rs = stat.executeQuery(sql);
            
            if (rs.next()) {
                jenis.setSelectedIndex(rs.getInt("jenis")-1);
            }
            
        } catch (Exception e) {}
    }
    
    private void save() {
        String id, getnim, getnama, getjurusan, getkode, getjudul, getpinjam, getkembali;
        
        getnim = nim.getText();
        getnama = nama.getText();
        getjurusan = jurusan.getText();
        getkode = kode.getText();
        getjudul = judul.getText();
        getpinjam = pinjam.getText();
        getkembali = kembali.getText();
        
        if (empty(getnim) || empty(getkode) || empty(getpinjam) || empty(getkembali)) {
            JOptionPane.showMessageDialog(null, "Data yang Anda masukkan belum lengkap!", "Peringatan!", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Connection con = new database.connection().configDB();
                String get = "SELECT * FROM peminjaman WHERE nim = '"+getnim+"' AND kode = '"+getkode+"'";
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet hasil = st.executeQuery(get);
                
                if (hasil.next()) {
                    JOptionPane.showMessageDialog(null, "Data seperti ini sudah pernah Anda masukkan sebelumnya.", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                } else {
                    try {
                        String sql = "INSERT INTO peminjaman VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
                        java.sql.PreparedStatement stat = (PreparedStatement)con.prepareStatement(sql);
                        stat.setString(1, getnim);
                        stat.setString(2, getnama);
                        stat.setString(3, getjurusan);
                        stat.setString(4, getkode);
                        stat.setString(5, getjudul);
                        stat.setString(6, getpinjam);
                        stat.setString(7, getkembali);
                        stat.executeUpdate();

                        this.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Data BERHASIL Ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "GAGAL Menambahkan Data", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (Exception e) {}
        }
    }
    
    private static boolean empty(final String s) {
        return s == null || s.trim().isEmpty();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JTextField cari_buku;
    private javax.swing.JTextField cari_mahasiswa;
    private javax.swing.JLabel close_btn;
    private javax.swing.JPanel data_buku;
    private javax.swing.JPanel data_mahasiswa;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JTextField judul;
    private javax.swing.JTextField jurusan;
    private javax.swing.JTextField kembali;
    private javax.swing.JTextField kode;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField nim;
    private javax.swing.JTextField pinjam;
    private javax.swing.JLabel save;
    private javax.swing.JPanel save_btn;
    private javax.swing.JTable tbl_buku;
    private javax.swing.JTable tbl_mahasiswa;
    // End of variables declaration//GEN-END:variables
}
