/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.pojekakhirbismillah;
<<<<<<< HEAD
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;


=======

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

>>>>>>> origin/arkh
/**
 *
 * @author faruq
 */
public class mainView extends javax.swing.JFrame {
<<<<<<< HEAD

private void cariManagement() {
    String cariID = idRuanganManagementRuangan.getText().trim();
    DefaultTableModel model = (DefaultTableModel) tableManagementRuangan.getModel();
    
    for (int i = 0; i < model.getRowCount(); i++) {
        if (model.getValueAt(i, 0).toString().equalsIgnoreCase(cariID)) {
            tableManagementRuangan.setRowSelectionInterval(i, i);
            return;
        }
    }

    JOptionPane.showMessageDialog(this, "ID Rekam Medis tidak ditemukan.");
}

private void cariRekam() {
    String cariID = IDRekamMedisTextFieldRekamMedis.getText().trim();
    DefaultTableModel model = (DefaultTableModel) tableRekamMedis.getModel();
    
    for (int i = 0; i < model.getRowCount(); i++) {
        if (model.getValueAt(i, 0).toString().equalsIgnoreCase(cariID)) {
            tableRekamMedis.setRowSelectionInterval(i, i);
            return;
        }
    }

    JOptionPane.showMessageDialog(this, "ID Rekam Medis tidak ditemukan.");
}
private void tambahRuangan() {
    String id = idRuanganManagementRuangan.getText().trim();
    String tipe = jComboBoxTipeRuanganManagementRUangan.getSelectedItem().toString();
    String harga = tfHargaRuanganManagementRuangan.getText().trim();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID Ruangan tidak boleh kosong!");
        return;
    }

    DefaultTableModel model = (DefaultTableModel) tableManagementRuangan.getModel();
    model.addRow(new Object[]{id, tipe, harga});
}
    private void TambahRekam() {
        String id = IDRekamMedisTextFieldRekamMedis.getText().trim();
        String nama = tanggalTextFieldRekamMedis.getText().trim();
        String diagnosa = TextFieldDiagnosaRekamMedis.getText().trim();
        
        DefaultTableModel model = (DefaultTableModel) tableRekamMedis.getModel();
        model.addRow(new Object[]{id, nama, diagnosa});
    }
    public mainView() {
        initComponents();
        btnCariRekamMedis.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        String cariID = IDRekamMedisTextFieldRekamMedis.getText().trim();
        DefaultTableModel model = (DefaultTableModel) tableRekamMedis.getModel();

        boolean ditemukan = false;

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString().equalsIgnoreCase(cariID)) {
                tableRekamMedis.setRowSelectionInterval(i, i); // pilih baris
                tableRekamMedis.scrollRectToVisible(tableRekamMedis.getCellRect(i +5 , 4, true)); // scroll ke sana
=======
    private void tambahObatKeTabel() {
    String id = txtField_ID_OBAT.getText().trim();
    String nama = jComboBox_Nama_Obat.getSelectedItem().toString();
    boolean tidakTersedia = jCheckBox_Tersedia_Obat.isSelected();
    int jumlah = (int) jSpinner_BanyakObat.getValue();
    String harga = jTextField_Harga_Obat.getText().trim();

    String status = tidakTersedia ? "Tidak Tersedia" : "Tersedia";

    // Validasi sederhana
    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID Obat tidak boleh kosong!");
        return;
    }

    DefaultTableModel model_obat = (DefaultTableModel) jTable_Obat.getModel();
    model_obat.addRow(new Object[]{id, nama, status, jumlah, harga});
    }
    
    private void tambahRekeningKeTabel() {
    String id = txtField_IdTransaksi.getText().trim();
    String tanggal = txtField_TanggalTransaksi.getText().trim();
    String total = txtField_TotalTransaksi.getText().trim();

    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID Rekening tidak boleh kosong!");
        return;
    }

    DefaultTableModel model_obat = (DefaultTableModel) jTable_Transaksi.getModel();
    model_obat.addRow(new Object[]{id, tanggal,total });
    }

    private void cariTransaksiByID() {
    String cariID = txtField_IdTransaksi.getText().trim();
    DefaultTableModel model_caritransaksi = (DefaultTableModel) jTable_Transaksi.getModel();
    
    for (int i = 0; i < model_caritransaksi.getRowCount(); i++) {
        if (model_caritransaksi.getValueAt(i, 0).toString().equalsIgnoreCase(cariID)) {
            jTable_Transaksi.setRowSelectionInterval(i, i);
            return;
        }
    }

    JOptionPane.showMessageDialog(this, "ID Obat tidak ditemukan.");
}
    
    private void cariObatByID() {
    String cariID = txtField_ID_OBAT.getText().trim();
    DefaultTableModel model_cariobat = (DefaultTableModel) jTable_Obat.getModel();
    
    for (int i = 0; i < model_cariobat.getRowCount(); i++) {
        if (model_cariobat.getValueAt(i, 0).toString().equalsIgnoreCase(cariID)) {
            jTable_Obat.setRowSelectionInterval(i, i);
            return;
        }
    }

    JOptionPane.showMessageDialog(this, "ID Obat tidak ditemukan.");
}

private Map<String, Integer> hargaObat;
    /**
     * Creates new form mainView
     */
     private void updateHarga() {
    if (jCheckBox_Tersedia_Obat.isSelected()) {
        jTextField_Harga_Obat.setText("0");
        return;
    }

    String namaObat = (String) jComboBox_Nama_Obat.getSelectedItem();
    int hargaSatuan = hargaObat.getOrDefault(namaObat, 0);
    int jumlah = (int) jSpinner_BanyakObat.getValue();
    int total = hargaSatuan * jumlah;

    jTextField_Harga_Obat.setText(String.valueOf(total));
}
    private void toggleKetersediaan() {
    boolean tidakTersedia = jCheckBox_Tersedia_Obat.isSelected();

    jSpinner_BanyakObat.setEnabled(!tidakTersedia);
    jTextField_Harga_Obat.setEnabled(!tidakTersedia);

    if (tidakTersedia) {
        jTextField_Harga_Obat.setText("0");
        jSpinner_BanyakObat.setValue(0);
    } else {
        updateHarga();
    }
}



    public mainView() {
                initComponents();
                
        jButton_Cari_Obat.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        String cariID = txtField_ID_OBAT.getText().trim();
        DefaultTableModel modelbutton_cariobat = (DefaultTableModel) jTable_Obat.getModel();

        boolean ditemukan = false;

        for (int i = 0; i < modelbutton_cariobat.getRowCount(); i++) {
            if (modelbutton_cariobat.getValueAt(i, 0).toString().equalsIgnoreCase(cariID)) {
                jTable_Obat.setRowSelectionInterval(i, i); // pilih baris
                jTable_Obat.scrollRectToVisible(jTable_Obat.getCellRect(i + 7, 0, true)); // scroll ke sana
>>>>>>> origin/arkh
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
<<<<<<< HEAD
            JOptionPane.showMessageDialog(null, "ID Ruangan tidak ditemukan.");
        }
        }
});
        DefaultTableModel model_tabel = new DefaultTableModel(
    new Object[]{"ID Rekam Medis", "Tanggal", "Diagnosa"}, 0);
    tableRekamMedis.setModel(model_tabel);
    }
    
=======
            JOptionPane.showMessageDialog(null, "ID Obat tidak ditemukan.");
        }
    }
});
        jButton_Cari_Transaksi.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent evt) {
        String cariID = txtField_IdTransaksi.getText().trim();
        DefaultTableModel modelbutton_caritransaksi = (DefaultTableModel) jTable_Transaksi.getModel();

        boolean ditemukan = false;

        for (int i = 0; i < modelbutton_caritransaksi.getRowCount(); i++) {
            if (modelbutton_caritransaksi.getValueAt(i, 0).toString().equalsIgnoreCase(cariID)) {
                jTable_Transaksi.setRowSelectionInterval(i, i); // pilih baris
                jTable_Transaksi.scrollRectToVisible(jTable_Transaksi.getCellRect(i + 7, 0, true)); // scroll ke sana
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            JOptionPane.showMessageDialog(null, "ID Obat tidak ditemukan.");
        }
    }
});

    hargaObat = new HashMap<>();

    hargaObat.put("Paracetamol", 5000);
    hargaObat.put("OBH (Obat Batuk Hitam)", 12000);
    hargaObat.put("Antasida", 7000);
    hargaObat.put("Amoxicillin", 15000);
    hargaObat.put("Loperamide", 6000);
    hargaObat.put("CTM (Chlorpheniramine)", 4000);
    hargaObat.put("Loratadine", 10000);
    hargaObat.put("Betadine", 13000);
    hargaObat.put("Metformin", 9000);
    hargaObat.put("Vitamin C / Suplemen", 11000);

    for (String nama : hargaObat.keySet()) {
    jComboBox_Nama_Obat.addItem(nama);
}
    jComboBox_Nama_Obat.addActionListener(e -> updateHarga());
    jSpinner_BanyakObat.addChangeListener(e -> updateHarga());
    jCheckBox_Tersedia_Obat.addActionListener(e -> toggleKetersediaan());
    
    jSpinner_BanyakObat.setModel(new SpinnerNumberModel(0, 0, 100, 1));
    
    DefaultTableModel model_tabel = new DefaultTableModel(
    new Object[]{"ID Obat", "Nama Obat", "Ketersediaan Obat", "Banyak Obat", "Harga Obat"}, 0);
    jTable_Obat.setModel(model_tabel);

    }
>>>>>>> origin/arkh

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bodyPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menuRuangan = new javax.swing.JButton();
        menuDashboard = new javax.swing.JButton();
        menuDataPasien = new javax.swing.JButton();
        menuDataPegawai = new javax.swing.JButton();
        menuRekamMedis = new javax.swing.JButton();
        menuInventarisObat = new javax.swing.JButton();
        menuTransaksi = new javax.swing.JButton();
<<<<<<< HEAD
=======
        jLabel3 = new javax.swing.JLabel();
>>>>>>> origin/arkh
        mainPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pasienPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFieldIDPasien1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtFieldNamaPasien = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        txtFieldNoTelp = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtFieldUmur = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtFieldAlamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtFieldTgglMasuk = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtFieldTgglKeluar = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKembali = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pegawaiPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtFieldIDPasien2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtFieldNamaPasien1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        btnHapus1 = new javax.swing.JButton();
        btnKembali1 = new javax.swing.JButton();
        rekamMedisPanel = new javax.swing.JPanel();
<<<<<<< HEAD
        NamelLabel7RekamMedis = new javax.swing.JLabel();
        NamelPanel9RekamMedis = new javax.swing.JPanel();
        Namelanel10 = new javax.swing.JPanel();
        idRekamMedisRekamMeidis = new javax.swing.JLabel();
        tanggalRekamMedis = new javax.swing.JLabel();
        diagnosaRekamMedis = new javax.swing.JLabel();
        tanggalTextFieldRekamMedis = new javax.swing.JTextField();
        TextFieldDiagnosaRekamMedis = new javax.swing.JTextField();
        IDRekamMedisTextFieldRekamMedis = new javax.swing.JTextField();
        btnCariRekamMedis = new javax.swing.JButton();
        btnTAMBAHRekamMedis = new javax.swing.JButton();
        btnHAPUSRekamMedis = new javax.swing.JButton();
        btNKEMBALIRekamMedis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRekamMedis = new javax.swing.JTable();
        obatPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        transaksiPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ruanganPanel = new javax.swing.JPanel();
        namelLabel10ManagementRuangan = new javax.swing.JLabel();
        ManagementRuangan = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        NamelPanel9ManagementRuangan = new javax.swing.JPanel();
        Namelpanel11ManajementRuangan = new javax.swing.JPanel();
        idRuanganjlabelManagementRuangan = new javax.swing.JLabel();
        tipeRuanganManajementRuangan = new javax.swing.JLabel();
        hargaRuanganManagementRuangan = new javax.swing.JLabel();
        tfHargaRuanganManagementRuangan = new javax.swing.JTextField();
        idRuanganManagementRuangan = new javax.swing.JTextField();
        btnCariManagementRuangan = new javax.swing.JButton();
        btnTAMBAHManagementRuangan = new javax.swing.JButton();
        btnHAPUSManagementRuangan = new javax.swing.JButton();
        btNKEMBALIManagementRUangan = new javax.swing.JButton();
        jComboBoxTipeRuanganManagementRUangan = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableManagementRuangan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        dashboardPanel1 = new javax.swing.JPanel();
        jLabelDashboard = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
=======
        jLabel7 = new javax.swing.JLabel();
        obatPanel = new javax.swing.JPanel();
        javax.swing.JLabel ArkhanJpanel8 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel_IJOIJO_OBAT = new javax.swing.JPanel();
        jPanel_belakangan_obat = new javax.swing.JPanel();
        javax.swing.JPanel jPanel_ID_OBAT = new javax.swing.JPanel();
        javax.swing.JLabel jLabel_ID_OBAT = new javax.swing.JLabel();
        javax.swing.JLabel jLabel_Nama_Obat = new javax.swing.JLabel();
        txtField_ID_OBAT = new javax.swing.JTextField();
        javax.swing.JLabel jLabel_Ketersediaan_Obat = new javax.swing.JLabel();
        javax.swing.JLabel jLabel_Banyak_Obat = new javax.swing.JLabel();
        jButton_Cari_Obat = new javax.swing.JButton();
        btnTambah_Obat = new javax.swing.JButton();
        btnKembali_Obat = new javax.swing.JButton();
        jCheckBox_Tersedia_Obat = new javax.swing.JCheckBox();
        javax.swing.JLabel jLabel_Harga_Obat = new javax.swing.JLabel();
        jTextField_Harga_Obat = new javax.swing.JTextField();
        jSpinner_BanyakObat = new JSpinner();
        jComboBox_Nama_Obat = new javax.swing.JComboBox<>();
        btnHapus_Obat = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Obat = new javax.swing.JTable();
        transaksiPanel = new javax.swing.JPanel();
        arkhan_jLabel9 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel_Transaksi = new javax.swing.JPanel();
        javax.swing.JPanel jPanel20 = new javax.swing.JPanel();
        txtField_TanggalTransaksi = new javax.swing.JTextField();
        btnTambah_Transaksi = new javax.swing.JButton();
        btnHapus_Transaksi = new javax.swing.JButton();
        btnKembali_Transaksi = new javax.swing.JButton();
        jLabel_idTransaksi = new javax.swing.JLabel();
        jLabel_TanggalTransaksi = new javax.swing.JLabel();
        txtField_IdTransaksi = new javax.swing.JTextField();
        jLabel_TotalTransaksi = new javax.swing.JLabel();
        jButton_Cari_Transaksi = new javax.swing.JButton();
        txtField_TotalTransaksi = new javax.swing.JTextField();
        jPanel_21 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Transaksi = new javax.swing.JTable();
        ruanganPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
>>>>>>> origin/arkh

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bodyPanel.setBackground(new java.awt.Color(26, 188, 156));

        menuPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Rockwell Condensed", 1, 34)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo_RS.png"))); // NOI18N
        jLabel1.setText("RS Sehat Selalu");
        jLabel1.setIconTextGap(10);
        menuPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 70));

        jLabel2.setText("Sistem Administrasi");
        menuPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        menuRuangan.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        menuRuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Ruangan.png"))); // NOI18N
        menuRuangan.setText("Ruangan");
        menuRuangan.setToolTipText("");
        menuRuangan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuRuangan.setIconTextGap(20);
        menuRuangan.setVerifyInputWhenFocusTarget(false);
        menuRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRuanganActionPerformed(evt);
            }
        });
        menuPanel.add(menuRuangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 240, 60));

        menuDashboard.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        menuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dashboard.png"))); // NOI18N
        menuDashboard.setText("Dashboard");
        menuDashboard.setToolTipText("");
        menuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuDashboard.setIconTextGap(20);
        menuDashboard.setVerifyInputWhenFocusTarget(false);
        menuDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuDashboardMouseClicked(evt);
            }
        });
        menuDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDashboardActionPerformed(evt);
            }
        });
        menuPanel.add(menuDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 60));

        menuDataPasien.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        menuDataPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Data_Pasien.png"))); // NOI18N
        menuDataPasien.setText("Data Pasien");
        menuDataPasien.setToolTipText("");
        menuDataPasien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuDataPasien.setIconTextGap(20);
        menuDataPasien.setVerifyInputWhenFocusTarget(false);
        menuDataPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDataPasienActionPerformed(evt);
            }
        });
        menuPanel.add(menuDataPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, 60));

        menuDataPegawai.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        menuDataPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Pegawai.png"))); // NOI18N
        menuDataPegawai.setText("Data Pegawai");
        menuDataPegawai.setToolTipText("");
        menuDataPegawai.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuDataPegawai.setIconTextGap(20);
        menuDataPegawai.setVerifyInputWhenFocusTarget(false);
        menuDataPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDataPegawaiActionPerformed(evt);
            }
        });
        menuPanel.add(menuDataPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 240, 60));

        menuRekamMedis.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        menuRekamMedis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Rekam Medis.png"))); // NOI18N
        menuRekamMedis.setText("Rekam Medis");
        menuRekamMedis.setToolTipText("");
        menuRekamMedis.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuRekamMedis.setIconTextGap(20);
        menuRekamMedis.setVerifyInputWhenFocusTarget(false);
        menuRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRekamMedisActionPerformed(evt);
            }
        });
        menuPanel.add(menuRekamMedis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 240, 60));

        menuInventarisObat.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        menuInventarisObat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Obat.png"))); // NOI18N
        menuInventarisObat.setText("Inventaris Obat");
        menuInventarisObat.setToolTipText("");
        menuInventarisObat.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuInventarisObat.setIconTextGap(20);
        menuInventarisObat.setVerifyInputWhenFocusTarget(false);
        menuInventarisObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInventarisObatActionPerformed(evt);
            }
        });
        menuPanel.add(menuInventarisObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 240, 60));

        menuTransaksi.setFont(new java.awt.Font("Rockwell Condensed", 1, 24)); // NOI18N
        menuTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/transaction.png"))); // NOI18N
        menuTransaksi.setText("Transaksi");
        menuTransaksi.setToolTipText("");
        menuTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuTransaksi.setIconTextGap(20);
        menuTransaksi.setVerifyInputWhenFocusTarget(false);
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        menuPanel.add(menuTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 240, 60));

<<<<<<< HEAD
=======
        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/call.png"))); // NOI18N
        jLabel3.setText("119");
        menuPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 830, -1, -1));

>>>>>>> origin/arkh
        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel4.setText("Dashboard");
        jLabel4.setIconTextGap(10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addContainerGap(3988, Short.MAX_VALUE))
=======
                .addContainerGap(1122, Short.MAX_VALUE))
>>>>>>> origin/arkh
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(700, Short.MAX_VALUE))
        );

        mainPanel.add(dashboardPanel, "card2");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel5.setText("Data Pasien");
        jLabel5.setIconTextGap(10);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel11.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel11.setText("ID Pasien");

        jLabel12.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel12.setText("Nama Pasien");

        jLabel13.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel13.setText("Jenis Kelamin");

        jRadioButton1.setText("Laki - Laki");

        jRadioButton2.setText("Perempuan");

        jLabel14.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel14.setText("Umur");

        jLabel15.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel15.setText("No. Telepon");

        jLabel16.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel16.setText("Alamat");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Cari");
        jButton1.setToolTipText("");

        jLabel17.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel17.setText("Tanggal Masuk");

        jLabel18.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel18.setText("Tanggal Keluar");

        btnTambah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembali.setText("KEMBALI");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFieldUmur)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtFieldAlamat)
                                    .addComponent(txtFieldNamaPasien)
                                    .addComponent(txtFieldIDPasien1)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(46, 46, 46)
                                .addComponent(txtFieldNoTelp)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFieldTgglMasuk))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel18)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtFieldTgglKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
<<<<<<< HEAD
                        .addGap(0, 3850, Short.MAX_VALUE)))
=======
                        .addGap(0, 984, Short.MAX_VALUE)))
>>>>>>> origin/arkh
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFieldIDPasien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFieldNamaPasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtFieldUmur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtFieldAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFieldTgglMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtFieldTgglKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pasien", "Nama", "Jenis Kelamin", "Umur", "Alamat", "No. Telepon", "Tanggal Masuk", "Tanggal Keluar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pasienPanelLayout = new javax.swing.GroupLayout(pasienPanel);
        pasienPanel.setLayout(pasienPanelLayout);
        pasienPanelLayout.setHorizontalGroup(
            pasienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pasienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pasienPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pasienPanelLayout.setVerticalGroup(
            pasienPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pasienPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(pasienPanel, "card3");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel6.setText("Data Pegawai");
        jLabel6.setIconTextGap(10);

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel19.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel19.setText("ID Pegawai");

        jLabel20.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel20.setText("Nama Pasien");

        jLabel21.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel21.setText("Bagian Pegawai");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Cari");
        jButton2.setToolTipText("");

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Dokter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Admin");

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Perawat");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldNamaPasien1)
                            .addComponent(txtFieldIDPasien2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                        .addGap(0, 3861, Short.MAX_VALUE)))
=======
                        .addGap(0, 978, Short.MAX_VALUE)))
>>>>>>> origin/arkh
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtFieldIDPasien2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtFieldNamaPasien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel22.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        jLabel22.setText("Bertugas");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(252, 252, 252))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 249, Short.MAX_VALUE)
        );

        btnHapus1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus1.setText("HAPUS");
        btnHapus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus1ActionPerformed(evt);
            }
        });

        btnKembali1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembali1.setText("KEMBALI");
        btnKembali1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pegawaiPanelLayout = new javax.swing.GroupLayout(pegawaiPanel);
        pegawaiPanel.setLayout(pegawaiPanelLayout);
        pegawaiPanelLayout.setHorizontalGroup(
            pegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pegawaiPanelLayout.createSequentialGroup()
                .addGroup(pegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pegawaiPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pegawaiPanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pegawaiPanelLayout.createSequentialGroup()
                                .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnKembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
<<<<<<< HEAD
                .addContainerGap(3283, Short.MAX_VALUE))
=======
                .addContainerGap(417, Short.MAX_VALUE))
>>>>>>> origin/arkh
            .addGroup(pegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pegawaiPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pegawaiPanelLayout.setVerticalGroup(
            pegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pegawaiPanelLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(163, 163, 163)
                .addGroup(pegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addGap(0, 326, Short.MAX_VALUE))
=======
                .addGap(0, 322, Short.MAX_VALUE))
>>>>>>> origin/arkh
            .addGroup(pegawaiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pegawaiPanelLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                    .addContainerGap(19, Short.MAX_VALUE)))
=======
                    .addContainerGap(18, Short.MAX_VALUE)))
>>>>>>> origin/arkh
        );

        mainPanel.add(pegawaiPanel, "card4");

<<<<<<< HEAD
        rekamMedisPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NamelLabel7RekamMedis.setBackground(new java.awt.Color(255, 255, 255));
        NamelLabel7RekamMedis.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        NamelLabel7RekamMedis.setText("Rekam Medis");
        NamelLabel7RekamMedis.setIconTextGap(10);

        NamelPanel9RekamMedis.setBackground(new java.awt.Color(0, 153, 153));

        Namelanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Namelanel10.setForeground(new java.awt.Color(255, 255, 255));

        idRekamMedisRekamMeidis.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        idRekamMedisRekamMeidis.setText("ID Rekam Medis");

        tanggalRekamMedis.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        tanggalRekamMedis.setText("Tanggal");

        diagnosaRekamMedis.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        diagnosaRekamMedis.setText("Diagnosa");

        tanggalTextFieldRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalTextFieldRekamMedisActionPerformed(evt);
            }
        });

        TextFieldDiagnosaRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDiagnosaRekamMedisActionPerformed(evt);
            }
        });

        IDRekamMedisTextFieldRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDRekamMedisTextFieldRekamMedisActionPerformed(evt);
            }
        });

        btnCariRekamMedis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCariRekamMedis.setText("cari");
        btnCariRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariRekamMedisActionPerformed(evt);
            }
        });

        btnTAMBAHRekamMedis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTAMBAHRekamMedis.setText("TAMBAH");
        btnTAMBAHRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTAMBAHRekamMedisActionPerformed(evt);
            }
        });

        btnHAPUSRekamMedis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHAPUSRekamMedis.setText("HAPUS");
        btnHAPUSRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAPUSRekamMedisActionPerformed(evt);
            }
        });

        btNKEMBALIRekamMedis.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btNKEMBALIRekamMedis.setText("KEMBALI");
        btNKEMBALIRekamMedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNKEMBALIRekamMedisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Namelanel10Layout = new javax.swing.GroupLayout(Namelanel10);
        Namelanel10.setLayout(Namelanel10Layout);
        Namelanel10Layout.setHorizontalGroup(
            Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Namelanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Namelanel10Layout.createSequentialGroup()
                        .addGroup(Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idRekamMedisRekamMeidis)
                            .addComponent(tanggalRekamMedis)
                            .addComponent(diagnosaRekamMedis))
                        .addGap(18, 18, 18)
                        .addGroup(Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDRekamMedisTextFieldRekamMedis)
                            .addComponent(tanggalTextFieldRekamMedis)
                            .addComponent(TextFieldDiagnosaRekamMedis))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCariRekamMedis))
                    .addGroup(Namelanel10Layout.createSequentialGroup()
                        .addComponent(btnTAMBAHRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHAPUSRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btNKEMBALIRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Namelanel10Layout.setVerticalGroup(
            Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Namelanel10Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRekamMedisRekamMeidis)
                    .addComponent(IDRekamMedisTextFieldRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tanggalTextFieldRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanggalRekamMedis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diagnosaRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldDiagnosaRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Namelanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTAMBAHRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHAPUSRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNKEMBALIRekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tableRekamMedis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Rekam Medis", "Tanggal", "Diagnosa"
            }
        ));
        jScrollPane2.setViewportView(tableRekamMedis);

        javax.swing.GroupLayout NamelPanel9RekamMedisLayout = new javax.swing.GroupLayout(NamelPanel9RekamMedis);
        NamelPanel9RekamMedis.setLayout(NamelPanel9RekamMedisLayout);
        NamelPanel9RekamMedisLayout.setHorizontalGroup(
            NamelPanel9RekamMedisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamelPanel9RekamMedisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NamelPanel9RekamMedisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Namelanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        NamelPanel9RekamMedisLayout.setVerticalGroup(
            NamelPanel9RekamMedisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamelPanel9RekamMedisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Namelanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
                .addContainerGap())
        );
=======
        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel7.setText("Rekam Medis");
        jLabel7.setIconTextGap(10);
>>>>>>> origin/arkh

        javax.swing.GroupLayout rekamMedisPanelLayout = new javax.swing.GroupLayout(rekamMedisPanel);
        rekamMedisPanel.setLayout(rekamMedisPanelLayout);
        rekamMedisPanelLayout.setHorizontalGroup(
            rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addGroup(rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rekamMedisPanelLayout.createSequentialGroup()
                        .addComponent(NamelLabel7RekamMedis, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4167, Short.MAX_VALUE))
                    .addComponent(NamelPanel9RekamMedis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
=======
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1340, Short.MAX_VALUE))
>>>>>>> origin/arkh
        );
        rekamMedisPanelLayout.setVerticalGroup(
            rekamMedisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rekamMedisPanelLayout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap()
                .addComponent(NamelLabel7RekamMedis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamelPanel9RekamMedis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
                .addGap(27, 27, 27)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
>>>>>>> origin/arkh
        );

        mainPanel.add(rekamMedisPanel, "card5");

<<<<<<< HEAD
        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel8.setText("Inventaris Obat");
        jLabel8.setIconTextGap(10);
=======
        ArkhanJpanel8.setBackground(new java.awt.Color(255, 255, 255));
        ArkhanJpanel8.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        ArkhanJpanel8.setText("Inventaris Obat");
        ArkhanJpanel8.setIconTextGap(10);

        jPanel_IJOIJO_OBAT.setBackground(new java.awt.Color(0, 153, 153));

        jPanel_ID_OBAT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        jLabel_ID_OBAT.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_ID_OBAT.setText("ID Obat");

        jLabel_Nama_Obat.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_Nama_Obat.setText("Nama Obat");

        txtField_ID_OBAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtField_ID_OBATActionPerformed(evt);
            }
        });

        jLabel_Ketersediaan_Obat.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_Ketersediaan_Obat.setText("Ketersediaan");

        jLabel_Banyak_Obat.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_Banyak_Obat.setText("Banyak Obat");

        jButton_Cari_Obat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Cari_Obat.setText("Cari");
        jButton_Cari_Obat.setToolTipText("");
        jButton_Cari_Obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cari_ObatActionPerformed(evt);
            }
        });

        btnTambah_Obat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah_Obat.setText("TAMBAH");
        btnTambah_Obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah_ObatActionPerformed(evt);
            }
        });

        btnKembali_Obat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembali_Obat.setText("KEMBALI");
        btnKembali_Obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali_ObatActionPerformed(evt);
            }
        });

        jCheckBox_Tersedia_Obat.setText("Tidak Tersedia");
        jCheckBox_Tersedia_Obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_Tersedia_ObatActionPerformed(evt);
            }
        });

        jLabel_Harga_Obat.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_Harga_Obat.setText("Harga Total Obat");

        jTextField_Harga_Obat.setEditable(false);
        jTextField_Harga_Obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Harga_ObatActionPerformed(evt);
            }
        });

        jComboBox_Nama_Obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Nama_ObatActionPerformed(evt);
            }
        });

        btnHapus_Obat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus_Obat.setText("Hapus");
        btnHapus_Obat.setActionCommand("HAPUS");
        btnHapus_Obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus_ObatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_ID_OBATLayout = new javax.swing.GroupLayout(jPanel_ID_OBAT);
        jPanel_ID_OBAT.setLayout(jPanel_ID_OBATLayout);
        jPanel_ID_OBATLayout.setHorizontalGroup(
            jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ID_OBATLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_ID_OBATLayout.createSequentialGroup()
                        .addComponent(btnTambah_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKembali_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1006, Short.MAX_VALUE))
                    .addGroup(jPanel_ID_OBATLayout.createSequentialGroup()
                        .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Nama_Obat)
                            .addComponent(jLabel_ID_OBAT)
                            .addComponent(jLabel_Ketersediaan_Obat)
                            .addComponent(jLabel_Banyak_Obat)
                            .addComponent(jLabel_Harga_Obat))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_ID_OBATLayout.createSequentialGroup()
                                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField_Harga_Obat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtField_ID_OBAT, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Cari_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel_ID_OBATLayout.createSequentialGroup()
                                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_BanyakObat, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox_Tersedia_Obat)
                                    .addComponent(jComboBox_Nama_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel_ID_OBATLayout.setVerticalGroup(
            jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ID_OBATLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_ID_OBAT)
                    .addComponent(txtField_ID_OBAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari_Obat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Nama_Obat)
                    .addComponent(jComboBox_Nama_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Ketersediaan_Obat)
                    .addComponent(jCheckBox_Tersedia_Obat))
                .addGap(18, 18, 18)
                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Banyak_Obat)
                    .addComponent(jSpinner_BanyakObat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Harga_Obat)
                    .addComponent(jTextField_Harga_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel_ID_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus_Obat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        JSpinner spinner = new JSpinner();

        // Ambil editor dan komponennya
        JComponent editor = spinner.getEditor();
        JFormattedTextField tf = ((JSpinner.DefaultEditor) editor).getTextField();

        // Ambil parent dari text field
        Container parent = tf.getParent();
        parent.setLayout(new BorderLayout());

        // Ambil tombol spinner
        Component[] comps = parent.getComponents();
        for (Component c : comps) {
            if (c instanceof JButton) {
                parent.remove(c); // Hapus dari kanan
                parent.add(c, BorderLayout.WEST); // Tambahkan ke kiri
            }
        }

        javax.swing.GroupLayout jPanel_belakangan_obatLayout = new javax.swing.GroupLayout(jPanel_belakangan_obat);
        jPanel_belakangan_obat.setLayout(jPanel_belakangan_obatLayout);
        jPanel_belakangan_obatLayout.setHorizontalGroup(
            jPanel_belakangan_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_belakangan_obatLayout.createSequentialGroup()
                .addComponent(jPanel_ID_OBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_belakangan_obatLayout.setVerticalGroup(
            jPanel_belakangan_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_ID_OBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTable_Obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Obat", "Nama Obat", "Ketersediaan Obat", "Banyak Obat", "Harga Obat"
            }
        ));
        jScrollPane2.setViewportView(jTable_Obat);
        if (jTable_Obat.getColumnModel().getColumnCount() > 0) {
            jTable_Obat.getColumnModel().getColumn(0).setMinWidth(200);
            jTable_Obat.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_IJOIJO_OBATLayout = new javax.swing.GroupLayout(jPanel_IJOIJO_OBAT);
        jPanel_IJOIJO_OBAT.setLayout(jPanel_IJOIJO_OBATLayout);
        jPanel_IJOIJO_OBATLayout.setHorizontalGroup(
            jPanel_IJOIJO_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_IJOIJO_OBATLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_IJOIJO_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_belakangan_obat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_IJOIJO_OBATLayout.setVerticalGroup(
            jPanel_IJOIJO_OBATLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_IJOIJO_OBATLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_belakangan_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
>>>>>>> origin/arkh

        javax.swing.GroupLayout obatPanelLayout = new javax.swing.GroupLayout(obatPanel);
        obatPanel.setLayout(obatPanelLayout);
        obatPanelLayout.setHorizontalGroup(
            obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obatPanelLayout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addComponent(jLabel8)
                .addContainerGap(4214, Short.MAX_VALUE))
=======
                .addComponent(ArkhanJpanel8)
                .addContainerGap(1256, Short.MAX_VALUE))
            .addComponent(jPanel_IJOIJO_OBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> origin/arkh
        );
        obatPanelLayout.setVerticalGroup(
            obatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obatPanelLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(27, 27, 27)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
=======
                .addComponent(ArkhanJpanel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_IJOIJO_OBAT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
>>>>>>> origin/arkh
        );

        mainPanel.add(obatPanel, "card6");

<<<<<<< HEAD
        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel9.setText("Menu Transaksi");
        jLabel9.setIconTextGap(10);
=======
        arkhan_jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        arkhan_jLabel9.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        arkhan_jLabel9.setText("Menu Transaksi");
        arkhan_jLabel9.setIconTextGap(10);

        jPanel_Transaksi.setBackground(new java.awt.Color(0, 153, 153));

        btnTambah_Transaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTambah_Transaksi.setText("TAMBAH");
        btnTambah_Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah_TransaksiActionPerformed(evt);
            }
        });

        btnHapus_Transaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHapus_Transaksi.setText("HAPUS");
        btnHapus_Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapus_TransaksiActionPerformed(evt);
            }
        });

        btnKembali_Transaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKembali_Transaksi.setText("KEMBALI");
        btnKembali_Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembali_TransaksiActionPerformed(evt);
            }
        });

        jLabel_idTransaksi.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_idTransaksi.setText("ID Transaksi");

        jLabel_TanggalTransaksi.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_TanggalTransaksi.setText("Tanggal Transaksi");

        jLabel_TotalTransaksi.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel_TotalTransaksi.setText("Total Transaksi");

        jButton_Cari_Transaksi.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton_Cari_Transaksi.setText("Cari");
        jButton_Cari_Transaksi.setToolTipText("");
        jButton_Cari_Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cari_TransaksiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_TanggalTransaksi)
                            .addComponent(jLabel_idTransaksi)
                            .addComponent(jLabel_TotalTransaksi))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtField_IdTransaksi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField_TotalTransaksi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtField_TanggalTransaksi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Cari_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(btnTambah_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKembali_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 998, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_idTransaksi)
                    .addComponent(txtField_IdTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Cari_Transaksi))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TanggalTransaksi)
                    .addComponent(txtField_TanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_TotalTransaksi)
                    .addComponent(txtField_TotalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTable_Transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Transaksi", "Tanggal Transaksi", "Total Transaksi"
            }
        ));
        jScrollPane3.setViewportView(jTable_Transaksi);
        if (jTable_Transaksi.getColumnModel().getColumnCount() > 0) {
            jTable_Transaksi.getColumnModel().getColumn(0).setMinWidth(200);
            jTable_Transaksi.getColumnModel().getColumn(0).setMaxWidth(200);
        }

        javax.swing.GroupLayout jPanel_21Layout = new javax.swing.GroupLayout(jPanel_21);
        jPanel_21.setLayout(jPanel_21Layout);
        jPanel_21Layout.setHorizontalGroup(
            jPanel_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel_21Layout.setVerticalGroup(
            jPanel_21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_TransaksiLayout = new javax.swing.GroupLayout(jPanel_Transaksi);
        jPanel_Transaksi.setLayout(jPanel_TransaksiLayout);
        jPanel_TransaksiLayout.setHorizontalGroup(
            jPanel_TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel_21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_TransaksiLayout.setVerticalGroup(
            jPanel_TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel_21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
>>>>>>> origin/arkh

        javax.swing.GroupLayout transaksiPanelLayout = new javax.swing.GroupLayout(transaksiPanel);
        transaksiPanel.setLayout(transaksiPanelLayout);
        transaksiPanelLayout.setHorizontalGroup(
            transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiPanelLayout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addComponent(jLabel9)
                .addContainerGap(4211, Short.MAX_VALUE))
=======
                .addGroup(transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(transaksiPanelLayout.createSequentialGroup()
                        .addComponent(arkhan_jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
>>>>>>> origin/arkh
        );
        transaksiPanelLayout.setVerticalGroup(
            transaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transaksiPanelLayout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
=======
                .addComponent(arkhan_jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
>>>>>>> origin/arkh
        );

        mainPanel.add(transaksiPanel, "card7");

<<<<<<< HEAD
        namelLabel10ManagementRuangan.setBackground(new java.awt.Color(255, 255, 255));
        namelLabel10ManagementRuangan.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        namelLabel10ManagementRuangan.setText("Management Ruangan");
        namelLabel10ManagementRuangan.setIconTextGap(10);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3208, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 804, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ManagementRuanganLayout = new javax.swing.GroupLayout(ManagementRuangan);
        ManagementRuangan.setLayout(ManagementRuanganLayout);
        ManagementRuanganLayout.setHorizontalGroup(
            ManagementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ManagementRuanganLayout.setVerticalGroup(
            ManagementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NamelPanel9ManagementRuangan.setBackground(new java.awt.Color(0, 153, 153));

        idRuanganjlabelManagementRuangan.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        idRuanganjlabelManagementRuangan.setText("ID Ruangan");

        tipeRuanganManajementRuangan.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        tipeRuanganManajementRuangan.setText("Tipe Ruangan");

        hargaRuanganManagementRuangan.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        hargaRuanganManagementRuangan.setText("Harga Ruangan");

        tfHargaRuanganManagementRuangan.setEditable(false);
        tfHargaRuanganManagementRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaRuanganManagementRuanganActionPerformed(evt);
            }
        });

        idRuanganManagementRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idRuanganManagementRuanganActionPerformed(evt);
            }
        });

        btnCariManagementRuangan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCariManagementRuangan.setText("cari");
        btnCariManagementRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariManagementRuanganActionPerformed(evt);
            }
        });

        btnTAMBAHManagementRuangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTAMBAHManagementRuangan.setText("TAMBAH");
        btnTAMBAHManagementRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTAMBAHManagementRuanganActionPerformed(evt);
            }
        });

        btnHAPUSManagementRuangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHAPUSManagementRuangan.setText("HAPUS");
        btnHAPUSManagementRuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHAPUSManagementRuanganActionPerformed(evt);
            }
        });

        btNKEMBALIManagementRUangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btNKEMBALIManagementRUangan.setText("KEMBALI");
        btNKEMBALIManagementRUangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNKEMBALIManagementRUanganActionPerformed(evt);
            }
        });

        jComboBoxTipeRuanganManagementRUangan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jComboBoxTipeRuanganManagementRUangan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UMUM", "REGULER", "VIP" }));
        jComboBoxTipeRuanganManagementRUangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipeRuanganManagementRUanganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Namelpanel11ManajementRuanganLayout = new javax.swing.GroupLayout(Namelpanel11ManajementRuangan);
        Namelpanel11ManajementRuangan.setLayout(Namelpanel11ManajementRuanganLayout);
        Namelpanel11ManajementRuanganLayout.setHorizontalGroup(
            Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Namelpanel11ManajementRuanganLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Namelpanel11ManajementRuanganLayout.createSequentialGroup()
                        .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(idRuanganjlabelManagementRuangan)
                            .addComponent(tipeRuanganManajementRuangan)
                            .addComponent(hargaRuanganManagementRuangan))
                        .addGap(18, 18, 18)
                        .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Namelpanel11ManajementRuanganLayout.createSequentialGroup()
                                .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idRuanganManagementRuangan)
                                    .addGroup(Namelpanel11ManajementRuanganLayout.createSequentialGroup()
                                        .addComponent(tfHargaRuanganManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCariManagementRuangan))
                            .addGroup(Namelpanel11ManajementRuanganLayout.createSequentialGroup()
                                .addComponent(jComboBoxTipeRuanganManagementRUangan, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Namelpanel11ManajementRuanganLayout.createSequentialGroup()
                        .addComponent(btnTAMBAHManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHAPUSManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btNKEMBALIManagementRUangan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 436, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Namelpanel11ManajementRuanganLayout.setVerticalGroup(
            Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Namelpanel11ManajementRuanganLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idRuanganjlabelManagementRuangan)
                    .addComponent(idRuanganManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipeRuanganManajementRuangan)
                    .addComponent(jComboBoxTipeRuanganManagementRUangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hargaRuanganManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfHargaRuanganManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Namelpanel11ManajementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTAMBAHManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHAPUSManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNKEMBALIManagementRUangan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tableManagementRuangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Ruangan", "Tipe Ruangan", "Harga Ruangan"
            }
        ));
        jScrollPane4.setViewportView(tableManagementRuangan);

        javax.swing.GroupLayout NamelPanel9ManagementRuanganLayout = new javax.swing.GroupLayout(NamelPanel9ManagementRuangan);
        NamelPanel9ManagementRuangan.setLayout(NamelPanel9ManagementRuanganLayout);
        NamelPanel9ManagementRuanganLayout.setHorizontalGroup(
            NamelPanel9ManagementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamelPanel9ManagementRuanganLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(NamelPanel9ManagementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(Namelpanel11ManajementRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        NamelPanel9ManagementRuanganLayout.setVerticalGroup(
            NamelPanel9ManagementRuanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NamelPanel9ManagementRuanganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Namelpanel11ManajementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
=======
        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabel10.setText("Management Ruangan");
        jLabel10.setIconTextGap(10);
>>>>>>> origin/arkh

        javax.swing.GroupLayout ruanganPanelLayout = new javax.swing.GroupLayout(ruanganPanel);
        ruanganPanel.setLayout(ruanganPanelLayout);
        ruanganPanelLayout.setHorizontalGroup(
            ruanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ruanganPanelLayout.createSequentialGroup()
                .addContainerGap()
<<<<<<< HEAD
                .addGroup(ruanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ruanganPanelLayout.createSequentialGroup()
                        .addComponent(namelLabel10ManagementRuangan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ruanganPanelLayout.createSequentialGroup()
                        .addComponent(NamelPanel9ManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(ManagementRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        ruanganPanelLayout.setVerticalGroup(
            ruanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(ruanganPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(ManagementRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ruanganPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(namelLabel10ManagementRuangan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamelPanel9ManagementRuangan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
=======
                .addComponent(jLabel10)
                .addContainerGap(1130, Short.MAX_VALUE))
        );
        ruanganPanelLayout.setVerticalGroup(
            ruanganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ruanganPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(754, Short.MAX_VALUE))
>>>>>>> origin/arkh
        );

        mainPanel.add(ruanganPanel, "card8");

<<<<<<< HEAD
        jLabel3.setFont(new java.awt.Font("Rockwell Condensed", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/call.png"))); // NOI18N
        jLabel3.setText("119");
        mainPanel.add(jLabel3, "card9");

        jLabelDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jLabelDashboard.setFont(new java.awt.Font("Rockwell Condensed", 1, 36)); // NOI18N
        jLabelDashboard.setText("Dashboard");
        jLabelDashboard.setIconTextGap(10);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1092, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dashboardPanel1Layout = new javax.swing.GroupLayout(dashboardPanel1);
        dashboardPanel1.setLayout(dashboardPanel1Layout);
        dashboardPanel1Layout.setHorizontalGroup(
            dashboardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashboardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelDashboard)
                        .addContainerGap(1074, Short.MAX_VALUE))
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        dashboardPanel1Layout.setVerticalGroup(
            dashboardPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.add(dashboardPanel1, "cardDashboard");

=======
>>>>>>> origin/arkh
        javax.swing.GroupLayout bodyPanelLayout = new javax.swing.GroupLayout(bodyPanel);
        bodyPanel.setLayout(bodyPanelLayout);
        bodyPanelLayout.setHorizontalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        bodyPanelLayout.setVerticalGroup(
            bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 865, Short.MAX_VALUE))
=======
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE))
>>>>>>> origin/arkh
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
<<<<<<< HEAD

=======
>>>>>>> origin/arkh
    private void menuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDashboardActionPerformed
        //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add panel
        mainPanel.add(dashboardPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuDashboardActionPerformed

    private void menuDataPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDataPasienActionPerformed
          //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add panel
        mainPanel.add(pasienPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuDataPasienActionPerformed

    private void menuDataPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDataPegawaiActionPerformed
         //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add panel
        mainPanel.add(pegawaiPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuDataPegawaiActionPerformed

    private void menuRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRekamMedisActionPerformed
         //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add panel
        mainPanel.add(rekamMedisPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuRekamMedisActionPerformed

    private void menuInventarisObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInventarisObatActionPerformed
         //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add panel
        mainPanel.add(obatPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuInventarisObatActionPerformed

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
         //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add panel
        mainPanel.add(transaksiPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuTransaksiActionPerformed

    private void menuRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRuanganActionPerformed
         //remove panel
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add panel
        mainPanel.add(ruanganPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_menuRuanganActionPerformed

    private void menuDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuDashboardMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuDashboardMouseClicked

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnHapus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapus1ActionPerformed

    private void btnKembali1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembali1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

<<<<<<< HEAD
    private void tanggalTextFieldRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalTextFieldRekamMedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalTextFieldRekamMedisActionPerformed

    private void TextFieldDiagnosaRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDiagnosaRekamMedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDiagnosaRekamMedisActionPerformed

    private void IDRekamMedisTextFieldRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRekamMedisTextFieldRekamMedisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDRekamMedisTextFieldRekamMedisActionPerformed

    private void btnCariRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariRekamMedisActionPerformed
    btnCariRekamMedis.addActionListener(e -> cariRekam());        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariRekamMedisActionPerformed

    private void btnTAMBAHRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTAMBAHRekamMedisActionPerformed
        TambahRekam();
            // TODO add your handling code here:
    }//GEN-LAST:event_btnTAMBAHRekamMedisActionPerformed

    private void btnHAPUSRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHAPUSRekamMedisActionPerformed
    int selectedRow = tableRekamMedis.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tableRekamMedis.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus!");
        }
        // TODO add your handling de here:
    }//GEN-LAST:event_btnHAPUSRekamMedisActionPerformed

    private void btNKEMBALIRekamMedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNKEMBALIRekamMedisActionPerformed
    mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(dashboardPanel);
        mainPanel.repaint();
        mainPanel.revalidate();        // TODO add your handling code here:
    }//GEN-LAST:event_btNKEMBALIRekamMedisActionPerformed

    private void tfHargaRuanganManagementRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaRuanganManagementRuanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHargaRuanganManagementRuanganActionPerformed

    private void idRuanganManagementRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idRuanganManagementRuanganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idRuanganManagementRuanganActionPerformed

    private void btnCariManagementRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariManagementRuanganActionPerformed
        btnCariManagementRuangan.addActionListener(e -> cariManagement());        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariManagementRuanganActionPerformed

    private void btnTAMBAHManagementRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTAMBAHManagementRuanganActionPerformed
    tambahRuangan();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTAMBAHManagementRuanganActionPerformed

    private void btnHAPUSManagementRuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHAPUSManagementRuanganActionPerformed
    int selectedRow = tableManagementRuangan.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tableManagementRuangan.getModel();
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus!");
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnHAPUSManagementRuanganActionPerformed

    private void btNKEMBALIManagementRUanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNKEMBALIManagementRUanganActionPerformed
=======
    private void btnTambah_ObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah_ObatActionPerformed
    tambahObatKeTabel();    
    }//GEN-LAST:event_btnTambah_ObatActionPerformed

    private void btnKembali_ObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali_ObatActionPerformed
>>>>>>> origin/arkh
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(dashboardPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
<<<<<<< HEAD
    }//GEN-LAST:event_btNKEMBALIManagementRUanganActionPerformed

    private void jComboBoxTipeRuanganManagementRUanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipeRuanganManagementRUanganActionPerformed

    String tipe = jComboBoxTipeRuanganManagementRUangan.getSelectedItem().toString();

    switch (tipe) {
        case "UMUM":
            tfHargaRuanganManagementRuangan.setText("Rp200.000");
            break;
        case "REGULER":
            tfHargaRuanganManagementRuangan.setText("Rp500.000");
            break;
        case "VIP":
            tfHargaRuanganManagementRuangan.setText("Rp1.000.000");
            break;
        default:
            tfHargaRuanganManagementRuangan.setText("");
            break;
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipeRuanganManagementRUanganActionPerformed
=======
    }//GEN-LAST:event_btnKembali_ObatActionPerformed

    private void btnTambah_TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah_TransaksiActionPerformed
        tambahRekeningKeTabel();
    }//GEN-LAST:event_btnTambah_TransaksiActionPerformed

    private void btnHapus_TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus_TransaksiActionPerformed
        int selectedRow = jTable_Transaksi.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel modelhapustransaksi = (DefaultTableModel) jTable_Transaksi.getModel();
            modelhapustransaksi.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus!");
        }
    }//GEN-LAST:event_btnHapus_TransaksiActionPerformed

    private void btnKembali_TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembali_TransaksiActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(dashboardPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnKembali_TransaksiActionPerformed

    private void jTextField_Harga_ObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Harga_ObatActionPerformed
    String namaObat = (String) jComboBox_Nama_Obat.getSelectedItem();
    int hargaSatuan = hargaObat.getOrDefault(namaObat, 0);
    int jumlah = (int) jSpinner_BanyakObat.getValue();
    int total = hargaSatuan * jumlah;

    jTextField_Harga_Obat.setText(String.valueOf(total));


    }//GEN-LAST:event_jTextField_Harga_ObatActionPerformed

    private void jComboBox_Nama_ObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Nama_ObatActionPerformed
    Map<String, Integer> hargaObat = new HashMap<>();
{
    hargaObat.put("Paracetamol", 5000);
    hargaObat.put("OBH (Obat Batuk Hitam)", 12000);
    hargaObat.put("Antasida", 7000);
    hargaObat.put("Amoxicillin", 15000);
    hargaObat.put("Loperamide", 6000);
    hargaObat.put("CTM (Chlorpheniramine)", 4000);
    hargaObat.put("Loratadine", 10000);
    hargaObat.put("Betadine", 13000);
    hargaObat.put("Metformin", 9000);
    hargaObat.put("Vitamin C / Suplemen", 11000);
}

// Listener ketika pilihan berubah
jComboBox_Nama_Obat.addActionListener(e -> updateHarga());

    }//GEN-LAST:event_jComboBox_Nama_ObatActionPerformed

    private void jCheckBox_Tersedia_ObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_Tersedia_ObatActionPerformed
        // Listener untuk checkbox
jCheckBox_Tersedia_Obat.addActionListener(e -> toggleKetersediaan());

    }//GEN-LAST:event_jCheckBox_Tersedia_ObatActionPerformed

    private void txtField_ID_OBATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtField_ID_OBATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtField_ID_OBATActionPerformed

    private void jButton_Cari_ObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cari_ObatActionPerformed
        jButton_Cari_Obat.addActionListener(e -> cariObatByID());
    }//GEN-LAST:event_jButton_Cari_ObatActionPerformed

    private void btnHapus_ObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapus_ObatActionPerformed
        int selectedRow = jTable_Obat.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel modelhapusobat = (DefaultTableModel) jTable_Obat.getModel();
            modelhapusobat.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Pilih baris yang ingin dihapus!");
        }
    }//GEN-LAST:event_btnHapus_ObatActionPerformed

    private void jButton_Cari_TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cari_TransaksiActionPerformed
        jButton_Cari_Transaksi.addActionListener(e -> cariTransaksiByID());
    }//GEN-LAST:event_jButton_Cari_TransaksiActionPerformed
>>>>>>> origin/arkh

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
<<<<<<< HEAD
        /* Set the Nimbus look and feel */
=======
     /* Set the Nimbus look and feel */
>>>>>>> origin/arkh
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
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
<<<<<<< HEAD
        java.awt.EventQueue.invokeLater(new Runnable() {
=======
    java.awt.EventQueue.invokeLater(new Runnable() {
>>>>>>> origin/arkh
            public void run() {
                new mainView().setVisible(true);
            }
        });
    }
<<<<<<< HEAD

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDRekamMedisTextFieldRekamMedis;
    private javax.swing.JPanel ManagementRuangan;
    private javax.swing.JLabel NamelLabel7RekamMedis;
    private javax.swing.JPanel NamelPanel9ManagementRuangan;
    private javax.swing.JPanel NamelPanel9RekamMedis;
    private javax.swing.JPanel Namelanel10;
    private javax.swing.JPanel Namelpanel11ManajementRuangan;
    private javax.swing.JTextField TextFieldDiagnosaRekamMedis;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btNKEMBALIManagementRUangan;
    private javax.swing.JButton btNKEMBALIRekamMedis;
    private javax.swing.JButton btnCariManagementRuangan;
    private javax.swing.JButton btnCariRekamMedis;
    private javax.swing.JButton btnHAPUSManagementRuangan;
    private javax.swing.JButton btnHAPUSRekamMedis;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKembali1;
    private javax.swing.JButton btnTAMBAHManagementRuangan;
    private javax.swing.JButton btnTAMBAHRekamMedis;
    private javax.swing.JButton btnTambah;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JPanel dashboardPanel1;
    private javax.swing.JLabel diagnosaRekamMedis;
    private javax.swing.JLabel hargaRuanganManagementRuangan;
    private javax.swing.JLabel idRekamMedisRekamMeidis;
    private javax.swing.JTextField idRuanganManagementRuangan;
    private javax.swing.JLabel idRuanganjlabelManagementRuangan;
=======
 


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arkhan_jLabel9;
    private javax.swing.JPanel bodyPanel;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHapus1;
    private javax.swing.JButton btnHapus_Obat;
    private javax.swing.JButton btnHapus_Transaksi;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnKembali1;
    private javax.swing.JButton btnKembali_Obat;
    private javax.swing.JButton btnKembali_Transaksi;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah_Obat;
    private javax.swing.JButton btnTambah_Transaksi;
    private javax.swing.JPanel dashboardPanel;
>>>>>>> origin/arkh
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
<<<<<<< HEAD
    private javax.swing.JComboBox<String> jComboBoxTipeRuanganManagementRUangan;
    private javax.swing.JLabel jLabel1;
=======
    private javax.swing.JButton jButton_Cari_Obat;
    private javax.swing.JButton jButton_Cari_Transaksi;
    private javax.swing.JCheckBox jCheckBox_Tersedia_Obat;
    private javax.swing.JComboBox<String> jComboBox_Nama_Obat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
>>>>>>> origin/arkh
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDashboard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
=======
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_TanggalTransaksi;
    private javax.swing.JLabel jLabel_TotalTransaksi;
    private javax.swing.JLabel jLabel_idTransaksi;
    private javax.swing.JPanel jPanel1;
>>>>>>> origin/arkh
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
<<<<<<< HEAD
=======
    private javax.swing.JPanel jPanel_21;
    private javax.swing.JPanel jPanel_belakangan_obat;
>>>>>>> origin/arkh
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
<<<<<<< HEAD
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
=======
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner_BanyakObat;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Obat;
    private javax.swing.JTable jTable_Transaksi;
    private javax.swing.JTextField jTextField_Harga_Obat;
>>>>>>> origin/arkh
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton menuDashboard;
    private javax.swing.JButton menuDataPasien;
    private javax.swing.JButton menuDataPegawai;
    private javax.swing.JButton menuInventarisObat;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton menuRekamMedis;
    private javax.swing.JButton menuRuangan;
    private javax.swing.JButton menuTransaksi;
<<<<<<< HEAD
    private javax.swing.JLabel namelLabel10ManagementRuangan;
=======
>>>>>>> origin/arkh
    private javax.swing.JPanel obatPanel;
    private javax.swing.JPanel pasienPanel;
    private javax.swing.JPanel pegawaiPanel;
    private javax.swing.JPanel rekamMedisPanel;
    private javax.swing.JPanel ruanganPanel;
<<<<<<< HEAD
    protected javax.swing.JTable tableManagementRuangan;
    protected javax.swing.JTable tableRekamMedis;
    private javax.swing.JLabel tanggalRekamMedis;
    private javax.swing.JTextField tanggalTextFieldRekamMedis;
    private javax.swing.JTextField tfHargaRuanganManagementRuangan;
    private javax.swing.JLabel tipeRuanganManajementRuangan;
=======
>>>>>>> origin/arkh
    private javax.swing.JPanel transaksiPanel;
    private javax.swing.JTextField txtFieldAlamat;
    private javax.swing.JTextField txtFieldIDPasien1;
    private javax.swing.JTextField txtFieldIDPasien2;
    private javax.swing.JTextField txtFieldNamaPasien;
    private javax.swing.JTextField txtFieldNamaPasien1;
    private javax.swing.JTextField txtFieldNoTelp;
    private javax.swing.JTextField txtFieldTgglKeluar;
    private javax.swing.JTextField txtFieldTgglMasuk;
    private javax.swing.JTextField txtFieldUmur;
<<<<<<< HEAD
    // End of variables declaration//GEN-END:variables
}
=======
    private javax.swing.JTextField txtField_ID_OBAT;
    private javax.swing.JTextField txtField_IdTransaksi;
    private javax.swing.JTextField txtField_TanggalTransaksi;
    private javax.swing.JTextField txtField_TotalTransaksi;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> origin/arkh
