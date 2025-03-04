package poo.trabajo.interfaces;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import poo.trabajo.VentasProductos;
import poo.trabajo.Venta;

/**
 *
 * @author josed
 */
public class VerCompras extends javax.swing.JPanel {
    private TableRowSorter Filtro;
    DefaultTableModel modelo=new DefaultTableModel();//generamos el modelo de la tabla
    ArrayList<Venta> ventas = VentasProductos.getVentas();//obtenemos el arraylist
    /**
     * Creates new form VerCompras
     */
    public VerCompras() {
        initComponents();
        Cargar();
    }
    /**
     * Generamos la talba 
     */
    public void Cargar(){
                ArrayList<Object>nombrecolumna=new ArrayList<Object>();
                nombrecolumna.add("Producto");
                nombrecolumna.add("Caracteristicas");
                nombrecolumna.add("Categoria");
                nombrecolumna.add("Precio");
                nombrecolumna.add("Cantidad");
                nombrecolumna.add("Fecha");
                nombrecolumna.add("Cliente");
                nombrecolumna.add("Correo");
                nombrecolumna.add("Ciudad");
                nombrecolumna.add("Calle");
                nombrecolumna.add("Numero");
                nombrecolumna.add("CP");

                for (Object columna: nombrecolumna){
                    modelo.addColumn(columna);
                }
                this.tabladatos.setModel(modelo);

             for(int i=0;i<ventas.size();i++){//introducmos los datos de la tabla
                    modelo.addRow(new Object[] {ventas.get(i).getCarro().getProductos().getTitulo(),ventas.get(i).getCarro().getProductos().getCaracteristicas()
                            ,ventas.get(i).getCarro().getProductos().getCategoria(),ventas.get(i).getCarro().getPrecio(),ventas.get(i).getCarro().getCantidad(),ventas.get(i).getLocalDate(),
                            ventas.get(i).getCliente().getNombre(),ventas.get(i).getCliente().getCorreo_electronico(),
                            ventas.get(i).getCliente().getDireccion().getCiudad(),ventas.get(i).getCliente().getDireccion().getCalle(),
                            ventas.get(i).getCliente().getDireccion().getNumero(),ventas.get(i).getCliente().getDireccion().getCodigop()});
            }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldFilto = new javax.swing.JTextField();

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
        ));
        jScrollPane1.setViewportView(tabladatos);

        jLabel1.setText("Introducir Fecha: ");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldFilto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(564, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFilto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * Filto de texto para la busqueda por fechas 
     */
    private void jTextFieldFiltoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFiltoKeyTyped
        jTextFieldFilto.addKeyListener(new KeyAdapter(){
            @Override
            public void keyReleased (KeyEvent ke){
                String texto= jTextFieldFilto.getText();
                jTextFieldFilto.setText(texto);
                FNombre();
                    }
                });
        Filtro=new TableRowSorter(tabladatos.getModel());
        tabladatos.setRowSorter(Filtro);
    }                                        
    public void FNombre(){
        int datofecha=5;
        Filtro.setRowFilter(RowFilter.regexFilter("(?i)" + jTextFieldFilto.getText(),datofecha));
    }//GEN-LAST:event_jTextFieldFiltoKeyTyped

    private void jTextFieldFiltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFiltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFiltoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldFilto;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
