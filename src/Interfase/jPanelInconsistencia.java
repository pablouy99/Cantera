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
public class jPanelInconsistencia extends javax.swing.JPanel {
   MaskFormatter mask15, mask11, mask12, mask14;
   Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
   public String justificacion;
   clsFuncionario func = new clsFuncionario();
   int currentDay = localCalendar.get(Calendar.DATE);
   int currentMonth = localCalendar.get(Calendar.MONTH);
   int currentYear = localCalendar.get(Calendar.YEAR);
   int horaInicio, horas, minutos;
   int horaFin;
   int minInicio;
   int minFin;
         
   /**
     * Creates new form jPanelInconsistencia
     */
    public jPanelInconsistencia() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBoxCausa = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        try{ mask14 = new MaskFormatter("##:##"); }catch(ParseException e) {     e.printStackTrace(); }
        jTextFieldFinal = new javax.swing.JFormattedTextField(mask14);
        try{ mask14 = new MaskFormatter("##:##"); }catch(ParseException e) {     e.printStackTrace(); }
        jTextFieldInicio = new javax.swing.JFormattedTextField(mask14);
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldHoraExtra = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jComboBoxJustificacion = new javax.swing.JComboBox();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldFecha1 = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        try{ mask15 = new MaskFormatter("####"); }catch(ParseException e) {     e.printStackTrace(); }
        jTextChapa = new javax.swing.JFormattedTextField(mask15);
        jComboBoxDia = new javax.swing.JComboBox();
        jComboBoxMes = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();

        jLabel1.setText("DIA");

        jComboBoxCausa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxCausa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Falta", "Llega Tarde", "Extras", "Otros" }));
        jComboBoxCausa.setEnabled(false);
        jComboBoxCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCausaActionPerformed(evt);
            }
        });

        jLabel2.setText("CAUSA:");

        jLabel3.setText("CHAPA:");

        jLabel4.setText("DESCRIPCIÓN:");

        jLabel5.setText("HHEE:");

        jTextFieldFinal.setEnabled(false);
        jTextFieldFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFinalActionPerformed(evt);
            }
        });
        jTextFieldFinal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFinalFocusLost(evt);
            }
        });

        jTextFieldInicio.setEnabled(false);
        jTextFieldInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInicioActionPerformed(evt);
            }
        });

        jLabel6.setText("INICIO:");

        jLabel7.setText("FIN:");

        jTextFieldHoraExtra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextFieldHoraExtra.setFocusable(false);
        jTextFieldHoraExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHoraExtraActionPerformed(evt);
            }
        });

        jLabel8.setText("JUSTIFICACION:");

        jComboBoxJustificacion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxJustificacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Termino de Ruta", "Salida Demorada", "Apoyo", "Traslado", "Rotura" }));
        jComboBoxJustificacion.setEnabled(false);
        jComboBoxJustificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJustificacionActionPerformed(evt);
            }
        });

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

        jTextFieldFecha1.setEnabled(false);

        jLabel9.setText("FECHA:");

        jLabel10.setText("MES");

        jLabel11.setText("AÑO");

        jTextChapa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextChapa.setMaximumSize(new java.awt.Dimension(2, 20));
        jTextChapa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextChapaKeyPressed(evt);
            }
        });

        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDia.setEnabled(false);

        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));
        jComboBoxMes.setEnabled(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 1025, Short.MAX_VALUE)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextChapa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxCausa, 0, 1, Short.MAX_VALUE)
                                    .addComponent(jTextFieldInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
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
                                                .addComponent(jTextFieldFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jComboBoxJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFinalActionPerformed
        
    }//GEN-LAST:event_jTextFieldFinalActionPerformed

    private void jTextFieldInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInicioActionPerformed

    private void jTextFieldHoraExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHoraExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHoraExtraActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
                   
            if (justificacion.isEmpty()){
                 JOptionPane.showMessageDialog(null,"Debe haber una justificacion para las extras");
            }   
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextChapaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextChapaKeyPressed
        Operaciones opera = new Operaciones();
        ArrayList resultado = new ArrayList();
                
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            {
               resultado = opera.buscarFuncionarioPorChapa(Integer.parseInt(jTextChapa.getText().trim()));
           if (resultado.isEmpty()){
            JOptionPane.showMessageDialog(null,"Funcionario no Existe o num Invalido");
            }else{
               func = (clsFuncionario) resultado.get(0);
                jComboBoxCausa.setEnabled(true);
                jTextFieldFecha1.setEnabled(true);
                jComboBoxDia.setEnabled(true);
                jComboBoxMes.setEnabled(true);
                jComboBoxDia.setSelectedIndex(currentDay-1);     
                jComboBoxMes.setSelectedIndex(currentMonth);  
                jTextFieldFecha1.setText(String.valueOf(currentYear));
                jButtonAceptar.setEnabled(true);
            }
                
            }
        
        
    }//GEN-LAST:event_jTextChapaKeyPressed

    private void jComboBoxCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCausaActionPerformed
        if(jComboBoxCausa.getSelectedIndex()== 2){
          jTextFieldInicio.setEnabled(true);
          jTextFieldFinal.setEnabled(true);
          jComboBoxJustificacion.setEnabled(true);
          jTextAreaDescripcion.setEnabled(true);
        }else{
            if(jComboBoxCausa.getSelectedIndex()== 0){
                Justificaciones jus = new Justificaciones();
                jus.setVisible(true);
            }
        }
    }//GEN-LAST:event_jComboBoxCausaActionPerformed

    private void jTextFieldFinalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFinalFocusLost
      String horaFinal = jTextFieldFinal.getText();
      String horaInicial = jTextFieldInicio.getText();
      
        if(horaFinal.isEmpty() || horaInicial.isEmpty()){
          JOptionPane.showMessageDialog(null,"La hora de Inicio y/o fin no pueden estar vacías");
        }else{
         horaFin = Integer.parseInt(horaFinal.substring(0,2));
         minFin = Integer.parseInt(horaFinal.substring(3,5));
         
         horaInicio = Integer.parseInt(horaInicial.substring(0,2));
         minInicio = Integer.parseInt(horaInicial.substring(3,5));
         
        horas = horaFin - horaInicio;
        minutos = minFin - minInicio;
        
        if(horas < 0){
            horas += 24;
        }
            
        if (minutos < 15){
            minutos = 0;
            }else{
                if (minutos < 30){
                minutos = 15;
                }else{
                    if (minutos < 45){
                    minutos = 30;
                    }else{
                        if (minutos < 60){
                        minutos = 45;
                        }
                    }
                }
            };    
        
        
        jTextFieldHoraExtra.setText(horas + ":" + minutos);
        }
    }//GEN-LAST:event_jTextFieldFinalFocusLost

    private void jComboBoxJustificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJustificacionActionPerformed
            justificacion = (String) jComboBoxJustificacion.getSelectedItem();
    }//GEN-LAST:event_jComboBoxJustificacionActionPerformed

    private void jTextAreaDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionFocusLost
        justificacion = (String) jTextAreaDescripcion.getText();
    }//GEN-LAST:event_jTextAreaDescripcionFocusLost
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox jComboBoxCausa;
    private javax.swing.JComboBox jComboBoxDia;
    private javax.swing.JComboBox jComboBoxJustificacion;
    private javax.swing.JComboBox jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescripcion;
    public javax.swing.JTextField jTextChapa;
    private javax.swing.JFormattedTextField jTextFieldFecha1;
    private javax.swing.JTextField jTextFieldFinal;
    private javax.swing.JTextField jTextFieldHoraExtra;
    private javax.swing.JTextField jTextFieldInicio;
    // End of variables declaration//GEN-END:variables
}
