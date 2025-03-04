package poo.trabajo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author josed y maria
 */
public class Venta implements Serializable {
    private Carro carro;
    private Cliente cliente;
    private LocalDate localDate;
    /**
     * 
     * @param carro
     * @param cliente
     * @param localDate 
     */

    public Venta(Carro carro, Cliente cliente, LocalDate localDate) {
        this.carro = carro;
        this.cliente = cliente;
        this.localDate = localDate;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
    
    @Override
    public int hashCode(){
        int hash=7;
        hash=31*hash+Objects.hashCode(this.cliente.getCorreo_electronico());
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
        final Venta other = (Venta) obj;
        if (!Objects.equals(this.cliente.getCorreo_electronico(), other.cliente.getCorreo_electronico())) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Venta{" + "carro=" + carro + ", cliente=" + cliente + ", localDate=" + localDate + '}';
    }
}
