 
package unach.trabajogrupal3.rnegocio.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import unach.trabajogrupal3.rnegocio.accesodatos.*;
import unach.trabajogrupal3.rnegocio.dao.*;
import unach.trabajogrupal3.rnegocio.entidades.*;
import unach.trabajogrupal3.rnegocio.impl.*;
 


public class PublicacionesImpl implements IPublicaciones {
     @Override
    public int insertar(Publicaciones publicaciones ) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into prestamo values(?,?,?,?,?,?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, publicaciones.getNiveles().getId()));
        lstPar.add(new Parametro(2, publicaciones.getUsuarios().getId()));
        lstPar.add(new Parametro(3, publicaciones.getId()));
        lstPar.add(new Parametro(4, publicaciones.getTitulo()));
        lstPar.add(new Parametro(5, publicaciones.getContenido()));
        lstPar.add(new Parametro(6, publicaciones.getPublicado()));
        lstPar.add(new Parametro(7, publicaciones.getVistas()));
        lstPar.add(new Parametro(7, publicaciones.getVotos()));
        lstPar.add(new Parametro(8, publicaciones.getCreado()));
        lstPar.add(new Parametro(10, publicaciones.getActualizado()));
        
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
    public List<Publicaciones> obtener() throws Exception{
        List<Publicaciones> lista = new ArrayList<>();
        
        String sql="SELECT * FROM Publicaciones;";
        Conexion con = null;
        try{
            Publicaciones publicaciones = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                publicaciones = new Publicaciones();
                publicaciones.setId(rst.getInt(1));
                publicaciones.setTitulo(rst.getString(1));
                publicaciones.setContenido(rst.getString(1));
                publicaciones.setPublicado(rst.getInt(1));
                publicaciones.setVistas(rst.getInt(1));
                publicaciones.setVotos(rst.getDouble(1));
                publicaciones.setCreado(rst.getDate(2));
                publicaciones.setActualizado(rst.getDate(3));
                IUsuarios usuariosdao = new UsuariosImp();
                Usuarios usuarios = usuariosdao.obtener(rst.getInt(4));
                publicaciones.setUsuarios(usuarios);
                
                 INiveles nivelesdao = new NivelesImpl();
                Niveles niveles = nivelesdao.obtener(rst.getInt(5));
                publicaciones.setNiveles(niveles);
                lista.add(publicaciones);
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
    public Publicaciones obtener(int codigo) throws Exception{
        return null;
        
    }  
}
