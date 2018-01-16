package progra_taller.rnegocio.entidades;
import java.util.Date;
public class Nivel {
    private int idnivel;
    private String nombre;
    private Date creado;
    private Date actualizado;

    public Nivel() {
    }

    public Nivel(int idnivel, String nombre, Date creado, Date actualizado) {
        this.idnivel = idnivel;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Date getActualizado() {
        return actualizado;
    }

    public void setActualizado(Date actualizado) {
        this.actualizado = actualizado;
    }

    public int getIdnivel() {
        return idnivel;
    }

    public void setIdnivel(int idnivel) {
        this.idnivel = idnivel;
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
    
}
