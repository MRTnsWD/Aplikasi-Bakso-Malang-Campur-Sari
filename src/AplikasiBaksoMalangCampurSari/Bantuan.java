/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiBaksoMalangCampurSari;

/**
 *
 * @author LENOVO
 */
public class Bantuan extends javax.swing.JFrame {

    /**
     * Creates new form Bantuan
     */
    public Bantuan() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setText("Bakso Malang Campur Sari");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Main Menu", "Barang", "Aset", "Karyawan", "Tentang" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Selamat datang di menu Bantuan\n\njika ada yang error atau yang\nlain hubungi kontak yang tertera pada\n\"Tentang Aplikasi\"\nklik menu di kiri untuk melihat \nbantuan lengkap\nTerima Kasih\n\n");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addContainerGap())
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
String pilih;
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
        pilih=jList1.getSelectedValue();
        switch(pilih){
            case "Main Menu" : jTextArea1.setText("Main Menu ini Adalah Gerbang Utama untuk Ke menu - menu lainnya yang hendak di akses\n"
                    + "1. Click pada tombol yang ada untuk menuju ke halaman yang di tuju\n"
                    + "2. tekan sesuai dengan tulisan di tombol misal:kalau menekan tombol karyawan maka form karyawan akan muncul");break;
            case "Barang" : jTextArea1.setText("Pada Menu Barang ini, Barang yang di masukan adalah barang mentah untuk membuat Bakso\n"
                    + "1. jika ingin menambah data pastikan semua data yang di perlukan di isi\n"
                    + "2. jika ingin menambah data pastikan id barang tidak sama dengan kode yang sudah ada pada tabel\n"
                    + "3. jika ingin mengganti data tekan ubah dan pastikan kode sama dengan kode yang ada di tabel\n"
                    + "4. jika ingin menghapus data pastikan juga data sudah di tekan dan kode sama dengan data yang ingin di hapus\n"
                    + "5. jika tidak ada data yang di tampilkan tekan tombol refresh\n"
                    + "6. Untuk Tombol Pemasukan Barang untuk memasukan stock yang telah di daftarkan terlebih dahulu\n"
                    + "7. Untuk Tombol Pengambilan Barang untuk mengurangi stock yang telah di daftarkan terlebih dahulu\n dan "
                    + "6. jika ingin menghapus semua data yang ada di text tekan bersihkan");break;
            case "Aset" : jTextArea1.setText("Pada Menu Aset ini, Barang yang di masukan adalah barang inventaris\n"
                    + "1. jika ingin menambah data pastikan semua data yang di perlukan di isi\n"
                    + "2. jika ingin menambah data pastikan id aset tidak sama dengan kode yang sudah ada pada tabel\n"
                    + "3. jika ingin mengganti data tekan ubah dan pastikan kode sama dengan kode yang ada di tabel\n"
                    + "4. jika ingin menghapus data pastikan juga data sudah di tekan dan kode sama dengan data yang ingin di hapus\n"
                    + "5. jika tidak ada data yang di tampilkan tekan tombol refresh\n"
                    + "6. jika ingin menghapus semua data yang ada di text tekan bersihkan\n");break;
            case "Karyawan" : jTextArea1.setText("Pada Menu Karyawan ini, Menyimpan data semua Karyawan yang di pekerjakan\n"
                    + "1. jika ingin menambah data pastikan semua data yang di perlukan di isi\n"
                    + "2. jika ingin menambah data pastikan id barang dan aset tidak sama dengan kode yang sudah ada pada tabel\n"
                    + "3. jika ingin mengganti data tekan ubah dan pastikan kode sama dengan kode yang ada di tabel\n"
                    + "4. jika ingin menghapus data pastikan juga data sudah di tekan dan kode sama dengan data yang ingin di hapus\n"
                    + "5. jika tidak ada data yang di tampilkan tekan tombol refresh\n"
                    + "6. jika ingin menghapus semua data yang ada di text tekan bersihkan\n");break;
            case "Keuangan" : jTextArea1.setText("Pada Menu ini, selain untuk memasukan data harian menu ini juga dapat mencetak data barang, aset, dan pengeluaran dan pemasukan bulanan\n"
                    + "1. jika ingin menambah data harian tekan (+) pada form dan pastikan tanggal dan data pemasukan harian telah terisi\n");break;
            case "Tentang" : jTextArea1.setText("Pada Menu ini, berisi tentang siapa saja yang membuat aplikasi ini");break;
        }
    }//GEN-LAST:event_jList1MouseClicked

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
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bantuan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bantuan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}