package progra_taller.rnegocio.entidades;
import java.util.Date;
public class Rol {
  
     private int idrol; 
     private String nombre;
     private Date creado;
     private Date actualizado;

    public Rol() {
    }

    public Rol(int idrol, String nombre, Date creado, Date actualizado) {
        this.idrol = idrol;
        this.nombre = nombre;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public int getIdrol() {
        return idrol;
    }

    public void setIdrol(int idrol) {
        this.idrol = idrol;
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
