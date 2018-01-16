package progra_taller.rnegocio.Impl;

import progra_taller.rnegocio.dao.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import progra_taller.accesodatos.*;
import progra_taller.rnegocio.entidades.Nivel;
import java.util.Date;
/**
 *
 * @author WILCXMAC
 */
public class NivelImpl implements INivel{
    
      @Override
    public int insertar(Nivel nivel) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into nivel values(?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, nivel.getIdnivel()));
        lstPar.add(new Parametro(2, nivel.getNombre()));
        lstPar.add(new Parametro(3, nivel.getCreado()));
        lstPar.add(new Parametro(4, nivel.getActualizado()));
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
    public List<Nivel> obtener() throws Exception{
        List<Nivel> lista = new ArrayList<>();
        
        String sql="SELECT * FROM nivel;";
        Conexion con = null;
        try{
            Nivel nivel = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                nivel = new Nivel();
                nivel.setIdnivel(rst.getInt(1));
                nivel.setNombre(rst.getString(2));
                nivel.setCreado(rst.getDate(3));
                nivel.setActualizado(rst.getDate(4));
                lista.add(nivel);
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
    public Nivel obtener(int codigo) throws Exception{
        Nivel nivel = null;
        String sql="SELECT * FROM nivel where idnivel=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                nivel = new Nivel();
                nivel.setIdnivel(rst.getInt(1));
                nivel.setNombre(rst.getString(2));
                nivel.setCreado(rst.getDate(3));
                nivel.setActualizado(rst.getDate(4));
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return nivel;
    }  
}
