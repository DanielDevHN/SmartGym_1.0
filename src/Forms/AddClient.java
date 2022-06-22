package Forms;

import Clases.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel-Reyes
 */
public class AddClient extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.getConnection();
    Statement sta;
    ResultSet rs;

    public AddClient() {
        initComponents();
        this.setLocationRelativeTo(null);
        desabilitarForm();
        cargarDatos();

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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        txtEstatura = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtObservaciones = new javax.swing.JTextArea();
        cmbSuscripcion = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbGenero = new javax.swing.JComboBox<>();
        btnLatest = new javax.swing.JButton();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(946, 2, 26, 34));

        jLabel2.setBackground(new java.awt.Color(102, 142, 222));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Nuevo Cliente");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 980, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 52, 885, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombres:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 71, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellidos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 71, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 71, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("DNI:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 71, 20));

        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 149, 20));

        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 276, 20));

        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 276, 20));

        txtTel.setBackground(new java.awt.Color(255, 255, 255));
        txtTel.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTel.setForeground(new java.awt.Color(0, 0, 0));
        txtTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 148, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Edad:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 90, 20));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Dirección:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, 40));

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 151, 20));

        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDireccion.setRows(5);
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtDireccion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 279, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("ID:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 71, 20));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtId.setForeground(new java.awt.Color(0, 0, 0));
        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.setEnabled(false);
        jPanel2.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 149, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 430, 350));

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
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 80, 70));

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
        jPanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 80, 70));

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
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, 70));

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
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, 80, 70));

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
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 80, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos Generales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Peso:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 71, 20));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Estatura:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 71, 20));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha Ingreso:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, 20));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Genero:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 71, 20));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Observaciones:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 110, 40));

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(0, 0, 0));
        txtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 149, 20));

        txtEstatura.setBackground(new java.awt.Color(255, 255, 255));
        txtEstatura.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtEstatura.setForeground(new java.awt.Color(0, 0, 0));
        txtEstatura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtEstatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 149, 20));

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 20));

        txtObservaciones.setBackground(new java.awt.Color(255, 255, 255));
        txtObservaciones.setColumns(20);
        txtObservaciones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtObservaciones.setRows(5);
        txtObservaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(txtObservaciones);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 270, 110));

        cmbSuscripcion.setBackground(new java.awt.Color(255, 255, 255));
        cmbSuscripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbSuscripcion.setForeground(new java.awt.Color(0, 0, 0));
        cmbSuscripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "3 Meses", "6 Meses", "12 Meses", "" }));
        jPanel3.add(cmbSuscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 270, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("kg");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("m");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Suscripción:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 20));

        cmbGenero.setBackground(new java.awt.Color(255, 255, 255));
        cmbGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cmbGenero.setForeground(new java.awt.Color(0, 0, 0));
        cmbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Masculino", "Femenino" }));
        jPanel3.add(cmbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 270, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 430, 350));

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
        jPanel1.add(btnLatest, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 40, 30));

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
        jPanel1.add(btnFirst, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 40, 30));

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
        jPanel1.add(btnPrevious, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 40, 30));

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
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 40, 30));

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
        jPanel1.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, -1, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        //Guarda un nuevo registro en la BD
        /*String dni = txtDni.getText();
        String nomb = txtNombres.getText();
        String ape = txtApellidos.getText();
        String tel = txtTel.getText();
        String edad = txtEdad.getText();
        String direcc = txtDireccion.getText();
        String peso = txtPeso.getText();
        String esta = txtEstatura.getText();
        String fecha = txtFecha.getText();
        String suscri = cmbSuscripcion.getSelectedItem().toString();
        String genero = cmbGenero.getSelectedItem().toString();
        String observa = txtObservaciones.getText();*/
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO clientes (Dni,Nombres,Apellidos,Telefono,Edad,Direccion,Peso,"
                    + "Estatura,fecha_ingreso,Suscripcion,Genero,Observaciones) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, txtDni.getText());
            ps.setString(2, txtNombres.getText());
            ps.setString(3, txtApellidos.getText());
            ps.setString(4, txtTel.getText());
            ps.setString(5, txtEdad.getText());
            ps.setString(6, txtDireccion.getText());
            ps.setString(7, txtPeso.getText());
            ps.setString(8, txtEstatura.getText());
            ps.setString(9, txtFecha.getText());
            ps.setString(10, cmbSuscripcion.getSelectedItem().toString());
            ps.setString(11, cmbGenero.getSelectedItem().toString());
            ps.setString(12, txtObservaciones.getText());

            ps.executeUpdate();
            limpiarForm();
            desabilitarForm();
            btnUpdate.setEnabled(true);
            JOptionPane.showMessageDialog(null, "Registro guardado con exito!");
        } catch (SQLException e) {
            System.err.println("Error" + e);
            JOptionPane.showMessageDialog(null, "Error al guardar!", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed
    }
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

    private void btnNewMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseMoved
        this.btnNew.setContentAreaFilled(true);
    }//GEN-LAST:event_btnNewMouseMoved

    private void btnSaveMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseMoved
        this.btnSave.setContentAreaFilled(true);
    }//GEN-LAST:event_btnSaveMouseMoved

    private void btnUpdateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseMoved
        this.btnUpdate.setContentAreaFilled(true);
    }//GEN-LAST:event_btnUpdateMouseMoved


    private void btnDeleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseMoved
        this.btnDelete.setContentAreaFilled(true);
    }//GEN-LAST:event_btnDeleteMouseMoved

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        habilitarForm();
        limpiarForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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

            PreparedStatement ps = cn.prepareStatement("DELETE FROM clientes WHERE Id='" + id + "'");

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

    private void btnLatestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLatestActionPerformed
        try {
            rs.last();
            llenarCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_btnLatestActionPerformed

    private void btnFirstMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFirstMouseMoved
        this.btnFirst.setContentAreaFilled(true);
    }//GEN-LAST:event_btnFirstMouseMoved

    private void btnPreviousMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPreviousMouseMoved
        this.btnPrevious.setContentAreaFilled(true);
    }//GEN-LAST:event_btnPreviousMouseMoved

    private void btnNextMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseMoved
        this.btnNext.setContentAreaFilled(true);
    }//GEN-LAST:event_btnNextMouseMoved

    private void btnLatestMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLatestMouseMoved
        this.btnLatest.setContentAreaFilled(true);
    }//GEN-LAST:event_btnLatestMouseMoved

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        try {
            rs.first();
            llenarCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_btnFirstActionPerformed

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

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked

    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnUpdate1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MouseMoved
        this.btnUpdate1.setContentAreaFilled(true);
    }//GEN-LAST:event_btnUpdate1MouseMoved

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        //btnSave.setEnabled(false);
        String id = txtId.getText();
        String dni = txtDni.getText();
        String nomb = txtNombres.getText();
        String ape = txtApellidos.getText();
        String tel = txtTel.getText();
        String edad = txtEdad.getText();
        String direcc = txtDireccion.getText();
        String peso = txtPeso.getText();
        String esta = txtEstatura.getText();
        String fecha = txtFecha.getText();
        String suscri = cmbSuscripcion.getSelectedItem().toString();
        String genero = cmbGenero.getSelectedItem().toString();
        String observa = txtObservaciones.getText();

        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE clientes SET Dni='" + dni + "',Nombres='" + nomb + "',"
                    + "Apellidos='" + ape + "',Telefono='" + tel + "',Edad='" + edad + "',Direccion='" + direcc + "',Peso='" + peso + "'"
                    + ",Estatura='" + esta + "',fecha_ingreso='" + fecha + "',Suscripcion='" + suscri + "',Genero='" + genero + "'"
                    + ",Observaciones='" + observa + "' WHERE Id='" + id + "'");
            int respuesta = ps.executeUpdate();
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Los datos fueron actualizados!");
                desabilitarForm();
                ps.executeUpdate();
                btnUpdate.setVisible(true);
                btnUpdate1.setVisible(false);
                btnNew.setEnabled(true);
            } else {
                JOptionPane.showConfirmDialog(null, "Registro no actualizado", "Error de Actualización", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar" + e);
        }
    }//GEN-LAST:event_btnUpdate1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClient().setVisible(true);
            }
        });
    }

    public void desabilitarForm() {
        txtApellidos.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtDni.setEnabled(false);
        txtEdad.setEnabled(false);
        txtEstatura.setEnabled(false);
        txtFecha.setEnabled(false);
        txtNombres.setEnabled(false);
        txtObservaciones.setEnabled(false);
        txtPeso.setEnabled(false);
        txtTel.setEnabled(false);
        btnSave.setEnabled(false);
        //btnUpdate.setEnabled(false);
        //btnDelete.setEnabled(false);
        //btnCancel.setEnabled(false);
        cmbGenero.setEnabled(false);
        cmbSuscripcion.setEnabled(false);
        btnUpdate1.setVisible(false);
    }

    public void habilitarForm() {
        txtApellidos.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtDni.setEnabled(true);
        txtEdad.setEnabled(true);
        txtEstatura.setEnabled(true);
        txtFecha.setEnabled(true);
        txtNombres.setEnabled(true);
        txtObservaciones.setEnabled(true);
        txtPeso.setEnabled(true);
        txtTel.setEnabled(true);
        btnSave.setEnabled(true);
        //btnUpdate.setEnabled(true);
        //btnDelete.setEnabled(true);
        btnCancel.setEnabled(true);
        cmbGenero.setEnabled(true);
        cmbSuscripcion.setEnabled(true);
        btnNew.setEnabled(false);
        txtDni.requestFocus();
        btnUpdate.setEnabled(false);
    }

    public void limpiarForm() {
        txtId.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtDni.setText("");
        txtEdad.setText("");
        txtEstatura.setText("");
        txtFecha.setText("");
        txtNombres.setText("");
        txtObservaciones.setText("");
        txtPeso.setText("");
        txtTel.setText("");
        cmbGenero.setSelectedItem("");
        cmbSuscripcion.setSelectedItem("");
        txtDni.requestFocus();
    }

    public void cargarDatos() {
        String SQL = "SELECT * FROM clientes";
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
            txtDni.setText(rs.getString(2));
            txtNombres.setText(rs.getString(3));
            txtApellidos.setText(rs.getString(4));
            txtTel.setText(rs.getString(5));
            txtEdad.setText(rs.getString(6));
            txtDireccion.setText(rs.getString(7));
            txtPeso.setText(rs.getString(8));
            txtEstatura.setText(rs.getString(9));
            txtFecha.setText(rs.getString(10));
            cmbSuscripcion.setSelectedItem(rs.getString(11));
            cmbGenero.setSelectedItem(rs.getString(12));
            txtObservaciones.setText(rs.getString(13));
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
    private javax.swing.JComboBox<String> cmbGenero;
    private javax.swing.JComboBox<String> cmbSuscripcion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextArea txtObservaciones;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
