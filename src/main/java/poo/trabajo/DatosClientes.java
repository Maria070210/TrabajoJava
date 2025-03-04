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
public class DatosClientes {
    private static ArrayList<Cliente> clientes = new ArrayList<>();//creamos el arraylist clientes
    
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    /**
     * 
     * @param c
     * metodo definido para dar de alta a un cliente
     * @return 
     */
    
    public static String intoducirCliente(Cliente c) {
            try {
                if (clientes.contains(c)) {//si esta dentro
                    throw new Exceptions(Exceptions.Cliente_registrado);
                } else {
                    clientes.add(c);
                    return "Usuario con correo " + c.getCorreo_electronico()+ " ha sido registrado";
                }
            } catch (Exceptions Cliente_registrado) {
                return Cliente_registrado.toString();
            }

        }
    /**
     * 
     * @param correo
     * @param clave
     * metodo definido para inicar sesión en la aplicación
     * @return 
     */
    public static boolean  inicairSesion(String correo,String clave) {
            boolean esta = false;
            Cliente cl = null;
            for (Cliente c : clientes) {
                if (c.getCorreo_electronico().equals(correo)&&c.getClave().equals(clave)) {
                    cl = c;
                    esta = true;
                }
            }
        return esta;
    }
    /**
     * 
     * @param correo
     * metodo defido para la obtencion del objeto cliente
     * @return 
     */
     public static Cliente  encontrarCliente(String correo) {
            boolean esta = false;
            Cliente cl = null;
            for (Cliente c : clientes) {
                if (c.getCorreo_electronico().equals(correo)) {
                    cl = c;
                    esta = true;
                }
            }
            return cl;
     }
     /**
      * 
      * @param correo
      * @param nombre
      * @param clave
      * @param telefono
      * @param dni
      * @param cif
      * @param web
      * @param calle
      * @param numero
      * @param codigop
      * @param ciudad
      * @param titular
      * @param numtarjeta
      * @param caducidad 
      * metodo definido para la modificacion de los datos de los clientes
      * 
      */
    public static void modificar_datos(String correo,String nombre, String clave, long telefono,String dni,String cif,String web,String calle,long numero,long codigop,String ciudad,String titular,long numtarjeta,String caducidad){
        for (Cliente c: clientes){
            if (c.getCorreo_electronico().equals(correo)){
                if (!nombre.equals("")){
                    c.setNombre(nombre);
                }
                if (!clave.equals("")){
                    c.setClave(clave);
                }
                if (telefono!=0){
                    System.out.println(telefono);
                    c.setTelefono(telefono);
                }
                if(!calle.equals("")){
                    c.getDireccion().setCalle(calle);
                }
                if(numero!=0){
                    c.getDireccion().setNumero(numero);
                }
                if(codigop!=0){
                    c.getDireccion().setCodigop(codigop);
                }
                if(!ciudad.equals("")){
                   
                    c.direccion.setCiudad(ciudad);
                }
                if(!titular.equals("")){
                    c.getTarjeta().setTitular(titular);
                }
                if(numtarjeta!=0){
                    c.getTarjeta().setNumero(numero);
                }
                if(!caducidad.equals("")){
                    c.getTarjeta().setFecha_caducidad(caducidad);
                }
                
                String tipo=c.getClass().getSimpleName();
                if (tipo.equals("Cliente_particular")){
                    Cliente_particular cli=(Cliente_particular)c;
                    if(!dni.equals("")){
                        cli.setDni(dni);
                    }
                }else{
                    Cliente_empresa clie=(Cliente_empresa)c;
                    if(!cif.equals("")){
                        clie.setCif(cif);
                    }
                    if(!web.equals("")){
                        clie.setWeb(web);

                    }
                }
            }
        }
    }
    /**
     * Carga de datos desde copia de seguridad
     */
    public static void cargarDatos() {
        try {
            //Lectura de los objetos
            FileInputStream istreamPer = new FileInputStream("copiasegApar.dat");
            ObjectInputStream oisPer = new ObjectInputStream(istreamPer);
            clientes= (ArrayList<Cliente>) oisPer.readObject();
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
     * Guardado de la información el un fichero
     */
    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!clientes.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización
                FileOutputStream ostreamPer = new FileOutputStream("copiasegApar.dat");
                ObjectOutputStream oosPer = new ObjectOutputStream(ostreamPer);
                oosPer.writeObject(clientes);
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
