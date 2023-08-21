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
     public static void main(String[] args) {
        // Configuración de la conexión
        String jdbcUrl = "jdbc:mysql://localhost:3306/fitadmindb";
        String username = " ";
        String password = " ";
        
        // Objeto Connection para manejar la conexión
        Connection connection = null;
        
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.jdbc.Driver");
            
            // Establecer la conexión
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            
            System.out.println("Conexión exitosa a la base de datos.");
            
            // Realiza aquí las operaciones en la base de datos
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar la conexión en el bloque finally
            if (connection != null) {
                try {
                    connection.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
