/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ashley Mendoza V
 */
public class Conexion {
    
    private String db = "FitAdminDB";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "fitadmindb";
    private String password = "fitadmindb";
    private String driver = "com.mysql.cj.jdbc.Driver";

    private Connection conn;
    private static Conexion connector;

    public static Conexion DB() {
        if (connector == null) {
            connector = new Conexion();
        }
        return connector;
    }

    public Connection connect() {
        return this.conn;
    }

    private Conexion() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url + db, user, password);
            System.out.println("DATABASE CONNECTED");
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("DATABASE DES-CONNECTED");
            System.out.println("Message: " + ex.getMessage());
        }
    }

    public void disconnect() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Message: " + ex.getMessage());
        }
    }
}
