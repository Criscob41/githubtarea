
package unach.trabajogrupal3.rnegocio.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import unach.trabajogrupal3.rnegocio.accesodatos.*;
import unach.trabajogrupal3.rnegocio.dao.*;
import unach.trabajogrupal3.rnegocio.entidades.*;
import unach.trabajogrupal3.rnegocio.impl.*;
    
public class RolesImpl implements IRoles {
    @Override
    public int insertar(Roles roles) throws Exception{
        int numFilasAfectadas=0;
        String sql="insert into roles values(?,?,?,?)";
        List<Parametro> lstPar = new ArrayList<>();
        lstPar.add(new Parametro(1, roles.getId()));
        lstPar.add(new Parametro(2, roles.getNombre()));
        lstPar.add(new Parametro(3, roles.getCreado()));
        lstPar.add(new Parametro(4, roles.getActualizado()));
       
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
    public List<Roles> obtener() throws Exception{
        List<Roles> lista = new ArrayList<>();
        
        String sql="SELECT * FROM roles;";
        Conexion con = null;
        try{
            Roles roles = null;
            con = new Conexion();
            con.conectar();
            ResultSet rst = con.ejecutaQuery(sql, null);
            while (rst.next()){
                roles = new Roles();
                roles.setId(rst.getInt(1));
                roles.setNombre(rst.getString(2));
                roles.setCreado(rst.getDate(3));
                roles.setActualizado(rst.getDate(4));
                lista.add(roles);
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
    public Roles obtener(int codigo) throws Exception{
        
        return null;
    }  
}
    

