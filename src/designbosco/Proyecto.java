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
public class Proyecto {
    private String nombre;
    private String estado;
    private String descripcion;
    private ArrayList<Empleado> empleado = new ArrayList();
    private DefaultListModel empleadoModel = new DefaultListModel();

    public Proyecto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.estado = "Sin terminar";
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        switch (estado) {
            case 0:
                this.estado = "Sin terminar";
                break;
            case 1:
                this.estado ="Terminado";
                break;
            default:
                this.estado = "???";
                break;
        }
        
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }
    
    public String toString() {
        return nombre + ", " + estado;
    }
    
    public boolean equals(String nombre) {
        return this.nombre.equals(nombre);
    }
    
    public DefaultListModel getEmpleadoModel() {
        this.empleadoModel.removeAllElements(); 
        for(int i = 0;i < empleado.size();i++) {
            this.empleadoModel.addElement(empleado.get(i).toString());
        }
        return empleadoModel;
    }
    
    public void addEmpleado(Empleado empleado) {
        this.empleado.add(empleado);
    }
    
    public void removeEmpleado(int selectedIndex) {
        this.empleado.remove(selectedIndex);
    }
    
    public void removeEmpleado(Empleado empleado) {
        for(int i = 0;i < this.empleado.size();i++) {
            if(this.empleado.get(i).getCi().equals(empleado.getCi())) {
                this.empleado.remove(i);
            }
        }
    }
    
    public Empleado getEmpleado(int selectedIndex) {
        return this.empleado.get(selectedIndex);
    }
    
}
