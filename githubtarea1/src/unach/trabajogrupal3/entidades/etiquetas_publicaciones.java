
package unach.trabajogrupal3.entidades;

public class etiquetas_publicaciones {

private int etiqueta_id;
private int publicacion_id;
private String creado;
private String actualizado; 

public etiquetas_publicaciones() {
    
}

    public int getEtiqueta_id() {
        return etiqueta_id;
    }

    public void setEtiqueta_id(int etiqueta_id) {
        this.etiqueta_id = etiqueta_id;
    }

    public int getPublicacion_id() {
        return publicacion_id;
    }

    public void setPublicacion_id(int publicacion_id) {
        this.publicacion_id = publicacion_id;
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

    public etiquetas_publicaciones(int etiqueta_id, int publicacion_id, String creado, String actualizado) {
        this.etiqueta_id = etiqueta_id;
        this.publicacion_id = publicacion_id;
        this.creado = creado;
        this.actualizado = actualizado;
    }
}
