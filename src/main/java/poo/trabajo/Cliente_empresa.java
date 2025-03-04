package poo.trabajo;

/**
 *
 * @author josed y maria
 */
public class Cliente_empresa extends Cliente{
    private String cif;
    private String web;
/**
 * 
 * @param cif
 * @param web
 * @param nombre
 * @param correo_electronico
 * @param clave
 * @param telefono
 * @param direccion
 * @param tarjeta 
 */
    public Cliente_empresa(String cif, String web, String nombre, String correo_electronico, String clave, long telefono, Direccion direccion, Tarjeta tarjeta) {
        super(nombre, correo_electronico, clave, telefono, direccion, tarjeta);
        this.cif = cif;
        this.web = web;
    }

    
    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Cliente_empresa{" + "cif=" + cif + ", web=" + web  + "nombre=" + nombre + ", correo_electronico=" + correo_electronico + ", clave=" + clave + ", direccion=" + direccion + ", tarjeta=" + tarjeta + ", telefono=" + telefono + '}';
    }
    
}
