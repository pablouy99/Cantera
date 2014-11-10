/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import operaciones.clsUnidad;

/**
 *
 * @author Usuario
 */
public class pUnidad extends clsPersistencia{
       
    public ArrayList buscarUnidad(String matricula){
        ArrayList resultado = new ArrayList();
        ResultSet rs;

        try {
            rs = selectQuery("SELECT matricula, marca, modelo, km, horimetro FROM unidades WHERE matricula LIKE '%" + matricula + "';");
            //rs.first();
            

        while(rs.next()){
            resultado.add(rs.getString("matricula"));
            resultado.add(rs.getString("marca"));
            resultado.add(rs.getString("modelo"));
            resultado.add(rs.getString("km"));
            resultado.add(rs.getString("horimetro"));
            
       }
       } catch (SQLException e) {
            e.printStackTrace();
        }
              
    return resultado; 
    }
    
    public boolean ingresar(clsUnidad uni){
        boolean resultado = false;
              
       resultado = executeQuery("INSERT INTO unidades (matricula, marca, modelo, km, horimetro) VALUES ("+ uni.getMatricula()+ ",'" + uni.getMarca() +"','"+ uni.getModelo() + "'," +
                uni.getKilometros() + "," + uni.getTomaFuerza()); 
        
        return resultado;
    }
    
    public boolean modificar(clsUnidad uni){
        boolean resultado = false;
              
       resultado = executeQuery("UPDATE unidades SET matricula=" + uni.getMatricula() + ", marca='"+ uni.getMarca() +"', modelo='" + uni.getModelo()+ "', km="+ uni.getKilometros()+", horimetro=" + uni.getTomaFuerza() +" WHERE matricula="+ uni.getMatricula()); 
        
        return resultado;
    }
       
    public boolean bajaUnidad(int matricula){
       boolean resultado = false;
                 
       resultado = executeQuery("DELETE FROM unidades WHERE matricula=" + matricula +";");
       
        return resultado;
    }
    
    public ArrayList listarUnidades(){
        ArrayList unidadesActivas = new ArrayList();
          ResultSet rs;

        try {
            rs = selectQuery("SELECT matricula FROM unidades;");
            
            

        while(rs.next()){
            unidadesActivas.add(rs.getString("matricula"));
            
            
       }
       } catch (SQLException e) {
            e.printStackTrace();
        }
        return unidadesActivas;
    
    
    }   
}
