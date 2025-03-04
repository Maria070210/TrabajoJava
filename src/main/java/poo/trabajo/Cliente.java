package poo.trabajo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author josed y maria
 */
public class Cliente implements Serializable{

     public String nombre;
    public String correo_electronico;
    public String clave;
    public long telefono;
    Direccion direccion;
    Tarjeta tarjeta;
    /**
     * 
     * @param nombre
     * @param correo_electronico
     * @param clave
     * @param telefono
     * @param direccion
     * @param tarjeta 
     */
    
    public Cliente(String nombre, String correo_electronico, String clave, long telefono, Direccion direccion, Tarjeta tarjeta) {
        this.nombre = nombre;
        this.correo_electronico = correo_electronico;
        this.clave = clave;
        this.telefono = telefono;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    @Override
    public int hashCode(){
        int hash=7;
        hash=31*hash+Objects.hashCode(this.correo_electronico);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.correo_electronico, other.correo_electronico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", correo_electronico=" + correo_electronico + ", clave=" + clave + ", direccion=" + direccion + ", tarjeta=" + tarjeta + ", telefono=" + telefono + '}';
    }
    
}
