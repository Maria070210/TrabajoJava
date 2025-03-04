
package poo.trabajo.interfaces;


import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import poo.trabajo.Carro;
import poo.trabajo.Productos;
import poo.trabajo.DatosProductos;
import poo.trabajo.Imgtabla;

/**
 *
 * @author jose y maria
 */
public class BusquedaProductos extends javax.swing.JPanel {
    private TableRowSorter Filtro;
    DefaultTableModel modelo=new DefaultTableModel();
    ArrayList<Productos> productos = DatosProductos.getProducto();
    
   
    
    /**
     * Creates new form MostrarUsuarios
     */
    public BusquedaProductos() {
        initComponents();
        Cargar();
    }
    /**
     * Creamos la tabla predefinida para cargar los datos 
     */
     public void Cargar(){
        tabladatos.setDefaultRenderer(Object.class,new Imgtabla());
        ArrayList<Object>nombrecolumna=new ArrayList<Object>();
        nombrecolumna.add("Titulo");//columnas de la tabla
        nombrecolumna.add("Caracteristicas");
        nombrecolumna.add("Categoria");
        nombrecolumna.add("Precio");
        nombrecolumna.add("Stock");
        nombrecolumna.add("Fecha entrada");
        nombrecolumna.add("Valoración");
        nombrecolumna.add("Foto");


        for (Object columna: nombrecolumna){
            modelo.addColumn(columna);
        }
        this.tabladatos.setModel(modelo);//establecemos el modelo de la tabla

        for(int i=0;i<productos.size();i++){//introducimos todos los datos a la tabla
                modelo.addRow(new Object[] {productos.get(i).getTitulo(), productos.get(i).getCaracteristicas(), productos.get(i).getCategoria(), productos.get(i).getPrecio(), productos.get(i).getStrok(),productos.get(i).getFecha_entrada(),productos.get(i).getOpiniones().getCalificacion(),new JLabel(new ImageIcon(productos.get(i).getFoto()))});
                tabladatos.setRowHeight(50);
              
         }       
     }
     

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextFieldFilto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSpinnerCant = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabladatos);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Componentes", "Ordenadores", "Móviles y telefonía", "TV audio y foto", "Consolas y videojuegos" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTextFieldFilto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFiltoActionPerformed(evt);
            }
        });
        jTextFieldFilto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFiltoKeyTyped(evt);
            }
        });

        jLabel1.setText("Introduce categoria del producto:");

        jLabel2.setText("Introduce una plabra clave: ");

        jButton1.setText("Ascendente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Descendente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Valoracion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Añadir a la cesta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad de productos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2)
                        .addGap(52, 52, 52)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jSpinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldFilto, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFilto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jLabel3)
                            .addComponent(jSpinnerCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * metodo definido para mostrar los datos selecionados en el combobox 
 */
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        RellenoTabla();//rellenamos la tabla con la selección relizada
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    /**
     * metodo definido para rellenar la tabla de datos.
     */
    public void RellenoTabla(){//función global para rellenar las tablas 
        DefaultTableModel tableModel = (DefaultTableModel) tabladatos.getModel();//generamos la tabla 
        tabladatos.setDefaultRenderer(Object.class,new Imgtabla());//indicamos que la tabla tendra una imagen
        for(int i=0;i<tabladatos.getRowCount();i++){//eliminamos todos los datos anteriores
            modelo.removeRow(i);
            i-=1;
        } 
        tabladatos.setModel(new DefaultTableModel());//definimos el modelo de la tabla 
        for (Productos producto:productos){//introducciomos los datos 
            if(jComboBox1.getSelectedIndex()==0){
               modelo.addRow(new Object[] {producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getPrecio(), producto.getStrok(),producto.getFecha_entrada(),producto.getOpiniones().getCalificacion(),new JLabel(new ImageIcon(producto.getFoto()))});
            }else if (jComboBox1.getSelectedIndex()==1&& "Componentes".equals(producto.getCategoria())){
                               modelo.addRow(new Object[] {producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getPrecio(), producto.getStrok(),producto.getFecha_entrada(),producto.getOpiniones().getCalificacion(),new JLabel(new ImageIcon(producto.getFoto()))});
            }else if (jComboBox1.getSelectedIndex()==2&& "Ordenadores".equals(producto.getCategoria())){
                               modelo.addRow(new Object[] {producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getPrecio(), producto.getStrok(),producto.getFecha_entrada(),producto.getOpiniones().getCalificacion(),new JLabel(new ImageIcon(producto.getFoto()))});
            }else if (jComboBox1.getSelectedIndex()==3&& "Móviles y telefonía".equals(producto.getCategoria())){
                               modelo.addRow(new Object[] {producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getPrecio(), producto.getStrok(),producto.getFecha_entrada(),producto.getOpiniones().getCalificacion(),new JLabel(new ImageIcon(producto.getFoto()))});
            }else if (jComboBox1.getSelectedIndex()==4&& "TV audio y foto".equals(producto.getCategoria())){
                               modelo.addRow(new Object[] {producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getPrecio(), producto.getStrok(),producto.getFecha_entrada(),producto.getOpiniones().getCalificacion(),new JLabel(new ImageIcon(producto.getFoto()))});
            }else if (jComboBox1.getSelectedIndex()==5&& "Consolas y videojuegos".equals(producto.getCategoria())){
                               modelo.addRow(new Object[] {producto.getTitulo(), producto.getCaracteristicas(), producto.getCategoria(), producto.getPrecio(), producto.getStrok(),producto.getFecha_entrada(),producto.getOpiniones().getCalificacion(),new JLabel(new ImageIcon(producto.getFoto()))});
            }
        }
        tabladatos.setModel(tableModel);
        
        
    }
    /**
     * 
     * metod de filto por texto
     */
    private void jTextFieldFiltoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltoKeyTyped

        jTextFieldFilto.addKeyListener(new KeyAdapter(){//añadimos un evento para que interactue cuando se escribe
            @Override
            public void keyReleased (KeyEvent ke){
                String texto= jTextFieldFilto.getText();//obtenemos el texto
                jTextFieldFilto.setText(texto);
                FNombre();
                    }
                });
        Filtro=new TableRowSorter(tabladatos.getModel());
        tabladatos.setRowSorter(Filtro);//aplicamos el filto
    }//GEN-LAST:event_jTextFieldFiltoKeyTyped
    public void FNombre(){
        int datosNombre=0;
        Filtro.setRowFilter(RowFilter.regexFilter("(?i)" + jTextFieldFilto.getText(),datosNombre));//mostramos los datos indicados en el filto
    }
    /**
     * 
     * Boton donde ordena los precios de forma ascendente
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DatosProductos.ordenascendente();
        RellenoTabla();
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * 
     * Boton donde ordena los precios de forma descendente
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DatosProductos.ordendescendente();
        RellenoTabla();
        
    }//GEN-LAST:event_jButton2ActionPerformed
     /**
     * 
     * Boton donde ordena las valoraciones
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DatosProductos.ordenvaloracion();
        RellenoTabla();
    }//GEN-LAST:event_jButton3ActionPerformed
    /**
     * 
     * Boton en el que se añaden los productos a la cesta 
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {            
            int cantidad = (Integer) jSpinnerCant.getValue();//se obtine cantidad de productos
            int filaseleccionada=tabladatos.getSelectedRow();//se obtiene el producto selecionado
            if (filaseleccionada>=0){//se comprueba si se seleciono alguna fila
                String dato=String.valueOf(tabladatos.getValueAt(tabladatos.getSelectedRow(),0));//se obtiene la posicion 0 que corresponde con el titulo
                for (Productos p: productos){
                    if (p.getTitulo().equals(dato)){
                        int stock=p.getStrok();
                        if (cantidad <= 0) {//si se introduce un valor negativo salta un error
                            JOptionPane.showMessageDialog(this, "Introduzca una cantidad.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        if (stock >= cantidad) {
                            p.setStrok(stock - cantidad);//restamos la cantidad seleccionada del producto
                            int precio = cantidad * p.getPrecio();//se genera el precio de los productos
                            Carro cl =new Carro(p,cantidad, precio);//creamos un nuevo objeto carro 
                            DatosProductos.añadircesta(cl);//se añade el objeto al carro 
                            JOptionPane.showMessageDialog(this, "Ha añadido el producto "+p.getTitulo()+" a su cesta ", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(this, "No hay suficiente stock.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                         }
                    }
                }
            }else{ JOptionPane.showMessageDialog(this, "Seleccione algún producto.", "Mensaje", JOptionPane.ERROR_MESSAGE); }
                
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error al comprar: " + e.toString(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldFiltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCant;
    private javax.swing.JTextField jTextFieldFilto;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
