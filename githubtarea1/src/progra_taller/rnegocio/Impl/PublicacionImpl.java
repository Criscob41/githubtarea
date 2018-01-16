package progra_taller.rnegocio.Impl;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import progra_taller.accesodatos.Conexion;
import progra_taller.accesodatos.Parametro;
import progra_taller.rnegocio.entidades.*;
import progra_taller.rnegocio.dao.*;

/**
 *
 * @author WILCXMAC
 */
public class PublicacionImpl implements IPublicacion{
      @Override
    public int insertar(Publicacion publicacion) throws Exception{
        int numFilasAfectadas=0;
          String sql = "insert into publicacion values(?,?,?,?,?,?,?,?,?,?)";
          List<Parametro> lstPar = new ArrayList<>();
          lstPar.add(new Parametro(1, publicacion.getIdpublicacion()));
          lstPar.add(new Parametro(2, publicacion.getUsuario().getIdusuario()));
          lstPar.add(new Parametro(3, publicacion.getNivel().getIdnivel()));
          lstPar.add(new Parametro(4, publicacion.getTitulo()));
          lstPar.add(new Parametro(5, publicacion.getContenido()));
          lstPar.add(new Parametro(6, publicacion.getPublicado()));
          lstPar.add(new Parametro(7, publicacion.getVistas()));
          lstPar.add(new Parametro(8, publicacion.getVotos()));
          lstPar.add(new Parametro(9, publicacion.getCreado()));
          lstPar.add(new Parametro(10, publicacion.getActualizado()));
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
    public List<Publicacion> obtener() throws Exception{
        List<Publicacion> lista = new ArrayList<>();
        
        String sql="SELECT * FROM publicacion;";
        Conexion con = null;
        try{
            Publicacion publicacion = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                publicacion = new Publicacion();
                publicacion.setIdpublicacion(rst.getInt(1));
                IUsuario usuariodao = new UsuarioImpl();
                Usuario usuario = usuariodao.obtener(rst.getInt(2));
                publicacion.setUsuario(usuario);
                INivel niveldao = new NivelImpl();
                Nivel nivel = niveldao.obtener(rst.getInt(3));
                publicacion.setNivel(nivel);
                publicacion.setTitulo(rst.getString(4));
                publicacion.setContenido(rst.getString(5));
                publicacion.setPublicado(rst.getInt(6));
                publicacion.setVistas(rst.getInt(7));
                publicacion.setVotos(rst.getDouble(8));
                publicacion.setCreado(rst.getDate(9));
                publicacion.setActualizado(rst.getDate(10));
                lista.add(publicacion);
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
    public Publicacion obtener(int codigo) throws Exception{
        Publicacion publicacion = null;
        String sql="SELECT * FROM publicacion where idpublicacion=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                publicacion = new Publicacion();
                publicacion.setIdpublicacion(rst.getInt(1));
                IUsuario usuariodao = new UsuarioImpl();
                Usuario usuario = usuariodao.obtener(rst.getInt(2));
                publicacion.setUsuario(usuario);
                INivel niveldao = new NivelImpl();
                Nivel nivel = niveldao.obtener(rst.getInt(3));
                publicacion.setNivel(nivel);
                publicacion.setTitulo(rst.getString(4));
                publicacion.setContenido(rst.getString(5));
                publicacion.setPublicado(rst.getInt(6));
                publicacion.setVistas(rst.getInt(7));
                publicacion.setVotos(rst.getDouble(8));
                publicacion.setCreado(rst.getDate(9));
                publicacion.setActualizado(rst.getDate(10));
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return publicacion;
}
    }
