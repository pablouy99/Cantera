/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import Interfase.Principal;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Operaciones {
    private clsFuncionario func = new clsFuncionario();
    private clsUnidad unidad = new clsUnidad();
    private boolean resultado= false;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Principal principal = new Principal();
        principal.setVisible(true);
    }
    
    public int ultimoIndice(int concesion){
        int indice =0;
                 indice = func.ultimoIndice(concesion);
        return indice;
    }
    
    public boolean altaFuncionario(String pNombre, String pApellido,
            int pCat, int pNumFunc, int pLibre, int pConcesion,int pChapa, int pTurno, boolean pActivo){
        boolean resultado=false;
        
        resultado = func.ingresarFunc(pNombre, pApellido, pCat, pNumFunc, pLibre, pConcesion, pChapa, pTurno, pActivo);
        
        return resultado;
    }
    
  
    public boolean bajaFuncionario(int pNumFunc){
        boolean resultado = false;
        
       resultado = func.bajaFunc(pNumFunc);
      
        return resultado;
    }
    
    public boolean modiFuncionario(String pNombre, String pApellido,
            int pCat, int pNumFunc, int pLibre, int pChapa, int pTurno, boolean pActivo){
        boolean resultado=false;
        
            resultado = func.modiFuncionario(pNombre, pApellido, pCat, pNumFunc, pLibre, pChapa, pTurno, pActivo);
        
        return resultado;
    }
    
    public ArrayList buscarFuncionario(int funcio){
    ArrayList<String[]> result = new ArrayList<String[]>();
    result = func.buscarFuncionario(funcio);
    
    return result;
    }
    
    public ArrayList buscarFuncionarioPorChapa(int funcio){
    ArrayList result = new ArrayList();
    ArrayList variosFunc = new ArrayList();
    int i;
    result = func.buscarFuncionarioPorChapa(funcio);
    //if (result.size()>8){
            for (i=0; i < result.size(); i=i+9){           
               clsFuncionario funcionarios = new clsFuncionario();
               funcionarios.setNroFunc(Integer.parseInt(result.get(i).toString()));
               funcionarios.setNombre(result.get(i+1).toString());
               funcionarios.setApellido(result.get(i+2).toString());
               funcionarios.setCategoria(Integer.parseInt(result.get(i+3).toString()));
               funcionarios.setChapa(Integer.parseInt(result.get(i+5).toString()));
               funcionarios.setConcesion(Integer.parseInt(result.get(i+7).toString()));
               if (result.get(i+4)== null){
                        funcionarios.setLibre(7);
                }else{
                    funcionarios.setLibre(Integer.parseInt(result.get(i+4).toString()));
                }
               funcionarios.setTurno(Integer.parseInt(result.get(i+6).toString()));
               funcionarios.setActivo(normalizaBool(result.get(i+8).toString()));
               variosFunc.add(funcionarios);
               
            }
            return variosFunc;
  }
    
    public void funcionarioActivo(boolean pActivo){
        func.setActivo(pActivo);
    }
    
 
public int normalizaGetTurno(int turno){
      switch (turno){
                           case 1: turno = 0;
                               break;
                           case 3: turno = 1;
                               break;
                           case 5: turno = 2;
                               break;
                           default: turno = 0;
                               break;
                            }
    
    return turno;
}

public int normalizaSetTurno(int turno){
      switch (turno){
                           case 0: turno = 1;
                               break;
                           case 1: turno = 3;
                               break;
                           case 2: turno = 5;
                               break;
                           default: turno = 1;
                               break;
                            }
    
    return turno;
}

 public boolean normalizaBool(String pActivo){
     boolean resultado=false;
     if (pActivo.equals("1")){
       resultado = true;
    }
     
             return resultado;
 }

 public ArrayList listarTurno(int pTurno){
     ArrayList resultado = new ArrayList();
     ArrayList variosFunc = new ArrayList();
     int i = 0;
        resultado = func.listarTurno(pTurno);
     for (i=0; i < resultado.size(); i=i+3){
        clsFuncionario funcionarios = new clsFuncionario();
               funcionarios.setChapa(Integer.parseInt(resultado.get(i).toString()));
               funcionarios.setNombre(resultado.get(i+1).toString());
               funcionarios.setApellido(resultado.get(i+2).toString());
               variosFunc.add(funcionarios);
     }
    return variosFunc;
 }
 
 public ArrayList buscarUnidad(String uni){
        ArrayList result = new ArrayList();
        
        result = unidad.buscarUnidad(uni);
                     
    return result;
 }
 
 public boolean ingresaOrden(String nroOrden, String fecha, String uni, String generadaPor, String descripcion){
     boolean resultado=false;
     
    int orden = Integer.parseInt(nroOrden);
     
    resultado = unidad.ingresaOrden(orden, fecha, uni, generadaPor, descripcion);
     
     
     return resultado;
 } 
 
 public int ultimaOrden(){
     return unidad.ultimaOrden()+1;
 }
 
}