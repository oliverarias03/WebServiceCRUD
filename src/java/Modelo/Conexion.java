/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class Conexion {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "Makeitcount1@";
    private static final String url = "jdbc:mysql://localhost:3306/universidad?autoReconnect=true&useSSL=false";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn =  DriverManager.getConnection(url,user,password);
            if(conn != null){
                System.out.println("Conexion Establecida...");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("error " + e);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
}
