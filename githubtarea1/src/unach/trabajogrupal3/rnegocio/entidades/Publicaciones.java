
package unach.trabajogrupal3.rnegocio.entidades;
import java.util.*;



public class Publicaciones {
    private Niveles niveles;
    private Usuarios usuarios;
    private int id;
    private String titulo;
    private String contenido;
    private int publicado;
    private int vistas;
    private double votos;
    private Date creado;
    private Date actualizado;

    public Publicaciones() {
        
    }       

    public Publicaciones(Niveles niveles, Usuarios usuarios, int id, String titulo, String contenido, int publicado, int vistas, double votos, Date creado, Date actualizado) {
        this.niveles = niveles;
        this.usuarios = usuarios;
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.publicado = publicado;
        this.vistas = vistas;
        this.votos = votos;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Niveles getNiveles() {
        return niveles;
    }

    public void setNiveles(Niveles niveles) {
        this.niveles = niveles;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getPublicado() {
        return publicado;
    }

    public void setPublicado(int publicado) {
        this.publicado = publicado;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }

    public double getVotos() {
        return votos;
    }

    public void setVotos(double votos) {
        this.votos = votos;
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
