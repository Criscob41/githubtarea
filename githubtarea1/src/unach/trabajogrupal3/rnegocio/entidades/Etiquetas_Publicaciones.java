
package unach.trabajogrupal3.rnegocio.entidades;
import java.util.*;

public class Etiquetas_Publicaciones {

private Publicaciones publicaciones;
private Etiquetas etiquetas;    
private int id_etipubli;
private Date creado;
private Date actualizado; 

public Etiquetas_Publicaciones() {
    
}

    public Etiquetas_Publicaciones(Publicaciones publicaciones, Etiquetas etiquetas, int id_etipubli, Date creado, Date actualizado) {
        this.publicaciones = publicaciones;
        this.etiquetas = etiquetas;
        this.id_etipubli = id_etipubli;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Publicaciones getPublicaciones() {
        return publicaciones;
    }

    public void setPublicaciones(Publicaciones publicaciones) {
        this.publicaciones = publicaciones;
    }

    public Etiquetas getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(Etiquetas etiquetas) {
        this.etiquetas = etiquetas;
    }

    public int getId_etipubli() {
        return id_etipubli;
    }

    public void setId_etipubli(int id_etipubli) {
        this.id_etipubli = id_etipubli;
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
