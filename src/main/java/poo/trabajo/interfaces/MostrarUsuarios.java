package poo.trabajo.interfaces;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import poo.trabajo.Cliente;
import poo.trabajo.DatosClientes;

/**
 *
 * @author jose y maria 
 */
public class MostrarUsuarios extends javax.swing.JPanel {
    DefaultTableModel modelo=new DefaultTableModel();//definimos el modelo de la tabla
    
   
    
    /**
     * Creates new form MostrarUsuarios
     */
    public MostrarUsuarios() {
        initComponents();
        Cargar();
    }
    /**
     *Generamos la tabla predefinada para mostrar los usuarios al administrador
     */
     public void Cargar(){
        ArrayList<Object>nombrecolumna=new ArrayList<Object>();
        nombrecolumna.add("Nombre");
        nombrecolumna.add("Teléfono");
        nombrecolumna.add("Correo");
        nombrecolumna.add("Contraseña");
        nombrecolumna.add("Nºtarjeta");
        nombrecolumna.add("Caducidad");
        nombrecolumna.add("Titular");
        nombrecolumna.add("Calle");
        nombrecolumna.add("Numero");
        nombrecolumna.add("Ciudad");
        for (Object columna: nombrecolumna){
            modelo.addColumn(columna);
        }
        this.tabladatos.setModel(modelo);
        
        
    
     ArrayList<Cliente> clientes = DatosClientes.getClientes();
     for(int i=0;i<clientes.size();i++){//introducimos los datos en la tabla 
        modelo.addRow(new Object[] {clientes.get(i).getNombre(), clientes.get(i).getTelefono(), clientes.get(i).getCorreo_electronico(), clientes.get(i).getClave(), clientes.get(i).getTarjeta().getNumero(),clientes.get(i).getTarjeta().getFecha_caducidad(),clientes.get(i).getTarjeta().getTitular(),clientes.get(i).getDireccion().getCalle(),clientes.get(i).getDireccion().getNumero(),clientes.get(i).getDireccion().getCiudad()});
        }
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabladatos;
    // End of variables declaration//GEN-END:variables
}
