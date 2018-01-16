package progra_taller.rnegocio.entidades;
import java.util.Date;
public class Publicacion {
    private int idpublicacion;
    private Usuario usuario;
    private Nivel nivel;
    private String titulo;
    private String contenido;
    private int publicado;
    private int vistas;
    private Double votos;
    private Date creado;
    private Date actualizado;

    public Publicacion() {
    }

    public Publicacion(int idpublicacion, Usuario usuario, Nivel nivel, String titulo, String contenido, int publicado, int vistas, Double votos, Date creado, Date actualizado) {
        this.idpublicacion = idpublicacion;
        this.usuario = usuario;
        this.nivel = nivel;
        this.titulo = titulo;
        this.contenido = contenido;
        this.publicado = publicado;
        this.vistas = vistas;
        this.votos = votos;
        this.creado = creado;
        this.actualizado = actualizado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public int getIdpublicacion() {
        return idpublicacion;
    }

    public void setIdpublicacion(int idpublicacion) {
        this.idpublicacion = idpublicacion;
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

    public Double getVotos() {
        return votos;
    }

    public void setVotos(Double votos) {
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
