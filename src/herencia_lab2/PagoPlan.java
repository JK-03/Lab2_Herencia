/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package herencia_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class PagoPlan extends javax.swing.JFrame {
    private Tigo tigoFunciones;
    ArrayList<Plan> planesTipo;
    
    public PagoPlan(ArrayList<Plan> planesTipoExterno) {
        tigoFunciones = new Tigo(planesTipo);
        planesTipo = planesTipoExterno;
        
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

        jPanel1 = new javax.swing.JPanel();
        MensajesField = new javax.swing.JTextField();
        MinutosField = new javax.swing.JTextField();
        NumeroTelefonoField = new javax.swing.JTextField();
        BotonPagar = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MensajesField.setBackground(new java.awt.Color(255, 222, 89));
        MensajesField.setFont(new java.awt.Font("InaiMathi", 1, 18)); // NOI18N
        MensajesField.setForeground(new java.awt.Color(0, 0, 0));
        MensajesField.setBorder(null);
        MensajesField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MensajesFieldKeyTyped(evt);
            }
        });
        jPanel1.add(MensajesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(504, 398, 320, 40));

        MinutosField.setBackground(new java.awt.Color(255, 222, 89));
        MinutosField.setFont(new java.awt.Font("InaiMathi", 1, 18)); // NOI18N
        MinutosField.setForeground(new java.awt.Color(0, 0, 0));
        MinutosField.setBorder(null);
        MinutosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MinutosFieldKeyTyped(evt);
            }
        });
        jPanel1.add(MinutosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 396, 320, 40));

        NumeroTelefonoField.setBackground(new java.awt.Color(255, 222, 89));
        NumeroTelefonoField.setFont(new java.awt.Font("InaiMathi", 1, 18)); // NOI18N
        NumeroTelefonoField.setForeground(new java.awt.Color(0, 0, 0));
        NumeroTelefonoField.setBorder(null);
        NumeroTelefonoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NumeroTelefonoFieldKeyTyped(evt);
            }
        });
        jPanel1.add(NumeroTelefonoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 279, 320, 40));

        BotonPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonPagarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 180, 50));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 80, 70, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/PagoPlan.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonPagarMouseClicked
        String numeroTelefonoStr = NumeroTelefonoField.getText();
        if (numeroTelefonoStr == null || numeroTelefonoStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de teléfono.", "Campos Incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int numeroTelefono = Integer.valueOf(numeroTelefonoStr);

        String minutosStr = MinutosField.getText();
        if (minutosStr == null || minutosStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese los minutos.", "Campos Incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int minutos = Integer.valueOf(minutosStr);

        String mensajesStr = MensajesField.getText();
        if (mensajesStr == null || mensajesStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese los mensajes.", "Campos Incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int mensajes = Integer.valueOf(mensajesStr);

        if(minutos == 0 || mensajes == 0) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos para crear un plan.", "Campos Incompletos", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double pago = MenuPrincipal.tigoFunciones.pagoPlan(numeroTelefono, minutos, mensajes);
        if (pago != 0) {
            JOptionPane.showMessageDialog(null, "Su pago mensual es de: $. " + pago, "Pago Mensual", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un plan con el número de teléfono proporcionado.", "Teléfono Inexistente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonPagarMouseClicked

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal(planesTipo);
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void NumeroTelefonoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumeroTelefonoFieldKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_NumeroTelefonoFieldKeyTyped

    private void MinutosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MinutosFieldKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_MinutosFieldKeyTyped

    private void MensajesFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MensajesFieldKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_MensajesFieldKeyTyped

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
            java.util.logging.Logger.getLogger(PagoPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PagoPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PagoPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PagoPlan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PagoPlan(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonPagar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField MensajesField;
    private javax.swing.JTextField MinutosField;
    private javax.swing.JTextField NumeroTelefonoField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}