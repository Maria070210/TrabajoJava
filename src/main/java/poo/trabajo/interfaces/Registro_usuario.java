package poo.trabajo.interfaces;


import java.awt.Color;
import javax.swing.JOptionPane;
import poo.trabajo.Cliente_empresa;
import poo.trabajo.Cliente_particular;
import poo.trabajo.DatosClientes;
import poo.trabajo.Direccion;
import poo.trabajo.Tarjeta;
/**
 *
 * @author josed y maria
 */

public class Registro_usuario extends javax.swing.JFrame {
    int xMouse, yMouse;
    
    public Registro_usuario() {
        initComponents();
        this.setVisible(true);
        jComboBoxTipo.setSelectedIndex(0);
        jPanelCliente.setVisible(false);
        jPanelEmpresa.setVisible(false);
        jButtonRegistro.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelEmpresa = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldWeb = new javax.swing.JTextField();
        jFormattedTextFieldCif = new javax.swing.JFormattedTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jPanelCliente = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jTextFieldCalle = new javax.swing.JTextField();
        jFormattedTextFieldNumeroCasa = new javax.swing.JFormattedTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jFormattedTextFieldCodigopostal = new javax.swing.JFormattedTextField();
        jTextFieldTitular = new javax.swing.JTextField();
        jFormattedTextFieldNumeroTarjeta = new javax.swing.JFormattedTextField();
        jTextFieldFechaC = new javax.swing.JTextField();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jButtonRegistro = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Crear una cuenta de usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 320, 40));

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empresa", "Particular" }));
        jComboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel2.setText("Como deseas registrarte");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre: ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel4.setText("Correo: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("Clave: ");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setText("Telefono: ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jPanelEmpresa.setBackground(new java.awt.Color(255, 0, 0));
        jPanelEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("CIF: ");
        jPanelEmpresa.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel11.setText("Web: ");
        jPanelEmpresa.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
        jPanelEmpresa.add(jTextFieldWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 130, 30));

        try {
            jFormattedTextFieldCif.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldCif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCifActionPerformed(evt);
            }
        });
        jPanelEmpresa.add(jFormattedTextFieldCif, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 130, 30));

        jPanel3.add(jPanelEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 90));
        jPanel3.add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, 30));

        jPanelCliente.setBackground(new java.awt.Color(255, 0, 0));
        jPanelCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("DNI:");
        jPanelCliente.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 29, -1));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jPanelCliente.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 130, 30));

        jPanel3.add(jPanelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 190, 40));

        jLabel12.setText("Codigo Postal: ");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel13.setText("Calle:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel14.setText("Numero: ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, 20));

        jLabel15.setText("Ciudad: ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Datos Usuario");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, 280));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 10, 250));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Dirección");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Tarjeta");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jLabel17.setText("Titular:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, 20));

        jLabel18.setText("NumeroT:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, -1, -1));

        jLabel19.setText("Fecha Caducidad:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));
        jPanel3.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 130, 30));
        jPanel3.add(jTextFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 30));
        jPanel3.add(jTextFieldCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 120, 30));

        jFormattedTextFieldNumeroCasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldNumeroCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNumeroCasaActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextFieldNumeroCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 120, 30));
        jPanel3.add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 120, 30));

        jFormattedTextFieldCodigopostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jFormattedTextFieldCodigopostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCodigopostalActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextFieldCodigopostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 120, 30));
        jPanel3.add(jTextFieldTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 140, 30));

        jFormattedTextFieldNumeroTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("################"))));
        jFormattedTextFieldNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNumeroTarjetaActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextFieldNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 140, 30));
        jPanel3.add(jTextFieldFechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 140, 30));

        jFormattedTextFieldTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#########"))));
        jFormattedTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefonoActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 790, 350));

        jButtonRegistro.setText("Registrar");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, 210, 30));

        header.setBackground(new java.awt.Color(51, 51, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private String tipo;
        /**
         * 
         * Indentificamos que tipo de usuario es y mostramos el DNI o cif y web 
         */
    private void jComboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoActionPerformed
        tipo = (String) jComboBoxTipo.getSelectedItem();
        if (tipo.equals("Empresa")) {
            jPanelEmpresa.setVisible(true);
            jPanelCliente.setVisible(false);
            jButtonRegistro.setEnabled(true);
        } else {
            jPanelEmpresa.setVisible(false);
            jPanelCliente.setVisible(true);
            jButtonRegistro.setEnabled(true);
        }
    }//GEN-LAST:event_jComboBoxTipoActionPerformed
    /**
     * 
     * obtenemos los datos y los pasamos a los constructores para crear el objeto y añadirlo al array list 
     */
    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        try{
            String correo = jTextFieldCorreo.getText();
            String nombre=jTextFieldNombre.getText();
            String clave=jTextFieldClave.getText();
            long telefono =  (long) jFormattedTextFieldTelefono.getValue();
            String calle=jTextFieldCalle.getText();
            long numerocasa=(long)jFormattedTextFieldNumeroCasa.getValue();
            long codigopostal=(long)jFormattedTextFieldCodigopostal.getValue();
            String ciudad=jTextFieldCiudad.getText();
            String titulartarjeta=jTextFieldTitular.getText();
            long numerotarjeta=(long)jFormattedTextFieldNumeroTarjeta.getValue();
            String fechacadudidad=jTextFieldFechaC.getText();
                if (tipo.equals("Particular")) {
                    if(correo.equals("") || nombre.equals("")||clave.equals("")){//comprobamos que los datos no estan vacios
                        JOptionPane.showMessageDialog(this, "Error al introducir los datos complete los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }else{
                        String dni=jFormattedTextField1.getText();
                        Direccion d1=new Direccion(calle, numerocasa, codigopostal, ciudad);//creamos el objeto dirección
                        Tarjeta t1=new Tarjeta(titulartarjeta, numerotarjeta, fechacadudidad);//cremos el objeto tarjeta
                        Cliente_particular cl=new Cliente_particular(dni, nombre, correo, clave, telefono, d1,t1);//cremos el objeto cliente con las asociaciones de dirección y tarjeta
                        String mensaje=DatosClientes.intoducirCliente(cl);//introducmos el cliente al arraylist
                        JOptionPane.showMessageDialog(this, mensaje);   
                        DatosClientes.guardarDatos();//guardamos los datos 
                        Login lg = new Login();
                            lg.setVisible(true);
                            this.dispose();
                    }

                }else{
                    if(correo.equals("") || nombre.equals("")||clave.equals("")){//comprobamos que los datos no estan vacios
                        JOptionPane.showMessageDialog(this, "Error al introducir los datos, complete los campos", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }else{
                        String cif=(String) jFormattedTextFieldCif.getValue();
                        String web=jTextFieldWeb.getText();
                        System.out.println("dd");
                        Direccion de=new Direccion(calle, numerocasa, codigopostal, ciudad);//creamos el objeto dirección
                        Tarjeta te=new Tarjeta(titulartarjeta, numerotarjeta, fechacadudidad);//cremos el objeto tarjeta
                        Cliente_empresa ce=new Cliente_empresa(cif, web, nombre, correo, clave, telefono,de,te);//cremos el objeto cliente con las asociaciones de dirección y tarjeta
                        String mensaje=DatosClientes.intoducirCliente(ce);//introducmos el cliente al arraylist
                        JOptionPane.showMessageDialog(this, mensaje);
                        DatosClientes.guardarDatos();//guardamos los datos 
                        Login lg = new Login();
                            lg.setVisible(true);
                            this.dispose();
                    }
                }
            }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al intoducir los datos, revisar.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jFormattedTextFieldCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCifActionPerformed

    private void jFormattedTextFieldNumeroCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNumeroCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNumeroCasaActionPerformed

    private void jFormattedTextFieldCodigopostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodigopostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCodigopostalActionPerformed

    private void jFormattedTextFieldNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNumeroTarjetaActionPerformed

    private void jFormattedTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefonoActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextFieldCif;
    private javax.swing.JFormattedTextField jFormattedTextFieldCodigopostal;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumeroCasa;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumeroTarjeta;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefono;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelEmpresa;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldFechaC;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTitular;
    private javax.swing.JTextField jTextFieldWeb;
    // End of variables declaration//GEN-END:variables
}
