
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Ferrando Carlos
 */
public class ProductoView extends javax.swing.JFrame {

    //tabla 
    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form ProductoView
     */
    public ProductoView() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpProductoSelect = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlCategoria = new javax.swing.JLabel();
        jcbCategorias = new javax.swing.JComboBox<>();
        jlDatos = new javax.swing.JLabel();
        jlDatos1 = new javax.swing.JLabel();
        jlDatos2 = new javax.swing.JLabel();
        jtfNombre = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        jbtnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpProductoSelect.setBackground(new java.awt.Color(7, 10, 222));
        jpProductoSelect.setToolTipText("");

        jlTitulo.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jlTitulo.setText("Sistema de Productos");

        jlCategoria.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlCategoria.setText("CATEGORIA");

        jcbCategorias.setBackground(new java.awt.Color(51, 51, 255));
        jcbCategorias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jcbCategorias.setForeground(new java.awt.Color(0, 0, 0));
        jcbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Electrónica", "Alimentos", "Videojuegos", "Indumentaria" }));
        jcbCategorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(168, 64, 15), 2, true));

        jlDatos.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jlDatos.setForeground(new java.awt.Color(255, 255, 255));
        jlDatos.setText("DATOS DEL PRODUCTO");

        jlDatos1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlDatos1.setForeground(new java.awt.Color(255, 255, 255));
        jlDatos1.setText("NOMBRE");

        jlDatos2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlDatos2.setForeground(new java.awt.Color(255, 255, 255));
        jlDatos2.setText("PRECIO");

        jtfNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 64, 15), 2));

        jtfPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jtfPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 64, 15), 2));

        jbtnAgregar.setBackground(new java.awt.Color(168, 64, 15));
        jbtnAgregar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbtnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAgregar.setText("AGREGAR PRODUCTO");
        jbtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpProductoSelectLayout = new javax.swing.GroupLayout(jpProductoSelect);
        jpProductoSelect.setLayout(jpProductoSelectLayout);
        jpProductoSelectLayout.setHorizontalGroup(
            jpProductoSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoSelectLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jpProductoSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlDatos2)
                    .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlCategoria)
                    .addComponent(jcbCategorias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlDatos)
                    .addComponent(jlDatos1)
                    .addComponent(jtfNombre)
                    .addComponent(jtfPrecio)
                    .addComponent(jbtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jpProductoSelectLayout.setVerticalGroup(
            jpProductoSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProductoSelectLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jlDatos)
                .addGap(31, 31, 31)
                .addComponent(jlDatos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jlDatos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jbtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        getContentPane().add(jpProductoSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 600));

        jtProductos.setBackground(new java.awt.Color(255, 255, 255));
        jtProductos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtProductos.setForeground(new java.awt.Color(0, 0, 0));
        jtProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarActionPerformed

        cargarDatos();
        jtfNombre.setText("");
        jtfPrecio.setText("");

    }//GEN-LAST:event_jbtnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregar;
    private javax.swing.JComboBox<String> jcbCategorias;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlDatos;
    private javax.swing.JLabel jlDatos1;
    private javax.swing.JLabel jlDatos2;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpProductoSelect;
    private javax.swing.JTable jtProductos;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("Categoria");
        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");

        jtProductos.setModel(modelo);
    }

    private void cargarDatos() {
        String nombre, categoria;
        double precio;

        try {
            if (!jtfPrecio.getText().isEmpty() && !jtfNombre.getText().isEmpty()) {
                precio = Double.parseDouble(jtfPrecio.getText());
                categoria = (String) jcbCategorias.getSelectedItem();
                nombre = jtfNombre.getText();
                Object[] porductosArray = new Object[]{categoria, nombre, precio};
                modelo.addRow(porductosArray);
            } else {
                JOptionPane.showMessageDialog(this, "No deben quedar campos vacíos");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un precio en números");
        }

    }
}
