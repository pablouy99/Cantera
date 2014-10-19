/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import operaciones.clsFuncionario;

/**
 *
 * @author Usuario
 */
public class pFuncionario extends clsPersistencia{
    
    public int ultimoIndice(int concesion) {
        int id = 0;
        ResultSet rs;

        try {
            rs = selectQuery("SELECT MAX(numeroFunc) as numeroFunc FROM funcionario WHERE concesion=" + concesion + ";");
            rs.first();
            id = Integer.parseInt(rs.getString("numeroFunc"))+1;


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public boolean ingresar(clsFuncionario func){
        boolean resultado = false;
              
       resultado = executeQuery("INSERT INTO funcionario (numeroFunc, nombre, apellido, categoria, libre, concesion, chapa, turno) VALUES ("+ func.getNroFunc() +",'" + func.getNombre() +"','"+ func.getApellido() + "'," +
                func.getCategoria() + "," + func.getLibre() +","+ func.getConcesion() + "," + func.getChapa() + "," + func.getTurno() +")"); 
        
        return resultado;
    }
    
    public boolean modificar(clsFuncionario func){
        boolean resultado = false;
              
       resultado = executeQuery("UPDATE funcionario SET numeroFunc=" + func.getNroFunc() + ", nombre='"+ func.getNombre() +"', apellido='" + func.getApellido()+ "', categoria="+ func.getCategoria() +", libre="+ func.getLibre() +", chapa=" + func.getChapa() + " , turno=" + func.getTurno()+" WHERE numeroFunc="+ func.getNroFunc()); 
        
        return resultado;
    }
    
    public ArrayList buscarFunc(int nroFun){
          ArrayList userList = new ArrayList();
          ResultSet rs;

        try {
            rs = selectQuery("select numeroFunc, nombre, apellido, categoria.categoria, libre, chapa, turno from funcionario inner join categoria on categoria.idcategoria=funcionario.categoria where numeroFunc=" + nroFun + ";");
            //rs.first();
            

        while(rs.next()){
            userList.add(rs.getString("numeroFunc"));
            userList.add(rs.getString("nombre"));
            userList.add(rs.getString("apellido"));
            userList.add(rs.getString("categoria"));
            userList.add(rs.getString("libre"));
            userList.add(rs.getString("chapa"));
            userList.add(rs.getString("turno"));
       }
       } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
    
    public ArrayList buscarFuncPorChapa(int nroFun){
          ArrayList userList = new ArrayList();
          ResultSet rs;

        try {
            rs = selectQuery("select numeroFunc, nombre, apellido, categoria, libre, chapa, turno, concesion from funcionario where chapa=" + nroFun + ";");
            //rs.first();
            

        while(rs.next()){
            userList.add(rs.getString("numeroFunc"));
            userList.add(rs.getString("nombre"));
            userList.add(rs.getString("apellido"));
            userList.add(rs.getString("categoria"));
            userList.add(rs.getString("libre"));
            userList.add(rs.getString("chapa"));
            userList.add(rs.getString("turno"));
            userList.add(rs.getString("concesion"));
       }
       } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    }
    
    public boolean bajaFunc(int nroFun){
       boolean resultado = false;
                 
       resultado = executeQuery("DELETE FROM funcionario WHERE numeroFunc=" + nroFun +";");
       
        return resultado;
    }
    
    public ArrayList listarTurno(int pTurno){
        ArrayList userList = new ArrayList();
          ResultSet rs;

        try {
            rs = selectQuery("select chapa, nombre, apellido from funcionario where turno=" + pTurno + ";");
            
            

        while(rs.next()){
            userList.add(rs.getString("chapa"));
            userList.add(rs.getString("nombre"));
            userList.add(rs.getString("apellido"));
            
       }
       } catch (SQLException e) {
            e.printStackTrace();
        }
        return userList;
    
    
    }
 
}
