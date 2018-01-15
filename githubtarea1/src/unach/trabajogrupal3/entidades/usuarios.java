/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unach.trabajogrupal3.entidades;

/**
 *
 * @author Usuario
 */
public class usuarios {
    private int id;
    private String nombre;
    private String email;
    private String pasword;
    private int rol_id;
    private String creado;
    private String actualizado;

    public usuarios() {
    
    }

    public usuarios(int id, String nombre, String email, String pasword, int rol_id, String creado, String actualizado) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.pasword = pasword;
        this.rol_id = rol_id;
        this.creado = creado;
        this.actualizado = actualizado;
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

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getCreado() {
        return creado;
    }

    public void setCreado(String creado) {
        this.creado = creado;
    }

    public String getActualizado() {
        return actualizado;
    }

    public void setActualizado(String actualizado) {
        this.actualizado = actualizado;
    }
}
