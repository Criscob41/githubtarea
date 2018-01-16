package progra_taller.rnegocio.dao;
import progra_taller.rnegocio.entidades.*;
import java.util.List;

public interface IEtiqueta_publicacion {
     public int insertar(Etiqueta_publicacion etiqueta_publicacion) throws Exception;
     public List<Etiqueta_publicacion> obtener() throws Exception;
     public Etiqueta_publicacion obtener(int codigo) throws Exception;   
}