/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLExeption;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fragata
 */
public class Conexion {
    
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/lacolonia;"
    private connection conexion;´
            
    
    
public conexion() {
    crearconexion();
}
    

public connection crearConexion() {
    
    
    try {
        Class.forName(Driver);
        conexion = DriverManager:getconnection(URL,USER,PASSWORD)
    }
}