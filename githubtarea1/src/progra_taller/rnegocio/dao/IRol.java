package progra_taller.rnegocio.dao;
import progra_taller.rnegocio.entidades.*;
import java.util.List;

public interface IRol {
     public int insertar(Rol rol) throws Exception;
     public List<Rol> obtener() throws Exception;
     public Rol obtener(int codigo) throws Exception;   
}
