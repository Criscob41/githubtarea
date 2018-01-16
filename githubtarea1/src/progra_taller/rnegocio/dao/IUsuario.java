package progra_taller.rnegocio.dao;
import progra_taller.rnegocio.entidades.*;
import java.util.List;

public interface IUsuario {
     public int insertar(Usuario usuario) throws Exception;
     public List<Usuario> obtener() throws Exception;
     public Usuario obtener(int codigo) throws Exception;   
}
