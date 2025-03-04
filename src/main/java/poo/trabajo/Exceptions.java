package poo.trabajo;
/**
 *
 * @author josed y maria
 */

/**
 * 
 * Definicion de las excepciones
 */
public class Exceptions extends Exception {

    public static String Cliente_registrado = "El cliente ya está registrado.";
    public static String Producto_carro = "El producto ya está añadido en el carro.";
    public static String Producto_Registrado = "El producto ya está registrado.";
    public static String Producto_erroneo = "Algún campo esta vacío o es erroneo.";
    public static String Producto_erroneomo = "No se pudo realizar la modificacion.";
    public static String Registro = "Error al intoducir los datos";
   

    public Exceptions() {
        super("Se ha producido una excepción en la aplicación.");
    }

    public Exceptions(String txt) {
        super(txt); 
    }
}
