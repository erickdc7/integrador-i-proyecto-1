package view;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.AvogadroModel;

public class LeyAvogadroView extends javax.swing.JFrame {

    // Crear una instancia de AvogadroModel
    AvogadroModel avogadroFormula = new AvogadroModel();

    public LeyAvogadroView() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        SetImageLabel(AvogradoFormula, "src/img/avogadro-formula.png");
        SetImageLabel(logoAvogadro, "src/img/icono-formula.png");
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

        jPanel2 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        lbV1 = new javax.swing.JLabel();
        lbN1 = new javax.swing.JLabel();
        lbV2 = new javax.swing.JLabel();
        lbN2 = new javax.swing.JLabel();
        VolumenInicial = new javax.swing.JTextField();
        InicialMoles = new javax.swing.JTextField();
        FinalMoles = new javax.swing.JTextField();
        VolumenFinal = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        logoAvogadro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AvogradoFormula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtResolucion = new javax.swing.JLabel();
        txtResolucion1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Ley de Avogadro");

        jPanel2.setBackground(new java.awt.Color(220, 249, 250));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(7, 44, 44));
        lbTitulo.setText("Calcular Ley de Avogadro");
        jPanel2.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnCalcular.setBackground(new java.awt.Color(21, 77, 138));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(220, 249, 250));
        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel2.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 330, 40));

        btnMenu.setBackground(new java.awt.Color(21, 77, 138));
        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(220, 249, 250));
        btnMenu.setText("Volver al menú");
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 330, 40));

        lbV1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbV1.setForeground(new java.awt.Color(7, 44, 44));
        lbV1.setText("Volumen inicial (V1):");
        jPanel2.add(lbV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        lbN1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbN1.setForeground(new java.awt.Color(7, 44, 44));
        lbN1.setText("Número inicial de moles (n1):");
        jPanel2.add(lbN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        lbV2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbV2.setForeground(new java.awt.Color(7, 44, 44));
        lbV2.setText("Volumen final (V2):");
        jPanel2.add(lbV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        lbN2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbN2.setForeground(new java.awt.Color(7, 44, 44));
        lbN2.setText("Número final de moles (n2):");
        jPanel2.add(lbN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));
        jPanel2.add(VolumenInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 90, 30));
        jPanel2.add(InicialMoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, 30));
        jPanel2.add(FinalMoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, 30));

        VolumenFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolumenFinalActionPerformed(evt);
            }
        });
        jPanel2.add(VolumenFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, 30));

        btnLimpiar.setBackground(new java.awt.Color(21, 77, 138));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(220, 249, 250));
        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 330, 40));
        jPanel2.add(logoAvogadro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 44, 44)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(AvogradoFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(AvogradoFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 100));

        jLabel1.setForeground(new java.awt.Color(7, 44, 44));
        jLabel1.setText("litros");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 44, 44));
        jLabel2.setText("RESOLUCIÓN:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        jLabel3.setForeground(new java.awt.Color(7, 44, 44));
        jLabel3.setText("litros");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel4.setForeground(new java.awt.Color(7, 44, 44));
        jLabel4.setText("moles");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jLabel5.setForeground(new java.awt.Color(7, 44, 44));
        jLabel5.setText("moles");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        txtResolucion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtResolucion.setForeground(new java.awt.Color(7, 44, 44));
        jPanel2.add(txtResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 330, 20));

        txtResolucion1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtResolucion1.setForeground(new java.awt.Color(7, 44, 44));
        jPanel2.add(txtResolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 330, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolumenFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolumenFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VolumenFinalActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // Cierra la ventana actual
        dispose();

        // Abre la nueva ventana VentanaPrincipal
        VentanaPrincipal boyleView = new VentanaPrincipal();
        boyleView.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // Obtener los valores ingresados por el usuario
        String v1Inicial = VolumenInicial.getText();
        String n1Inicial = InicialMoles.getText();
        String v2Final = VolumenFinal.getText();
        String n2Final = FinalMoles.getText();

        int camposNoVacios = 0;
        // Validar si los valores son números
        try {
            if (!v1Inicial.isEmpty()) {
                Double.parseDouble(v1Inicial);
                camposNoVacios++;
            }
            if (!n1Inicial.isEmpty()) {
                Double.parseDouble(n1Inicial);
                camposNoVacios++;
            }
            if (!v2Final.isEmpty()) {
                Double.parseDouble(v2Final);
                camposNoVacios++;
            }
            if (!n2Final.isEmpty()) {
                Double.parseDouble(n2Final);
                camposNoVacios++;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar solo números válidos.");
            return;
        }

        // Verificar si hay al menos 3 campos no vacíos
        if (camposNoVacios < 3) {
            JOptionPane.showMessageDialog(this, "Debe ingresar al menos 3 valores.");
            return;
        }

        // Verificar que al menos se hayan ingresado 3 valores no vacíos
        if (!v1Inicial.isEmpty() && !n1Inicial.isEmpty() && !v2Final.isEmpty() && !n2Final.isEmpty()) {
            // Mostrar un mensaje de error en caso de que se ingresen los 4 valores
            JOptionPane.showMessageDialog(this, "Debe ingresar solo 3 valores.");
            return;
        }

        String resolucion = "";

        // Verificar qué valor se debe calcular
        if (v2Final.isEmpty()) {
            // Calcular V2 y actualizar el campo correspondiente
            double v1 = Double.parseDouble(v1Inicial);
            double n1 = Double.parseDouble(n1Inicial);
            double n2 = Double.parseDouble(n2Final);

            double resultadoV2 = avogadroFormula.calcular(v1, n1, 0, n2);
            
            String resultadoFormateado = String.format("%.1f", resultadoV2);
            VolumenFinal.setText(resultadoFormateado);
            
            txtResolucion1.setText("El nuevo volumen después de ajustar la");
            resolucion = "cantidad de moles a " + n2 + " será de " + resultadoFormateado + " litro(s).";
        } else if (n2Final.isEmpty()) {
            // Calcular N2 y actualizar el campo correspondiente
            double v1 = Double.parseDouble(v1Inicial);
            double n1 = Double.parseDouble(n1Inicial);
            double v2 = Double.parseDouble(v2Final);

            double resultadoN2 = avogadroFormula.calcular(v1, n1, v2, 0); 

            String resultadoFormateado = String.format("%.1f", resultadoN2);
            FinalMoles.setText(resultadoFormateado);
            
            txtResolucion1.setText("La nueva cantidad de moles después de cambiar");
            resolucion = "el volumen a " + v2 + " litro(s) será de " + resultadoFormateado + " moles.";
        } else {
            // Mostrar un mensaje de error si se ingresan todos los valores
            JOptionPane.showMessageDialog(this, "Debe dejar un campo vacío en v2 o n2 para calcularlo.");
        }

        // Establecer el texto en el TextArea
        txtResolucion.setText(resolucion); 
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Limpiar los campos de entrada
        VolumenInicial.setText("");
        InicialMoles.setText("");
        VolumenFinal.setText("");
        FinalMoles.setText("");
        txtResolucion.setText("");
        txtResolucion1.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(LeyAvogadroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeyAvogadroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeyAvogadroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeyAvogadroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeyAvogadroView().setVisible(true);
            }
        });
    }

    // Establece una imagen en un JLabel y la adapta al tamaño del JLabel.
    private void SetImageLabel(JLabel labelName, String root) {
        // Crea un objeto ImageIcon a partir de la ruta de la imagen
        ImageIcon image = new ImageIcon(root);

        // Crea un objeto Icon escalando la imagen para que se ajuste al tamaño del JLabel
        Icon icon = new ImageIcon(
                image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT)
        );

        // Establece el icono en el JLabel
        labelName.setIcon(icon);

        // Actualiza la vista para mostrar la imagen
        this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvogradoFormula;
    private javax.swing.JTextField FinalMoles;
    private javax.swing.JTextField InicialMoles;
    private javax.swing.JTextField VolumenFinal;
    private javax.swing.JTextField VolumenInicial;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbN1;
    private javax.swing.JLabel lbN2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbV1;
    private javax.swing.JLabel lbV2;
    private javax.swing.JLabel logoAvogadro;
    private javax.swing.JLabel txtResolucion;
    private javax.swing.JLabel txtResolucion1;
    // End of variables declaration//GEN-END:variables
}
