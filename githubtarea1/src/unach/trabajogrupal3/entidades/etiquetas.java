
package unach.trabajogrupal3.entidades;
public class etiquetas {
private int id;
private String nombre;
private String creado;
private String actualizado; 

public etiquetas() {
    
    }

    public etiquetas(int id, String nombre, String creado, String actualizado) {
        this.id = id;
        this.nombre = nombre;
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
