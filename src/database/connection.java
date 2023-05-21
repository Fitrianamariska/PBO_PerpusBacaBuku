/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author diazam
 */
public class connection {
    static Connection mysqlconfig;
    static Statement mysqlstm;
    public Connection configDB() {
        try {
            String url = "jdbc:mysql://localhost:3306/pbo";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
            mysqlstm = mysqlconfig.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi GAGAL!\n"+e);
        }
        return mysqlconfig;
    }
    
}
