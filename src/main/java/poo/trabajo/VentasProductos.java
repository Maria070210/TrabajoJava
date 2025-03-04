package poo.trabajo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author josed y maria
 */
public class VentasProductos {
    private static ArrayList<Venta> venta = new ArrayList<Venta>();//creacion del arraylista para alamcenar las ventas
    
    public static ArrayList<Venta> getVentas() {
        return venta;
    }
    /**
     * 
     * @param c
     * metodo para añadir la venta al arraylist
     * @return 
     */
    public static String añadirventa(Venta c ) {
        venta.add(c);
        System.out.println("se añadio al carro");
        return "Usuario con correo " + c.getCliente().getNombre()+ "compro productos"+c.getCarro().getProductos().getCategoria();
        
    }
    /**
     * metodo para cargar los datos del fichero
     */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos
            FileInputStream istreamPer = new FileInputStream("ventas.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            venta= (ArrayList<Venta>) oisPer.readObject();
            istreamPer.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin cargarDatos
    /**
     * metodo para guardar los datos en el fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!venta.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización
                FileOutputStream ostreamPer = new FileOutputStream("ventas.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                oosPer.writeObject(venta);
                ostreamPer.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos

    
}


