package progra_taller.rnegocio.Impl;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import progra_taller.accesodatos.*;
import progra_taller.rnegocio.entidades.Etiqueta;
import progra_taller.rnegocio.dao.*;
public class EtiquetaImpl implements IEtiqueta{
    

      @Override
    public int insertar(Etiqueta etiqueta) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into etiqueta values(?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, etiqueta.getIdetiqueta()));
        lstPar.add(new Parametro(2, etiqueta.getNombre()));
        lstPar.add(new Parametro(3, etiqueta.getCreado()));
        lstPar.add(new Parametro(4, etiqueta.getActualizado()));
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
    public List<Etiqueta> obtener() throws Exception{
        List<Etiqueta> lista = new ArrayList<>();
        
        String sql="SELECT * FROM etiqueta;";
        Conexion con = null;
        try{
            Etiqueta etiqueta = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                etiqueta = new Etiqueta();
                etiqueta.setIdetiqueta(rst.getInt(1));
                etiqueta.setNombre(rst.getString(2));
                etiqueta.setCreado(rst.getDate(3));
                etiqueta.setActualizado(rst.getDate(4));
                lista.add(etiqueta);
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
    public Etiqueta obtener(int codigo) throws Exception{
        Etiqueta etiqueta = null;
        String sql="SELECT * FROM etiqueta where idetiqueta=?;";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, codigo));
        Conexion con = null;
        try{
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, lstPar);
            while (rst.next()){
                etiqueta = new Etiqueta();
                etiqueta.setIdetiqueta(rst.getInt(1));
                etiqueta.setNombre(rst.getString(2));
                etiqueta.setCreado(rst.getDate(3));
                etiqueta.setActualizado(rst.getDate(4));
            }
            
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return etiqueta;
}
}