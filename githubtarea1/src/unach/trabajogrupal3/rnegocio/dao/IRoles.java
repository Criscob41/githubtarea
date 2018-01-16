
package unach.trabajogrupal3.rnegocio.dao;

import java.util.List;
import unach.trabajogrupal3.rnegocio.entidades.*;



public interface IRoles {
    public int insertar( Roles roles) throws Exception;
     public List<Roles> obtener() throws Exception;
     public Roles obtener(int codigo) throws Exception;   
    
}
