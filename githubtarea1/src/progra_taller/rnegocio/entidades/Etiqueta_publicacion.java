package progra_taller.rnegocio.entidades;

import java.util.*;

public class Etiqueta_publicacion {

      private int Id_Eti_pub;
    private Etiqueta etiqueta;
    private Publicacion publicacion;
    private Date Creado;
    private Date Actualizado;

    public Etiqueta_publicacion() {
    }

    public Etiqueta_publicacion(int Id_Eti_pub, Etiqueta etiqueta, Publicacion publicacion, Date Creado, Date Actualizado) {
        this.Id_Eti_pub = Id_Eti_pub;
        this.etiqueta = etiqueta;
        this.publicacion = publicacion;
        this.Creado = Creado;
        this.Actualizado = Actualizado;
    }

    public Date getActualizado() {
        return Actualizado;
    }

    public void setActualizado(Date Actualizado) {
        this.Actualizado = Actualizado;
    }

    public int getId_Eti_pub() {
        return Id_Eti_pub;
    }

    public void setId_Eti_pub(int Id_Eti_pub) {
        this.Id_Eti_pub = Id_Eti_pub;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    public Date getCreado() {
        return Creado;
    }

    public void setCreado(Date Creado) {
        this.Creado = Creado;
    }

}
