package poo.trabajo;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import poo.trabajo.interfaces.Login;

/**
 *
 * @author jose y maria
 */
public class DatosProductos {
    private static ArrayList<Productos> productos = new ArrayList<Productos>();//creación del arraylist productos
    
    public static ArrayList<Productos> getProducto() {
        return productos;
    }
    //*
    private static ArrayList<Carro> carro = new ArrayList<Carro>();
    
    public static ArrayList<Carro> getCarro() {
        return carro;
    }
    /**
     * 
     * @param p
     * metodo para agregar producto
     * @return 
     */
    public static String intoducirProducto(Productos p) {
            try {
                if (productos.contains(p)) {//si esta dentro
                    throw new Exceptions(Exceptions.Producto_Registrado);
                } else {
                    productos.add(p);
                    return "Produto con nombre " + p.getTitulo()+ " ha sido registrado";
                }
            } catch (Exceptions ae) {
                return ae.toString();
            }

        }
    /**
     * metodo para la eleiminación de un producto
     * @param dato 
     */
    public static void bajaProducto(String dato) {
        
        for (int i = 0; i < productos.size(); i++){
            System.out.println(i);
            if (productos.get(i).getTitulo().equals(dato)){
                productos.remove(i);
            } else {
                System.out.println("Error: no existe el dato");
            }
        }
    }
    /**
     * metodo definido para la modificación de los atrivutos de un producto
     * @param titulo
     * @param caracteristicas
     * @param categoria
     * @param preco
     * @param stock 
     */
    public static void modificarProducto(String titulo,String caracteristicas,String categoria,int preco,int stock){
          for (Productos p: productos){
               if (p.getTitulo().equals(titulo)){
                   p.setCaracteristicas(caracteristicas);
                   p.setCategoria(categoria);
                   p.setPrecio(preco);
                   p.setStrok(stock);
               }
          }
    }
    /**
     * Comparador de proeductos por calificación
     */
    public static Comparator<Productos>comparator=new Comparator<Productos>() {
        @Override
        public int compare(Productos o1, Productos o2) {
            return o1.getOpiniones().getCalificacion()-o2.getOpiniones().getCalificacion();
        }
    };
    /**
     * comparador de productos por precio
     */
    public static Comparator<Productos>ascen=new Comparator<Productos>() {
        @Override
        public int compare(Productos o1, Productos o2) {
            return o1.getPrecio()-o2.getPrecio();
        }
    };
    /**
     * Metodo para odenar de manera ascendente
     */
    public static void ordenascendente(){
        Collections.sort(productos,ascen);       
    }
     /**
     * Metodo para odenar de manera descendente
     */
    public static void ordendescendente(){
        Collections.sort(productos, Collections.reverseOrder());        
    }
     /**
     * Metodo para odenar por valoración
     */
    public static void ordenvaloracion(){
        Collections.sort(productos,comparator);    
    }
    /**
     * metodo definido para añadir productos a la cesta
     * @param c
     * @return 
     */
    public static String añadircesta(Carro c ) {
        try {
                if (carro.contains(c)) {//si esta dentro
                    throw new Exceptions(Exceptions.Producto_carro);
                } else {
                    carro.add(c);
                    return "Usuario con correo " + c.getProductos().getTitulo()+ ". Producto registrado";
                }
            } catch (Exceptions ae) {
                return ae.toString();
            }
        
    }
    /**
     * metodo definido para elimniar producto de la cesta
     * @param dato 
     */
    public static void bajaProductoCesta(String dato) {
        for (int i = 0; i < carro.size(); i++){
            System.out.println(i);
            if (carro.get(i).getProductos().getTitulo().equals(dato)){
                carro.remove(i);
            } else {
                System.out.println("error no existe el dato");
            }
        }
    }
    /**
     * metodo definido para realizar valoración del producto
     * @param datop
     * @param opinion
     * @param valor 
     */
    public static void valoracion(String datop, String opinion, int valor){
        Opiniones opiniones=new Opiniones(valor, opinion, LocalDate.now());
        for (Productos p: productos){
               if (p.getTitulo().equals(datop)){
                   p.setOpiniones(opiniones);
               }
        }
    }
    /**
     * metodo definido para generar facturas
     */
    public static void generaFactura() {       
        String usuario=Login.usuario;
        Cliente login=DatosClientes.encontrarCliente(usuario);
        try{
            PrintWriter salida= new PrintWriter(new BufferedWriter(new FileWriter(login.getCorreo_electronico() + ".txt")));
            salida.println("-------------------------------- Factura de Compra --------------------------------");
            salida.println("\n");
            salida.println("Fecha de la compra: "+LocalDate.now());
            salida.println("\n");
            salida.println("El usuaruio es: "+login.getNombre());
            salida.println("\n");
            salida.println("El correo es: "+login.getCorreo_electronico());
            salida.println("\n");
            salida.println("La direcion es: "+login.getDireccion().toString());
            salida.println("\n");
            salida.println("El telefono es: "+login.getTelefono());
            salida.println("\n");
            salida.println("Se realizo el pago con la targeta: "+login.getTarjeta().toString());
            salida.println("\n");
           if (login.getClass().getSimpleName().equals("Cliente_particular")) {
               Cliente_particular particular = (Cliente_particular) login;
                salida.println("*** Cliente Particular ***");
                salida.println("\n");
                salida.println("Dni: " + particular.getDni());
                salida.println("\n");
           } else {
               Cliente_empresa empresa = (Cliente_empresa) login;
                salida.println("*** Cliente Empresas ***");
                salida.println("\n");
                salida.println("CIF: " + empresa.getCif());
                salida.println("\n");
                salida.println("web: " + empresa.getWeb());
               salida.println("\n");
           }
            salida.println("-------------------------------- Datos de los Productos --------------------------------");
            salida.println("\n");
            int total=5;
           for (Carro c: carro){
               salida.println("Producto: " +c.getProductos().getTitulo() );
               salida.println("\n");
               salida.println("Categoria: " +c.getProductos().getCategoria());
               salida.println("\n");
               salida.println("Cantidad: " +c.getCantidad());
               salida.println("\n");
               salida.println("Caracteristicas: " +c.getProductos().getCaracteristicas() );
               salida.println("\n");
               salida.println("Precio por unidad: " +c.getProductos().getPrecio());
               salida.println("\n");
               salida.println("Precio toal del producto: "+c.getProductos().getTitulo()+ " es: " +c.getPrecio() );
               salida.println("\n");
               total+=c.getPrecio();
               salida.println("\n");
           }
           salida.println("Gastos de envío = 5 €" );
           salida.println("Precio total del pedido es: "+total+" €" );
            salida.println("\n");
            salida.println("-------------------------------------------------------------------------------");
            salida.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * metodo definido para cargar los datos de un fichero
     */
      public static void cargarDatos() {
        try {
            //Lectura de los objetos
            FileInputStream istreamPer = new FileInputStream("productos.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            productos= (ArrayList<Productos>) oisPer.readObject();
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
     * metodo definido para guardar los datos en un fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!productos.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización
                FileOutputStream ostreamPer = new FileOutputStream("productos.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                oosPer.writeObject(productos);
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
