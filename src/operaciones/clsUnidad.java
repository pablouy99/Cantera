/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Persistencia.pUnidad;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clsUnidad {
    private int codigoInt;
    private String matricula;
    private String marca;
    private String modelo;
    private int año;
    double kilometros;
    double tomaFuerza;
 
    pUnidad unidad = new pUnidad();
    
    
    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getTomaFuerza() {
        return tomaFuerza;
    }

    public void setTomaFuerza(double tomaFuerza) {
        this.tomaFuerza = tomaFuerza;
    }

    public int getCodigoInt() {
        return codigoInt;
    }

    public void setCodigoInt(int codigoInt) {
        this.codigoInt = codigoInt;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public ArrayList buscarUnidad(String matricula){
        ArrayList result = new ArrayList();
        
        /* 
        REVISAR REVISAR REVISAR no es seguro que ande
        */
        result = unidad.buscarUnidad(matricula);
        /*this.codigoInt = Integer.parseInt(((String) result.get(0)).substring(2,7));
        this.matricula = (String) result.get(0);
        this.marca = (String) result.get(2);
        this.modelo = (String) result.get(3);
        this.año = (Integer) result.get(4);
        this.kilometros = (Double) result.get(5);
        this.tomaFuerza = (Double) result.get(6);
          */  
    return result;
    }

    public boolean ingresaOrden(int nroOrden, String fecha, String unidad, String generadaPor, String descripcion){
        boolean resultado=false;
        
        resultado = pUnidad.ingresaOrden(nroOrden, fecha, unidad, generadaPor, descripcion);
        
        return resultado;
    }

    public int ultimaOrden() {
        return unidad.ultimaOS();
    }
}
