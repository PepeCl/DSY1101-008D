/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author Cetecom
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form EliminarPaciente
     */
    public Menu() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAgregarPaciente = new javax.swing.JMenuItem();
        mnuModificarPaciente = new javax.swing.JMenuItem();
        mnuListarPaciente = new javax.swing.JMenuItem();
        mnuEliminarPaciente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu");

        mnuAgregarPaciente.setText("Agregar Paciente");
        mnuAgregarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAgregarPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAgregarPaciente);

        mnuModificarPaciente.setText("Modificar Paciente");
        mnuModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuModificarPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuModificarPaciente);

        mnuListarPaciente.setText("Listar Paciente");
        mnuListarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuListarPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuListarPaciente);

        mnuEliminarPaciente.setText("Eliminar Paciente");
        mnuEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEliminarPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEliminarPaciente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuAgregarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAgregarPacienteActionPerformed
        // TODO add your handling code here:
        AgregarPaciente a = new AgregarPaciente();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuAgregarPacienteActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuModificarPacienteActionPerformed
        // TODO add your handling code here:
        ModificarPaciente mod = new ModificarPaciente();
        mod.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuModificarPacienteActionPerformed

    private void mnuListarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuListarPacienteActionPerformed
        // TODO add your handling code here:
        ListarPaciente lp = new ListarPaciente();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuListarPacienteActionPerformed

    private void mnuEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEliminarPacienteActionPerformed
        // TODO add your handling code here:
        EliminarPaciente ep = new EliminarPaciente();
        ep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mnuEliminarPacienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAgregarPaciente;
    private javax.swing.JMenuItem mnuEliminarPaciente;
    private javax.swing.JMenuItem mnuListarPaciente;
    private javax.swing.JMenuItem mnuModificarPaciente;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
