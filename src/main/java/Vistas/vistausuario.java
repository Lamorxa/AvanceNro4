package Vistas;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.*;
import controladores.*;


public class vistausuario extends javax.swing.JFrame {
    UsuarioDAO usDao= new UsuarioDAO();
    Usuarios us=new Usuarios();
    Rutas rut=new Rutas();
    RutasDAO rutdao=new RutasDAO();
    
  
    public vistausuario() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
  
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelRecargas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelModuloRecargas = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtCodtarjetarecarga = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtMontorecarga = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblrecargas = new javax.swing.JTable();
        jPanelModuloRecargas1 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtCodtarjetarecarga1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtMontorecarga1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblrecargas1 = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Lucida Sans", 3, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 51, 51));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("EtravelEase");
        jLabel31.setToolTipText("");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 250, -1));

        jLabel2.setBackground(new java.awt.Color(102, 204, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 190));

        jPanelRecargas.setBackground(new java.awt.Color(0, 153, 204));
        jPanelRecargas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanelRecargasMouseMoved(evt);
            }
        });
        jPanelRecargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelRecargasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelRecargasMouseExited(evt);
            }
        });
        jPanelRecargas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Recargas");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createCompoundBorder()));
        jPanelRecargas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 100, 30));

        jPanel1.add(jPanelRecargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuario");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 40, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("_");
        jLabel9.setToolTipText("");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 30, -1));

        jLabel1.setBackground(new java.awt.Color(0, 153, 204));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 890, 60));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setEnabled(false);

        jPanelModuloRecargas.setBackground(new java.awt.Color(255, 255, 255));
        jPanelModuloRecargas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Módulo de Recargas");
        jPanelModuloRecargas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 36, 190, 32));

        jLabel24.setText("Nro de Tarjeta");
        jPanelModuloRecargas.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 122, 26));

        txtCodtarjetarecarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodtarjetarecargaActionPerformed(evt);
            }
        });
        jPanelModuloRecargas.add(txtCodtarjetarecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 230, 30));

        jLabel27.setText("Monto");
        jPanelModuloRecargas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 71, 27));
        jPanelModuloRecargas.add(txtMontorecarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 230, 30));

        jButton9.setText("Recargar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelModuloRecargas.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 230, 30));

        tblrecargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CodRecarga", "MontoRecarga", "CodTarjeta", "FechaCodRecarga", "estado"
            }
        ));
        jScrollPane4.setViewportView(tblrecargas);

        jPanelModuloRecargas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 120, 520, 403));

        jTabbedPane1.addTab("Recargas", jPanelModuloRecargas);

        jPanelModuloRecargas1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelModuloRecargas1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Reportes");
        jPanelModuloRecargas1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 36, 190, 32));

        jLabel26.setText("Nro de Tarjeta");
        jPanelModuloRecargas1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 122, 26));

        txtCodtarjetarecarga1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodtarjetarecarga1ActionPerformed(evt);
            }
        });
        jPanelModuloRecargas1.add(txtCodtarjetarecarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 30));

        jLabel28.setText("Monto");
        jPanelModuloRecargas1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 71, 27));
        jPanelModuloRecargas1.add(txtMontorecarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 30));

        jButton10.setText("Generar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelModuloRecargas1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 30));

        tblrecargas1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CodRecarga", "MontoRecarga", "CodTarjeta", "FechaCodRecarga", "estado"
            }
        ));
        jScrollPane5.setViewportView(tblrecargas1);

        jPanelModuloRecargas1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 120, 520, 403));

        jTabbedPane1.addTab("Recargas", jPanelModuloRecargas1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 890, 610));
        jTabbedPane1.getAccessibleContext().setAccessibleName("Recargas");

        jLabel29.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("USUARIO");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRecargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRecargasMouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanelRecargasMouseClicked

    private void jPanelRecargasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRecargasMouseMoved
        jPanelRecargas.setBackground(new Color(0, 204, 255));
    }//GEN-LAST:event_jPanelRecargasMouseMoved

    private void jPanelRecargasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRecargasMouseExited
        jPanelRecargas.setBackground(new Color(0, 153, 204));
    }//GEN-LAST:event_jPanelRecargasMouseExited

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtCodtarjetarecargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodtarjetarecargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodtarjetarecargaActionPerformed

    private void txtCodtarjetarecarga1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodtarjetarecarga1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodtarjetarecarga1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(vistausuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistausuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistausuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistausuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistausuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelModuloRecargas;
    private javax.swing.JPanel jPanelModuloRecargas1;
    private javax.swing.JPanel jPanelRecargas;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblrecargas;
    private javax.swing.JTable tblrecargas1;
    private javax.swing.JTextField txtCodtarjetarecarga;
    private javax.swing.JTextField txtCodtarjetarecarga1;
    private javax.swing.JTextField txtMontorecarga;
    private javax.swing.JTextField txtMontorecarga1;
    // End of variables declaration//GEN-END:variables
}
