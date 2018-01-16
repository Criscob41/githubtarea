package taller.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import progra_taller.rnegocio.Impl.*;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.Impl.*;

public class Etiqueta_publicacionTest {
    public Etiqueta_publicacionTest() {
    }
    @Test
    public void pruebageneral() throws Exception{
        //              INSERTAR
        int filasAfectadas =0;
        IEtiqueta_publicacion etiqueta_publicacionDao = new Etiqueta_publicacionImpl();
        IEtiqueta etiquetaDao = new EtiquetaImpl();
        Etiqueta etiqueta = etiquetaDao.obtener(1);
        IPublicacion publicacionDao = new PublicacionImpl();
        Publicacion publicacion = publicacionDao.obtener(1);
        Etiqueta_publicacion etiqueta_publicacion = new Etiqueta_publicacion(1,etiqueta,publicacion,new Date(),new Date());
        
        try{
            filasAfectadas = etiqueta_publicacionDao.insertar(etiqueta_publicacion);
            System.out.println("Ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE PEdido
        List<Etiqueta_publicacion> lista = new ArrayList<>();
        try {
            lista = etiqueta_publicacionDao.obtener();
            for (Etiqueta_publicacion c:lista){
                System.out.println("Id :"+c.getId_Eti_pub());
                System.out.println("Etiqueta :"+c.getEtiqueta().getIdetiqueta());
                System.out.println("Publicacion :"+c.getPublicacion().getIdpublicacion());
                System.out.println("Fecha creado :"+c.getCreado());
                System.out.println("Fecha actualizado :"+c.getActualizado());
                
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}
