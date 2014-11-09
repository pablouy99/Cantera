/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import operaciones.Operaciones;
import operaciones.clsFuncionario;

/**
 *
 * @author Usuario
 */
public class jPanelOrdenServicio extends javax.swing.JLayeredPane {
   MaskFormatter mask15, mask11, mask12, mask14;
   Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
   public String justificacion;
   clsFuncionario func = new clsFuncionario();
   Operaciones opera;
   int currentDay = localCalendar.get(Calendar.DATE);
   int currentMonth = localCalendar.get(Calendar.MONTH);
   int currentYear = localCalendar.get(Calendar.YEAR);
   String unidad="", nroOrden="";
   
         
   /**
     * Creates new form jPanelInconsistencia
     */
    public jPanelOrdenServicio() {
                initComponents();
        this.opera = new Operaciones();
        jTextField1.setText(nroOrden = String.valueOf(opera.ultimaOrden()));
        jComboBoxDia.setSelectedIndex(currentDay-1);     
        jComboBoxMes.setSelectedIndex(currentMonth);  
        jTextFieldAño.setText(String.valueOf(currentYear));     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxGeneradaPor = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldAño = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        try{ mask15 = new MaskFormatter("####"); }catch(ParseException e) {     e.printStackTrace(); }
        jTextUnidad = new javax.swing.JFormattedTextField(mask15);
        jComboBoxDia = new javax.swing.JComboBox();
        jComboBoxMes = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();

        jLabel1.setText("DIA");

        jComboBoxGeneradaPor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxGeneradaPor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chofer", "Taller" }));
        jComboBoxGeneradaPor.setEnabled(false);
        jComboBoxGeneradaPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneradaPorActionPerformed(evt);
            }
        });

        jLabel2.setText("GENERADA POR:");

        jLabel3.setText("UNIDAD:");

        jLabel4.setText("DESCRIPCIÓN:");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setEnabled(false);
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextFieldAño.setEnabled(false);
        jTextFieldAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAñoActionPerformed(evt);
            }
        });

        jLabel9.setText("FECHA:");

        jLabel10.setText("MES");

        jLabel11.setText("AÑO");

        jTextUnidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextUnidad.setMaximumSize(new java.awt.Dimension(2, 20));
        jTextUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextUnidadKeyPressed(evt);
            }
        });

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setEnabled(false);
        jTextAreaDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaDescripcionFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(jTextAreaDescripcion);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxGeneradaPor, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))
                            .addComponent(jComboBoxMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 484, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldAño, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxGeneradaPor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );
        setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jComboBoxGeneradaPor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jButtonAceptar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jButtonCancelar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jTextFieldAño, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jTextUnidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jComboBoxDia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jComboBoxMes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
            this.opera = new Operaciones();
            if (justificacion.isEmpty()){
                 JOptionPane.showMessageDialog(null,"Debe Escribir la falla de la unidad");
            }else{
                String fecha = jComboBoxDia.getSelectedItem()+"/"+jComboBoxMes.getSelectedItem()+"/"+jTextFieldAño.getText();
                opera.ingresaOrden(nroOrden, fecha, this.unidad,(String) jComboBoxGeneradaPor.getSelectedItem(), jTextAreaDescripcion.getText().trim());
                JOptionPane.showMessageDialog(null,"Orden Ingresada con Exito");
                regresarAlInicio();
            }
            
           
                       
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        regresarAlInicio();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextUnidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUnidadKeyPressed
        this.opera = new Operaciones();
        ArrayList resultado = new ArrayList();
                
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
               resultado = opera.buscarUnidad(jTextUnidad.getText().trim());
           if (resultado.isEmpty()){
            JOptionPane.showMessageDialog(null,"Unidad no Existe o num Invalido");
            }else{
               this.unidad = (String) resultado.get(0);
                jComboBoxGeneradaPor.setEnabled(true);
                jButtonAceptar.setEnabled(true);
                jTextAreaDescripcion.setEnabled(true);
            }
                
            }
        
        
    }//GEN-LAST:event_jTextUnidadKeyPressed

    private void jComboBoxGeneradaPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneradaPorActionPerformed
        
    }//GEN-LAST:event_jComboBoxGeneradaPorActionPerformed

    private void jTextAreaDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionFocusLost
        justificacion = (String) jTextAreaDescripcion.getText();
    }//GEN-LAST:event_jTextAreaDescripcionFocusLost

    private void jTextFieldAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAñoActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
  
    private void regresarAlInicio(){
        this.setVisible(false);
        jTextUnidad.setText("");
        jTextUnidad.requestFocus();
        jComboBoxGeneradaPor.setEnabled(false);
        jButtonAceptar.setEnabled(false);
        jTextAreaDescripcion.setText("");
        jTextAreaDescripcion.setEnabled(false);
    
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxGeneradaPor;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField jTextFieldAño;
    public javax.swing.JTextField jTextUnidad;
    // End of variables declaration//GEN-END:variables
}
