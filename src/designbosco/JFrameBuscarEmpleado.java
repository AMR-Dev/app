/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designbosco;

import static designbosco.JFramePrincipal.sistema;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ezequiel Melogno
 */
public class JFrameBuscarEmpleado extends javax.swing.JFrame {
    
    static int indexLocal;
    
    public JFrameBuscarEmpleado(int indexLocal) {
        initComponents();
        this.indexLocal = indexLocal;
        actualizarListaEmpleados();
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
        cambios_text = new javax.swing.JLabel();
        nombre_text = new javax.swing.JLabel();
        email_text = new javax.swing.JLabel();
        emailEmpleado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaEmpleados = new javax.swing.JList<>();
        buscarCliente = new javax.swing.JButton();
        apellido_text = new javax.swing.JLabel();
        ci_text = new javax.swing.JLabel();
        telefono_text = new javax.swing.JLabel();
        nombreEmpleado = new javax.swing.JTextField();
        apellidoEmpleado = new javax.swing.JTextField();
        ciEmpleado = new javax.swing.JTextField();
        telefonoEmpleado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Empleado");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cambios_text.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cambios_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(cambios_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 510, 50));

        nombre_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        nombre_text.setText("Nombre: ");
        jPanel1.add(nombre_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        email_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        email_text.setText("EMail:");
        jPanel1.add(email_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        emailEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel1.add(emailEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 310, -1));

        jScrollPane2.setViewportView(listaEmpleados);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 400, 300));

        buscarCliente.setBackground(new java.awt.Color(255, 255, 255));
        buscarCliente.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        buscarCliente.setText("Buscar");
        buscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteActionPerformed(evt);
            }
        });
        jPanel1.add(buscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 170, 50));

        apellido_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        apellido_text.setText("Apellido:");
        jPanel1.add(apellido_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        ci_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        ci_text.setText("CI:");
        jPanel1.add(ci_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        telefono_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        telefono_text.setText("Telefono:");
        jPanel1.add(telefono_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        nombreEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel1.add(nombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 310, -1));

        apellidoEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel1.add(apellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 310, -1));

        ciEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel1.add(ciEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 310, -1));

        telefonoEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel1.add(telefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 310, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteActionPerformed
        actualizarListaEmpleados();
    }//GEN-LAST:event_buscarClienteActionPerformed

    public void actualizarListaEmpleados() {
        DefaultListModel lista = new DefaultListModel();
        ArrayList<Integer> listaIndex = sistema.buscarEmpleado(indexLocal, nombreEmpleado.getText(), apellidoEmpleado.getText(), ciEmpleado.getText(), telefonoEmpleado.getText(), emailEmpleado.getText());
        for(int i = 0;i < listaIndex.size();i++) {
            lista.addElement(sistema.getEmpleado(indexLocal, listaIndex.get(i)));
        }
        listaEmpleados.setModel(lista);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoEmpleado;
    private javax.swing.JLabel apellido_text;
    private javax.swing.JButton buscarCliente;
    private javax.swing.JLabel cambios_text;
    private javax.swing.JTextField ciEmpleado;
    private javax.swing.JLabel ci_text;
    private javax.swing.JTextField emailEmpleado;
    private javax.swing.JLabel email_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaEmpleados;
    private javax.swing.JTextField nombreEmpleado;
    private javax.swing.JLabel nombre_text;
    private javax.swing.JTextField telefonoEmpleado;
    private javax.swing.JLabel telefono_text;
    // End of variables declaration//GEN-END:variables
}