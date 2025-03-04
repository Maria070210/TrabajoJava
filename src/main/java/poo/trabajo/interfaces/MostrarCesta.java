package poo.trabajo.interfaces;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.trabajo.Carro;
import poo.trabajo.Cliente;
import poo.trabajo.DatosClientes;
import poo.trabajo.DatosProductos;
import poo.trabajo.Venta;
import poo.trabajo.VentasProductos;

/**
 *
 * @author jose y maria 
 */
public class MostrarCesta extends javax.swing.JPanel {
    DefaultTableModel modelo=new DefaultTableModel();//definimos el modelo de la tabla
    ArrayList<Carro> carros = DatosProductos.getCarro();//obteneos el arraylist de carro
    
   
    
    /**
     * Creates new form MostrarUsuarios
     */
    public MostrarCesta() {
        initComponents();
        Cargar();
    }
    /**
     * Generamos la tabla
     */
     public void Cargar(){
        ArrayList<Object>nombrecolumna=new ArrayList<Object>();
        nombrecolumna.add("Titulo");
        nombrecolumna.add("Categoria");
        nombrecolumna.add("Precio");
       
       
        for (Object columna: nombrecolumna){
            modelo.addColumn(columna);
        }
        this.tabladatos.setModel(modelo);
        
        
    
     ArrayList<Carro> carro = DatosProductos.getCarro();//introducimos los datos en la tabla
     for(int i=0;i<carro.size();i++){
        modelo.addRow(new Object[] {carro.get(i).getProductos().getTitulo(),carro.get(i).getProductos().getCategoria(),carro.get(i).getPrecio()});
        }
     }

    @SuppressWarnings("unchecked")
    String usuario;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButtonComprar = new javax.swing.JButton();

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

        jButtonEliminar.setText("Eliminar producto");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonComprar.setText("Comprar");
        jButtonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButtonEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 381, Short.MAX_VALUE)
                .addComponent(jButtonComprar)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonComprar))
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * Boton definido para elminar usuarios 
     */
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        int filaseleccionada=tabladatos.getSelectedRow();//selecionamos una fila 
        if (filaseleccionada>=0){//comprobamos que se seleciono alguna fila 
            String dato=String.valueOf(tabladatos.getValueAt(tabladatos.getSelectedRow(),0));//selecionamos el titulo para trabajar con el.
            DatosProductos.bajaProductoCesta(dato);//eliminamos el producto
            modelo.removeRow(filaseleccionada); //eliminamos la fila de la tabla
        }else{
            JOptionPane.showMessageDialog(this, "La tabla esta vacía o no selecionó ningún producto.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed
    /**
     * 
     * Boton definido para la compra de los produtos.
     */
    private void jButtonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprarActionPerformed
        usuario=Login.usuario;//obtenemos el usuario
        Cliente login =DatosClientes.encontrarCliente(usuario);//obtenemos el objeto cliente
        if(!carros.isEmpty()){//comprobamos que el carro no esta vacio
            for (Carro c:carros){//recorremos el carro
               Venta f1=new Venta(c, login, LocalDate.now());//creamos el objeto venta
               VentasProductos.añadirventa(f1);//añadimos la venta la arraylist
            }
            VentasProductos.guardarDatos();//guardamos los datos 
            DatosProductos.guardarDatos(); 
            DatosProductos.generaFactura();//generamos la factura en un fichero
       
        for(int i=0;i<tabladatos.getRowCount();i++){//restablecemos la tabla
            modelo.removeRow(i);
            i-=1;
        } 
        tabladatos.setModel(new DefaultTableModel());//mostramos la factura
            Facturas md = new Facturas();
            md.setVisible(true);   
        }else{
            JOptionPane.showMessageDialog(this,"Error, el carro no tiene datos ","Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonComprarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
