
package poo.trabajo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author josed y maria
 */
public class Productos implements  Serializable,Comparable<Productos> {
    private String titulo;
    private String caracteristicas;
    private String categoria;
    private int precio;
    private int strok;
    private LocalDate fecha_entrada;
    private Opiniones opiniones;
    private String foto;
    /**
     * 
     * @param titulo
     * @param caracteristicas
     * @param categoria
     * @param precio
     * @param strok
     * @param fecha_entrada
     * @param opiniones
     * @param foto 
     */

    public Productos(String titulo, String caracteristicas, String categoria, int precio, int strok, LocalDate fecha_entrada, Opiniones opiniones, String foto) {
        this.titulo = titulo;
        this.caracteristicas = caracteristicas;
        this.categoria = categoria;
        this.precio = precio;
        this.strok = strok;
        this.fecha_entrada = fecha_entrada;
        this.opiniones = opiniones;
        this.foto = foto;
    }
    

    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStrok() {
        return strok;
    }

    public void setStrok(int strok) {
        this.strok = strok;
    }

    public LocalDate getFecha_entrada() {
        return fecha_entrada;
    }

    public void setFecha_entrada(LocalDate fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }

    public Opiniones getOpiniones() {
        return opiniones;
    }

    public void setOpiniones(Opiniones opiniones) {
        this.opiniones = opiniones;
    }
     public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
   @Override
    public int hashCode(){
        int hash=7;
        hash=31*hash+Objects.hashCode(this.titulo);
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
        final Productos other = (Productos) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Productos{" + "titulo=" + titulo + ", caracteristicas=" + caracteristicas + ", categoria=" + categoria + ", precio=" + precio + ", strok=" + strok + ", fecha_entrada=" + fecha_entrada + ", opiniones=" + opiniones + '}';
    }

    @Override
    public int compareTo(Productos o) {
        if(o.getPrecio()>precio){
            return -1;
        }else if(o.getPrecio()==precio){
            return 0;
        }else{
            return 1;
        }
    }

    
    
}
