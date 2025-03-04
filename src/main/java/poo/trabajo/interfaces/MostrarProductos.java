package poo.trabajo.interfaces;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.trabajo.Productos;
import poo.trabajo.DatosProductos;
import poo.trabajo.Imgtabla;

/**
 *
 * @author jose y maria 
 */
public class MostrarProductos extends javax.swing.JPanel {
    
    DefaultTableModel modelo=new DefaultTableModel();//definimos el modelo de la tabla 
    
   
    public MostrarProductos() {
        initComponents();
        Cargar();
    }
    /**
     * Creamos la tabla predefinda.
     */
     public void Cargar(){
        ArrayList<Object>nombrecolumna=new ArrayList<Object>();
        tabladatos.setDefaultRenderer(Object.class,new Imgtabla());
        nombrecolumna.add("Titulo");
        nombrecolumna.add("Caracteristicas");
        nombrecolumna.add("Categoria");
        nombrecolumna.add("Precio");
        nombrecolumna.add("Strok");
        nombrecolumna.add("Fecha_entrada");
        nombrecolumna.add("Foto");
       
        for (Object columna: nombrecolumna){
            modelo.addColumn(columna);
        }
        this.tabladatos.setModel(modelo);
        
        
    
     ArrayList<Productos> productos = DatosProductos.getProducto();
     for(int i=0;i<productos.size();i++){//añadimos los datos a la tabla.
        modelo.addRow(new Object[] {productos.get(i).getTitulo(), productos.get(i).getCaracteristicas(), productos.get(i).getCategoria(), productos.get(i).getPrecio(), productos.get(i).getStrok(),productos.get(i).getFecha_entrada(),new JLabel(new ImageIcon(productos.get(i).getFoto()))});
        tabladatos.setRowHeight(60);
        }
     }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButtonModificar_Producto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        jButtonEliminar.setText("Eliminar producto");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonModificar_Producto.setText("Modificar Producto");
        jButtonModificar_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificar_ProductoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Solo se permite la modificación de : precio, stock, características, categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonModificar_Producto)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModificar_Producto)
                    .addComponent(jButtonEliminar))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * Boton para la elimnacion de productos 
     */
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        
        int filaseleccionada=tabladatos.getSelectedRow();//se seleciona la fila 
        if (filaseleccionada>=0){
            String dato=String.valueOf(tabladatos.getValueAt(tabladatos.getSelectedRow(),0));//se obtiene el titulo
            DatosProductos.bajaProducto(dato);//se elimina el producto del arraylist
            modelo.removeRow(filaseleccionada); //se elimina de la tabla el producto
            DatosProductos.guardarDatos();//se guardan los productos 
        }else{
            JOptionPane.showMessageDialog(null,"La tabla esta vacia o no ha seleccionado ninguna fila");
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonModificar_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificar_ProductoActionPerformed
        
        int filaseleccionada=tabladatos.getSelectedRow();//se seleciona la fila 
            if (filaseleccionada>=0){
              /**
               * se obtiene los nuevos datos de los productos
               */
                String titulo=tabladatos.getValueAt(filaseleccionada,0 ).toString();//se opbtienen los nuevos valores
                String caracteristicas=tabladatos.getValueAt(filaseleccionada, 1).toString();
                String categoria=tabladatos.getValueAt(filaseleccionada, 2).toString();
                String precio1= tabladatos.getValueAt(filaseleccionada, 3).toString();
                String stock1=tabladatos.getValueAt(filaseleccionada, 4).toString();
                int stock=Integer.parseInt(stock1);
                int precio=Integer.parseInt(precio1);
                
                try{
                    DatosProductos.modificarProducto(titulo, caracteristicas, categoria, precio, stock);//pasamos las datos al metodo
                    JOptionPane.showMessageDialog(this, "Modificacion realizada con exito.");
                    DatosProductos.guardarDatos();//se guardan lo productos modificados 
                    
                    
                }catch(Exception Producto_erroneomo){
                    Producto_erroneomo.toString();
                    
                }
            }
        
    }//GEN-LAST:event_jButtonModificar_ProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar_Producto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
