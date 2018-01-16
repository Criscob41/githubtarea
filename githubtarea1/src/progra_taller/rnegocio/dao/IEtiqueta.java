package progra_taller.rnegocio.dao;
import progra_taller.rnegocio.entidades.*;
import java.util.List;

public interface IEtiqueta {
     public int insertar(Etiqueta etiqueta) throws Exception;
     public List<Etiqueta> obtener() throws Exception;
     public Etiqueta obtener(int codigo) throws Exception;   
}
