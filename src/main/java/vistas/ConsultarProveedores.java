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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
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

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btnModificar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                    .addComponent(jTextField4))))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnActualizar)
                                .addGap(54, 54, 54)
                                .addComponent(btnEliminar))
                            .addComponent(jButton3))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addContainerGap(56, Short.MAX_VALUE))
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
            p.nombre = jTextField1.getText();
            p.direccion = jTextField2.getText();
            p.telefono = jTextField3.getText();
            p.nit = jTextField4.getText();

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
        p.nombre = jTextField1.getText();
        p.direccion = jTextField2.getText();
        p.telefono = jTextField3.getText();
        p.nit = jTextField4.getText();

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
            jTextField1.setText(p.nombre);
            jTextField2.setText(p.direccion);
            jTextField3.setText(p.telefono);
            jTextField4.setText(p.nit);
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un proveedor para modificar.");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        main.Libreria.guardarTodo(); // <- guarda todo
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
