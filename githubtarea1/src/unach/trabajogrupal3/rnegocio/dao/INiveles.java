
package unach.trabajogrupal3.rnegocio.dao;

import java.util.List;
import unach.trabajogrupal3.rnegocio.entidades.Niveles;


public interface INiveles {
    public int insertar( Niveles niveles) throws Exception;
     public List<Niveles> obtener() throws Exception;
     public Niveles obtener(int codigo) throws Exception;   
    
}
