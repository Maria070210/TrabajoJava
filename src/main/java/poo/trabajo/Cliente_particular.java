
package poo.trabajo;

/**
 *
 * @author josed y maria
 */
public class Cliente_particular extends Cliente {
    /**
     * 
     * @param dni
     * @param nombre
     * @param correo_electronico
     * @param clave
     * @param telefono
     * @param direccion
     * @param tarjeta 
     */
    public Cliente_particular(String dni, String nombre, String correo_electronico, String clave, long telefono, Direccion direccion, Tarjeta tarjeta) {
        super(nombre, correo_electronico, clave, telefono, direccion, tarjeta);
        this.dni = dni;
    }
    private String dni;
    
   

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    
    
    @Override
    public String toString() {
        return "Cliente_particular{" + "dni=" + dni  + "nombre=" + nombre + ", correo_electronico=" + correo_electronico + ", clave=" + clave + ", direccion=" + direccion + ", tarjeta=" + tarjeta + ", telefono=" + telefono + '}';
    }

    
    
    
}
