/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rakit
 */
public class databaseConnection {
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/todolist";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver((new com.mysql.cj.jdbc.Driver()));
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database not Connected");
            System.out.println("Failure to connecting database");
        }
        
        return MySQLConfig;
    }
}
