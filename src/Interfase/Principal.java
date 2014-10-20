/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import java.awt.BorderLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Usuario
 */
public class Principal extends javax.swing.JFrame {
    private iFuncionario iFun;
    private ModifFuncionario modFun;
    private JPanelPresencia presencia;
    private iBuscar iBusca;
    private iBuscaChapa iBuscaChapa;
    ArrayList func = new ArrayList();
    public JTable table;
    public DefaultTableModel model;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLayout(new BorderLayout());
        this.setExtendedState(Principal.MAXIMIZED_BOTH);   
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jModifFunc = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuPresenciaVesp = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        nuevoCliente = new javax.swing.JMenuItem();
        modificarCliente = new javax.swing.JMenuItem();
        bajaCliente = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenuItem3.setText("jMenuItem3");

        jMenuItem7.setText("jMenuItem7");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem10.setText("jMenuItem10");

        jMenuItem22.setText("jMenuItem22");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Operaciones");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setName("Operaciones"); // NOI18N
        getContentPane().setLayout(null);

        jMenu3.setText("Archivo");

        jMenuItem1.setText("Cerrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar2.add(jMenu3);

        jMenu5.setText("Funcionarios");

        jMenuItem6.setText("Nuevo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenu4.setText("Modificar");

        jModifFunc.setText("Por Funcionario");
        jModifFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModifFuncActionPerformed(evt);
            }
        });
        jMenu4.add(jModifFunc);

        jMenuItem2.setText("Por Chapa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenu5.add(jMenu4);

        jMenuItem9.setText("Borrar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar2.add(jMenu5);

        jMenu7.setText("Presencias");

        jMenuPresenciaVesp.setText("Nueva");
        jMenuPresenciaVesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPresenciaVespActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuPresenciaVesp);

        jMenuItem12.setText("Modificar Datos");
        jMenu7.add(jMenuItem12);

        jMenu12.setText("Inconsistencias");

        jMenuItem13.setText("Nueva");
        jMenu12.add(jMenuItem13);

        jMenuItem23.setText("Buscar");
        jMenu12.add(jMenuItem23);

        jMenu7.add(jMenu12);

        jMenuBar2.add(jMenu7);

        jMenu6.setText("Buscar");

        jMenu9.setText("Faltas");

        jMenuItem19.setText("Por Fecha");
        jMenu9.add(jMenuItem19);

        jMenuItem21.setText("Por Funcionario");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem21);

        jMenuItem20.setText("Por Turno");
        jMenu9.add(jMenuItem20);

        jMenu6.add(jMenu9);

        jMenu8.setText("Inconsistencia");

        jMenuItem17.setText("Por Fecha");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem17);

        jMenuItem16.setText("Por Funcionario");
        jMenu8.add(jMenuItem16);

        jMenuItem18.setText("Por Tipo");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem18);

        jMenu6.add(jMenu8);

        jMenuItem15.setText("Clientes");
        jMenu6.add(jMenuItem15);

        jMenuBar2.add(jMenu6);

        jMenu10.setText("Repuestos");

        nuevoCliente.setText("Nuevo");
        jMenu10.add(nuevoCliente);

        modificarCliente.setText("Modificar Datos");
        jMenu10.add(modificarCliente);

        bajaCliente.setText("Borrar");
        jMenu10.add(bajaCliente);

        jMenuBar2.add(jMenu10);

        setJMenuBar(jMenuBar2);

        getAccessibleContext().setAccessibleName("operaciones");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
                // TODO add your handling code here:
       try{
          this.remove(modFun);
       }catch(Exception e){
       }
       this.iFun = new iFuncionario();
       
       this.add(iFun);
       pack();
       iFun.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jModifFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModifFuncActionPerformed
        // TODO add your handling code here:
       try{
      this.modFun = new ModifFuncionario();
      this.add(modFun);
      modFun.setVisible(false);
      this.iBusca = new iBuscar(modFun);
      iBusca.setVisible(true);
       }catch(Exception e){
       }
    }//GEN-LAST:event_jModifFuncActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        this.modFun = new ModifFuncionario();
    if (this.contains(modFun.getLocation())){
       this.remove(modFun);
    }
      this.modFun = new ModifFuncionario();
      this.add(modFun);
      modFun.setVisible(false);
      this.iBusca = new iBuscar(modFun);
      iBusca.setVisible(true);
             
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    // Esto inicia el 
        try{
            this.modFun = new ModifFuncionario();
            this.add(modFun);
            modFun.setVisible(false);
            this.iBuscaChapa = new iBuscaChapa(modFun);
            iBuscaChapa.setVisible(true);
       }catch(Exception e){
       
       }        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuPresenciaVespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPresenciaVespActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   //get current date time with Date()
        Date date = new Date();        
        this.presencia = new JPanelPresencia();
        this.add(presencia,BorderLayout.CENTER);
        presencia.jFechaPesencia.setText(dateFormat.format(date));
        this.pack();
        presencia.setVisible(true);
        
    }//GEN-LAST:event_jMenuPresenciaVespActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bajaCliente;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuPresenciaVesp;
    private javax.swing.JMenuItem jModifFunc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem modificarCliente;
    private javax.swing.JMenuItem nuevoCliente;
    // End of variables declaration//GEN-END:variables
}

