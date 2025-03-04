package poo.trabajo.interfaces;

/**
 *
 * @author josed y maria
 */


import java.io.File;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import poo.trabajo.Productos;
import poo.trabajo.Opiniones;
import poo.trabajo.DatosProductos;


public class AñadirProductos extends javax.swing.JPanel {
    private String  rutaImagen;
    private File file;
    /**
     * Creates new form Añadrirp
     */
    public AñadirProductos() {
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCaract = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jButtonRegistro = new javax.swing.JButton();
        jSpinnerFecha = new javax.swing.JSpinner();
        jComboBox = new javax.swing.JComboBox<>();
        jFormattedTextFieldPrecio = new javax.swing.JFormattedTextField();
        jFormattedTextFieldStock = new javax.swing.JFormattedTextField();
        jButtonAbrir = new javax.swing.JButton();
        jLabelImagen = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(850, 550));
        setPreferredSize(new java.awt.Dimension(850, 550));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Título : ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 34));

        jTextFieldTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTituloActionPerformed(evt);
            }
        });
        add(jTextFieldTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 200, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Características :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 138, 31));

        jTextFieldCaract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCaractActionPerformed(evt);
            }
        });
        add(jTextFieldCaract, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 200, 38));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Categoría :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 95, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Stock :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 101, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Precio :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 101, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Fecha de alta :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });
        add(jButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jButtonRegistro.setText("Registro Producto");
        jButtonRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroActionPerformed(evt);
            }
        });
        add(jButtonRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, -1, -1));

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());
        jSpinnerFecha.setEditor(new javax.swing.JSpinner.DateEditor(jSpinnerFecha, "dd/MM/yyyy"));
        add(jSpinnerFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 200, 42));

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Componentes", "Ordenadores", "Móviles y telefonía", "TV audio y foto", "Consolas y videojuegos" }));
        add(jComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 200, 30));

        jFormattedTextFieldPrecio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldPrecioActionPerformed(evt);
            }
        });
        add(jFormattedTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 200, 40));

        jFormattedTextFieldStock.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextFieldStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldStockActionPerformed(evt);
            }
        });
        add(jFormattedTextFieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 200, 40));

        jButtonAbrir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAbrir.setText("Seleccionar Imagen");
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });
        add(jButtonAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));
        add(jLabelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 120, 100));

        jLabel8.setText("Imagen");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jTextFieldTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTituloActionPerformed

    private void jTextFieldCaractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCaractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCaractActionPerformed

    /**
     * 
     * boton registrador, pasamos los datos al arraylist de la clase productos,
     * comptobamos que los datos son correctos.
     */
    private void jButtonRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroActionPerformed
        try{
            String titulo= jTextFieldTitulo.getText();//obtenemos el titulo
            String caract= jTextFieldCaract.getText();//obtenemos las caracteristicas
            String categoria = (String) jComboBox.getSelectedItem();//obtenemos la categoria
            int stock = ((Number) jFormattedTextFieldStock.getValue()).intValue();//obtenemos el stock
            int precio = ((Number) jFormattedTextFieldPrecio.getValue()).intValue();//obtenemos el precio 
            Date fecha = (Date) jSpinnerFecha.getValue();//obtenemos la fecha 
            Instant instant = Instant.ofEpochMilli(fecha.getTime());
            LocalDate localDate = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate();
            
           
            if (titulo.equals("") || caract.equals("")||categoria.equals("")) {//no permitimos que se introduzcan datos vacios
                JOptionPane.showMessageDialog(this, "Error al introducir los datos escritos", "Mensaje",JOptionPane.ERROR_MESSAGE);  
                } else {
                    Opiniones op=new Opiniones(0);//definimos las opiniones en 0 al introducir el producto.
                    Productos pro=new Productos(titulo, caract, categoria, precio, stock, localDate,op,rutaImagen);//metemos los datos al constructor de producto
                    String mensaje=DatosProductos.intoducirProducto(pro);//mostramos un mensaje enseñando el producto que se ha añadido 
                    JOptionPane.showMessageDialog(this, mensaje);  
                    DatosProductos.guardarDatos();//guardamos los datos en fichero
                    }
            }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al intoducir los datos numericos, revisar.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButtonRegistroActionPerformed

    private void jFormattedTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldPrecioActionPerformed

    private void jFormattedTextFieldStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldStockActionPerformed
    /**
     * 
     * boton borrar definido 
     */
    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        jTextFieldTitulo.setText("");
        jTextFieldCaract.setText("");
        jFormattedTextFieldStock.setValue(0);
        jFormattedTextFieldPrecio.setValue(0);
    }//GEN-LAST:event_jButtonBorrarActionPerformed
    /**
     * 
     * definimos el boton para introoducir las imagenes del producto.
     */
    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);

        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            rutaImagen = file.getAbsolutePath();//obtenemos la ruta de la imagen
            System.out.println(rutaImagen);
        } else {
            JOptionPane.showMessageDialog(this, "Ningún fichero seleccionado", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
        ImageIcon imagen = new ImageIcon(rutaImagen);//creamos el imageicon
        ImageIcon imgRedimensionada = new ImageIcon(imagen.getImage().getScaledInstance(jLabelImagen.getWidth(), jLabelImagen.getHeight(), 1));//redimensionamos la imagen para el espacio asignado
        jLabelImagen.setIcon(imgRedimensionada);//ponemos la imagen 
    }//GEN-LAST:event_jButtonAbrirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonRegistro;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JFormattedTextField jFormattedTextFieldPrecio;
    private javax.swing.JFormattedTextField jFormattedTextFieldStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldCaract;
    private javax.swing.JTextField jTextFieldTitulo;
    // End of variables declaration//GEN-END:variables
}
