/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designbosco;

import static designbosco.JFramePrincipal.chequearSiEsEntero;
import java.awt.Color;

/**
 *
 * @author Ezequiel Melogno
 */
public class JFrameEquipo extends javax.swing.JFrame {

    /**
     * Creates new form JFrameCliente
     */
    
    static int indexLocal;
    static int indexEquipo;
    
    public JFrameEquipo(int indexLocal, int indexEquipo) {
        initComponents();
        JFrameEquipo.indexLocal = indexLocal;
        JFrameEquipo.indexEquipo = indexEquipo;
        sistemaOperativo.setText(JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getSistemaOperativo());
        planta.setText(String.valueOf(JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getPlanta()));
        habitacion.setText(String.valueOf(JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getHabitacion()));
        actualizarListaComponentes();
        actualizarListaProgramas();
        actualizarListaLicencias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipoTab = new javax.swing.JTabbedPane();
        equipo = new javax.swing.JPanel();
        sistemaOperativo = new javax.swing.JTextField();
        guardarSistemaOperativo = new javax.swing.JButton();
        planta_text = new javax.swing.JLabel();
        planta = new javax.swing.JTextField();
        guardarPlanta = new javax.swing.JButton();
        habitacion = new javax.swing.JTextField();
        guardarHabitacion = new javax.swing.JButton();
        habitacion_text = new javax.swing.JLabel();
        sistemaOperativo_text = new javax.swing.JLabel();
        cambios_text = new javax.swing.JLabel();
        componentes = new javax.swing.JPanel();
        componente = new javax.swing.JTextField();
        actualizarListaComponentes = new javax.swing.JButton();
        componentes_text = new javax.swing.JLabel();
        componenteDarDeAlta_text = new javax.swing.JLabel();
        agregarComponente_text = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaComponentes = new javax.swing.JList<>();
        agregarComponente = new javax.swing.JButton();
        eliminarComponente = new javax.swing.JButton();
        programas = new javax.swing.JPanel();
        programa = new javax.swing.JTextField();
        actualizarListaProgramas = new javax.swing.JButton();
        programas_text = new javax.swing.JLabel();
        programaDarDeAlta_text = new javax.swing.JLabel();
        agregarPrograma_text = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaProgramas = new javax.swing.JList<>();
        agregarPrograma = new javax.swing.JButton();
        eliminarPrograma = new javax.swing.JButton();
        licencias = new javax.swing.JPanel();
        licencia = new javax.swing.JTextField();
        actualizarListaLicencias = new javax.swing.JButton();
        licencias_text = new javax.swing.JLabel();
        licenciaDarDeAlta_text = new javax.swing.JLabel();
        agregarLicencia_text = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaLicencias = new javax.swing.JList<>();
        agregarLicencia = new javax.swing.JButton();
        eliminarLicencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).toString());
        setResizable(false);

        equipoTab.setBackground(new java.awt.Color(255, 255, 255));
        equipoTab.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        equipoTab.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N

        equipo.setBackground(new java.awt.Color(255, 255, 255));
        equipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sistemaOperativo.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        equipo.add(sistemaOperativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 320, 20));

        guardarSistemaOperativo.setBackground(new java.awt.Color(255, 255, 255));
        guardarSistemaOperativo.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        guardarSistemaOperativo.setText("Guardar");
        guardarSistemaOperativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarSistemaOperativoActionPerformed(evt);
            }
        });
        equipo.add(guardarSistemaOperativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, 22));

        planta_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        planta_text.setText("Planta:");
        equipo.add(planta_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 22));

        planta.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        equipo.add(planta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 320, -1));

        guardarPlanta.setBackground(new java.awt.Color(255, 255, 255));
        guardarPlanta.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        guardarPlanta.setText("Guardar");
        guardarPlanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarPlantaActionPerformed(evt);
            }
        });
        equipo.add(guardarPlanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 22));

        habitacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        equipo.add(habitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 320, -1));

        guardarHabitacion.setBackground(new java.awt.Color(255, 255, 255));
        guardarHabitacion.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        guardarHabitacion.setText("Guardar");
        guardarHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarHabitacionActionPerformed(evt);
            }
        });
        equipo.add(guardarHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, -1, 22));

        habitacion_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        habitacion_text.setText("Hab.:");
        equipo.add(habitacion_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 22));

        sistemaOperativo_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        sistemaOperativo_text.setText("SO:");
        equipo.add(sistemaOperativo_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, 20));

        cambios_text.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cambios_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        equipo.add(cambios_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 488, 50));

        equipoTab.addTab("Equipo", equipo);

        componentes.setBackground(new java.awt.Color(255, 255, 255));
        componentes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        componente.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        componentes.add(componente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 390, 20));

        actualizarListaComponentes.setBackground(new java.awt.Color(255, 255, 255));
        actualizarListaComponentes.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        actualizarListaComponentes.setText("Actualizar");
        actualizarListaComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarListaComponentesActionPerformed(evt);
            }
        });
        componentes.add(actualizarListaComponentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 100, 22));

        componentes_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        componentes_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        componentes_text.setText("Componentes");
        componentes.add(componentes_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 500, 30));

        componenteDarDeAlta_text.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        componenteDarDeAlta_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        componentes.add(componenteDarDeAlta_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 470, 40));

        agregarComponente_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        agregarComponente_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarComponente_text.setText("Agregar componente");
        componentes.add(agregarComponente_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 20));

        listaComponentes.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(listaComponentes);

        componentes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 440, 210));

        agregarComponente.setBackground(new java.awt.Color(255, 255, 255));
        agregarComponente.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        agregarComponente.setText("Agregar");
        agregarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarComponenteActionPerformed(evt);
            }
        });
        componentes.add(agregarComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, 22));

        eliminarComponente.setBackground(new java.awt.Color(255, 255, 255));
        eliminarComponente.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        eliminarComponente.setText("Eliminar");
        eliminarComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarComponenteActionPerformed(evt);
            }
        });
        componentes.add(eliminarComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 100, 22));

        equipoTab.addTab("Componentes", componentes);

        programas.setBackground(new java.awt.Color(255, 255, 255));
        programas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        programa.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        programas.add(programa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 390, 20));

        actualizarListaProgramas.setBackground(new java.awt.Color(255, 255, 255));
        actualizarListaProgramas.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        actualizarListaProgramas.setText("Actualizar");
        actualizarListaProgramas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarListaProgramasActionPerformed(evt);
            }
        });
        programas.add(actualizarListaProgramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 100, 22));

        programas_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        programas_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        programas_text.setText("Programas");
        programas.add(programas_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 500, 30));

        programaDarDeAlta_text.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        programaDarDeAlta_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        programas.add(programaDarDeAlta_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 470, 40));

        agregarPrograma_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        agregarPrograma_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarPrograma_text.setText("Agregar Programa");
        programas.add(agregarPrograma_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 20));

        listaProgramas.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(listaProgramas);

        programas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 440, 210));

        agregarPrograma.setBackground(new java.awt.Color(255, 255, 255));
        agregarPrograma.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        agregarPrograma.setText("Agregar");
        agregarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProgramaActionPerformed(evt);
            }
        });
        programas.add(agregarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, 22));

        eliminarPrograma.setBackground(new java.awt.Color(255, 255, 255));
        eliminarPrograma.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        eliminarPrograma.setText("Eliminar");
        eliminarPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarProgramaActionPerformed(evt);
            }
        });
        programas.add(eliminarPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 100, 22));

        equipoTab.addTab("Programas", programas);

        licencias.setBackground(new java.awt.Color(255, 255, 255));
        licencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        licencia.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        licencias.add(licencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 390, 20));

        actualizarListaLicencias.setBackground(new java.awt.Color(255, 255, 255));
        actualizarListaLicencias.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        actualizarListaLicencias.setText("Actualizar");
        actualizarListaLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarListaLicenciasActionPerformed(evt);
            }
        });
        licencias.add(actualizarListaLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 100, 22));

        licencias_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        licencias_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licencias_text.setText("Licencias");
        licencias.add(licencias_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 500, 30));

        licenciaDarDeAlta_text.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        licenciaDarDeAlta_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        licencias.add(licenciaDarDeAlta_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 470, 40));

        agregarLicencia_text.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        agregarLicencia_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarLicencia_text.setText("Agregar Licencia");
        licencias.add(agregarLicencia_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 490, 20));

        listaLicencias.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(listaLicencias);

        licencias.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 440, 210));

        agregarLicencia.setBackground(new java.awt.Color(255, 255, 255));
        agregarLicencia.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        agregarLicencia.setText("Agregar");
        agregarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarLicenciaActionPerformed(evt);
            }
        });
        licencias.add(agregarLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, 22));

        eliminarLicencia.setBackground(new java.awt.Color(255, 255, 255));
        eliminarLicencia.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        eliminarLicencia.setText("Eliminar");
        eliminarLicencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLicenciaActionPerformed(evt);
            }
        });
        licencias.add(eliminarLicencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 100, 22));

        equipoTab.addTab("Licencias", licencias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipoTab, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(equipoTab, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarSistemaOperativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarSistemaOperativoActionPerformed
        if(sistemaOperativo.getText().isBlank()) {
            cambios_text.setForeground(Color.RED);
            cambios_text.setText("El sistema operativo no puede estar en blanco.");
        } else {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).setSistemaOperativo(sistemaOperativo.getText());
            cambios_text.setForeground(Color.BLACK);
            cambios_text.setText("Sistema opartivo cambiado satisfactoriamente.");
        }
        
    }//GEN-LAST:event_guardarSistemaOperativoActionPerformed

    private void guardarPlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarPlantaActionPerformed
        if(planta.getText().isBlank()) {
            cambios_text.setForeground(Color.RED);
            cambios_text.setText("La planta no puede estar en blanco.");
        } else if (!chequearSiEsEntero(planta.getText())) {
            cambios_text.setForeground(Color.RED);
            cambios_text.setText("La planta tiene que ser un entero.");
        } else {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).setPlanta(Integer.valueOf(planta.getText()));
            cambios_text.setForeground(Color.BLACK);
            cambios_text.setText("Planta cambiada satisfactoriamente.");
        }
    }//GEN-LAST:event_guardarPlantaActionPerformed

    private void guardarHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarHabitacionActionPerformed
        if(habitacion.getText().isBlank()) {
            cambios_text.setForeground(Color.RED);
            cambios_text.setText("La habitacion no puede estar en blanco.");
        } else if (!chequearSiEsEntero(habitacion.getText())) {
            cambios_text.setForeground(Color.RED);
            cambios_text.setText("La habitacion tiene que ser un entero.");
        } else {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).setHabitacion(Integer.valueOf(habitacion.getText()));
            cambios_text.setForeground(Color.BLACK);
            cambios_text.setText("Habitacion cambiada satisfactoriamente.");
        }
    }//GEN-LAST:event_guardarHabitacionActionPerformed

    private void actualizarListaComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarListaComponentesActionPerformed
       actualizarListaComponentes();
    }//GEN-LAST:event_actualizarListaComponentesActionPerformed

    private void agregarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarComponenteActionPerformed
        if(componente.getText().isBlank()) {
            componenteDarDeAlta_text.setForeground(Color.RED);
            componenteDarDeAlta_text.setText("El componente no puede estar en blanco.");
        } else {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getComponentes().add(componente.getText());
            componenteDarDeAlta_text.setForeground(Color.BLACK);
            componenteDarDeAlta_text.setText("Componente agregado satisfactoriamente.");
            actualizarListaComponentes();
        }
        
    }//GEN-LAST:event_agregarComponenteActionPerformed

    private void eliminarComponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarComponenteActionPerformed
        if(listaComponentes.getSelectedIndex() > -1) {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getComponentes().remove(listaComponentes.getSelectedIndex());
            actualizarListaComponentes();
        }
        
    }//GEN-LAST:event_eliminarComponenteActionPerformed

    private void actualizarListaProgramas() {
        listaProgramas.setModel(JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getProgramasModel());
    }
    
    private void actualizarListaProgramasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarListaProgramasActionPerformed
        actualizarListaProgramas();
    }//GEN-LAST:event_actualizarListaProgramasActionPerformed

    private void agregarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProgramaActionPerformed
        if(programa.getText().isBlank()) {
            programaDarDeAlta_text.setForeground(Color.RED);
            programaDarDeAlta_text.setText("El programa no puede estar en blanco.");
        } else {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getProgramas().add(programa.getText());
            programaDarDeAlta_text.setForeground(Color.BLACK);
            programaDarDeAlta_text.setText("Programa agregado satisfactoriamente.");
            actualizarListaProgramas();
        }
    }//GEN-LAST:event_agregarProgramaActionPerformed

    private void eliminarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarProgramaActionPerformed
        if(listaProgramas.getSelectedIndex() > -1) {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getProgramas().remove(listaProgramas.getSelectedIndex());
            actualizarListaProgramas();
        }
    }//GEN-LAST:event_eliminarProgramaActionPerformed

    private void actualizarListaLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarListaLicenciasActionPerformed
        actualizarListaLicencias();
    }//GEN-LAST:event_actualizarListaLicenciasActionPerformed

    private void agregarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarLicenciaActionPerformed
        if(licencia.getText().isBlank()) {
            licenciaDarDeAlta_text.setForeground(Color.RED);
            licenciaDarDeAlta_text.setText("La licencia no puede estar en blanco.");
        } else {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getLicencias().add(licencia.getText());
            licenciaDarDeAlta_text.setForeground(Color.BLACK);
            licenciaDarDeAlta_text.setText("Licencia agregada satisfactoriamente.");
            actualizarListaLicencias();
        }
    }//GEN-LAST:event_agregarLicenciaActionPerformed

    private void eliminarLicenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLicenciaActionPerformed
        if(listaLicencias.getSelectedIndex() > -1) {
            JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getLicencias().remove(listaLicencias.getSelectedIndex());
            actualizarListaLicencias();
        }
    }//GEN-LAST:event_eliminarLicenciaActionPerformed

    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarListaComponentes;
    private javax.swing.JButton actualizarListaLicencias;
    private javax.swing.JButton actualizarListaProgramas;
    private javax.swing.JButton agregarComponente;
    private javax.swing.JLabel agregarComponente_text;
    private javax.swing.JButton agregarLicencia;
    private javax.swing.JLabel agregarLicencia_text;
    private javax.swing.JButton agregarPrograma;
    private javax.swing.JLabel agregarPrograma_text;
    private javax.swing.JLabel cambios_text;
    private javax.swing.JTextField componente;
    private javax.swing.JLabel componenteDarDeAlta_text;
    private javax.swing.JPanel componentes;
    private javax.swing.JLabel componentes_text;
    private javax.swing.JButton eliminarComponente;
    private javax.swing.JButton eliminarLicencia;
    private javax.swing.JButton eliminarPrograma;
    private javax.swing.JPanel equipo;
    private javax.swing.JTabbedPane equipoTab;
    private javax.swing.JButton guardarHabitacion;
    private javax.swing.JButton guardarPlanta;
    private javax.swing.JButton guardarSistemaOperativo;
    private javax.swing.JTextField habitacion;
    private javax.swing.JLabel habitacion_text;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField licencia;
    private javax.swing.JLabel licenciaDarDeAlta_text;
    private javax.swing.JPanel licencias;
    private javax.swing.JLabel licencias_text;
    private javax.swing.JList<String> listaComponentes;
    private javax.swing.JList<String> listaLicencias;
    private javax.swing.JList<String> listaProgramas;
    private javax.swing.JTextField planta;
    private javax.swing.JLabel planta_text;
    private javax.swing.JTextField programa;
    private javax.swing.JLabel programaDarDeAlta_text;
    private javax.swing.JPanel programas;
    private javax.swing.JLabel programas_text;
    private javax.swing.JTextField sistemaOperativo;
    private javax.swing.JLabel sistemaOperativo_text;
    // End of variables declaration//GEN-END:variables

    private void actualizarListaComponentes() {
        listaComponentes.setModel(JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getComponentesModel());
    }

    private void actualizarListaLicencias() {
        listaLicencias.setModel(JFramePrincipal.sistema.getLocal(indexLocal).getEquipo(indexEquipo).getLicenciasModel());
    }

}
