/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import operaciones.Operaciones;
import operaciones.clsOrdenDeServicio;

/**
 *
 * @author Usuario
 */
public class jPanelOSabierta extends javax.swing.JPanel {
    private DefaultTableModel model;
    private String[] cosa;
    int filaDeLaTabla = 0;
    private ArrayList borrados = new ArrayList();
    
    /**
     * Creates new form jPanelOSabierta
     */
    public jPanelOSabierta() {
        initComponents();
    }
    
    public void rellenarTabla(String[] correccion){
        this.cosa = correccion;
        this.model.addRow(correccion);
        this.jTableOS.setModel(model);
    
    }
    public void iniciarDatos(){
        int i=0;
           Operaciones operac = new Operaciones();
           ArrayList uni = new ArrayList();
           
           uni = operac.listarOSabierta();
           
            String[] titulos = {"Numero de Orden", "Unidad", "Fecha", "Generada Por"}; 
              model = new DefaultTableModel(null, titulos){
                  @Override
                  public boolean isCellEditable(int row, int column) {
                   //all cells false
                  return false;
                  }
              };
              String[] fila = new String[4];
              clsOrdenDeServicio claseOrden = new clsOrdenDeServicio();
              for (i=0; i<uni.size(); i++){
              claseOrden = (clsOrdenDeServicio) uni.get(i);
              
              fila[0] = Integer.toString(claseOrden.getNumeroOrden());
              fila[1] = claseOrden.getMatricula();
              fila[2] = claseOrden.getFecha();
              fila[3] = claseOrden.getGenera();                         
              model.addRow(fila);
              }
             this.jTableOS.setModel(model);
                
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOS = new javax.swing.JTable();

        setPreferredSize(getMaximumSize());

        jTableOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero de Orden", "Unidad", "Fecha", "Generada Por"
            }
        ));
        jTableOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOSMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOS);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOSMouseClicked
        //String[] DatosDeBorrados = new String[3];
        
            if (evt.getClickCount() == 2 && !evt.isConsumed()){
                
                
                /*this.filaDeLaTabla = jTableOS.getSelectedRow();
                DatosDeBorrados[0] = (String) model.getValueAt(filaDeLaTabla, 0);
                DatosDeBorrados[1] = (String) model.getValueAt(filaDeLaTabla, 1);
                DatosDeBorrados[2] = (String) model.getValueAt(filaDeLaTabla, 2);
                this.borrados.add(DatosDeBorrados);
                model.removeRow(filaDeLaTabla);
                this.jTableOS.setModel(model);
                */
            }
    }//GEN-LAST:event_jTableOSMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOS;
    // End of variables declaration//GEN-END:variables
}
