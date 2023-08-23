/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectorDB;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ashley Mendoza V
 */
public class Connector {
    
    private String db = "FitAdminDB";
    private String url = "jdbc:mysql://localhost:3306/";
    private String user = "fitadmindb";
    private String password = "fitadmindb";
    private String driver = "com.mysql.cj.jdbc.Driver";

    private Connection conn;
    private static Connector connector;

    public static Connector DB() {
        if (connector == null) {
            connector = new Connector();
        }
        return connector;
    }

    public Connection connect() {
        return this.conn;
    }

    private Connector() {
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
