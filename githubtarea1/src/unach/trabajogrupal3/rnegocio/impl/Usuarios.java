//
//package unach.trabajogrupal3.rnegocio.impl;
//
//
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.List;
//import unach.trabajogrupal3.rnegocio.accesodatos.*;
//import unach.trabajogrupal3.rnegocio.dao.*;
//import unach.trabajogrupal3.rnegocio.entidades.*;
//import unach.trabajogrupal3.rnegocio.impl.*;
// 
//
//
//////public class Usuarios implements IUsuarios {
//////    @Override
////    public int insertar(Usuarios usuarios ) throws Exception{
//        int numFilasAfectadas=0;
//        String sql="insert into Usuarios values(?,?,?,?,?,?,?)";
//        List<Parametro> lstPar = new ArrayList<>();
//        lstPar.add(new Parametro(1, usuarios.getRoles().getId()));
//        lstPar.add(new Parametro(2, usuarios.getId()));
//        lstPar.add(new Parametro(3, usuarios.getNombre()));
//        lstPar.add(new Parametro(4, usuarios.getEmail()));
//        lstPar.add(new Parametro(5, usuarios.getPasword()));
//        lstPar.add(new Parametro(6, usuarios.getCreado()));
//        lstPar.add(new Parametro(7, usuarios.getActualizado()));
//        Conexion con = null;
//        try{
//            con = new Conexion();
//            con.conectar();
//            numFilasAfectadas=con.ejecutaComando(sql, lstPar);
//        }catch (Exception e) {
//            throw e;
//        }finally {
//            if(con!=null)
//            con.desconectar();
//        }
//        return numFilasAfectadas;
//    }
//    @Override
//    public List<Usuarios> obtener() throws Exception{
//        List<Usuarios> lista = new ArrayList<>();
//        
//        String sql="SELECT * FROM Usuarios;";
//        Conexion con = null;
//        try{
//            Usuarios usuarios = null;
//            con = new Conexion();
//            con.conectar();
//            ResultSet rst = con.ejecutaQuery(sql, null);
//            while (rst.next()){
//                usuarios = new Usuarios();
//                usuarios.setId(rst.getInt(1));
//                usuarios.setNombre(rst.getString(2));
//                usuarios.setEmail(rst.getString(3));
//                usuarios.setPasword(rst.getString(4));
//                usuarios.setCreado(rst.getDate(5));
//                usuarios.setActualizado(rst.getDate(6));
//                IRoles rolesdao = new RolesImpl();
//                Roles roles = rolesdao.obtener(rst.getInt(7));
//                usuarios.setRoles(roles);
//                lista.add(usuarios);
//                
//           }
//        }catch (Exception e) {
//            throw e;
//        }finally {
//            if(con!=null)
//            con.desconectar();
//        }
//        return lista;
//    }  
//    @Override
//    public Usuarios obtener(int codigo) throws Exception{
//        return null;
//        
//    }  
//}
