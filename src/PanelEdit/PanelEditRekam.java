/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PanelEdit;

import java.sql.ResultSet;
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
public class PanelEditRekam extends javax.swing.JPanel {

    private DefaultTableModel model;
    ResultSet rs;
    koneksi koneksi;
    /**
     * Creates new form PanelEditRekam
     */
    public PanelEditRekam() {
        koneksi = new koneksi(new Parameter().HOST_DB, new Parameter().USERNAME_DB, 
                  new Parameter().PASSWORD_DB, new Parameter().IPHOST, new Parameter().PORT);
        initComponents();
        cb_pasien();
        cb_dokter();
        cb_perawat();
        cb_ruang();
        table();
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
        tgl_msk.setText("");
        tgl_klr.setText("");
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelRekam = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_pasien = new javax.swing.JComboBox();
        cb_dokter = new javax.swing.JComboBox();
        penyakit = new javax.swing.JTextField();
        resep = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cb_ruang = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cb_perawat = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        no_rekam = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tgl_msk = new javax.swing.JFormattedTextField();
        tgl_klr = new javax.swing.JFormattedTextField();

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Edit Data Rekam Medis");
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
        jScrollPane2.setViewportView(tabelRekam);

        jLabel1.setText("Id Dokter");

        jLabel3.setText("Id Pasien");

        jLabel4.setText("Penyakit");

        jLabel5.setText("Resep Obat");

        jLabel6.setText("Tanggal Masuk");

        jLabel7.setText("Tanggal Keluar");

        jLabel8.setText("Id Ruang");

        jLabel9.setText("Id Perawat");

        jLabel10.setText("No_Rekam");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/36.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.setBorder(new ClRoundedTextField());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/172.png"))); // NOI18N
        jButton2.setText("Edit");
        jButton2.setBorder(new ClRoundedTextField());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tgl_msk.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        tgl_klr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4))
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(penyakit, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                            .addComponent(no_rekam)
                            .addComponent(cb_dokter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cb_pasien, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tgl_msk)
                                    .addComponent(tgl_klr)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_perawat, 0, 253, Short.MAX_VALUE)
                                    .addComponent(cb_ruang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(resep, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addComponent(jScrollPane2)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ruang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(no_rekam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_perawat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cb_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(cb_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgl_msk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(penyakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tgl_klr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(resep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
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
            tgl_msk.getText().equals("") || tgl_klr.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Lengkapi Data!");
        }
        else {
            String[] kolom = {"no_rekam", "id_pasien", "id_dokter", "id_perawat", "id_ruang", "penyakit",
                "resep","tanggal_masuk","tanggal_keluar"};

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
                tgl_msk.getText(),
                tgl_klr.getText()};
            
            String id = String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 0));
            System.out.println(koneksi.queryUpdate("tb_rekam", kolom, isi, "no_rekam='" + id + "'"));
            table();
            refresh();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelRekamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelRekamMouseClicked
        // TODO add your handling code here:
        no_rekam.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 0)));
        penyakit.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 5)));
        resep.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 6)));
        tgl_msk.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 7)));
        tgl_klr.setText(String.valueOf(tabelRekam.getValueAt(tabelRekam.getSelectedRow(), 8)));
        
    }//GEN-LAST:event_tabelRekamMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb_dokter;
    private javax.swing.JComboBox cb_pasien;
    private javax.swing.JComboBox cb_perawat;
    private javax.swing.JComboBox cb_ruang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField no_rekam;
    private javax.swing.JTextField penyakit;
    private javax.swing.JTextField resep;
    private javax.swing.JTable tabelRekam;
    private javax.swing.JFormattedTextField tgl_klr;
    private javax.swing.JFormattedTextField tgl_msk;
    // End of variables declaration//GEN-END:variables
}
