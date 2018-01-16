package progra_taller.rnegocio.dao;
import progra_taller.rnegocio.entidades.*;
import java.util.List;

public interface INivel {
     public int insertar(Nivel nivel) throws Exception;
     public List<Nivel> obtener() throws Exception;
     public Nivel obtener(int codigo) throws Exception;   
}
