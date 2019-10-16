/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designbosco;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ezequiel Melogno
 */
public class Equipo {
    private String sistemaOperativo;
    private int habitacion;
    private int planta;
    private ArrayList<String> componentes = new ArrayList();
    private DefaultListModel componentesModel = new DefaultListModel();
    private ArrayList<String> programas = new ArrayList();
    private DefaultListModel programasModel = new DefaultListModel();
    private ArrayList<String> licencias = new ArrayList();
    private DefaultListModel licenciasModel = new DefaultListModel();

    public Equipo(String sistemaOperativo, int planta, int habitacion) {
        this.sistemaOperativo = sistemaOperativo;
        this.habitacion = habitacion;
        this.planta = planta;
    }

   

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public ArrayList<String> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<String> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<String> getProgramas() {
        return programas;
    }

    public void setProgramas(ArrayList<String> programas) {
        this.programas = programas;
    }

    public ArrayList<String> getLicencias() {
        return licencias;
    }

    public void setLicencias(ArrayList<String> licencias) {
        this.licencias = licencias;
    }
    
    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }
    
    @Override
    public String toString() {
        return sistemaOperativo + ", " + "Piso " + planta + ", Habitacion No. " + habitacion;
    }
    
    public DefaultListModel getComponentesModel() {
        this.componentesModel.removeAllElements(); 
        for(int i = 0;i < componentes.size();i++) {
            this.componentesModel.addElement(componentes.get(i));
        }
        return componentesModel;
    }
    
    public DefaultListModel getProgramasModel() {
        this.programasModel.removeAllElements(); 
        for(int i = 0;i < programas.size();i++) {
            this.programasModel.addElement(programas.get(i));
        }
        return programasModel;
    }
    
    public DefaultListModel getLicenciasModel() {
        this.licenciasModel.removeAllElements(); 
        for(int i = 0;i < licencias.size();i++) {
            this.licenciasModel.addElement(licencias.get(i));
        }
        return licenciasModel;
    }
    
    
    
}
