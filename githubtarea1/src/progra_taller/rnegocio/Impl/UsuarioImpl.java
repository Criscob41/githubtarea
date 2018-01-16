package progra_taller.rnegocio.Impl;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import progra_taller.accesodatos.*;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;

public class UsuarioImpl implements IUsuario{

    @Override
    public int insertar(Usuario usuario) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into usuario values(?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, usuario.getIdusuario()));
        lstPar.add(new Parametro(2, usuario.getNombre()));
        lstPar.add(new Parametro(3, usuario.getEmail()));
        lstPar.add(new Parametro(4, usuario.getPassword()));
        lstPar.add(new Parametro(6, usuario.getCreado()));
        lstPar.add(new Parametro(7, usuario.getActualizado()));
        lstPar.add(new Parametro(5, usuario.getRol().getIdrol()));
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
    public List<Usuario> obtener() throws Exception{
        List<Usuario> lista = new ArrayList<>();
        
        String sql="SELECT * FROM usuario;";
        Conexion con = null;
        try{
            Usuario usuario = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                usuario = new Usuario();
                usuario.setIdusuario(rst.getInt(1));
                usuario.setNombre(rst.getString(2));
                usuario.setEmail(rst.getString(3));
                usuario.setPassword(rst.getString(4));
                usuario.setCreado(rst.getDate(6));
                usuario.setActualizado(rst.getDate(7));
                IRol roldao = new RolImpl();
                Rol rol = roldao.obtener(rst.getInt(5));
                usuario.setRol(rol);
                lista.add(usuario);
               
                
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
    public Usuario obtener(int codigo) throws Exception{
        Usuario usuario = null;
        String sql="SELECT * FROM usuario where Idusuario=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                usuario = new Usuario();
                usuario.setIdusuario(rst.getInt(1));
                usuario.setNombre(rst.getString(2));
                usuario.setEmail(rst.getString(3));
                usuario.setPassword(rst.getString(4));
                usuario.setCreado(rst.getDate(6));
                usuario.setActualizado(rst.getDate(7));
                IRol roldao = new RolImpl();
                Rol rol = roldao.obtener(rst.getInt(5));
                usuario.setRol(rol);
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return usuario;
    }  
}