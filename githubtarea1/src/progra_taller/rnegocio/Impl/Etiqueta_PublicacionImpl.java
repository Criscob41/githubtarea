package progra_taller.rnegocio.Impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import progra_taller.accesodatos.*;
import progra_taller.rnegocio.dao.*;
import progra_taller.rnegocio.entidades.*;





public class Etiqueta_publicacionImpl implements IEtiqueta_publicacion{
     @Override
    public int insertar(Etiqueta_publicacion etiqueta_publicacion) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into etiqueta_publicacion values(?,?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, etiqueta_publicacion.getId_Eti_pub()));
        lstPar.add(new Parametro(2, etiqueta_publicacion.getEtiqueta().getIdetiqueta()));
        lstPar.add(new Parametro(3, etiqueta_publicacion.getPublicacion().getIdpublicacion()));
        lstPar.add(new Parametro(4, etiqueta_publicacion.getCreado()));
        lstPar.add(new Parametro(5, etiqueta_publicacion.getActualizado()));
    
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
    public List<Etiqueta_publicacion> obtener() throws Exception{
        List<Etiqueta_publicacion> lista = new ArrayList<>();
        
        String sql="SELECT * FROM etiqueta_publicacion;";
        Conexion con = null;
        try{
            Etiqueta_publicacion etiqueta_publicacion = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                etiqueta_publicacion = new Etiqueta_publicacion();
                etiqueta_publicacion.setId_Eti_pub(rst.getInt(1));
                IEtiqueta etiquetadao = new EtiquetaImpl();
                Etiqueta etiqueta = etiquetadao.obtener(rst.getInt(2));
                etiqueta_publicacion.setEtiqueta(etiqueta);
                IPublicacion niveldao = new PublicacionImpl();
                Publicacion nivel = niveldao.obtener(rst.getInt(3));
                etiqueta_publicacion.setPublicacion(nivel);
                etiqueta_publicacion.setCreado(rst.getDate(4));
                etiqueta_publicacion.setActualizado(rst.getDate(5));
                    lista.add(etiqueta_publicacion);
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
    public Etiqueta_publicacion obtener(int codigo) throws Exception{
        Etiqueta_publicacion etiqueta_publicacion = null;
        String sql="SELECT * FROM etiqueta_publicacion where Id_Eti_pub=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                etiqueta_publicacion = new Etiqueta_publicacion();
                etiqueta_publicacion.setId_Eti_pub(rst.getInt(1));
                IEtiqueta etiquetadao = new EtiquetaImpl();
                Etiqueta etiqueta = etiquetadao.obtener(rst.getInt(2));
                etiqueta_publicacion.setEtiqueta(etiqueta);
                IPublicacion niveldao = new PublicacionImpl();
                Publicacion nivel = niveldao.obtener(rst.getInt(3));
                etiqueta_publicacion.setPublicacion(nivel);
                etiqueta_publicacion.setCreado(rst.getDate(4));
                etiqueta_publicacion.setActualizado(rst.getDate(5));
                etiqueta_publicacion.setEtiqueta(etiqueta);
            }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        
        return etiqueta_publicacion;
        
    }  
}
