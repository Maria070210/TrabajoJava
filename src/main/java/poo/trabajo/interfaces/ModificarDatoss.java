package poo.trabajo.interfaces;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import poo.trabajo.Cliente;
import poo.trabajo.Cliente_empresa;
import poo.trabajo.Cliente_particular;
import poo.trabajo.DatosClientes;

/**
 *
 * @author josed y maria 
 */
public class ModificarDatoss extends javax.swing.JPanel {

    ArrayList<Cliente> clientes = DatosClientes.getClientes();//cargamos el arraylist de clientes

    /**
     * Creates new form ModificarDatoss
     */
    public ModificarDatoss() {
        initComponents();
        inicio();
    }

    @SuppressWarnings("unchecked")
    String dato;

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCargar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jPanelEmpresa = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldWeb = new javax.swing.JTextField();
        jFormattedTextFieldCif = new javax.swing.JFormattedTextField();
        jPanelParticular = new javax.swing.JPanel();
        jLabelDni = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCalle = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldTitular = new javax.swing.JTextField();
        jTextFieldFechaC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jFormattedTextFieldTelefono = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNumeroCasa = new javax.swing.JFormattedTextField();
        jFormattedTextFieldNumeroTarjeta = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCodigopostal = new javax.swing.JFormattedTextField();

        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCargar.setText("Cargar datos");
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        add(jButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, -1, -1));

        jLabel1.setText("Nombre: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setText("Contraseña:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 20));
        add(jTextFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 132, 130, 30));

        jLabel3.setText("Teléfono:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jButtonModificar.setText("Modificar datos");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, -1, -1));
        add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 92, 130, 30));

        jPanelEmpresa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Cif: ");
        jPanelEmpresa.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel7.setText("Web:");
        jPanelEmpresa.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        jPanelEmpresa.add(jTextFieldWeb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 130, 30));

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
        jPanelEmpresa.add(jFormattedTextFieldCif, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 30));

        add(jPanelEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 220, 120));

        jPanelParticular.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDni.setText("Dni:");
        jPanelParticular.add(jLabelDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

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
        jPanelParticular.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 12, 130, 30));

        add(jPanelParticular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, 50));

        jLabel8.setText("Calle:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel9.setText("Numero:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel10.setText("Codigo P:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        jLabel11.setText("Ciudad:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));
        add(jTextFieldCalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 150, 30));
        add(jTextFieldCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 150, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 310));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Direción");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, 310));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("Tarjeta");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 110, 40));

        jLabel13.setText("Titular:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        jLabel14.setText("Numero:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jLabel15.setText("Fecha Caducidad:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));
        add(jTextFieldTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 92, 160, 30));
        add(jTextFieldFechaC, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 212, 160, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setText("Usuario");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jFormattedTextFieldTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jFormattedTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldTelefonoActionPerformed(evt);
            }
        });
        add(jFormattedTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 172, 130, 30));

        jFormattedTextFieldNumeroCasa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jFormattedTextFieldNumeroCasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNumeroCasaActionPerformed(evt);
            }
        });
        add(jFormattedTextFieldNumeroCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 150, 30));

        jFormattedTextFieldNumeroTarjeta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jFormattedTextFieldNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldNumeroTarjetaActionPerformed(evt);
            }
        });
        add(jFormattedTextFieldNumeroTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 160, 30));

        jFormattedTextFieldCodigopostal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));
        jFormattedTextFieldCodigopostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCodigopostalActionPerformed(evt);
            }
        });
        add(jFormattedTextFieldCodigopostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 150, 30));
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo para mostrar diferentes opciones dependiendo el tipo de usuario.
     */
    private void inicio() {
        dato = Login.usuario;
        for (Cliente c : clientes) {
            if (c.getCorreo_electronico().equals(dato)) {
                String tipo = c.getClass().getSimpleName();
                if (tipo.equals("Cliente_particular")) {//si es cliente particular
                    jPanelParticular.setVisible(true);
                    jPanelEmpresa.setVisible(false);
                } else {//si es cliente empresa
                    jPanelParticular.setVisible(false);
                    jPanelEmpresa.setVisible(true);
                }
            }
        }
    }

    /**
     *
     * Metodo para mostrar los datos al cliente
     */
    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        dato = Login.usuario;//usuario obtenido desde el inicio de sesión
        for (Cliente c : clientes) {//recorremos el array 
            if (c.getCorreo_electronico().equals(dato)) {//para el usuario que tiene el mismo correo, modificamos los datos 
                jFormattedTextFieldCodigopostal.setValue(c.getDireccion().getCodigop());
                jTextFieldCalle.setText(c.getDireccion().getCalle());
                jTextFieldCiudad.setText(c.getDireccion().getCiudad());
                jFormattedTextFieldNumeroCasa.setValue(c.getDireccion().getNumero());
                jTextFieldTitular.setText(c.getTarjeta().getTitular());
                jTextFieldFechaC.setText(c.getTarjeta().getFecha_caducidad());
                jFormattedTextFieldNumeroTarjeta.setValue(c.getTarjeta().getNumero());
                jTextFieldNombre.setText(c.getNombre());
                jFormattedTextFieldTelefono.setValue(c.getTelefono());
                jTextFieldClave.setText(c.getClave());

                String tipo = c.getClass().getSimpleName();
                if (tipo.equals("Cliente_empresa")) {
                    Cliente_empresa clie = (Cliente_empresa) c;
                    jTextFieldWeb.setText(clie.getWeb());
                    jFormattedTextFieldCif.setValue(clie.getCif());
                }

            }
            String tipo = c.getClass().getSimpleName();
            if (tipo.equals("Cliente_particular")) {

                Cliente_particular cli = (Cliente_particular) c;
                jFormattedTextField1.setValue(cli.getDni());
            }
        }
    }//GEN-LAST:event_jButtonCargarActionPerformed

    /**
     *
     * Metodo para la modificacion de los datos
     */
    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        dato = Login.usuario;
        long telefono;
        long numerocasa;
        long codigopostal;
        long numerotarjeta;
        String dni;
        String cif;
        System.out.println("1");
        String nombre = jTextFieldNombre.getText();
        System.out.println("2");
        String clave = jTextFieldClave.getText();
        System.out.println("3");
        if (jFormattedTextFieldTelefono.getValue() == null) {//comprobamos si los datos son nulos 
            telefono = 0;//definimos un valor para realizar las comprobaciones en la clase principal
        } else {
            telefono = (long) jFormattedTextFieldTelefono.getValue();
        }
        if (jFormattedTextFieldNumeroCasa.getValue() == null) {
            numerocasa = 0;
        } else {
            numerocasa = (long) jFormattedTextFieldNumeroCasa.getValue();
        }
        if (jFormattedTextFieldCodigopostal.getValue() == null) {
            codigopostal = 0;
        } else {
            codigopostal = (long) jFormattedTextFieldCodigopostal.getValue();
        }
        if (jFormattedTextFieldNumeroTarjeta.getValue() == null) {
            numerotarjeta = 0;
        } else {
            numerotarjeta = (long) jFormattedTextFieldNumeroTarjeta.getValue();
        }
        if ((String) jFormattedTextField1.getValue() == null) {
            dni = "";
        } else {
            dni = (String) jFormattedTextField1.getValue();
        }
        if ((String) jFormattedTextFieldCif.getValue() == null) {
            cif = "";
        } else {
            cif = (String) jFormattedTextFieldCif.getValue();

        }
        String calle = jTextFieldCalle.getText();
        String ciudad = jTextFieldCiudad.getText();
        String titulartarjeta = jTextFieldTitular.getText();
        String fechacadudidad = jTextFieldFechaC.getText();
        String web = jTextFieldWeb.getText();

        DatosClientes.modificar_datos(dato, nombre, clave, telefono, dni, cif, web, calle, numerocasa, codigopostal, ciudad, titulartarjeta, numerotarjeta, fechacadudidad);//pasamos los datos al metodo
        DatosClientes.guardarDatos();//guardamos los datos 
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jFormattedTextFieldCifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCifActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCifActionPerformed

    private void jFormattedTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldTelefonoActionPerformed

    private void jFormattedTextFieldNumeroCasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNumeroCasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNumeroCasaActionPerformed

    private void jFormattedTextFieldNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldNumeroTarjetaActionPerformed

    private void jFormattedTextFieldCodigopostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCodigopostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCodigopostalActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonModificar;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JPanel jPanelEmpresa;
    private javax.swing.JPanel jPanelParticular;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldCalle;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldFechaC;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTitular;
    private javax.swing.JTextField jTextFieldWeb;
    // End of variables declaration//GEN-END:variables
}
