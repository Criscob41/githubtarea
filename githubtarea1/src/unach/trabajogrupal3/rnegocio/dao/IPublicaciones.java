
package unach.trabajogrupal3.rnegocio.dao;

import java.util.List;
import unach.trabajogrupal3.rnegocio.entidades.*;


public interface IPublicaciones {
    public int insertar( Publicaciones publicaciones) throws Exception;
     public List<Publicaciones> obtener() throws Exception;
     public Publicaciones obtener(int codigo) throws Exception;   
    
}
