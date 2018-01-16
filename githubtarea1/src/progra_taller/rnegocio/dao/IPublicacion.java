package progra_taller.rnegocio.dao;
import progra_taller.rnegocio.entidades.*;
import java.util.List;

public interface IPublicacion {
     public int insertar(Publicacion publicacion) throws Exception;
     public List<Publicacion> obtener() throws Exception;
     public Publicacion obtener(int codigo) throws Exception;   
}
