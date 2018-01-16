
package unach.trabajogrupal3.rnegocio.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import unach.trabajogrupal3.rnegocio.accesodatos.*;
import unach.trabajogrupal3.rnegocio.dao.*;
import unach.trabajogrupal3.rnegocio.entidades.*;
import unach.trabajogrupal3.rnegocio.impl.*;
 


public class Etiquetas_PublicacionesImpl implements IEtiquetas_Publicaciones {
     @Override
    public int insertar(Etiquetas_Publicaciones etiquetas_publicaciones ) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into prestamo values(?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, etiquetas_publicaciones.getPublicaciones().getId()));
        lstPar.add(new Parametro(2, etiquetas_publicaciones.getEtiquetas().getId()));
        lstPar.add(new Parametro(3, etiquetas_publicaciones.getId_etipubli()));
        lstPar.add(new Parametro(4, etiquetas_publicaciones.getCreado()));
        lstPar.add(new Parametro(4, etiquetas_publicaciones.getActualizado()));
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
    public List<Etiquetas_Publicaciones> obtener() throws Exception{
        List<Etiquetas_Publicaciones> lista = new ArrayList<>();
        
        String sql="SELECT * FROM prestamo;";
        Conexion con = null;
        try{
            Etiquetas_Publicaciones etiquetas_Publicaciones = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
//            while (rst.next()){
//                etiquetas_Publicaciones = new Etiquetas_Publicaciones();
//                etiquetas_Publicaciones.setPublicaciones(rst.getInt(2));
//                etiquetas_Publicaciones.setMonto(rst.getInt(3));
//                etiquetas_Publicaciones.setPlazo(rst.getInt(4));
//                ICuenta cuentadao = new CuentaImp();
//                Cuenta cuenta = cuentadao.obtener(rst.getInt(1));
//                etiquetas_Publicaciones.setCuenta(cuenta);
//                lista.add(etiquetas_Publicaciones);
//           }
        }catch (Exception e) {
            throw e;
        }finally {
            if(con!=null)
            con.desconectar();
        }
        return lista;
    }  
    @Override
    public Etiquetas_Publicaciones obtener(int codigo) throws Exception{
        return null;
        
    }  
}
