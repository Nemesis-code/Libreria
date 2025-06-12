/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import main.Libreria;
import modelos.Proveedor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mynor
 */
public class ConsultarProveedores extends javax.swing.JFrame {

    // Variable temporal para almacenar el proveedor seleccionado para edición o consulta
    private Proveedor proveedorTemporal;

    public ConsultarProveedores() {
        initComponents();
        cargarTablaProveedores();//para que se muestren los datos en la tabla
    }

    /**
 * Actualiza la tabla con la lista actual de proveedores.
 * Limpia la tabla y agrega una fila por cada proveedor contenido en la lista
 * Libreria.proveedores.
 * 
 * Este método debe llamarse cada vez que se:
 * - Agrega un nuevo proveedor
 * - Modifica un proveedor existente
 * - Elimina un proveedor
 * 
 * Así, la interfaz gráfica (la tabla) se mantiene sincronizada con los datos reales.
 */
private void cargarTablaProveedores() {
    // Definir los nombres de las columnas que aparecerán en la cabecera de la tabla
    String encabezado[] = {"Nombre", "Dirección", "Telefono", "NIT"};

    // Crear un modelo de tabla vacío con las columnas definidas
    DefaultTableModel t = new DefaultTableModel(encabezado, 0);

    // Recorrer la lista de proveedores y por cada uno crear una fila con sus datos
    for (Proveedor p : Libreria.proveedores) {
        Object[] fila = {
            p.nombre,    // Columna 0: Nombre del proveedor
            p.direccion, // Columna 1: Dirección
            p.telefono,  // Columna 2: Teléfono
            p.nit        // Columna 3: NIT
        };
        // Agregar la fila al modelo de tabla
        t.addRow(fila);
    }

    // Asignar el modelo de tabla al componente jTable1 para que se actualice en la interfaz
    jTable1.setModel(t);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        txtNit = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Direccion:");

        jLabel3.setText("Telefono:");

        jLabel4.setText("NIT;");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDireccion)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(txtTelefono))
                            .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addComponent(btnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrar)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // Obtener la fila seleccionada en la tabla
        int fila = jTable1.getSelectedRow();

        // Verificar que haya una fila seleccionada para actualizar
        if (fila >= 0) {
            // Obtener el proveedor de la lista según la fila seleccionada
            Proveedor p = Libreria.proveedores.get(fila);

            // Actualizar los datos del proveedor con los valores actuales de los campos de texto
            p.nombre = txtNombre.getText();
            p.direccion = txtDireccion.getText();
            p.telefono = txtTelefono.getText();
            p.nit = txtNit.getText();

            // Guardar todos los datos actualizados en disco
            main.Libreria.guardarTodo();
            // Refrescar la tabla para mostrar los cambios realizados
            cargarTablaProveedores();
            JOptionPane.showMessageDialog(this, "Proveedor actualizado exitosamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un proveedor para actualizar.");
        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Crear un nuevo objeto Proveedor
        Proveedor p = new Proveedor();

        // Asignar los valores ingresados en los campos de texto al objeto Proveedor
        p.nombre = txtNombre.getText();
        p.direccion = txtDireccion.getText();
        p.telefono = txtTelefono.getText();
        p.nit = txtNit.getText();

        // Agregar el nuevo proveedor a la lista estática de proveedores
        Libreria.proveedores.add(p);

        // Guardar todos los datos (usuarios, libros, proveedores, etc.) en disco
        main.Libreria.guardarTodo();
        // Actualizar la tabla para mostrar el nuevo proveedor agregado
        cargarTablaProveedores();
        JOptionPane.showMessageDialog(this, "Proveedor agregado exitosamente.");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Obtener la fila seleccionada en la tabla
        int fila = jTable1.getSelectedRow();

        // Verificar que haya una fila seleccionada
        if (fila >= 0) {
            // Obtener el proveedor correspondiente a la fila seleccionada
            Proveedor p = Libreria.proveedores.get(fila);
            // Mostrar los datos del proveedor en los campos de texto para poder editarlos
            txtNombre.setText(p.nombre);
            txtDireccion.setText(p.direccion);
            txtTelefono.setText(p.telefono);
            txtNit.setText(p.nit);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un proveedor para modificar.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        main.Libreria.guardarTodo(); // <- guarda todo
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // Obtener la fila seleccionada en la tabla
        int fila = jTable1.getSelectedRow();

        // Verificar que haya una fila seleccionada
        if (fila >= 0) {
            // Confirmar con el usuario que realmente quiere eliminar el proveedor
            if (JOptionPane.showConfirmDialog(this, "¿Estás seguro de eliminar este proveedor?") == 0) {
                // Eliminar el proveedor de la lista
                Libreria.proveedores.remove(fila);
                // Guardar cambios en disco
                main.Libreria.guardarTodo();
                // Actualizar la tabla para reflejar la eliminación
                cargarTablaProveedores();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un proveedor para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
