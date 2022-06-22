
package Forms;

import Clases.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Daniel-Reyes
 */
public class AddUser extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn = con.getConnection();
    Statement sta;
    ResultSet rs;
    
    public AddUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        desabilitarForm();
        cargarDatos();
        txtId.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLatest = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.gray));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel1MouseMoved(evt);
            }
        });
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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 26, 34));

        jLabel2.setBackground(new java.awt.Color(102, 142, 222));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Nuevo Usuario");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 800, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 52, 720, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombres:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 71, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Registro:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("ID:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 71, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Estado:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 71, 20));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 149, 20));

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 276, 20));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 276, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Apellidos:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 71, 20));

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 276, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuario:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 71, 20));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 276, 20));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Contraseña:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, 20));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(0, 0, 0));
        txtPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 276, 20));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("* Todos los campos son obligatorios.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 220, -1));

        jLabel12.setFont(jLabel12.getFont().deriveFont((float)16));
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel13.setFont(jLabel13.getFont().deriveFont((float)16));
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("*");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel14.setFont(jLabel14.getFont().deriveFont((float)16));
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jLabel15.setFont(jLabel15.getFont().deriveFont((float)16));
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, -1, -1));

        jLabel16.setFont(jLabel16.getFont().deriveFont((float)16));
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        jLabel17.setFont(jLabel17.getFont().deriveFont((float)16));
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        cmbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cmbEstado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Activo", "Inactivo" }));
        jPanel2.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 150, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 460, 350));

        btnSave.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnSave.png"))); // NOI18N
        btnSave.setText("Guardar");
        btnSave.setContentAreaFilled(false);
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnSaveMouseMoved(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 80, 70));

        btnNew.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnNew.setForeground(new java.awt.Color(0, 0, 0));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNew.png"))); // NOI18N
        btnNew.setText("Nuevo");
        btnNew.setContentAreaFilled(false);
        btnNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNewMouseMoved(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 80, 70));

        btnUpdate.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnUpdate.png"))); // NOI18N
        btnUpdate.setText("Modificar");
        btnUpdate.setContentAreaFilled(false);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUpdate.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnUpdateMouseMoved(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, 70));

        btnDelete.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 0, 0));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnDelete.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.setContentAreaFilled(false);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnDeleteMouseMoved(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 80, 70));

        btnCancel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnCancel.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCancelMouseMoved(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 80, 70));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SmartGym_Logo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 280, 340));

        btnUpdate1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(0, 0, 0));
        btnUpdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnUpdate.png"))); // NOI18N
        btnUpdate1.setText("Actualizar");
        btnUpdate1.setContentAreaFilled(false);
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUpdate1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnUpdate1MouseMoved(evt);
            }
        });
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, 70));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnFirst.png"))); // NOI18N
        btnFirst.setContentAreaFilled(false);
        btnFirst.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnFirstMouseMoved(evt);
            }
        });
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 40, 30));

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnBefore.png"))); // NOI18N
        btnPrevious.setContentAreaFilled(false);
        btnPrevious.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnPreviousMouseMoved(evt);
            }
        });
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 40, 30));

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNext.png"))); // NOI18N
        btnNext.setContentAreaFilled(false);
        btnNext.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNext.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnNextMouseMoved(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 40, 30));

        btnLatest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnLatest.png"))); // NOI18N
        btnLatest.setContentAreaFilled(false);
        btnLatest.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnLatestMouseMoved(evt);
            }
        });
        btnLatest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLatestActionPerformed(evt);
            }
        });
        jPanel1.add(btnLatest, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnSaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseMoved
        this.btnSave.setContentAreaFilled(true);
    }//GEN-LAST:event_btnSaveMouseMoved

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO usuarios (Estado,Nombres,Apellidos,Nombre_usuario,Contrasena,Fecha_registro)"
                    + "VALUES(?,?,?,?,?,?)");
            ps.setString(1, cmbEstado.getSelectedItem().toString());
            ps.setString(2, txtNombres.getText());
            ps.setString(3, txtApellidos.getText());
            ps.setString(4, txtUser.getText());
            ps.setString(5, txtPass.getText());          
            ps.setString(6, txtFecha.getText());

            ps.executeUpdate();
            limpiarForm();
            desabilitarForm();
            btnUpdate.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Registro guardado con exito!");
        } catch (SQLException e) {
            System.err.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error al guardar!", "Error", JOptionPane.ERROR_MESSAGE);
    }                   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseMoved
        this.btnNew.setContentAreaFilled(true);
    }//GEN-LAST:event_btnNewMouseMoved

    private void btnUpdateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseMoved
        this.btnUpdate.setContentAreaFilled(true);
    }//GEN-LAST:event_btnUpdateMouseMoved

    private void btnDeleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseMoved
        this.btnDelete.setContentAreaFilled(true);
    }//GEN-LAST:event_btnDeleteMouseMoved

    private void btnCancelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseMoved
        this.btnCancel.setContentAreaFilled(true);
    }//GEN-LAST:event_btnCancelMouseMoved

    private void jPanel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseMoved
        this.btnCancel.setContentAreaFilled(false);
        this.btnNew.setContentAreaFilled(false);
        this.btnSave.setContentAreaFilled(false);
        this.btnUpdate.setContentAreaFilled(false);
        this.btnDelete.setContentAreaFilled(false);
        this.btnFirst.setContentAreaFilled(false);
        this.btnLatest.setContentAreaFilled(false);
        this.btnPrevious.setContentAreaFilled(false);
        this.btnNext.setContentAreaFilled(false);
        this.btnUpdate1.setContentAreaFilled(false);
    }//GEN-LAST:event_jPanel1MouseMoved

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        habilitarForm();
        limpiarForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdate1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MouseMoved
        this.btnUpdate1.setContentAreaFilled(true);
    }//GEN-LAST:event_btnUpdate1MouseMoved

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        //btnSave.setEnabled(false);
        String id = txtId.getText();
        String est = cmbEstado.getSelectedItem().toString();
        String nomb = txtNombres.getText();
        String ape = txtApellidos.getText();
        String user = txtUser.getText();
        String pass = txtPass.getText();
        String fecha = txtFecha.getText();


        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE usuarios SET Estado='" + est + "',Nombres='" + nomb + "',"
                + "Apellidos='" + ape + "',Nombre_usuario='" + user + "',Contrasena='" + pass + "',Fecha_registro='" + fecha + "' WHERE Id='" + id + "'");
            int respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Los datos fueron actualizados!");
                desabilitarForm();
                ps.executeUpdate();
                btnUpdate.setVisible(true);
                btnUpdate1.setVisible(false);
                btnNew.setEnabled(true);
                btnUpdate.setEnabled(true);
            } else {
                JOptionPane.showConfirmDialog(null, "Registro no actualizado", "Error de Actualización", JOptionPane.ERROR_MESSAGE);
                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar" + e);
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Actualiza el registro seleccionado
        btnUpdate1.setVisible(true);
        //btnUpdate1.setEnabled(true);
        btnUpdate.setVisible(false);
        habilitarForm();
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //Elimina el registro
        try {
            String id = txtId.getText();
            JOptionPane.showMessageDialog(null, "Estas seguro(a) que deseas borrar el registro?");

            PreparedStatement ps = cn.prepareStatement("DELETE FROM usuarios WHERE Id='" + id + "'");

            int respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                limpiarForm();
                desabilitarForm();
                JOptionPane.showMessageDialog(null, "Registro Eliminado!");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar" + e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnFirstMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseMoved
        this.btnFirst.setContentAreaFilled(true);
    }//GEN-LAST:event_btnFirstMouseMoved

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            rs.first();
            llenarCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPreviousMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreviousMouseMoved
        this.btnPrevious.setContentAreaFilled(true);
    }//GEN-LAST:event_btnPreviousMouseMoved

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        try {
            if (rs.isFirst() == false) {
                rs.previous();
                llenarCampos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseMoved
        this.btnNext.setContentAreaFilled(true);
    }//GEN-LAST:event_btnNextMouseMoved

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try {
            if (rs.isLast() == false) {
                rs.next();
                llenarCampos();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLatestMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLatestMouseMoved
        this.btnLatest.setContentAreaFilled(true);
    }//GEN-LAST:event_btnLatestMouseMoved

    private void btnLatestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLatestActionPerformed
        try {
            rs.last();
            llenarCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnLatestActionPerformed

 
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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

        public void desabilitarForm() {
        cmbEstado.setEnabled(false);
        txtNombres.setEnabled(false);
        txtApellidos.setEnabled(false);
        txtUser.setEnabled(false);
        txtPass.setEnabled(false);
        txtFecha.setEnabled(false);

        btnSave.setEnabled(false);
        //btnUpdate.setEnabled(false);
        //btnDelete.setEnabled(false);
        //btnCancel.setEnabled(false);
        btnUpdate1.setVisible(false);
    }

    public void habilitarForm() {
        cmbEstado.setEnabled(true);
        txtNombres.setEnabled(true);
        txtApellidos.setEnabled(true);
        txtUser.setEnabled(true);
        txtPass.setEnabled(true);
        txtFecha.setEnabled(true);
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnCancel.setEnabled(true);
        btnNew.setEnabled(false);
    }

    public void limpiarForm() {
        txtId.setText("");
        cmbEstado.setSelectedItem("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtUser.setText("");
        txtPass.setText("");
        txtFecha.setText("");
        cmbEstado.requestFocus();
    }

    public void cargarDatos() {
        String SQL = "SELECT * FROM usuarios";
        try {
            sta = cn.createStatement();
            rs = sta.executeQuery(SQL);
            rs.first();
            llenarCampos();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public void llenarCampos() {
        try {
            txtId.setText(rs.getString(1));
            cmbEstado.setSelectedItem(rs.getString(2));
            txtNombres.setText(rs.getString(3));
            txtApellidos.setText(rs.getString(4));
            txtUser.setText(rs.getString(5));
            txtPass.setText(rs.getString(6));
            txtFecha.setText(rs.getString(7));
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLatest;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
