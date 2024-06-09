/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uashafidzsabri;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Hafidz
 */
public class koneksi {
    public static Connection fungsiKoneksi() throws SQLException{
        Connection con = null;
        String driver = "com.mysql.jdbc.Driver";                        
        String url = "jdbc:mysql://localhost:3306/dataparkir" ;      
        String user = "root";
        String pass = "";
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi Tidak Berhasil");
            
        }
        return con;
    }
}
