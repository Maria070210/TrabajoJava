
package poo.trabajo;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author josed y maria
 */
public class Opiniones implements Serializable,Comparable<Opiniones>{
    private int calificacion;
    private String comentario;
    private LocalDate fecaha_comentario;
    /**
     * 
     * @param calificacion 
     */
    public Opiniones(int calificacion) {
        this.calificacion = calificacion;
    }
    /**
     * 
     * @param calificacion
     * @param comentario
     * @param fecaha_comentario 
     */
    public Opiniones(int calificacion, String comentario, LocalDate fecaha_comentario) {
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fecaha_comentario = fecaha_comentario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecaha_comentario() {
        return fecaha_comentario;
    }

    public void setFecaha_comentario(LocalDate fecaha_comentario) {
        this.fecaha_comentario = fecaha_comentario;
    }

    @Override
    public String toString() {
        return "Opiniones{" + "calificacion=" + calificacion + ", comentario=" + comentario + ", fecaha_comentario=" + fecaha_comentario + '}';
    }

    @Override
    public int compareTo(Opiniones o) {
        if(o.getCalificacion()>calificacion){
            return -1;
        }else if(o.getCalificacion()==calificacion){
            return 0;
        }else{
            return 1;
        }
    }
    
} 
