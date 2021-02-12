/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comunidad.admingastos.menu.ui;

import com.comunidad.admingastos.consultar.ui.ConsultarGastosInternalFrame;
import com.comunidad.admingastos.gastos.ui.GastosInternalFrame;

/**
 *
 * @author Santiago
 */
public class AdminGastosFrame extends javax.swing.JFrame {

    /**
     * Creates new form AdminGastosFrame
     */
    public AdminGastosFrame() {
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

        jdpPanelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCapturar = new javax.swing.JMenuItem();
        menuConsultar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuComunidad = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de gastos");

        jdpPanelPrincipal.setMinimumSize(new java.awt.Dimension(1300, 700));

        jMenu1.setText("Administrar");

        menuCapturar.setText("Capturar");
        menuCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCapturarActionPerformed(evt);
            }
        });
        jMenu1.add(menuCapturar);

        menuConsultar.setText("Consultar");
        menuConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarActionPerformed(evt);
            }
        });
        jMenu1.add(menuConsultar);
        jMenu1.add(jSeparator1);

        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Acerca de");

        menuComunidad.setText("Comunidad");
        menuComunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComunidadActionPerformed(evt);
            }
        });
        jMenu2.add(menuComunidad);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1300, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCapturarActionPerformed
        // TODO add your handling code here:
        if (jdpPanelPrincipal.getComponentCount() < 1) {
            GastosInternalFrame gastosInternalFrame = new GastosInternalFrame();
            gastosInternalFrame.setVisible(true);
            jdpPanelPrincipal.add(gastosInternalFrame);
        }
    }//GEN-LAST:event_menuCapturarActionPerformed

    private void menuConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarActionPerformed
        // TODO add your handling code here:
        if (jdpPanelPrincipal.getComponentCount() < 1) {
            ConsultarGastosInternalFrame consultarGastosInternalFrame = new ConsultarGastosInternalFrame();
            consultarGastosInternalFrame.setVisible(true);
            jdpPanelPrincipal.add(consultarGastosInternalFrame);
        }
    }//GEN-LAST:event_menuConsultarActionPerformed

    private void menuComunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComunidadActionPerformed
        // TODO add your handling code here:
        AcercaDeDialog dialog = new AcercaDeDialog(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_menuComunidadActionPerformed

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminGastosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGastosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGastosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGastosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }*/
        //</editor-fold>

        /* Create and display the form */
       /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGastosFrame().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JDesktopPane jdpPanelPrincipal;
    private javax.swing.JMenuItem menuCapturar;
    private javax.swing.JMenuItem menuComunidad;
    private javax.swing.JMenuItem menuConsultar;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}