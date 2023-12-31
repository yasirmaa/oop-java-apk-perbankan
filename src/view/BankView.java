/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perbankan.*;

/**
 *
 * @author Lenovo
 */
public class BankView extends javax.swing.JFrame {

    /**
     * Creates new form BankView
     */
    private Bank bank;

    public BankView() {
        initComponents();
        bank = new Bank();
        tampilData();
    }

    private void bersihkan() {
        txtNamaAwal.setText("");
        txtNamaAkhir.setText("");
        txtSaldo.setText("");

        btnTambah.setText("Tambah");
    }

    private void tampilData() {
        int jumlahNasabah = bank.getJumlahNasabah();
        int noUrut = 1;
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Nama Awal");
        model.addColumn("Nama Akhir");
        model.addColumn("Saldo");

        model.setRowCount(0);

        for (int i = 0; i < jumlahNasabah; i++) {
            if (bank.getNasabah(i).getNamaAwal() == "") {
                continue;
            }
            model.addRow(new Object[]{
                noUrut++,
                bank.getNasabah(i).getNamaAwal(),
                bank.getNasabah(i).getNamaAkhir(),
                bank.getNasabah(i).getTabungan().getSaldo(),});
        }

        tblData.setModel(model);
    }

    private Nasabah pilihNasabah() {
        int selectedRow = tblData.getSelectedRow();
        String namaAwal = tblData.getValueAt(selectedRow, 1).toString();
        String namaAkhir = tblData.getValueAt(selectedRow, 2).toString();

        int indexNasabah = bank.getIndexNasabah(namaAwal, namaAkhir);

        return bank.getNasabah(indexNasabah);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNamaAwal = new javax.swing.JTextField();
        txtNamaAkhir = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        titleApk = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Perbankan");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 400));

        jLabel1.setText("Nama Awal");

        jLabel2.setText("Nama Akhir");

        jLabel3.setText("Saldo");

        titleApk.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleApk.setText("PERBANKAN SEDERHANA");

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "Nama Awal", "Nama Akhir", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);
        if (tblData.getColumnModel().getColumnCount() > 0) {
            tblData.getColumnModel().getColumn(0).setResizable(false);
        }

        btnTambah.setBackground(new java.awt.Color(95, 166, 108));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(219, 88, 94));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(120, 139, 145));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 8));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBatal)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNamaAwal)
                            .addComponent(txtNamaAkhir)
                            .addComponent(txtSaldo)))
                    .addComponent(titleApk, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleApk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNamaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(594, 448));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        try {
            if (txtNamaAwal.getText().equals("")
                    || txtNamaAkhir.getText().equals("")
                    || txtSaldo.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Data tidak boleh kosong!", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!txtNamaAwal.getText().matches("^[a-zA-Z]*$") || !txtNamaAkhir.getText().matches("^[a-zA-Z]*$")) {
                JOptionPane.showMessageDialog(null, "Nama harus berupa huruf saja!", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (!txtSaldo.getText().matches("^[0-9]*$")) {
                JOptionPane.showMessageDialog(null, "Saldo harus berupa angka saja!", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (btnTambah.getText() == "Tambah") {
                String namaAwal = txtNamaAwal.getText();
                String namaAkhir = txtNamaAkhir.getText();
                int jumlahNasabah = bank.getJumlahNasabah();
                int saldo = Integer.parseInt(txtSaldo.getText());

                bank.tambahNasabah(namaAwal, namaAkhir);

                bank.getNasabah(jumlahNasabah).setTabungan(new Tabungan(saldo));

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            } else if (btnTambah.getText() == "Simpan") {
                Nasabah nasabah = pilihNasabah();
                nasabah.setNamaAwal(txtNamaAwal.getText());
                nasabah.setNamaAkhir(txtNamaAkhir.getText());

                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            }
            bersihkan();
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblData.getSelectedRow();
        txtNamaAwal.setText(tblData.getValueAt(selectedRow, 1).toString());
        txtNamaAkhir.setText(tblData.getValueAt(selectedRow, 2).toString());
        txtSaldo.setText(tblData.getValueAt(selectedRow, 3).toString());

        txtSaldo.setEditable(false);
        btnTambah.setText("Simpan");
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if (txtNamaAwal.getText().equals("")
                || txtNamaAkhir.getText().equals("")
                || txtSaldo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Silahkan pilih data yang ingin dihapus!", "Validasi Data", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int jawab = JOptionPane.showConfirmDialog(null, "Data ini akan dihapus ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (jawab == 0) {
//                int selectedRow = tblData.getSelectedRow();
//                String namaAwal = tblData.getValueAt(selectedRow, 1).toString();
//                String namaAkhir = tblData.getValueAt(selectedRow, 2).toString();
//
//                int indexNasabah = bank.getIndexNasabah(namaAwal, namaAkhir);

                Nasabah nasabah = pilihNasabah();
                nasabah.setNamaAwal("");
                nasabah.setNamaAkhir("");

                bersihkan();
                tampilData();
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        txtSaldo.setEditable(true);
        bersihkan();
    }//GEN-LAST:event_btnBatalActionPerformed

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
            java.util.logging.Logger.getLogger(BankView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankView.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblData;
    private javax.swing.JLabel titleApk;
    private javax.swing.JTextField txtNamaAkhir;
    private javax.swing.JTextField txtNamaAwal;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
