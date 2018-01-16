
package unach.trabajogrupal3.rnegocio.dao;

import java.util.List;
import unach.trabajogrupal3.rnegocio.entidades.*;


public interface IUsuarios {
     public int insertar( Usuarios usuarios) throws Exception;
     public List<Usuarios> obtener() throws Exception;
     public Usuarios obtener(int codigo) throws Exception;   
    
}
