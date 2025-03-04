package poo.trabajo;

import java.io.Serializable;


/**
 *
 * @author jose y maria
 */
public class Tarjeta implements Serializable{
    private String titular;
    private long numero;
    private String fecha_caducidad;

    /**
     * 
     * @param titular
     * @param numero
     * @param fecha_caducidad 
     */
    public Tarjeta(String titular, long numero, String fecha_caducidad) {
        this.titular = titular;
        this.numero = numero;
        this.fecha_caducidad = fecha_caducidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getFecha_caducidad() {
        return fecha_caducidad;
    }

    public void setFecha_caducidad(String fecha_caducidad) {
        this.fecha_caducidad = fecha_caducidad;
    }
     @Override
    public String toString() {
        return "Tarjeta{" + "nombre=" + titular + ", titular=" + numero + ", fecha_caducidad=" + fecha_caducidad + '}';
    }
}
