package Clases;


import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel-Reyes
 */
public class LoginFunc {

    private static String logName;

    public void setLogName(String lg) {
        logName = lg;
    }

    public String getLogName() {
        return logName;
    }

    public boolean checkLogin(String name, String password) {
        Connection con = new Conexion().getConnection();
        String sql = "SELECT * FROM usuarios WHERE Nombre_usuario = ? AND Contrasena =? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);

            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Credenciales correctas!");

                setLogName(name);
                return true;

            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrectos!");
                System.out.println("Datos incorrectos" + name + " " + password);
                return false;

            }

        } catch (SQLException ex) {
            System.out.println("sql exception in submit btn :" + ex);
            // Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HeadlessException ez) {
            System.out.println("Error :" + ez);
        }

        return false;
    }
}
