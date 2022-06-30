/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiBaksoMalangCampurSari;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Karyawan extends javax.swing.JFrame {
    private Connection Hub1 = new AplikasiBaksoMalangCampurSari().getData();
    private DefaultTableModel tabelmode;

    /**
     * Creates new form Karyawan
     */
    public Karyawan() {
        initComponents();
        
        tabelmode = new DefaultTableModel();

        jTable1.setModel(tabelmode);

        tabelmode.addColumn("ID");
        tabelmode.addColumn("Nama");
        tabelmode.addColumn("Alamat");
        tabelmode.addColumn("No. TLP");
        tabelmode.addColumn("Tanggal Masuk");
        tabelmode.addColumn("Tanggal Lahir");

        this.datatable();
        Tanggalan();
        UP();
    }
    public void UP(){
    try{
        String sql = "SELECT * FROM Karyawan ORDER by id desc";
        Statement stat = Hub1.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        if (hasil.next()) {
            String ID = hasil.getString("id").substring(1);
            String angka = "" + (Integer.parseInt(ID) + 1);
            String kosong = "";
            KK.setText("K" + kosong + angka);
            } else {
            KK.setText("K1");
            }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    }
    public void Angka(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null, "masukan angka saja!", "peringatan", JOptionPane.WARNING_MESSAGE);
       }
   }
    public void Huruf(KeyEvent a){
       if(Character.isDigit(a.getKeyChar())){
           a.consume();
           JOptionPane.showMessageDialog(null, "masukan huruf saja!", "peringatan", JOptionPane.WARNING_MESSAGE);
       }
   }
        void Tanggalan(){
        TMasuk.setDate(new java.util.Date());
        }
    public void Hapus(){
    KK.setText("");
    txtNama.setText("");
    txtTLP.setText("");
    txtAlamat.setText("");
    jTextField2.setText("");
    Tanggalan();
    TLahir.setCalendar(null);
}
    public void datatable(){
        tabelmode.getDataVector().removeAllElements();
        tabelmode.fireTableDataChanged();

        try {
            Statement s = Hub1.createStatement();
            String sql = "SELECT * FROM karyawan ORDER BY id DESC";
            Statement stat = Hub1.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            while (hasil.next()) {
                Object[] o = new Object[6];
                o[0] = hasil.getString(1);
                o[1] = hasil.getString(2);
                o[2] = hasil.getString(3);
                o[3] = hasil.getString(4);
                o[4] = hasil.getString(5);
                o[5] = hasil.getString(6);
                
                tabelmode.addRow(o);
            }
            hasil.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
}
    private void refresh(){
DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
try{
  Statement stat = Hub1.createStatement();
    String sql="SELECT * FROM karyawan ORDER BY id DESC;";
    ResultSet hasil = stat.executeQuery(sql);
    while(hasil.next()){
      tabelmode.addRow(new Object[]{hasil.getString(1), hasil.getString(2), hasil.getString(3), hasil.getString(4), hasil.getString(5), hasil.getString(6)
});
    }
}catch(Exception e){
    System.out.print(e);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        txtTLP = new javax.swing.JTextField();
        TMasuk = new com.toedter.calendar.JDateChooser();
        TLahir = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        KK = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setText("Data Karyawan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jButton1.setText("Cari");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        jLabel2.setText("Nama Karyawan");

        jLabel3.setText("No. TELP");

        jLabel4.setText("Alamat");

        jLabel5.setText("Tanggal Masuk");

        jLabel6.setText("Tanggal Lahir");

        txtTLP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTLPKeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setText("+");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Ubah");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Bersihkan");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setText("-");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jLabel8.setText("Kode Karyawan");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/refresh-icon-clipart-transparent-3.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTLP, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jButton4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TLahir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                        .addComponent(TMasuk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(KK, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(KK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTLP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(TLahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        if(txtNama.getText().equals("") ||txtTLP.getText().equals("") || txtAlamat.getText().equals("")|| TMasuk.getDate() == null||TLahir.getDate() == null){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String tampilan ="yyyy-MM-dd" ;
            SimpleDateFormat fm = new SimpleDateFormat(tampilan); 
            String date = String.valueOf(fm.format(TMasuk.getDate()));
            String date1 = String.valueOf(fm.format(TLahir.getDate()));

            String sql = "INSERT INTO karyawan value (?,?,?,?,?,?)";
            try{
                PreparedStatement stat = Hub1.prepareStatement(sql);

                stat.setString(1, KK.getText());
                stat.setString(2, txtNama.getText());
                stat.setString(3, txtAlamat.getText());
                stat.setString(4, txtTLP.getText());
                stat.setString(5, date);
                stat.setString(6, date1);

                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Tersimpan");
                Hapus();
                KK.requestFocus();
            }catch (SQLException e){
                JOptionPane.showMessageDialog(null, "Data Gagal Disimpan"+e);
            }datatable();
            UP();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
while(model.getRowCount()>0){
    model.setRowCount(0);
}
refresh();
UP();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
Hapus();
UP();// TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        if(txtNama.getText().equals("") ||txtTLP.getText().equals("") || txtAlamat.getText().equals("")|| TMasuk.getDate() == null||TLahir.getDate() == null){
            JOptionPane.showMessageDialog(null, "LENGKAPI DATA !", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
        String tampilan ="yyyy-MM-dd" ; 
SimpleDateFormat fm = new SimpleDateFormat(tampilan);
String date = String.valueOf(fm.format(TMasuk.getDate()));
String date1 = String.valueOf(fm.format(TLahir.getDate()));
String sql = "UPDATE karyawan SET id=?,namakaryawan=?,alamat=?,noTelp=?,Masuk=?,Lahir=? WHERE id='"+KK.getText()+"'";
try{
PreparedStatement stat = Hub1.prepareStatement(sql);

stat.setString(1, KK.getText());
stat.setString(2, txtNama.getText());
stat.setString(3, txtAlamat.getText());
stat.setString(4, txtTLP.getText());
stat.setString(5, date);
stat.setString(6, date1);

stat.executeUpdate();
JOptionPane.showMessageDialog(null, "Data Terupdate");
Hapus();
KK.requestFocus();
}
catch (SQLException e){
JOptionPane.showMessageDialog(null, "Data Gagal Diupdate"+e);
}
datatable();
UP();}// TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
try{
    int bar = jTable1.getSelectedRow();
    String kk = tabelmode.getValueAt(bar, 0).toString();
    String name = tabelmode.getValueAt(bar, 1).toString();
    String alamat = tabelmode.getValueAt(bar, 2).toString();
    String NP = tabelmode.getValueAt(bar, 3).toString();
    String tanggal = tabelmode.getValueAt(bar, 4).toString();
    String tanggal1 = tabelmode.getValueAt(bar, 5).toString();
    
    KK.setText(kk);
    txtNama.setText(name);
    txtAlamat.setText(alamat);
    txtTLP.setText(NP);
        
        
            String tampilan ="yyyy-MM-dd" ;
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            java.util.Date z=fm.parse(tanggal);
            java.util.Date zz=fm.parse(tanggal1);
            TMasuk.setDate(z);
            TLahir.setDate(zz);
    }   catch (ParseException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }
;
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        tabelmode.getDataVector().removeAllElements();
        tabelmode.fireTableDataChanged();
        String caridata = jTextField2.getText();

        try {
            Statement s = Hub1.createStatement();
            String sql = "SELECT * FROM karyawan WHERE id LIKE '%"+caridata+"%' OR NamaKaryawan LIKE '%"+caridata+"%' OR alamat LIKE '%"+caridata+"%' ORDER BY id DESC";
            Statement stat = Hub1.createStatement();
            ResultSet hasil = stat.executeQuery(sql);

            while (hasil.next()) {
                Object[] o = new Object[6];
                o[0] = hasil.getString(1);
                o[1] = hasil.getString(2);
                o[2] = hasil.getString(3);
                o[3] = hasil.getString(4);
                o[4] = hasil.getString(5);
                o[5] = hasil.getString(6);
                
                tabelmode.addRow(o);
            }
            hasil.close();
            s.close();
        } catch (SQLException e) {
            System.out.println("Terjadi Error");
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtTLPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTLPKeyTyped
        // TODO add your handling code here:
        Angka(evt);
    }//GEN-LAST:event_txtTLPKeyTyped

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        // TODO add your handling code here:
        Huruf(evt);
    }//GEN-LAST:event_txtNamaKeyTyped

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
int hapus = JOptionPane.showConfirmDialog(null,"Yakin Untuk Menghapus?","Dialog Konfirmasi",JOptionPane.YES_NO_OPTION);
if (hapus==0){
String sql = "DELETE FROM karyawan WHERE id='"+KK.getText()+"'";
try{
PreparedStatement stat = Hub1.prepareStatement(sql);
stat.executeUpdate();
JOptionPane.showMessageDialog(null, "Data Terhapus");
Hapus();
UP();
KK.requestFocus();
}catch(SQLException e){
JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+e);
}datatable();
}
    }//GEN-LAST:event_jButton6MouseClicked

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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Karyawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField KK;
    private com.toedter.calendar.JDateChooser TLahir;
    private com.toedter.calendar.JDateChooser TMasuk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTLP;
    // End of variables declaration//GEN-END:variables

}
