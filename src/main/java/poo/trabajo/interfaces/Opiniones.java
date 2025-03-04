package poo.trabajo.interfaces;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import poo.trabajo.Productos;
import poo.trabajo.DatosProductos;

/**
 *
 * @author jose y maria
 */
public class Opiniones extends javax.swing.JPanel {
    DefaultTableModel modelo=new DefaultTableModel();//definimos el modelo de la tabla
    ArrayList<Productos> productos = DatosProductos.getProducto();//obtenemos el arraylist productos
    
   
    public Opiniones() {
        initComponents();
        Cargar();
    }

    /**
     *Generamos la tabla predefinida para mostrar las opiniones
     */
     public void Cargar(){
        ArrayList<Object>nombrecolumna=new ArrayList<Object>();
        nombrecolumna.add("Titulo");
        nombrecolumna.add("Valoración");
        nombrecolumna.add("Opinion");
        nombrecolumna.add("Ultima opinion");
       
       
        for (Object columna: nombrecolumna){
            modelo.addColumn(columna);
        }
        this.tabladatos.setModel(modelo);//se aplica el modelo de la tabla
        
        
    
     for(int i=0;i<productos.size();i++){//se introducen los datos en la tabla 
        modelo.addRow(new Object[] {productos.get(i).getTitulo(),productos.get(i).getOpiniones().getCalificacion(),productos.get(i).getOpiniones().getComentario(),productos.get(i).getOpiniones().getFecaha_comentario()});
        }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        jButtonOpinar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldOpinion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();

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

        jButtonOpinar.setText("Opinar");
        jButtonOpinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOpinarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Dejar un comentario del producto seleccionado: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Valoración: ");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jTextFieldOpinion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addComponent(jButtonOpinar)
                                .addGap(94, 94, 94))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldOpinion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOpinar))
                .addContainerGap(120, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    /**
     * 
     * boton para realizar la valoración
     */
    private void jButtonOpinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOpinarActionPerformed
        int filaseleccionada=tabladatos.getSelectedRow();//se seleciona la fila a opinar 
        int valornum=(Integer) jSpinner1.getValue();//se obtiene el valor de la valoración
        String op=jTextFieldOpinion.getText();//se optiene el comentario
        if (filaseleccionada>=0){
            String dato=String.valueOf(tabladatos.getValueAt(tabladatos.getSelectedRow(),0));//se seleciona el valor en la posicion 0
            DatosProductos.valoracion(dato,op,valornum);//se reliza la valoración
            DatosProductos.guardarDatos();//se guarda la valoración
           
        }else{
            JOptionPane.showMessageDialog(this, "La tabla esta vacia o no seleciono ningún producto.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonOpinarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOpinar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextFieldOpinion;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
