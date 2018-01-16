package taller.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.Impl.*;

public class NivelTest {
    public NivelTest() {
    }
    @Test
    public void pruebageneral(){
        //              INSERTAR
        int filasAfectadas =0;
        INivel nivelDao = new NivelImpl();
        Nivel nivel = new Nivel(3,"Tercero",new Date(),new Date());
        try{
            filasAfectadas = nivelDao.insertar(nivel);
            System.out.println("Nivel ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE NIVELES
        List<Nivel> lista = new ArrayList<>();
        try {
            lista = nivelDao.obtener();
            for (Nivel c:lista){
                System.out.println("Id:nivel :"+c.getIdnivel());
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