/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import static Persistencia.clsPersistencia.selectQuery;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class pOrdenServicio extends clsPersistencia{
    
    public int ultimaOS() {
        int id = 0;
        ResultSet rs;

        try {
            rs = selectQuery("select MAX(idordenServicio) as id from ordenservicio");
            rs.next();
            id = rs.getInt("id");


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public static boolean ingresaOrden(int nroOrden, String fecha, String unidad, String generadaPor, String descripcion) {
        boolean resultado=false;
        
        resultado = executeQuery("INSERT INTO ordenservicio (idordenServicio, fecha, unidad, seccion, descripcion, status) VALUES (" + nroOrden + ",'"+ fecha+ "','" + unidad +"','"+ generadaPor + "','" +
                descripcion + "',"+ 1 +");"); 
        
        return resultado;
    }
    
}
