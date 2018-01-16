package progra_taller.rnegocio.entidades;

import java.util.Date;

public class Usuario {

    private int idusuario;
    private String nombre;
    private String email;
    private String password;
    private Date creado;
    private Date actualizado;
    private Rol rol;

    public Usuario() {
    }

    public Usuario(int idusuario, String nombre, String email, String password, Date creado, Date actualizado, Rol rol) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.creado = creado;
        this.actualizado = actualizado;
        this.rol = rol;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    

    
}
