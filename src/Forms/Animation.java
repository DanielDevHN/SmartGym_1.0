package Forms;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniel-Reyes
 */
public final class Animation extends javax.swing.JFrame {

    public Animation() {
        initComponents();
        this.setLocationRelativeTo(null);
        Animar();
    }

    public void Animar() {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    try {
                        pgBar.setValue(i);
                        lblPorcentaje.setText(i + " %");

                        Thread.sleep(50);
                        if (i == 5) {
                            lblMensaje.setText("Conectando a la Base de Datos...");
                        } else {
                            if (i == 50) {
                                lblMensaje.setText("Cargando el sistema...");
                            } else {
                                if (i == 90) {
                                    lblMensaje.setText("Bienvenido(a) al sistema!");
                                }
                            }
                        }

                        if (i == 100) {
                            new Home().setVisible(true);
                            setVisible(false);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        hilo.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pgBar = new javax.swing.JProgressBar();
        lblPorcentaje = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pgBar.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(pgBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 440, 30));

        lblPorcentaje.setBackground(new java.awt.Color(0, 0, 0));
        lblPorcentaje.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblPorcentaje.setForeground(new java.awt.Color(0, 0, 0));
        lblPorcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPorcentaje.setText("0%");
        jPanel1.add(lblPorcentaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SmartGym_Animation.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 340, 330));

        lblMensaje.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(0, 0, 0));
        lblMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 440, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Animation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPorcentaje;
    private javax.swing.JProgressBar pgBar;
    // End of variables declaration//GEN-END:variables
}
