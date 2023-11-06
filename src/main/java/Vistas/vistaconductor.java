package Vistas;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.*;
import controladores.*;


public class vistaconductor extends javax.swing.JFrame {
    UsuarioDAO usDao= new UsuarioDAO();
    Usuarios us=new Usuarios();
    Rutas rut=new Rutas();
    RutasDAO rutdao=new RutasDAO();
    
  
    public vistaconductor() {
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
        jPanelConsumos = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelModuloConsumos = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txticodunidad = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblconsumos = new javax.swing.JTable();
        cbxEstadoConsumo = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        cbxnrotarjeconduc = new javax.swing.JComboBox<>();
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

        jPanelConsumos.setBackground(new java.awt.Color(0, 153, 204));
        jPanelConsumos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConsumosMouseClicked(evt);
            }
        });
        jPanelConsumos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(51, 51, 51));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("Consumos");
        jPanelConsumos.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 30));

        jPanel1.add(jPanelConsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        jLabel7.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Conductor");
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

        jPanelModuloConsumos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel39.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel39.setText("Módulo de Consumos");

        jLabel41.setText("Nro de Tarjeta");

        jLabel44.setText("Unidad");

        txticodunidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txticodunidadActionPerformed(evt);
            }
        });

        jButton15.setText("Recargar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        tblconsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CodConsumo", "MontoConsumo", "CodTarjeta", "CodUnidad", "FechaConsumo", "estado"
            }
        ));
        jScrollPane7.setViewportView(tblconsumos);

        cbxEstadoConsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        cbxEstadoConsumo.setToolTipText("");
        cbxEstadoConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoConsumoActionPerformed(evt);
            }
        });

        jLabel60.setText("estado");

        cbxnrotarjeconduc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelModuloConsumosLayout = new javax.swing.GroupLayout(jPanelModuloConsumos);
        jPanelModuloConsumos.setLayout(jPanelModuloConsumosLayout);
        jPanelModuloConsumosLayout.setHorizontalGroup(
            jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloConsumosLayout.createSequentialGroup()
                .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloConsumosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModuloConsumosLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116))
                            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(cbxEstadoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txticodunidad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxnrotarjeconduc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)))
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanelModuloConsumosLayout.setVerticalGroup(
            jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxnrotarjeconduc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txticodunidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelModuloConsumosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelModuloConsumosLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel60))
                            .addComponent(cbxEstadoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jButton15))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Consumos", jPanelModuloConsumos);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 890, 610));

        jLabel29.setFont(new java.awt.Font("Corbel", 0, 30)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("USUARIO");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 190, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanelConsumosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConsumosMouseClicked
        jTabbedPane1.setSelectedIndex(6);

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelConsumosMouseClicked

    private void txticodunidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txticodunidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txticodunidadActionPerformed

    private void cbxEstadoConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoConsumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoConsumoActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
      
        
    }//GEN-LAST:event_jButton15ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaconductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaconductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxEstadoConsumo;
    private javax.swing.JComboBox<String> cbxnrotarjeconduc;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelConsumos;
    private javax.swing.JPanel jPanelModuloConsumos;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblconsumos;
    private javax.swing.JTextField txticodunidad;
    // End of variables declaration//GEN-END:variables
}
