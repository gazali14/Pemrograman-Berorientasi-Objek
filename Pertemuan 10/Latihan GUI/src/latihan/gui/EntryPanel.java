/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package latihan.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author U53R
 */
public class EntryPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntryPanel
     */
    public EntryPanel() {
        initComponents();
        loadTableData();
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
        perempuanRadioButton = new javax.swing.JRadioButton();
        menyanyiCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        berenangCheckBox = new javax.swing.JCheckBox();
        namaTextField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        umurSpinner = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        provinsiComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        nimTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lakiRadioButton = new javax.swing.JRadioButton();
        membacaCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        perempuanRadioButton.setText("Perempuan");
        perempuanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perempuanRadioButtonActionPerformed(evt);
            }
        });

        menyanyiCheckBox.setText("Menyanyi");

        jLabel4.setText("Umur :");

        berenangCheckBox.setText("Berenang");

        simpanButton.setBackground(new java.awt.Color(204, 204, 204));
        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        umurSpinner.setModel(new javax.swing.SpinnerNumberModel(15, 10, 60, 1));

        jLabel5.setText("Alamat :");

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        jScrollPane1.setViewportView(alamatTextArea);

        jLabel6.setText("Provinsi : ");

        provinsiComboBox.setBackground(java.awt.SystemColor.controlHighlight);
        provinsiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "DKI Jakarta", "Jawa Timur", "Bali", "Maluku", "Papua", "Sulawesi Tenggara" }));
        provinsiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinsiComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("NIM :");

        jLabel2.setText("Nama :");

        jLabel3.setText("Jenis Kelamin :");

        jLabel7.setText("Hobi :");

        lakiRadioButton.setText("Laki-Laki");
        lakiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiRadioButtonActionPerformed(evt);
            }
        });

        membacaCheckBox.setText("Membaca");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(50, 50, 50)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(simpanButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(perempuanRadioButton)
                                    .addComponent(lakiRadioButton)
                                    .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(membacaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menyanyiCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(berenangCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 389, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(lakiRadioButton))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(perempuanRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(provinsiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(membacaCheckBox))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(menyanyiCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(berenangCheckBox)
                    .addGap(18, 18, 18)
                    .addComponent(simpanButton)
                    .addContainerGap()))
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(mahasiswaTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        add(jPanel2, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void perempuanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perempuanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perempuanRadioButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNim(nimTextField.getText());
        mhs.setNama(namaTextField.getText());
        if(lakiRadioButton.isSelected()){
            mhs.setJenisKelamin("Laki-laki");
        }
        if(perempuanRadioButton.isSelected()){
            mhs.setJenisKelamin("Perempuan");
        }
        int umur = (Integer) umurSpinner.getValue();
        mhs.setUmur(umur);
        mhs.setAlamat(alamatTextArea.getText());
        mhs.setProvinsi(provinsiComboBox.getSelectedItem().toString());
        ArrayList<String> hobiList = new ArrayList<>();
        if(membacaCheckBox.isSelected()){
            hobiList.add("membaca");
        }
        if(menyanyiCheckBox.isSelected()){
            hobiList.add("menyanyi");
        }
        if(berenangCheckBox.isSelected()){
            hobiList.add("berenang");
        }

        Database.getInstance().insertMahasiswa(mhs);
        clearForm();
        JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
        loadTableData();
    }//GEN-LAST:event_simpanButtonActionPerformed
    
    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel)mahasiswaTable.getModel();
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        //isi tabel
        for(Mahasiswa mhs:Database.getInstance().getListMahasiswa()){
            dtm.addRow(new Object[]{mhs.getNim(),mhs.getNama(),mhs.getJenisKelamin(),mhs.getUmur()});
        } 
    }
    
    private void clearForm(){
        nimTextField.setText("");
        namaTextField.setText("");
        //buttonGroup1.clearSelection();
        umurSpinner.setValue(15);
        alamatTextArea.setText("");
        provinsiComboBox.setSelectedIndex(-1);
        membacaCheckBox.setSelected(false);
        menyanyiCheckBox.setSelected(false);
        berenangCheckBox.setSelected(false);
    }

    
    private void provinsiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinsiComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinsiComboBoxActionPerformed

    private void lakiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JCheckBox berenangCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton lakiRadioButton;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JCheckBox membacaCheckBox;
    private javax.swing.JCheckBox menyanyiCheckBox;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JComboBox<String> provinsiComboBox;
    private javax.swing.JButton simpanButton;
    private javax.swing.JSpinner umurSpinner;
    // End of variables declaration//GEN-END:variables
}
