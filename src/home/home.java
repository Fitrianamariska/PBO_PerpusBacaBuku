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
public class home extends javax.swing.JFrame {
    
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
    public home() {
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
        tampil_mhsiswa();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        timenow = new javax.swing.JLabel();
        tab = new javax.swing.JTabbedPane();
        kelolabuku = new javax.swing.JPanel();
        search_buku = new placeholder.search();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_buku = new javax.swing.JTable();
        result_buku = new javax.swing.JLabel();
        tambah2 = new javax.swing.JPanel();
        tambah2_value = new javax.swing.JLabel();
        ubah2 = new javax.swing.JPanel();
        ubah2_value = new javax.swing.JLabel();
        hapus2 = new javax.swing.JPanel();
        hapus2_value = new javax.swing.JLabel();
        segarkan2 = new javax.swing.JPanel();
        segarkan2_value = new javax.swing.JLabel();
        kelolamahasiswa = new javax.swing.JPanel();
        search_mhsiswa = new placeholder.search();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_mhsiswa = new javax.swing.JTable();
        result_mhsiswa = new javax.swing.JLabel();
        tambah3 = new javax.swing.JPanel();
        tambah3_value = new javax.swing.JLabel();
        ubah3 = new javax.swing.JPanel();
        ubah3_value = new javax.swing.JLabel();
        hapus3 = new javax.swing.JPanel();
        hapus3_value = new javax.swing.JLabel();
        segarkan3 = new javax.swing.JPanel();
        segarkan3_value = new javax.swing.JLabel();
        userinfo = new javax.swing.JPanel();
        peminjaman = new javax.swing.JPanel();
        search_peminjaman = new placeholder.search();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_peminjaman = new javax.swing.JTable();
        result_peminjaman = new javax.swing.JLabel();
        tambah1 = new javax.swing.JPanel();
        tambah1_value = new javax.swing.JLabel();
        ubah1 = new javax.swing.JPanel();
        ubah1_value = new javax.swing.JLabel();
        hapus1 = new javax.swing.JPanel();
        hapus1_value = new javax.swing.JLabel();
        segarkan1 = new javax.swing.JPanel();
        segarkan1_value = new javax.swing.JLabel();
        footer = new javax.swing.JPanel();

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

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timenow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(close_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addComponent(close_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(timenow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        tambah2.setBackground(new java.awt.Color(127, 79, 36));

        tambah2_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        tambah2_value.setForeground(new java.awt.Color(255, 255, 255));
        tambah2_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambah2_value.setText("Tambah Data");
        tambah2_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambah2_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambah2Layout = new javax.swing.GroupLayout(tambah2);
        tambah2.setLayout(tambah2Layout);
        tambah2Layout.setHorizontalGroup(
            tambah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tambah2_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        tambah2Layout.setVerticalGroup(
            tambah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tambah2_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        ubah2.setBackground(new java.awt.Color(127, 79, 36));

        ubah2_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        ubah2_value.setForeground(new java.awt.Color(255, 255, 255));
        ubah2_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ubah2_value.setText("Ubah Data");
        ubah2_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubah2_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ubah2Layout = new javax.swing.GroupLayout(ubah2);
        ubah2.setLayout(ubah2Layout);
        ubah2Layout.setHorizontalGroup(
            ubah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubah2_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        ubah2Layout.setVerticalGroup(
            ubah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubah2_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        hapus2.setBackground(new java.awt.Color(204, 0, 0));

        hapus2_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        hapus2_value.setForeground(new java.awt.Color(255, 255, 255));
        hapus2_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hapus2_value.setText("Hapus Data");
        hapus2_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapus2_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapus2Layout = new javax.swing.GroupLayout(hapus2);
        hapus2.setLayout(hapus2Layout);
        hapus2Layout.setHorizontalGroup(
            hapus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hapus2_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        hapus2Layout.setVerticalGroup(
            hapus2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hapus2_value, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        segarkan2.setBackground(new java.awt.Color(127, 79, 36));

        segarkan2_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, segarkan2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(segarkan2_value, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                    .addGroup(kelolabukuLayout.createSequentialGroup()
                        .addComponent(tambah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(segarkan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kelolabukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ubah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segarkan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab.addTab("Kelola Buku", null, kelolabuku, "Kelola Buku");
        kelolabuku.getAccessibleContext().setAccessibleName("Kelola Buku");

        kelolamahasiswa.setBackground(new java.awt.Color(255, 255, 255));

        search_mhsiswa.setToolTipText("Cari Data");
        search_mhsiswa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                search_mhsiswaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                search_mhsiswaKeyTyped(evt);
            }
        });

        tb_mhsiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama Lengkap", "Tempat Lahir", "Tanggal Lahir", "Jurusan", "Tanggal Terdaftar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tb_mhsiswa);

        result_mhsiswa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        result_mhsiswa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        tambah3.setBackground(new java.awt.Color(127, 79, 36));

        tambah3_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        tambah3_value.setForeground(new java.awt.Color(255, 255, 255));
        tambah3_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambah3_value.setText("Tambah Data");
        tambah3_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambah3_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambah3Layout = new javax.swing.GroupLayout(tambah3);
        tambah3.setLayout(tambah3Layout);
        tambah3Layout.setHorizontalGroup(
            tambah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tambah3_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        tambah3Layout.setVerticalGroup(
            tambah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambah3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(tambah3_value, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
        );

        ubah3.setBackground(new java.awt.Color(127, 79, 36));

        ubah3_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        ubah3_value.setForeground(new java.awt.Color(255, 255, 255));
        ubah3_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ubah3_value.setText("Ubah Data");
        ubah3_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubah3_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ubah3Layout = new javax.swing.GroupLayout(ubah3);
        ubah3.setLayout(ubah3Layout);
        ubah3Layout.setHorizontalGroup(
            ubah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubah3_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        ubah3Layout.setVerticalGroup(
            ubah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubah3_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        hapus3.setBackground(new java.awt.Color(204, 0, 0));

        hapus3_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        hapus3_value.setForeground(new java.awt.Color(255, 255, 255));
        hapus3_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hapus3_value.setText("Hapus Data");
        hapus3_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapus3_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapus3Layout = new javax.swing.GroupLayout(hapus3);
        hapus3.setLayout(hapus3Layout);
        hapus3Layout.setHorizontalGroup(
            hapus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hapus3_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        hapus3Layout.setVerticalGroup(
            hapus3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hapus3_value, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        segarkan3.setBackground(new java.awt.Color(127, 79, 36));

        segarkan3_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        segarkan3_value.setForeground(new java.awt.Color(255, 255, 255));
        segarkan3_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        segarkan3_value.setText("Segarkan Tabel");
        segarkan3_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                segarkan3_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout segarkan3Layout = new javax.swing.GroupLayout(segarkan3);
        segarkan3.setLayout(segarkan3Layout);
        segarkan3Layout.setHorizontalGroup(
            segarkan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(segarkan3_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        segarkan3Layout.setVerticalGroup(
            segarkan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(segarkan3_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout kelolamahasiswaLayout = new javax.swing.GroupLayout(kelolamahasiswa);
        kelolamahasiswa.setLayout(kelolamahasiswaLayout);
        kelolamahasiswaLayout.setHorizontalGroup(
            kelolamahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kelolamahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kelolamahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kelolamahasiswaLayout.createSequentialGroup()
                        .addComponent(result_mhsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search_mhsiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
                    .addGroup(kelolamahasiswaLayout.createSequentialGroup()
                        .addComponent(tambah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(segarkan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        kelolamahasiswaLayout.setVerticalGroup(
            kelolamahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kelolamahasiswaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kelolamahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_mhsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(result_mhsiswa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kelolamahasiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ubah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segarkan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        tab.addTab("Kelola Mahasiswa", null, kelolamahasiswa, "Kelola Siswa");
        kelolamahasiswa.getAccessibleContext().setAccessibleName("Kelola Siswa");

        userinfo.setBackground(new java.awt.Color(255, 255, 255));
        userinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userinfoMouseClicked(evt);
            }
        });
        userinfo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                userinfoComponentShown(evt);
            }
        });

        javax.swing.GroupLayout userinfoLayout = new javax.swing.GroupLayout(userinfo);
        userinfo.setLayout(userinfoLayout);
        userinfoLayout.setHorizontalGroup(
            userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        userinfoLayout.setVerticalGroup(
            userinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );

        tab.addTab("Pengaturan Admin", null, userinfo, "Informasi Login");
        userinfo.getAccessibleContext().setAccessibleName("Informasi Login");

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

        tambah1.setBackground(new java.awt.Color(127, 79, 36));

        tambah1_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        tambah1_value.setForeground(new java.awt.Color(255, 255, 255));
        tambah1_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tambah1_value.setText("Tambah Data");
        tambah1_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambah1_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout tambah1Layout = new javax.swing.GroupLayout(tambah1);
        tambah1.setLayout(tambah1Layout);
        tambah1Layout.setHorizontalGroup(
            tambah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambah1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(tambah1_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );
        tambah1Layout.setVerticalGroup(
            tambah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambah1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tambah1_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        ubah1.setBackground(new java.awt.Color(127, 79, 36));

        ubah1_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        ubah1_value.setForeground(new java.awt.Color(255, 255, 255));
        ubah1_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ubah1_value.setText("Ubah Data");
        ubah1_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubah1_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ubah1Layout = new javax.swing.GroupLayout(ubah1);
        ubah1.setLayout(ubah1Layout);
        ubah1Layout.setHorizontalGroup(
            ubah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubah1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ubah1_value, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
        ubah1Layout.setVerticalGroup(
            ubah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ubah1_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        hapus1.setBackground(new java.awt.Color(204, 0, 0));

        hapus1_value.setFont(new java.awt.Font("Futura Md BT", 1, 12)); // NOI18N
        hapus1_value.setForeground(new java.awt.Color(255, 255, 255));
        hapus1_value.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hapus1_value.setText("Hapus Data");
        hapus1_value.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapus1_valueMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hapus1Layout = new javax.swing.GroupLayout(hapus1);
        hapus1.setLayout(hapus1Layout);
        hapus1Layout.setHorizontalGroup(
            hapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hapus1_value, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        hapus1Layout.setVerticalGroup(
            hapus1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hapus1_value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            .addComponent(segarkan1_value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jScrollPane1)
                    .addGroup(peminjamanLayout.createSequentialGroup()
                        .addComponent(tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hapus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
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
                .addGroup(peminjamanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tambah1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ubah1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hapus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(segarkan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tab.addTab("Peminjaman", null, peminjaman, "Peminjaman");
        peminjaman.getAccessibleContext().setAccessibleName("Peminjaman");

        footer.setBackground(new java.awt.Color(242, 84, 45));

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bodyLayout = new javax.swing.GroupLayout(body);
        body.setLayout(bodyLayout);
        bodyLayout.setHorizontalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab))
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bodyLayout.setVerticalGroup(
            bodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tab)
                .addGap(1, 1, 1)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tab.getAccessibleContext().setAccessibleName("");

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

    private void segarkan1_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segarkan1_valueMouseClicked
        // TODO add your handling code here:
        search_peminjaman.setText("");
        result_peminjaman.setText("");
        tampil_peminjaman();
    }//GEN-LAST:event_segarkan1_valueMouseClicked

    private void hapus1_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapus1_valueMouseClicked
        // TODO add your handling code here:
        int baris = tb_peminjaman.getSelectedRow();
        if (baris >= 0) {
            String nim = tbl1.getValueAt(baris, 0).toString();
            String kode = tbl1.getValueAt(baris, 3).toString();
            String pinjam = tbl1.getValueAt(baris, 5).toString();

            int x = JOptionPane.showConfirmDialog(null, "Data Peminjaman Buku dengan\n\nKode Buku: "+kode+"\nNIM Mahasiswa: "+nim+"\nTanggal Peminjaman: "+pinjam+"\n\nakan Anda hapus, yakin?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (x == JOptionPane.YES_OPTION) {
                try {
                    Connection con = new database.connection().configDB();
                    String sql = "DELETE FROM peminjaman WHERE nim = '"+nim+"' AND kode = '"+kode+"' AND pinjam = '"+pinjam+"'";
                    java.sql.Statement st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    tampil_peminjaman();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih data yang akan dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_hapus1_valueMouseClicked

    private void ubah1_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubah1_valueMouseClicked
        // TODO add your handling code here:
        int baris = tb_peminjaman.getSelectedRow();
        if (baris >= 0) {
            String nim = tbl1.getValueAt(baris, 0).toString();
            String kode = tbl1.getValueAt(baris, 3).toString();
            String pinjam = tbl1.getValueAt(baris, 5).toString();
            
            try {
                Connection con = new database.connection().configDB();
                String sql = "SELECT * FROM peminjaman WHERE nim = '"+nim+"' AND kode = '"+kode+"' AND pinjam = '"+pinjam+"'";
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql);
                
                if (rs.next()) {
                    String id = rs.getString("id");
                    new pages.edit_peminjaman(this, rootPaneCheckingEnabled, id).setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal menyeleksi data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih data yang akan diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ubah1_valueMouseClicked

    private void tambah1_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambah1_valueMouseClicked
        // TODO add your handling code here:
        new pages.add_peminjaman(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_tambah1_valueMouseClicked

    private void search_bukuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_bukuKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search_buku();
        }
    }//GEN-LAST:event_search_bukuKeyPressed

    private void search_bukuKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_bukuKeyTyped
        // TODO add your handling code here:
        search_buku();
    }//GEN-LAST:event_search_bukuKeyTyped

    private void tambah2_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambah2_valueMouseClicked
        // TODO add your handling code here:
        new pages.add_buku(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_tambah2_valueMouseClicked

    private void ubah2_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubah2_valueMouseClicked
        // TODO add your handling code here:
        int baris = tb_buku.getSelectedRow();
        if (baris >= 0) {
            String kode = tbl2.getValueAt(baris, 0).toString();
            try {
                Connection con = new database.connection().configDB();
                String sql = "SELECT * FROM buku WHERE kode = '"+kode+"'";
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql);
                
                if (rs.next()) {
                    String id = rs.getString("id");
                    new pages.edit_buku(this, rootPaneCheckingEnabled, id).setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal menyeleksi data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih data yang akan diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ubah2_valueMouseClicked

    private void hapus2_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapus2_valueMouseClicked
        // TODO add your handling code here:
        int baris = tb_buku.getSelectedRow();
        if (baris >= 0) {
            String kode = tbl2.getValueAt(baris, 0).toString();
            String judul = tbl2.getValueAt(baris, 1).toString();

            int x = JOptionPane.showConfirmDialog(null, "Data Buku dengan\n\nJudul: "+judul+"\nKode Buku: "+kode+"\n\nakan Anda hapus, yakin?\nData peminjaman dengan BUKU ini juga akan ikut terhapus!", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (x == JOptionPane.YES_OPTION) {
                try {
                    Connection con = new database.connection().configDB();
                    String sql = "DELETE FROM buku WHERE kode = '"+kode+"'";
                    String sql2 = "DELETE FROM peminjaman WHERE kode = '"+kode+"' AND judul = '"+judul+"'";
                    java.sql.Statement st = con.createStatement();
                    st.executeUpdate(sql);
                    st.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    tampil_buku();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih data yang akan dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_hapus2_valueMouseClicked

    private void segarkan2_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segarkan2_valueMouseClicked
        // TODO add your handling code here:
        search_buku.setText("");
        result_buku.setText("");
        tampil_buku();
    }//GEN-LAST:event_segarkan2_valueMouseClicked

    private void search_mhsiswaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_mhsiswaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            search_mhsiswa();
        }
    }//GEN-LAST:event_search_mhsiswaKeyPressed

    private void search_mhsiswaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_mhsiswaKeyTyped
        // TODO add your handling code here:
        search_mhsiswa();
    }//GEN-LAST:event_search_mhsiswaKeyTyped

    private void tambah3_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambah3_valueMouseClicked
        // TODO add your handling code here:
        new pages.add_mahasiswa(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_tambah3_valueMouseClicked

    private void ubah3_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubah3_valueMouseClicked
        // TODO add your handling code here:
        int baris = tb_mhsiswa.getSelectedRow();
        if (baris >= 0) {
            String nim = tbl3.getValueAt(baris, 0).toString();
            try {
                Connection con = new database.connection().configDB();
                String sql = "SELECT * FROM mahasiswa WHERE nim = '"+nim+"'";
                java.sql.Statement st = con.createStatement();
                java.sql.ResultSet rs = st.executeQuery(sql);
                
                if (rs.next()) {
                    String id = rs.getString("id");
                    new pages.edit_mahasiswa(this, rootPaneCheckingEnabled, id).setVisible(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gagal menyeleksi data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih data yang akan diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ubah3_valueMouseClicked

    private void hapus3_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapus3_valueMouseClicked
        // TODO add your handling code here:
        int baris = tb_mhsiswa.getSelectedRow();
        if (baris >= 0) {
            String nim = tbl3.getValueAt(baris, 0).toString();
            String nama = tbl3.getValueAt(baris, 1).toString();

            int x = JOptionPane.showConfirmDialog(null, "Data Mahasiswa dengan\n\nNIM: "+nim+"\nNama Lengkap: "+nama+"\n\nakan Anda hapus, yakin?\nData peminjaman dengan SISWA ini juga akan ikut terhapus!", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (x == JOptionPane.YES_OPTION) {
                try {
                    Connection con = new database.connection().configDB();
                    String sql = "DELETE FROM mahasiswa WHERE nim = '"+nim+"'";
                    String sql2 = "DELETE FROM peminjaman WHERE nim = '"+nim+"'";
                    java.sql.Statement st = con.createStatement();
                    st.executeUpdate(sql);
                    st.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    tampil_mhsiswa();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus data!", "Kesalahan", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Anda belum memilih data yang akan dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_hapus3_valueMouseClicked

    private void segarkan3_valueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_segarkan3_valueMouseClicked
        // TODO add your handling code here:
        search_mhsiswa.setText("");
        result_mhsiswa.setText("");
        tampil_mhsiswa();
    }//GEN-LAST:event_segarkan3_valueMouseClicked

    private void userinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userinfoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userinfoMouseClicked

    private void userinfoComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_userinfoComponentShown
        // TODO add your handling code here:
        this.dispose();
        new user(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_userinfoComponentShown

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
    
    private void tampil_mhsiswa() {
        Object []baris = {"NIM", "Nama Lengkap", "Tempat Lahir", "Tanggal Lahir", "Jurusan", "Tanggal Masuk"};
        tbl3 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tb_mhsiswa.setModel(tbl3);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM mahasiswa ORDER BY id ASC";
            java.sql.Statement stat = con.createStatement();
            java.sql.ResultSet hasil = stat.executeQuery(sql);
            
            while (hasil.next()) {
                String nim = hasil.getString("nim");
                String nama = hasil.getString("nama");
                String tempat_lahir = hasil.getString("tempat_lahir");
                String tanggal_lahir = hasil.getString("tanggal_lahir");
                String jurusan = hasil.getString("jurusan");
                String tanggal = hasil.getString("tanggal");
                
                String[] data = {nim, nama, tempat_lahir, tanggal_lahir, jurusan, tanggal};
                tbl3.addRow(data);
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
    
    private void search_mhsiswa() {
        String query = search_mhsiswa.getText();
        
        Object []baris = {"NIM", "Nama Lengkap", "Tempat Lahir", "Tanggal Lahir", "Jurusan", "Tanggal Masuk"};
        tbl3 = new DefaultTableModel(null, baris) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tb_mhsiswa.setModel(tbl3);
        
        try {
            Connection con = new database.connection().configDB();
            String sql = "SELECT * FROM mahasiswa WHERE BINARY "
                    + "nim LIKE '%"+query+"%' "
                    + "OR nama LIKE '%"+query+"%' "
                    + "OR tempat_lahir LIKE '%"+query+"%' "
                    + "OR tanggal_lahir LIKE '%"+query+"%' "
                    + "OR jurusan LIKE '%"+query+"%' "
                    + "OR tanggal LIKE '%"+query+"%' "
                    + "ORDER BY id ASC";
            java.sql.Statement stmt = con.createStatement();
            java.sql.ResultSet hasil = stmt.executeQuery(sql);
            
            while (hasil.next()) {
                String nim = hasil.getString("nim");
                String nama = hasil.getString("nama");
                String tempat_lahir = hasil.getString("tempat_lahir");
                String tanggal_lahir = hasil.getString("tanggal_lahir");
                String jurusan = hasil.getString("jurusan");
                String tanggal = hasil.getString("tanggal");
                
                String[] data = {nim, nama, tempat_lahir, tanggal_lahir, jurusan, tanggal};
                tbl3.addRow(data);
            }
            
            if (!query.equals("")) {
                result_mhsiswa.setText("Hasil pencarian dari: '"+query+"'");
            } else {
                result_mhsiswa.setText("");
            }
        } catch (Exception e) {}
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JLabel close_btn;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel hapus1;
    private javax.swing.JLabel hapus1_value;
    private javax.swing.JPanel hapus2;
    private javax.swing.JLabel hapus2_value;
    private javax.swing.JPanel hapus3;
    private javax.swing.JLabel hapus3_value;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel kelolabuku;
    private javax.swing.JPanel kelolamahasiswa;
    private javax.swing.JPanel peminjaman;
    private javax.swing.JLabel result_buku;
    private javax.swing.JLabel result_mhsiswa;
    private javax.swing.JLabel result_peminjaman;
    private javax.swing.JTextField search_buku;
    private javax.swing.JTextField search_mhsiswa;
    private javax.swing.JTextField search_peminjaman;
    private javax.swing.JPanel segarkan1;
    private javax.swing.JLabel segarkan1_value;
    private javax.swing.JPanel segarkan2;
    private javax.swing.JLabel segarkan2_value;
    private javax.swing.JPanel segarkan3;
    private javax.swing.JLabel segarkan3_value;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JPanel tambah1;
    private javax.swing.JLabel tambah1_value;
    private javax.swing.JPanel tambah2;
    private javax.swing.JLabel tambah2_value;
    private javax.swing.JPanel tambah3;
    private javax.swing.JLabel tambah3_value;
    private javax.swing.JTable tb_buku;
    private javax.swing.JTable tb_mhsiswa;
    private javax.swing.JTable tb_peminjaman;
    private javax.swing.JLabel timenow;
    private javax.swing.JLabel title;
    private javax.swing.JPanel ubah1;
    private javax.swing.JLabel ubah1_value;
    private javax.swing.JPanel ubah2;
    private javax.swing.JLabel ubah2_value;
    private javax.swing.JPanel ubah3;
    private javax.swing.JLabel ubah3_value;
    private javax.swing.JPanel userinfo;
    // End of variables declaration//GEN-END:variables
}
