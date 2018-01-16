package taller.Test;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.Impl.*;

public class RolTest {
    public RolTest() {
    }
    @Test
    public void pruebageneral(){
        //              INSERTAR
        int filasAfectadas =0;
        IRol rolDao = new RolImpl();
        Rol rol = new Rol(5,"Administrador2",new Date(),new Date());
        try{
            filasAfectadas = rolDao.insertar(rol);
            System.out.println("Rol ingresado!!!\n");
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        assertEquals(filasAfectadas>0, true);
        //              LISTADO DE ROLES
        List<Rol> lista = new ArrayList<>();
        try {
            lista = rolDao.obtener();
            for (Rol c:lista){
                System.out.println("Id_rol :"+c.getIdrol());
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