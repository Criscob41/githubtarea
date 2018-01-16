
package unach.trabajogrupal3.rnegocio.entidades;
import java.util.*;

public class Usuarios {
    private Roles roles;
    private int id;
    private String nombre;
    private String email;
    private String pasword;
    private Date creado;
    private Date actualizado;

    public Usuarios() {
    
    }

    public Usuarios(Roles roles, int id, String nombre, String email, String pasword, Date creado, Date actualizado) {
        this.roles = roles;
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.pasword = pasword;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
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