/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import operaciones.Operaciones;

/**
 *
 * @author Usuario
 */
public class ModifFuncionario extends javax.swing.JLayeredPane{
       Operaciones operac = new Operaciones();
    /**this.setExtendedState(Principal.MAXIMIZED_BOTH); 
     * Creates new form ModifFuncionario
     */
    public ModifFuncionario() {
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

        BotonBorraFuncionario = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLibre = new javax.swing.JLabel();
        jComboLibre = new javax.swing.JComboBox();
        MaskFormatter mask = null;
        try{
            mask = new MaskFormatter("########");
        }catch(ParseException e) {
            e.printStackTrace();
        }
        jTextBuscaFuncionario = new javax.swing.JFormattedTextField(mask);
        MaskFormatter mask15 = null; try{     mask15 = new MaskFormatter("A******************************"); }catch(ParseException e) {     e.printStackTrace(); }
        jTextNombre = new javax.swing.JFormattedTextField(mask15);
        try{     mask15 = new MaskFormatter("A********************************"); }catch(ParseException e) {     e.printStackTrace(); }
        jTextApellido = new javax.swing.JFormattedTextField(mask15);
        BotonCancelaCambios = new javax.swing.JButton();
        try{     mask15 = new MaskFormatter("A*************************"); }catch(ParseException e) {     e.printStackTrace(); }
        jTextChapa = new javax.swing.JFormattedTextField(mask15);
        BotonModificaFuncionario = new javax.swing.JButton();
        jLabelLibre1 = new javax.swing.JLabel();
        jComboCategoria = new javax.swing.JComboBox();
        jComboTurno = new javax.swing.JComboBox();
        jLabelLibre2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();

        setToolTipText("Chofer, Cargador, Mecanico, Supervisor de Trafico, Supervisor de Turno, Supervisor General, Maquinista, Peon, Tractorista, Capataz");

        BotonBorraFuncionario.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        BotonBorraFuncionario.setText("Borrar Funcionario");
        BotonBorraFuncionario.setEnabled(false);
        BotonBorraFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorraFuncionarioActionPerformed(evt);
            }
        });
        add(BotonBorraFuncionario);
        BotonBorraFuncionario.setBounds(680, 270, 300, 38);

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 3, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MODIFICAR DATOS DE FUNCIONARIO");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerifyInputWhenFocusTarget(false);
        add(jLabel7);
        jLabel7.setBounds(10, 11, 1500, 31);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setText("Num Funcionario");
        add(jLabel1);
        jLabel1.setBounds(18, 45, 111, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Chapa");
        add(jLabel5);
        jLabel5.setBounds(30, 80, 72, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Apellido");
        add(jLabel4);
        jLabel4.setBounds(20, 200, 72, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Nombre");
        add(jLabel3);
        jLabel3.setBounds(20, 150, 72, 17);

        jLabelLibre.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelLibre.setText("Libre");
        add(jLabelLibre);
        jLabelLibre.setBounds(815, 42, 50, 25);

        jComboLibre.setEditable(true);
        jComboLibre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboLibre.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" }));
        jComboLibre.setMinimumSize(null);
        jComboLibre.setName(""); // NOI18N
        jComboLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboLibreActionPerformed(evt);
            }
        });
        add(jComboLibre);
        jComboLibre.setBounds(869, 42, 109, 25);

        jTextBuscaFuncionario.setEditable(false);
        jTextBuscaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextBuscaFuncionario.setMaximumSize(new java.awt.Dimension(2, 12));
        jTextBuscaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscaFuncionarioActionPerformed(evt);
            }
        });
        add(jTextBuscaFuncionario);
        jTextBuscaFuncionario.setBounds(133, 42, 103, 26);

        jTextNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextNombre.setMaximumSize(new java.awt.Dimension(2, 12));
        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });
        add(jTextNombre);
        jTextNombre.setBounds(130, 150, 172, 26);

        jTextApellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextApellido.setMaximumSize(new java.awt.Dimension(2, 12));
        add(jTextApellido);
        jTextApellido.setBounds(130, 190, 172, 26);

        BotonCancelaCambios.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        BotonCancelaCambios.setText("Cancelar Cambios");
        BotonCancelaCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelaCambiosActionPerformed(evt);
            }
        });
        add(BotonCancelaCambios);
        BotonCancelaCambios.setBounds(678, 229, 141, 38);

        jTextChapa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextChapa.setMaximumSize(new java.awt.Dimension(2, 20));
        add(jTextChapa);
        jTextChapa.setBounds(130, 80, 90, 26);

        BotonModificaFuncionario.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        BotonModificaFuncionario.setText("Confirmar Cambios");
        BotonModificaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModificaFuncionarioActionPerformed(evt);
            }
        });
        add(BotonModificaFuncionario);
        BotonModificaFuncionario.setBounds(829, 229, 149, 38);

        jLabelLibre1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelLibre1.setText("Categoria");
        add(jLabelLibre1);
        jLabelLibre1.setBounds(20, 240, 80, 25);

        jComboCategoria.setEditable(true);
        jComboCategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chofer", "Mecanico", "Supervisor", "Maquinista", "Peon", "Tractorista", "Capataz" }));
        jComboCategoria.setName(""); // NOI18N
        jComboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCategoriaActionPerformed(evt);
            }
        });
        add(jComboCategoria);
        jComboCategoria.setBounds(130, 240, 170, 25);

        jComboTurno.setEditable(true);
        jComboTurno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matutino", "Vespertino", "Nocturno" }));
        jComboTurno.setMinimumSize(null);
        jComboTurno.setName(""); // NOI18N
        jComboTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTurnoActionPerformed(evt);
            }
        });
        add(jComboTurno);
        jComboTurno.setBounds(130, 290, 137, 23);

        jLabelLibre2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabelLibre2.setText("Turno");
        add(jLabelLibre2);
        jLabelLibre2.setBounds(30, 290, 60, 17);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero Funcionario", "Nombre", "Apellido", "Categoria", "Libre", "Chapa", "Turno"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 322, 1140, 130);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Activo");
        add(jLabel6);
        jLabel6.setBounds(260, 40, 50, 20);

        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1);
        jRadioButton1.setBounds(310, 40, 21, 21);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBorraFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorraFuncionarioActionPerformed
        // TODO add your handling code here:
        boolean resultado = false;
        resultado = operac.bajaFuncionario(Integer.parseInt(jTextBuscaFuncionario.getText().trim()));
        
        if (resultado == true){
            JOptionPane.showMessageDialog(null,"Se han borrado los datos Exitosamente");
            limpiarTexto();
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error, Funcionario no se pudo Borrar");
        }
    }//GEN-LAST:event_BotonBorraFuncionarioActionPerformed

    private void jComboLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboLibreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboLibreActionPerformed

    private void BotonCancelaCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelaCambiosActionPerformed
             this.setVisible(false);
    }//GEN-LAST:event_BotonCancelaCambiosActionPerformed

    private void jTextBuscaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBuscaFuncionarioActionPerformed

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void BotonModificaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModificaFuncionarioActionPerformed
            // TODO 
           operac.modiFuncionario(jTextNombre.getText().trim(), jTextApellido.getText().trim(), 
                               jComboCategoria.getSelectedIndex()+1,
                               Integer.parseInt(jTextBuscaFuncionario.getText().trim()),
                               jComboLibre.getSelectedIndex()+1,
                               Integer.parseInt(jTextChapa.getText().trim()),
                               operac.normalizaSetTurno(jComboTurno.getSelectedIndex()),
                               jRadioButton1.isSelected()
                               );
        
    }//GEN-LAST:event_BotonModificaFuncionarioActionPerformed

    private void jComboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboCategoriaActionPerformed

    private void jComboTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTurnoActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getButton()==1){
            int fila = jTable1.getSelectedRow();    
            try {
                jTextBuscaFuncionario.setText((String) jTable1.getValueAt(fila, 0));
                jTextChapa.setText((String) jTable1.getValueAt(fila, 5));
                jTextNombre.setText((String) jTable1.getValueAt(fila, 1));
                jTextApellido.setText((String) jTable1.getValueAt(fila, 2));
                jComboCategoria.setSelectedItem(jComboCategoria.getItemAt(Integer.parseInt(((String) jTable1.getValueAt(fila, 3)))-1));
                jComboLibre.setSelectedItem(jComboLibre.getItemAt(Integer.parseInt((String) jTable1.getValueAt(fila, 4))-1));
                jComboTurno.setSelectedItem(jComboTurno.getItemAt(operac.normalizaGetTurno(Integer.parseInt((String) jTable1.getValueAt(fila, 6)))));
                jRadioButton1.setSelected(Boolean.parseBoolean((String) jTable1.getValueAt(fila, 7)));
                
            } catch (Exception e) {
                e.printStackTrace();
            }
               
        
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        boolean pActivo=false;
        if (jRadioButton1.isSelected()){
            operac.funcionarioActivo(true);
        }else{
            operac.funcionarioActivo(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonBorraFuncionario;
    private javax.swing.JButton BotonCancelaCambios;
    private javax.swing.JButton BotonModificaFuncionario;
    public javax.swing.JComboBox jComboCategoria;
    public javax.swing.JComboBox jComboLibre;
    public javax.swing.JComboBox jComboTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLibre;
    private javax.swing.JLabel jLabelLibre1;
    private javax.swing.JLabel jLabelLibre2;
    public javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextApellido;
    public javax.swing.JTextField jTextBuscaFuncionario;
    public javax.swing.JTextField jTextChapa;
    public javax.swing.JTextField jTextNombre;
    // End of variables declaration//GEN-END:variables

    public void limpiarTexto(){
    jTextBuscaFuncionario.setText("");
    jTextNombre.setText("");
    jTextApellido.setText("");
    jTextChapa.setText("");
    }
}
