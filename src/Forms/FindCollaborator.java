
package Forms;

import Clases.Conexion;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel-Reyes
 */
public class FindCollaborator extends javax.swing.JFrame {
    
    Conexion cn = new Conexion();
    Connection con = cn.getConnection();
  
    public FindCollaborator() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarTabla();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbColaboradores = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.lightGray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(jLabel1.getFont().deriveFont((float)22));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnExit.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 26, 34));

        jLabel2.setBackground(new java.awt.Color(102, 142, 222));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Buscar Colaboradores");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 885, 10));

        tbColaboradores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbColaboradores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbColaboradores.setShowGrid(true);
        jScrollPane1.setViewportView(tbColaboradores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 910, 340));

        jLabel3.setFont(jLabel3.getFont().deriveFont((float)16));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ingrese el DNI a buscar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 180, 30));

        txtBuscar.setFont(txtBuscar.getFont().deriveFont((float)16));
        txtBuscar.setForeground(new java.awt.Color(0, 0, 0));
        txtBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 390, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
      cargarTabla();
    }//GEN-LAST:event_txtBuscarKeyReleased

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FindCollaborator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindCollaborator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindCollaborator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindCollaborator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindCollaborator().setVisible(true);
            }
        });
    }
    
    void cargarTabla(){
        String campo = txtBuscar.getText();
        String where="";
        
        if(!"".equals(campo)){
             where = "WHERE Dni ='"+campo+"'";
        }
        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            tbColaboradores.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
                       
            String SQL = "SELECT Id, Dni, Nombres, Apellidos,Telefono, Edad, Direccion, Genero, Area, Depto, "
                    + "fecha_ingreso, Salario, Observaciones FROM colaboradores "
                    + where;
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID");
            modelo.addColumn("DNI");
            modelo.addColumn("Nombres");
            modelo.addColumn("Apellidos");
            modelo.addColumn("Telefono");
            modelo.addColumn("Edad");
            modelo.addColumn("Dirección");
            modelo.addColumn("Genero");
            modelo.addColumn("Area");
            modelo.addColumn("Depto");
            modelo.addColumn("Fecha Ingreso");
            modelo.addColumn("Salario");
            modelo.addColumn("Observaciones");
            
            int[] anchos = {5, 15, 50, 50, 20, 10, 50, 10, 10, 15, 15, 15, 50};
            for (int i = 0; i < tbColaboradores.getColumnCount(); i++) {
                tbColaboradores.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
            }
            
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbColaboradores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
