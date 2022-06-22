
package Forms;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Daniel-Reyes
 */
public class Home extends javax.swing.JFrame {

    ImagenFondo img = new ImagenFondo();
 
    public Home() {
       initComponents();
       this.setContentPane(img);
       setExtendedState(MAXIMIZED_BOTH);
       setTitle("SmartGym 1.0");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mClientes = new javax.swing.JMenu();
        mAddClient = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mAbout = new javax.swing.JMenuItem();
        mSoporte = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mCerrarSesion = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(6);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 590));

        jMenuBar1.setBorder(null);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N

        mClientes.setText("Clientes");

        mAddClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mAddClient.png"))); // NOI18N
        mAddClient.setText("Agregar Clientes");
        mAddClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAddClientActionPerformed(evt);
            }
        });
        mClientes.add(mAddClient);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mFindClient.png"))); // NOI18N
        jMenuItem4.setText(" Buscar Clientes");
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mClientes.add(jMenuItem4);

        jMenuBar1.add(mClientes);

        jMenu3.setText("Usuarios");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mAddUser.png"))); // NOI18N
        jMenuItem5.setText("Agregar Usuario");
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mFindUser.png"))); // NOI18N
        jMenuItem6.setText("Buscar Usuarios");
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Colaboradores");

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mAddCollaborator.png"))); // NOI18N
        jMenuItem9.setText("Agregar Colaborador");
        jMenuItem9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mFindClient.png"))); // NOI18N
        jMenuItem10.setText("Buscar Colaboradores");
        jMenuItem10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuBar1.add(jMenu6);

        jMenu4.setText("Ayuda");

        mAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mAbout.png"))); // NOI18N
        mAbout.setText("Acerca del Sistema");
        mAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAboutActionPerformed(evt);
            }
        });
        jMenu4.add(mAbout);

        mSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mSupport.png"))); // NOI18N
        mSoporte.setText("Soporte Tecnico");
        mSoporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mSoporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSoporteActionPerformed(evt);
            }
        });
        jMenu4.add(mSoporte);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");

        mCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mLogout.png"))); // NOI18N
        mCerrarSesion.setText("Cerrar Sesión");
        mCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mCerrarSesionActionPerformed(evt);
            }
        });
        jMenu5.add(mCerrarSesion);

        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mSalir.png"))); // NOI18N
        mSalir.setText("Salir del Sistema");
        mSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        jMenu5.add(mSalir);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAboutActionPerformed
        new About().setVisible(true);
    }//GEN-LAST:event_mAboutActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void mCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mCerrarSesionActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_mCerrarSesionActionPerformed

    private void mAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAddClientActionPerformed
        new AddClient().setVisible(true);
    }//GEN-LAST:event_mAddClientActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new FindClient().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new AddUser().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        new FindUsers().setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        new AddCollaborators().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        new FindCollaborator().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void mSoporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSoporteActionPerformed
       new Support().setVisible(true);
    }//GEN-LAST:event_mSoporteActionPerformed

  
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mAbout;
    private javax.swing.JMenuItem mAddClient;
    private javax.swing.JMenuItem mCerrarSesion;
    private javax.swing.JMenu mClientes;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenuItem mSoporte;
    // End of variables declaration//GEN-END:variables

    class ImagenFondo extends JPanel{
        private Image imagen;
        
        @Override
        public void paint (Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/SmartGym_Animation.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
