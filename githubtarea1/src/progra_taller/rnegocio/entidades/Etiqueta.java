package progra_taller.rnegocio.entidades;
import java.util.Date;
public class Etiqueta {
    private int idetiqueta;
    private String nombre;
    private Date creado;
    private Date actualizado;

    public Etiqueta() {
    }

    public Etiqueta(int idetiqueta, String nombre, Date creado, Date actualizado) {
        this.idetiqueta = idetiqueta;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdetiqueta() {
        return idetiqueta;
    }

    public void setIdetiqueta(int idetiqueta) {
        this.idetiqueta = idetiqueta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    public Date getActualizado() {
        return actualizado;
    }

    public void setActualizado(Date actualizado) {
        this.actualizado = actualizado;
    }

    
    
}
