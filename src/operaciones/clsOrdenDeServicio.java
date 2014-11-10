/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Persistencia.pOrdenServicio;
import Persistencia.pUnidad;
import com.sun.jmx.remote.util.OrderClassLoaders;

/**
 *
 * @author Usuario
 */
public class clsOrdenDeServicio {
    private int numeroOrden;
    private String matricula;
    private String fecha;
    private String genera;
    private String descripcion;

    pOrdenServicio orden = new pOrdenServicio();
    
    public int getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(int numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getGenera() {
        return genera;
    }

    public void setGenera(String genera) {
        this.genera = genera;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public boolean ingresaOrden(int nroOrden, String fecha, String unidad, String generadaPor, String descripcion){
        boolean resultado=false;
        
        resultado = pOrdenServicio.ingresaOrden(nroOrden, fecha, unidad, generadaPor, descripcion);
        
        return resultado;
    }

    public int ultimaOrden() {
        return orden.ultimaOS();
    }
    
    
    
}
