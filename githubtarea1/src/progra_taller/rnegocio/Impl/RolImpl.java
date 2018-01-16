package progra_taller.rnegocio.Impl;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import progra_taller.accesodatos.*;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;

public class RolImpl implements IRol{

    @Override
    public int insertar(Rol rol) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into rol values(?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, rol.getIdrol()));
        lstPar.add(new Parametro(2, rol.getNombre()));
        lstPar.add(new Parametro(3, rol.getCreado()));
        lstPar.add(new Parametro(4, rol.getActualizado()));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            numFilasAfectadas=con.ejecutaComando(sql, lstPar);
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return numFilasAfectadas;
    }
    @Override
    public List<Rol> obtener() throws Exception{
        List<Rol> lista = new ArrayList<>();
        
        String sql="SELECT * FROM rol;";
        Conexion con = null;
        try{
            Rol rol = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                rol = new Rol();
                rol.setIdrol(rst.getInt(1));
                rol.setNombre(rst.getString(2));
                rol.setCreado(rst.getDate(3));
                rol.setActualizado(rst.getDate(4));
                lista.add(rol);
           }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }  
    @Override
    public Rol obtener(int codigo) throws Exception{
        Rol rol = null;
        String sql="SELECT * FROM rol where idrol=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                rol = new Rol();
                rol.setIdrol(rst.getInt(1));
                rol.setNombre(rst.getString(2));
                rol.setCreado(rst.getDate(3));
                rol.setActualizado(rst.getDate(4));
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return rol;
    }  
}