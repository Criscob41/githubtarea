
package unach.trabajogrupal3.rnegocio.dao;


import java.util.List;
import unach.trabajogrupal3.rnegocio.entidades.*;



public interface IEtiquetas_Publicaciones {
    public int insertar( Etiquetas_Publicaciones etiquetas_publicaciones) throws Exception;
     public List<Etiquetas_Publicaciones> obtener() throws Exception;
     public Etiquetas_Publicaciones obtener(int codigo) throws Exception;   
    
}
