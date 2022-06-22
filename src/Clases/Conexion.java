
package Clases;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel-Reyes
 */
public class Conexion {
    
    private static String Driver ="com.mysql.jdbc.Driver";
    private static String Usuario ="root";
    private static String Password ="JazzBass93**";
    private static String Url  = "jdbc:mysql://localhost:3306/gymdb?autoreconnect=true&useSSL=false";
    
    static {
        try {
            Class.forName(Driver);
        } catch (ClassNotFoundException e) {
            System.err.print("Error en el Driver!");
            JOptionPane.showMessageDialog(null, "Error en el Driver!"+ e);
        }
    }
    
    public Connection getConnection(){
        Connection cn = null;
        try {
            cn = DriverManager.getConnection(Url,Usuario,Password);
            System.out.println("Conexion Exitosa!");
            //JOptionPane.showMessageDialog(null, "Conexion Exitosa!");
        } catch (HeadlessException | SQLException e) {
            System.err.println("Error de Conexion!");
            JOptionPane.showMessageDialog(null, "Error de Conexion!"+e);
            System.exit(0);
        }  
        return cn;
    }

}
