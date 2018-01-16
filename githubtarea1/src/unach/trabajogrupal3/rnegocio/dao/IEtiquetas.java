
package unach.trabajogrupal3.rnegocio.dao;

import java.util.List;
import unach.trabajogrupal3.rnegocio.entidades.*;


public interface IEtiquetas {
    public int insertar( Etiquetas etiquetas) throws Exception;
     public List<Etiquetas> obtener() throws Exception;
     public Etiquetas obtener(int codigo) throws Exception;   
    
}
