package view;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import model.CharlesModel;

public class LeyCharlesView extends javax.swing.JFrame {

    // Crear una instancia de AvogadroModel
    CharlesModel charlesFormula = new CharlesModel();

    public LeyCharlesView() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(getIconImage());

        SetImageLabel(CharlesFormula, "src/img/charles-formula.png");
        SetImageLabel(logoCharles, "src/img/icono-formula.png");
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
        logoCharles = new javax.swing.JLabel();
        lbV1 = new javax.swing.JLabel();
        lbT1 = new javax.swing.JLabel();
        lbV2 = new javax.swing.JLabel();
        lbT2 = new javax.swing.JLabel();
        VolumenInicial = new javax.swing.JTextField();
        TemperaturaInicial = new javax.swing.JTextField();
        VolumenFinal = new javax.swing.JTextField();
        TemperaturaFinal = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CharlesFormula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtResolucion = new javax.swing.JLabel();
        txtResolucion1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calcular Ley de Charles");

        jPanel1.setBackground(new java.awt.Color(220, 249, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(7, 44, 44));
        lbTitulo.setText("Calcular Ley de Charles");
        jPanel1.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));
        jPanel1.add(logoCharles, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 50, 40));

        lbV1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbV1.setForeground(new java.awt.Color(7, 44, 44));
        lbV1.setText("Volumen inicial (V1)");
        jPanel1.add(lbV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        lbT1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbT1.setForeground(new java.awt.Color(7, 44, 44));
        lbT1.setText("Temperatura inicial (T1)");
        jPanel1.add(lbT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        lbV2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbV2.setForeground(new java.awt.Color(7, 44, 44));
        lbV2.setText("Volumen final (V2)");
        jPanel1.add(lbV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        lbT2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbT2.setForeground(new java.awt.Color(7, 44, 44));
        lbT2.setText("Temperatura final (T2)");
        jPanel1.add(lbT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 30));
        jPanel1.add(VolumenInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 90, 30));
        jPanel1.add(TemperaturaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 90, 30));
        jPanel1.add(VolumenFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 90, 30));
        jPanel1.add(TemperaturaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 90, 30));

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
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 330, 40));

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
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 330, 40));

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
        jPanel1.add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 330, 40));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 44, 44)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(CharlesFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(CharlesFormula, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(7, 44, 44));
        jLabel1.setText("RESOLUCIÓN:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtResolucion.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtResolucion.setForeground(new java.awt.Color(7, 44, 44));
        jPanel1.add(txtResolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 330, 20));

        txtResolucion1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txtResolucion1.setForeground(new java.awt.Color(7, 44, 44));
        jPanel1.add(txtResolucion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 330, 20));

        jLabel2.setForeground(new java.awt.Color(7, 44, 44));
        jLabel2.setText("litros");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        jLabel3.setForeground(new java.awt.Color(7, 44, 44));
        jLabel3.setText("Kelvin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        jLabel4.setForeground(new java.awt.Color(7, 44, 44));
        jLabel4.setText("litros");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jLabel5.setForeground(new java.awt.Color(7, 44, 44));
        jLabel5.setText("Kelvin");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // Limpiar los campos de entrada 
        VolumenInicial.setText("");
        TemperaturaInicial.setText("");
        VolumenFinal.setText("");
        TemperaturaFinal.setText("");
        txtResolucion.setText("");
        txtResolucion1.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
        String t1Inicial = TemperaturaInicial.getText();
        String v2Final = VolumenFinal.getText();
        String t2Final = TemperaturaFinal.getText();

        int camposNoVacios = 0;
        // Validar si los valores son números
        try {
            if (!v1Inicial.isEmpty()) {
                Double.parseDouble(v1Inicial);
                camposNoVacios++;
            }
            if (!t1Inicial.isEmpty()) {
                Double.parseDouble(t1Inicial);
                camposNoVacios++;
            }
            if (!v2Final.isEmpty()) {
                Double.parseDouble(v2Final);
                camposNoVacios++;
            }
            if (!t2Final.isEmpty()) {
                Double.parseDouble(t2Final);
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
        if (!v1Inicial.isEmpty() && !t1Inicial.isEmpty() && !v2Final.isEmpty() && !t2Final.isEmpty()) {
            // Mostrar un mensaje de error en caso de que se ingresen los 4 valores
            JOptionPane.showMessageDialog(this, "Debe ingresar solo 3 valores.");
            return;
        }

        String resolucion = "";

        // Verificar qué valor se debe calcular
        if (v2Final.isEmpty()) {
            // Calcular V2 y actualizar el campo correspondiente
            double v1 = Double.parseDouble(v1Inicial);
            double t1 = Double.parseDouble(t1Inicial);
            double t2 = Double.parseDouble(t2Final);

            double resultadoV2 = charlesFormula.calcular(v1, t1, 0, t2);

            String resultadoFormateado = String.format("%.1f", resultadoV2);
            VolumenFinal.setText(resultadoFormateado);

            txtResolucion1.setText("El volumen final será de " + resultadoFormateado + " litro(s) después");
            resolucion = "de calentar el gas a " + t2 + " Kelvin.";
        } else if (t2Final.isEmpty()) {
            // Calcular T2 y actualizar el campo correspondiente
            double v1 = Double.parseDouble(v1Inicial);
            double t1 = Double.parseDouble(t1Inicial);
            double v2 = Double.parseDouble(v2Final);

            double resultadoT2 = charlesFormula.calcular(v1, t1, v2, 0);

            String resultadoFormateado = String.format("%.1f", resultadoT2);
            TemperaturaFinal.setText(resultadoFormateado);

            txtResolucion1.setText("La temperatura final será de " + resultadoFormateado + " Kelvin después");
            resolucion = "de modificar el volumen del gas a " + v2 + " litro(s).";
        } else {
            // Mostrar un mensaje de error si se ingresan todos los valores
            JOptionPane.showMessageDialog(this, "Debe dejar un campo vacío en v2 o t2 para calcularlo.");
        }

        // Establecer el texto en el TextArea
        txtResolucion.setText(resolucion);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(LeyCharlesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeyCharlesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeyCharlesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeyCharlesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeyCharlesView().setVisible(true);
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
    private javax.swing.JLabel CharlesFormula;
    private javax.swing.JTextField TemperaturaFinal;
    private javax.swing.JTextField TemperaturaInicial;
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
    private javax.swing.JLabel lbT1;
    private javax.swing.JLabel lbT2;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbV1;
    private javax.swing.JLabel lbV2;
    private javax.swing.JLabel logoCharles;
    private javax.swing.JLabel txtResolucion;
    private javax.swing.JLabel txtResolucion1;
    // End of variables declaration//GEN-END:variables
}
