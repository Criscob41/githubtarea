package taller.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.Impl.*;

public class EtiquetaTest {
    public EtiquetaTest() {
    }
    @Test
    public void pruebageneral(){
        //              INSERTAR
        int filasAfectadas =0;
        IEtiqueta etiquetaDao = new EtiquetaImpl();
        Etiqueta etiqueta = new Etiqueta(5,"Etiqueta3",new Date(),new Date());
        try{
            filasAfectadas = etiquetaDao.insertar(etiqueta);
            System.out.println("Etiqueta ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE etiqueta
        List<Etiqueta> lista = new ArrayList<>();
        try {
            lista = etiquetaDao.obtener();
            for (Etiqueta c:lista){
                System.out.println("Id_etiqueta :"+c.getIdetiqueta());
                System.out.println("Nombre :"+c.getNombre());
                System.out.println("Fecha de creacion :"+c.getCreado());
            System.out.println("Fecha de actualizacion :"+c.getActualizado());
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
        assertTrue(lista.size()>0);
    }

}