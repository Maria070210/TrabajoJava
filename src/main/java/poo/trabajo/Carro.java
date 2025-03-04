package poo.trabajo;

import java.io.Serializable;

/**
 *
 * @author josed y maria
 */
public class Carro implements Serializable{
    private Productos productos;
    private int cantidad;
    private int precio;
    /**
     * 
     * @param productos
     * @param cantidad
     * @param precio 
     */

    public Carro(Productos productos, int cantidad, int precio) {
        this.productos = productos;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Productos getProductos() {
        
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
 @Override
    public String toString() {
        return "Carro{" + "productos=" + productos + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
}