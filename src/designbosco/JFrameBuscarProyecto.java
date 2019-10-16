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
public class JFrameBuscarProyecto extends javax.swing.JFrame {
    
    public JFrameBuscarProyecto() {
        initComponents();
        actualizarListaProyectos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        estadoGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cambios_text = new javax.swing.JLabel();
        nombre_text = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProyectos = new javax.swing.JList<>();
        buscarProyecto = new javax.swing.JButton();
        estado_text = new javax.swing.JLabel();
        nombreProyecto = new javax.swing.JTextField();
        terminado = new javax.swing.JRadioButton();
        cualquierEstado = new javax.swing.JRadioButton();
        sinTerminar = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Local");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cambios_text.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cambios_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(cambios_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 510, 50));

        nombre_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        nombre_text.setText("Nombre:");
        jPanel1.add(nombre_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jScrollPane2.setViewportView(listaProyectos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 400, 310));

        buscarProyecto.setBackground(new java.awt.Color(255, 255, 255));
        buscarProyecto.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        buscarProyecto.setText("Buscar");
        buscarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(buscarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 170, 50));

        estado_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        estado_text.setText("Estado:");
        jPanel1.add(estado_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        nombreProyecto.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        nombreProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProyectoActionPerformed(evt);
            }
        });
        jPanel1.add(nombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 290, -1));

        terminado.setBackground(new java.awt.Color(255, 255, 255));
        estadoGroup.add(terminado);
        terminado.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        terminado.setText("Terminado");
        jPanel1.add(terminado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 230, -1));

        cualquierEstado.setBackground(new java.awt.Color(255, 255, 255));
        estadoGroup.add(cualquierEstado);
        cualquierEstado.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        cualquierEstado.setSelected(true);
        cualquierEstado.setText("Cualquiera");
        jPanel1.add(cualquierEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 230, -1));

        sinTerminar.setBackground(new java.awt.Color(255, 255, 255));
        estadoGroup.add(sinTerminar);
        sinTerminar.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        sinTerminar.setText("Sin Terminar");
        jPanel1.add(sinTerminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 230, -1));

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

    private void buscarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarProyectoActionPerformed
        actualizarListaProyectos();
    }//GEN-LAST:event_buscarProyectoActionPerformed

    private void nombreProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProyectoActionPerformed

    public void actualizarListaProyectos() {
        DefaultListModel lista = new DefaultListModel();
        String estado = "";
        if(cualquierEstado.isSelected()) {
            estado = "";
        } else if (sinTerminar.isSelected()) {
            estado = "Sin terminar";
        } else if (sinTerminar.isSelected()) {
            estado = "Terminado";
        }
        ArrayList<Integer> listaIndex = sistema.buscarProyecto(nombreProyecto.getText(), estado);
        for(int i = 0;i < listaIndex.size();i++) {
            lista.addElement(sistema.getProyecto(listaIndex.get(i)));
        }
        listaProyectos.setModel(lista);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarProyecto;
    private javax.swing.JLabel cambios_text;
    private javax.swing.JRadioButton cualquierEstado;
    private javax.swing.ButtonGroup estadoGroup;
    private javax.swing.JLabel estado_text;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaProyectos;
    private javax.swing.JTextField nombreProyecto;
    private javax.swing.JLabel nombre_text;
    private javax.swing.JRadioButton sinTerminar;
    private javax.swing.JRadioButton terminado;
    // End of variables declaration//GEN-END:variables
}
