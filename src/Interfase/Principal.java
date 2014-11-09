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
public class Principal extends javax.swing.JFrame{
    private iFuncionario iFun;
    private ModifFuncionario modFun;
    private JPanelPresencia presencia;
    private iBuscar iBusca;
    private iBuscaChapa iBuscaChapa;
    ArrayList func = new ArrayList();
    public JTable table;
    public DefaultTableModel model;
   public jPanelInconsistencia inco;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        Fondo f = new Fondo();
        this.add(f);
        this.setLayout(new BorderLayout());
        this.setExtendedState(Principal.MAXIMIZED_BOTH);   
        this.pack();
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
        jMenuItem22 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuCerrar = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuNuevoFuncionario = new javax.swing.JMenuItem();
        jMenuModificaFunc = new javax.swing.JMenu();
        jModifFunc = new javax.swing.JMenuItem();
        jMenuModifFuncChapa = new javax.swing.JMenuItem();
        jMenuBorraFunc = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuPresenciaVesp = new javax.swing.JMenuItem();
        jMenuModificaDatos = new javax.swing.JMenuItem();
        jMenuInconsistencias = new javax.swing.JMenu();
        jMenuIncoNueva = new javax.swing.JMenuItem();
        jMenuIncoBuscar = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        nuevoCliente = new javax.swing.JMenuItem();
        modificarCliente = new javax.swing.JMenuItem();
        bajaCliente = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuBuscaFaltas = new javax.swing.JMenu();
        jMenuBuscaFaltaFecha = new javax.swing.JMenuItem();
        jMenuBuscaFaltaFunc = new javax.swing.JMenuItem();
        jMenuBuscaFaltaTurno = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenuItem();

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
        setTitle("Gestión de Operaciones Cantera S.A");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Operaciones"); // NOI18N
        getContentPane().setLayout(null);

        jMenu3.setText("Archivo");

        jMenuCerrar.setText("Cerrar");
        jMenuCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCerrarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuCerrar);

        jMenuBar2.add(jMenu3);

        jMenu5.setText("Funcionarios");

        jMenuNuevoFuncionario.setText("Nuevo");
        jMenuNuevoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoFuncionarioActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuNuevoFuncionario);

        jMenuModificaFunc.setText("Modificar");

        jModifFunc.setText("Por Funcionario");
        jModifFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jModifFuncActionPerformed(evt);
            }
        });
        jMenuModificaFunc.add(jModifFunc);

        jMenuModifFuncChapa.setText("Por Chapa");
        jMenuModifFuncChapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModifFuncChapaActionPerformed(evt);
            }
        });
        jMenuModificaFunc.add(jMenuModifFuncChapa);

        jMenu5.add(jMenuModificaFunc);

        jMenuBorraFunc.setText("Borrar");
        jMenuBorraFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBorraFuncActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuBorraFunc);

        jMenuBar2.add(jMenu5);

        jMenu7.setText("Taller");

        jMenuPresenciaVesp.setText("Nueva Orden");
        jMenuPresenciaVesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPresenciaVespActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuPresenciaVesp);

        jMenuModificaDatos.setText("Modificar Datos");
        jMenu7.add(jMenuModificaDatos);

        jMenuInconsistencias.setText("Inconsistencias");

        jMenuIncoNueva.setText("Nueva");
        jMenuIncoNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIncoNuevaActionPerformed(evt);
            }
        });
        jMenuInconsistencias.add(jMenuIncoNueva);

        jMenuIncoBuscar.setText("Buscar");
        jMenuInconsistencias.add(jMenuIncoBuscar);

        jMenu7.add(jMenuInconsistencias);

        jMenuBar2.add(jMenu7);

        jMenu10.setText("Repuestos");

        nuevoCliente.setText("Nuevo");
        jMenu10.add(nuevoCliente);

        modificarCliente.setText("Modificar Datos");
        jMenu10.add(modificarCliente);

        bajaCliente.setText("Borrar");
        jMenu10.add(bajaCliente);

        jMenuBar2.add(jMenu10);

        jMenu6.setText("Buscar");

        jMenuBuscaFaltas.setText("Faltas");

        jMenuBuscaFaltaFecha.setText("Por Fecha");
        jMenuBuscaFaltas.add(jMenuBuscaFaltaFecha);

        jMenuBuscaFaltaFunc.setText("Por Funcionario");
        jMenuBuscaFaltaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscaFaltaFuncActionPerformed(evt);
            }
        });
        jMenuBuscaFaltas.add(jMenuBuscaFaltaFunc);

        jMenuBuscaFaltaTurno.setText("Por Turno");
        jMenuBuscaFaltas.add(jMenuBuscaFaltaTurno);

        jMenu6.add(jMenuBuscaFaltas);

        jMenu8.setText("Ordenes");

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

        jMenuClientes.setText("Clientes");
        jMenu6.add(jMenuClientes);

        jMenuBar2.add(jMenu6);

        setJMenuBar(jMenuBar2);

        getAccessibleContext().setAccessibleName("operaciones");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCerrarActionPerformed
           //this.dispose();
    }//GEN-LAST:event_jMenuCerrarActionPerformed

    private void jMenuNuevoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoFuncionarioActionPerformed
                // TODO add your handling code here:
       try{
          this.remove(modFun);
       }catch(Exception e){
       
       }
       this.iFun = new iFuncionario();
       this.add(iFun, 0);
       pack();
       iFun.setVisible(true);
     
    }//GEN-LAST:event_jMenuNuevoFuncionarioActionPerformed

    private void jModifFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jModifFuncActionPerformed
        // TODO add your handling code here:
       try{
            modFun = new ModifFuncionario();
            this.add(modFun, 0);
            modFun.setVisible(false);
            this.iBusca = new iBuscar(modFun);
            iBusca.setVisible(true);
       }catch(Exception e){
       }
    }//GEN-LAST:event_jModifFuncActionPerformed

    private void jMenuBorraFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBorraFuncActionPerformed
        this.modFun = new ModifFuncionario();
    
    if (this.contains(modFun.getLocation())){
       this.remove(modFun);
    }
      this.modFun = new ModifFuncionario();
      this.add(modFun, 0);
      modFun.setVisible(false);
      this.iBusca = new iBuscar(modFun);
      iBusca.setVisible(true);
     
             
    }//GEN-LAST:event_jMenuBorraFuncActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuModifFuncChapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModifFuncChapaActionPerformed
    
        try{
            this.modFun = new ModifFuncionario();
            this.add(modFun, 0);
            modFun.setVisible(false);
            this.iBuscaChapa = new iBuscaChapa(modFun);
            iBuscaChapa.setVisible(true);
            iBuscaChapa.toFront();
       }catch(Exception e){
       
       }        
    }//GEN-LAST:event_jMenuModifFuncChapaActionPerformed

    private void jMenuBuscaFaltaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscaFaltaFuncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBuscaFaltaFuncActionPerformed

    private void jMenuPresenciaVespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPresenciaVespActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	   //get current date time with Date()
        Date date = new Date();        
        this.presencia = new JPanelPresencia();
        this.add(presencia, 0);
        presencia.jFechaPesencia.setText(dateFormat.format(date));
        this.pack();
        presencia.setVisible(true);
              
    }//GEN-LAST:event_jMenuPresenciaVespActionPerformed

    private void jMenuIncoNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIncoNuevaActionPerformed
           if (inco==null){ 
            this.inco = new jPanelInconsistencia();
            this.add(inco, 0);
            this.pack();
            inco.setVisible(true);
           }else{
           inco.setVisible(true);
           }
            
    }//GEN-LAST:event_jMenuIncoNuevaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
            
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuBorraFunc;
    private javax.swing.JMenuItem jMenuBuscaFaltaFecha;
    private javax.swing.JMenuItem jMenuBuscaFaltaFunc;
    private javax.swing.JMenuItem jMenuBuscaFaltaTurno;
    private javax.swing.JMenu jMenuBuscaFaltas;
    private javax.swing.JMenuItem jMenuCerrar;
    private javax.swing.JMenuItem jMenuClientes;
    private javax.swing.JMenuItem jMenuIncoBuscar;
    private javax.swing.JMenuItem jMenuIncoNueva;
    private javax.swing.JMenu jMenuInconsistencias;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuModifFuncChapa;
    private javax.swing.JMenuItem jMenuModificaDatos;
    private javax.swing.JMenu jMenuModificaFunc;
    private javax.swing.JMenuItem jMenuNuevoFuncionario;
    private javax.swing.JMenuItem jMenuPresenciaVesp;
    private javax.swing.JMenuItem jModifFunc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem modificarCliente;
    private javax.swing.JMenuItem nuevoCliente;
    // End of variables declaration//GEN-END:variables
}

