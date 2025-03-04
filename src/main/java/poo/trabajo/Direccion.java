package poo.trabajo;

import java.io.Serializable;

/**
 *
 * @author jose y maria
 */
public class Direccion implements Serializable{
    private String calle;
    private long numero;
    private long codigop;
    private String ciudad;
    /**
     * 
     * @param calle
     * @param numero
     * @param codigop
     * @param ciudad 
     */
    public Direccion(String calle, long numero, long codigop, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.codigop = codigop;
        this.ciudad = ciudad;
    }
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public long getCodigop() {
        return codigop;
    }

    public void setCodigop(long codigop) {
        this.codigop = codigop;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
     @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + ", codigop=" + codigop + ", ciudad=" + ciudad + '}';
    }
   
    
}

