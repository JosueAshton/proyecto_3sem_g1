/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import datos.Dvehiculo;
import entidades.Evehiculo;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josué
 */
public class frmVehiculo extends javax.swing.JFrame {
    Dvehiculo dv = new Dvehiculo();
    Evehiculo vehiculo = new Evehiculo();
    String n1="",c1="";
    /**
     * Creates new form frmVehiculo
     */
    public frmVehiculo() {
        initComponents();
    }

    static void LlenarArray(){
		
	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new org.edisoncor.gui.panel.Panel();
        jLabel1 = new javax.swing.JLabel();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        jLabel3 = new javax.swing.JLabel();
        txtCI = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        jLabel5 = new javax.swing.JLabel();
        txtCelular = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        jLabel6 = new javax.swing.JLabel();
        txtDireccion = new org.edisoncor.gui.textField.TextFieldRoundBackground();
        btnVaciar = new org.edisoncor.gui.button.ButtonColoredAction();
        btnBuscar = new org.edisoncor.gui.button.ButtonColoredAction();
        panel3 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        panel5 = new org.edisoncor.gui.panel.Panel();
        btnMostrar = new org.edisoncor.gui.button.ButtonColoredAction();
        btnNuevo = new org.edisoncor.gui.button.ButtonColoredAction();
        btnEditar = new org.edisoncor.gui.button.ButtonColoredAction();
        btnEliminar = new org.edisoncor.gui.button.ButtonColoredAction();
        panel4 = new org.edisoncor.gui.panel.Panel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(102, 102, 255));
        panel1.setColorPrimario(new java.awt.Color(0, 51, 204));
        panel1.setColorSecundario(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos del cliente");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(508, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        panel2.setColorPrimario(new java.awt.Color(204, 204, 255));
        panel2.setColorSecundario(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Nombre del cliente:");

        txtNombre.setDescripcion("   ");
        txtNombre.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 204));
        jLabel3.setText("C.I:");

        txtCI.setDescripcion("   ");
        txtCI.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Celular:");

        txtCelular.setDescripcion("   ");
        txtCelular.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Direccion:");

        txtDireccion.setDescripcion("   ");
        txtDireccion.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N

        btnVaciar.setBackground(new java.awt.Color(51, 51, 255));
        btnVaciar.setText("Vaciar");
        btnVaciar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(51, 51, 255));
        btnBuscar.setText("BUSCAR");
        btnBuscar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 280, 310));

        panel3.setColorPrimario(new java.awt.Color(204, 204, 255));
        panel3.setColorSecundario(new java.awt.Color(204, 204, 204));

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatos);

        panel5.setBackground(new java.awt.Color(102, 102, 255));
        panel5.setColorPrimario(new java.awt.Color(204, 204, 255));
        panel5.setColorSecundario(new java.awt.Color(204, 204, 255));

        btnMostrar.setBackground(new java.awt.Color(51, 51, 255));
        btnMostrar.setText("MOSTRAR");
        btnMostrar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(51, 51, 255));
        btnNuevo.setText("NUEVO");
        btnNuevo.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(51, 51, 255));
        btnEditar.setText("EDITAR");
        btnEditar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(51, 51, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setFont(new java.awt.Font("Microsoft YaHei UI Light", 0, 14)); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        getContentPane().add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 510, 310));

        panel4.setColorPrimario(new java.awt.Color(0, 51, 153));
        panel4.setColorSecundario(new java.awt.Color(0, 51, 153));

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Copyright Josue Ashton - Un concepto del proyecto");

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        getContentPane().add(panel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 790, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        JPanel panel = new JPanel();
				DefaultTableModel tableModel = new DefaultTableModel();

				panel.setLayout(new BorderLayout());
				String[] columnNames = {"Nombre", "C.I.","Ceular","Direccion"};
				tableModel.setColumnIdentifiers(columnNames);
				Object[] fila = new Object[tableModel.getColumnCount()];

				for (int i = 0; i < dv.alVehiculo.size(); i++) {

				fila[0] = dv.alVehiculo.get(i).getNombre();
				fila[1] = dv.alVehiculo.get(i).getCi();
				fila[2] = dv.alVehiculo.get(i).getCelular();
				fila[3] = dv.alVehiculo.get(i).getDireccion();
				tableModel.addRow(fila);
				}
				tbDatos.setModel(tableModel);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        // TODO add your handling code here:
        int iFila = tbDatos.getSelectedRow();
				String nombre = (String) tbDatos.getValueAt(iFila,0);
				txtNombre.setText(nombre);
                                n1=txtNombre.getText();
				String ci = (String) tbDatos.getValueAt(iFila,1);
				txtCI.setText(ci);
                                c1=txtCI.getText();
				String celular = (String) tbDatos.getValueAt(iFila,2);
				txtCelular.setText(celular);
				String direccion = (String) tbDatos.getValueAt(iFila,3);
				txtDireccion.setText(direccion);
    }//GEN-LAST:event_tbDatosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        Evehiculo v = new Evehiculo(txtNombre.getText(), txtCI.getText(), txtCelular.getText(), txtDireccion.getText());
         dv.nuevo(v);
         
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        ArrayList<Evehiculo> ar = new ArrayList<>();
        if(dv.Buscar(txtNombre.getText()).size()==0){
            
        }else{
            ar.add(dv.Buscar(txtNombre.getText()).get(0));
        JPanel panel = new JPanel();
        DefaultTableModel tableModel = new DefaultTableModel();

        panel.setLayout(new BorderLayout());
        String[] columnNames = {"Nombre", "C.I.","Ceular","Direccion"};
        tableModel.setColumnIdentifiers(columnNames);
        Object[] fila = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < ar.size(); i++) {

        fila[0] = ar.get(i).getNombre();
        fila[1] = ar.get(i).getCi();
        fila[2] = ar.get(i).getCelular();
        fila[3] = ar.get(i).getDireccion();
        tableModel.addRow(fila);
        }
        tbDatos.setModel(tableModel);
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
        // TODO add your handling code here:
       VaciarTextos();
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        Evehiculo v = new Evehiculo(txtNombre.getText(), txtCI.getText(), txtCelular.getText(), txtDireccion.getText());
         dv.modificar(v,n1 ,c1);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Evehiculo v = new Evehiculo(txtNombre.getText(), txtCI.getText(), txtCelular.getText(), txtDireccion.getText());
        dv.eliminar(v);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void VaciarTextos(){
        this.txtNombre.setText("");
        this.txtCI.setText("");
        this.txtCelular.setText("");
        this.txtDireccion.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        /* Set the Nimbus look and feel */
        LlenarArray();
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonColoredAction btnBuscar;
    private org.edisoncor.gui.button.ButtonColoredAction btnEditar;
    private org.edisoncor.gui.button.ButtonColoredAction btnEliminar;
    private org.edisoncor.gui.button.ButtonColoredAction btnMostrar;
    private org.edisoncor.gui.button.ButtonColoredAction btnNuevo;
    private org.edisoncor.gui.button.ButtonColoredAction btnVaciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.Panel panel4;
    private org.edisoncor.gui.panel.Panel panel5;
    private javax.swing.JTable tbDatos;
    private org.edisoncor.gui.textField.TextFieldRoundBackground txtCI;
    private org.edisoncor.gui.textField.TextFieldRoundBackground txtCelular;
    private org.edisoncor.gui.textField.TextFieldRoundBackground txtDireccion;
    private org.edisoncor.gui.textField.TextFieldRoundBackground txtNombre;
    // End of variables declaration//GEN-END:variables
}