package view;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.AvogadroModel;
import model.BoyleMariotteModel;
import model.CharlesModel;
import model.GayLussacModel;

public class VentanaPrincipal extends javax.swing.JFrame {

    AvogadroModel avogadroFormula = new AvogadroModel();
    BoyleMariotteModel boyleMariotteModel = new BoyleMariotteModel();
    CharlesModel charlesModel = new CharlesModel();
    GayLussacModel gayLussacModel = new GayLussacModel();
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        SetImageLabel(imgLeyBoyle, "src/img/boyle-mariotte-formula.png");
        SetImageLabel(imgLeyCharles, "src/img/charles-formula.png");
        SetImageLabel(imgLeyGayLussac, "src/img/gay-lussac-formula.png");
        SetImageLabel(imgLeyAvogadro, "src/img/avogadro-formula.png");
        SetImageLabel(logo, "src/img/logo.png");
        SetImageLabel(logo1, "src/img/logo.png");
    }

    // Icono del JFrame
    @Override
    public Image getIconImage() {
        // Obtiene la imagen del icono utilizando la clase Toolkit y la ruta de la imagen.
        // En este caso, la imagen se busca en el recurso del sistema llamado "img/logo.png".
        Image resValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return resValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btnBoyle = new javax.swing.JButton();
        btnGayLussac = new javax.swing.JButton();
        btnAvogadro = new javax.swing.JButton();
        btnCharles = new javax.swing.JButton();
        imgLeyBoyle = new javax.swing.JLabel();
        imgLeyCharles = new javax.swing.JLabel();
        imgLeyAvogadro = new javax.swing.JLabel();
        imgLeyGayLussac = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        logo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Ley de Gases Ideales");

        jPanel1.setBackground(new java.awt.Color(220, 249, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(7, 44, 44));
        lbTitulo.setText("Calcular Ley de los Gases Ideales");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));

        btnBoyle.setBackground(new java.awt.Color(21, 77, 138));
        btnBoyle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBoyle.setForeground(new java.awt.Color(220, 249, 250));
        btnBoyle.setText("Ley de Boyle-Mariotte");
        btnBoyle.setBorder(null);
        btnBoyle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoyle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoyleActionPerformed(evt);
            }
        });
        jPanel1.add(btnBoyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 200, 40));

        btnGayLussac.setBackground(new java.awt.Color(21, 77, 138));
        btnGayLussac.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGayLussac.setForeground(new java.awt.Color(220, 249, 250));
        btnGayLussac.setText("Ley de Gay-Lussac");
        btnGayLussac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGayLussac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGayLussacActionPerformed(evt);
            }
        });
        jPanel1.add(btnGayLussac, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 200, 40));

        btnAvogadro.setBackground(new java.awt.Color(21, 77, 138));
        btnAvogadro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAvogadro.setForeground(new java.awt.Color(220, 249, 250));
        btnAvogadro.setText("Ley de Avogadro");
        btnAvogadro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAvogadro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvogadroActionPerformed(evt);
            }
        });
        jPanel1.add(btnAvogadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 200, 40));

        btnCharles.setBackground(new java.awt.Color(21, 77, 138));
        btnCharles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCharles.setForeground(new java.awt.Color(220, 249, 250));
        btnCharles.setText("Ley de Charles");
        btnCharles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCharles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCharlesActionPerformed(evt);
            }
        });
        jPanel1.add(btnCharles, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, 200, 40));

        imgLeyBoyle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgLeyBoyle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 200, 140));

        imgLeyCharles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgLeyCharles, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 200, 140));

        imgLeyAvogadro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgLeyAvogadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 200, 140));

        imgLeyGayLussac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(imgLeyGayLussac, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 200, 140));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 50, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 200, 140));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(logo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBoyleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoyleActionPerformed
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana LeyBoyleMariotteView
        LeyBoyleMariotteView boyleView = new LeyBoyleMariotteView();
        boyleView.setVisible(true);
    }//GEN-LAST:event_btnBoyleActionPerformed

    private void btnCharlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCharlesActionPerformed
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana LeyCharlesView
        LeyCharlesView boyleView = new LeyCharlesView();
        boyleView.setVisible(true);
    }//GEN-LAST:event_btnCharlesActionPerformed

    private void btnGayLussacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGayLussacActionPerformed
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana LeyGayLussacView
        LeyGayLussacView boyleView = new LeyGayLussacView();
        boyleView.setVisible(true);
    }//GEN-LAST:event_btnGayLussacActionPerformed

    private void btnAvogadroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvogadroActionPerformed
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana LeyAvogadroView
        LeyAvogadroView boyleView = new LeyAvogadroView();
        boyleView.setVisible(true);
    }//GEN-LAST:event_btnAvogadroActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    private void SetImageLabel(JLabel labelName, String root) {
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );
        labelName.setIcon(icon);
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvogadro;
    private javax.swing.JButton btnBoyle;
    private javax.swing.JButton btnCharles;
    private javax.swing.JButton btnGayLussac;
    private javax.swing.JLabel imgLeyAvogadro;
    private javax.swing.JLabel imgLeyBoyle;
    private javax.swing.JLabel imgLeyCharles;
    private javax.swing.JLabel imgLeyGayLussac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo1;
    // End of variables declaration//GEN-END:variables
}
