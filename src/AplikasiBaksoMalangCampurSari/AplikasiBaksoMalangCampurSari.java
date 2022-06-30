/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiBaksoMalangCampurSari;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class AplikasiBaksoMalangCampurSari {

    private static Connection Koneksi_db = null;
public static Connection getData(){
    MysqlDataSource db = new MysqlDataSource();
    db.setDatabaseName("aplikasibaso");
    db.setPassword("");
    db.setUser("root");
    try{
        Koneksi_db = db.getConnection();
        JOptionPane.showMessageDialog(null, "Berhasil Terkoneksi");
        }catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Maaf Anda Gagal Terkoneksi"+e.getMessage());
        } return Koneksi_db;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
