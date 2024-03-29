/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SuperAdminLoggedIn;

import Frame_Utama.*;
import Panel.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Parameter;
import model.ResultSetTableModel;
import model.koneksi;
import modulSwing.ClRoundedTextField;

/**
 *
 * @author Nayraa-Rahman
 */
public class PanelRekam extends javax.swing.JPanel {

    private DefaultTableModel model;
    ResultSet rs;
    koneksi koneksi;

    /**
     * Creates new form PanelRekam
     */
    public PanelRekam() {
        koneksi = new koneksi(new Parameter().HOST_DB, new Parameter().USERNAME_DB, 
                  new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        
        cb_pasien();
        cb_dokter();
        cb_perawat();
        cb_ruang();
        //setPasien();
        table();
        //jTabbedPane1.setEnabledAt(1, false);
    }
    
    public void table() {
        String namaKolom[] = {"no_rekam", "id_pasien", "id_dokter", "id_perawat", "id_ruang", "penyakit", 
                            "resep","tanggal_masuk","tanggal_keluar"};
        rs = koneksi.querySelect(namaKolom, "tb_rekam");
        tabelRekam.setModel(new ResultSetTableModel(rs));
    }
    
    void refresh() {
        no_rekam.setText("");
        penyakit.setText("");
        resep.setText("");

        table();
    }
    
    void cb_pasien() {
        try {
            // Menghapus semua item yang terdapat pada combo box agar tidak terjadi tumpukan data yang sama
            cb_pasien.removeAllItems();
            String namaKolom[] = {"id_pasien","nama_pasien",};
            rs = koneksi.querySelect(namaKolom, "tb_pasien"); 
            
            while (rs.next()) {
            String isi= rs.getString("id_pasien")+ " | " +rs.getString("nama_pasien");
            
            // Data dari database disimpan didalam object
            Object object = isi;
            // Menambahkan data pada combo box
            cb_pasien.addItem(object);
            }
        } 
        catch (Exception e) {
        }
    }
    
    void cb_dokter() {
        try {
            // Menghapus semua item yang terdapat pada combo box agar tidak terjadi tumpukan data yang sama
            cb_dokter.removeAllItems();
            String namaKolom[] = {"id_dokter","nama_dokter","spesialisasi"};
            rs = koneksi.querySelect(namaKolom, "tb_dokter");
            
            while (rs.next()) {
            String isi= rs.getString("id_dokter")+ " | " +rs.getString("nama_dokter") + " | " +rs.getString("spesialisasi");
            
            // Data dari database disimpan didalam object
            Object object = isi;

            // Menambahkan data pada combo box
            cb_dokter.addItem(object);
            }
        } 
        catch (Exception e) {
        }
    }
    
    void cb_perawat() {
        try {
            // Menghapus semua item yang terdapat pada combo box agar tidak terjadi tumpukan data yang sama
            cb_perawat.removeAllItems();
            String namaKolom[] = {"id_perawat","nama_perawat"};
            rs = koneksi.querySelect(namaKolom, "tb_perawat");
            
            while (rs.next()) {
            String isi= rs.getString("id_perawat")+ " | " +rs.getString("nama_perawat");
        
            // Data dari database disimpan didalam object
            Object object = isi;

            // Menambahkan data pada combo box
            cb_perawat.addItem(object);
            }
        } 
        catch (Exception e) {
        }
    }
    
    void cb_ruang() {
        try {
            // Menghapus semua item yang terdapat pada combo box agar tidak terjadi tumpukan data yang sama
            cb_ruang.removeAllItems();
            String namaKolom[] = {"id_ruang","nama_ruang"};
            rs = koneksi.querySelect(namaKolom, "tb_ruang");
            
            while (rs.next()) {
            String isi= rs.getString("id_ruang")+ " | " +rs.getString("nama_ruang");
        
            // Data dari database disimpan didalam object
            Object object = isi;

            // Menambahkan data pada combo box
            cb_ruang.addItem(object);
            }
        } 
        catch (Exception e) {
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

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRekam = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cmbkat = new javax.swing.JComboBox();
        txtcari = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cb_perawat = new javax.swing.JComboBox();
        cb_ruang = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_dokter = new javax.swing.JComboBox();
        cb_pasien = new javax.swing.JComboBox();
        no_rekam = new javax.swing.JTextField();
        penyakit = new javax.swing.JTextField();
        resep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tgl_msk = new com.toedter.calendar.JDateChooser();
        tgl_klr = new com.toedter.calendar.JDateChooser();

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Master Data Rekam Medis");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tabelRekam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelRekam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelRekamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelRekam);

        jLabel11.setText("Pilih Kategori :");

        cmbkat.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ID Rekam Medis", "ID Pasien", "ID Dokter", "ID Perawat", "ID Ruang", "Penyakit", " " }));

        txtcari.setText("masukkan keyword pencarian . . .");
        txtcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcariMouseClicked(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcariKeyTyped(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/View.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/186.png"))); // NOI18N
        jButton6.setText("Refresh Tabel");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtcari)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbkat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("List Data Rekam Medis", jPanel3);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/112.png"))); // NOI18N
        jButton1.setText("Reset");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/110.png"))); // NOI18N
        jButton2.setText("Input");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Id Ruang");

        jLabel9.setText("Id Perawat");

        jLabel7.setText("Tanggal Keluar");

        jLabel6.setText("Tanggal Masuk");

        jLabel4.setText("Penyakit");

        jLabel5.setText("Resep Obat");

        jLabel1.setText("Id Dokter");

        jLabel3.setText("Id Pasien");

        jLabel10.setText("No_Rekam");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/172.png"))); // NOI18N
        jButton3.setText("Edit");
        jButton3.setBorder(new ClRoundedTextField());
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/36.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.setBorder(new ClRoundedTextField());
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tgl_klr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                        .addComponent(tgl_msk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addComponent(jLabel10))
                    .addGap(32, 32, 32)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(penyakit)
                                .addComponent(no_rekam)
                                .addComponent(cb_dokter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cb_ruang, 0, 253, Short.MAX_VALUE)
                                        .addComponent(cb_perawat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(resep, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addContainerGap()))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(tgl_msk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tgl_klr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(161, 161, 161))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_ruang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel10)
                        .addComponent(no_rekam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(cb_perawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(cb_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel1)
                        .addComponent(cb_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(penyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(19, 19, 19)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(resep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(259, Short.MAX_VALUE)))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton4});

        jTabbedPane1.addTab("Form Data Rekam Medis", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (no_rekam.getText().equals("") || penyakit.getText().equals("") || resep.getText().equals("") ||
            tgl_msk.getDate().equals("") || tgl_klr.getDate().equals("")) {
            JOptionPane.showMessageDialog(this, "Lengkapi Data!");
        } 
        else {
            String[] kolom = {"no_rekam", "id_pasien", "id_dokter", "id_perawat", "id_ruang", "penyakit", 
                            "resep","tanggal_masuk","tanggal_keluar"};
            
            String tanggal = new SimpleDateFormat("yyyy-MM-dd").format(tgl_msk.getDate());
            String tanggal2 = new SimpleDateFormat("yyyy-MM-dd").format(tgl_klr.getDate());
            
            String a=(cb_pasien.getSelectedItem().toString()).substring(0, 5);
            String b=(cb_dokter.getSelectedItem().toString()).substring(0, 5);
            String c=(cb_perawat.getSelectedItem().toString()).substring(0, 6);
            String d=(cb_ruang.getSelectedItem().toString()).substring(0, 4);
            
            String[] isi = {no_rekam.getText(),
                            a,
                            b,
                            c,
                            d,
                            penyakit.getText(),
                            resep.getText(),
                            tanggal,
                            tanggal2};
            
            System.out.println(koneksi.queryInsert("tb_rekam", kolom, isi));
            table();
            refresh();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (no_rekam.getText().equals("") || penyakit.getText().equals("") || resep.getText().equals("") ||
            tgl_msk.getDate().equals("") || tgl_klr.getDate().equals("")) {
            JOptionPane.showMessageDialog(this, "Lengkapi Data!");
        }
        else {
            String[] kolom = {"no_rekam", "id_pasien", "id_dokter", "id_perawat", "id_ruang", "penyakit",
                "resep","tanggal_masuk","tanggal_keluar"};

            String tanggal = new SimpleDateFormat("yyyy-MM-dd").format(tgl_msk.getDate());
            String tanggal2 = new SimpleDateFormat("yyyy-MM-dd").format(tgl_klr.getDate());
            
            String a=(cb_pasien.getSelectedItem().toString()).substring(0, 5);
            String b=(cb_dokter.getSelectedItem().toString()).substring(0, 5);
            String c=(cb_perawat.getSelectedItem().toString()).substring(0, 6);
            String d=(cb_ruang.getSelectedItem().toString()).substring(0, 4);

            String[] isi = {no_rekam.getText(),
                a,
                b,
                c,
                d,
                penyakit.getText(),
                resep.getText(),
                tanggal,
                tanggal2};

            String id = String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 0));
            System.out.println(koneksi.queryUpdate("tb_rekam", kolom, isi, "no_rekam='" + id + "'"));
            table();
            refresh();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String id = String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 0));
        if (JOptionPane.showConfirmDialog(this, "Ingin Menghapus Data Ini?", "Warning!!!",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
        koneksi.queryDelete("tb_rekam", "no_rekam='" + id + "'" );
        }
        else {
            return;
        }
        table();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseClicked
        // TODO add your handling code here:
        txtcari.setText("");
    }//GEN-LAST:event_txtcariMouseClicked

    private void txtcariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariKeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (txtcari.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please input your keyword");
        }
        else {
            if (cmbkat.getSelectedItem().equals("ID Rekam Medis")) {
                rs = koneksi.querySelectAll("tb_rekam", "id_rekam LIKE '" + txtcari.getText() + "' ");
                tabelRekam.setModel(new ResultSetTableModel(rs));
            }
            else if (cmbkat.getSelectedItem().equals("ID Pasien")) {
                rs = koneksi.querySelectAll("tb_rekam", "id_pasien LIKE '" + txtcari.getText() + "' ");
                tabelRekam.setModel(new ResultSetTableModel(rs));
            }
            else if (cmbkat.getSelectedItem().equals("ID Dokter")) {
                rs = koneksi.querySelectAll("tb_rekam", "id_dokter LIKE '" + txtcari.getText() + "' ");
                tabelRekam.setModel(new ResultSetTableModel(rs));
            }
            else if (cmbkat.getSelectedItem().equals("ID Perawat")) {
                rs = koneksi.querySelectAll("tb_rekam", "id_perawat LIKE '" + txtcari.getText() + "' ");
                tabelRekam.setModel(new ResultSetTableModel(rs));
            }
            else if (cmbkat.getSelectedItem().equals("ID Ruang")) {
                rs = koneksi.querySelectAll("tb_rekam", "id_ruang LIKE '" + txtcari.getText() + "' ");
                tabelRekam.setModel(new ResultSetTableModel(rs));
            }
            else if (cmbkat.getSelectedItem().equals("Penyakit")) {
                rs = koneksi.querySelectAll("tb_rekam", "penyakit LIKE '%" + txtcari.getText() + "%' ");
                tabelRekam.setModel(new ResultSetTableModel(rs));
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        refresh();
        table();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tabelRekamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRekamMouseClicked
        // TODO add your handling code here:
        no_rekam.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 0)));
        penyakit.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 5)));
        resep.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 6)));
        /*tgl_msk.setDate(Date.valueOf((String) tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 7)));
        tgl_klr.setDate(Date.valueOf((String) tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 8)));*/
    }//GEN-LAST:event_tabelRekamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_dokter;
    private javax.swing.JComboBox cb_pasien;
    private javax.swing.JComboBox cb_perawat;
    private javax.swing.JComboBox cb_ruang;
    private javax.swing.JComboBox cmbkat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField no_rekam;
    private javax.swing.JTextField penyakit;
    private javax.swing.JTextField resep;
    private javax.swing.JTable tabelRekam;
    private com.toedter.calendar.JDateChooser tgl_klr;
    private com.toedter.calendar.JDateChooser tgl_msk;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
