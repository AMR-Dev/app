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
public class Empleado {
    private String nombre;
    private String apellido;
    private String ci;
    private String cargo;
    private String telefono;
    private String correo;
    private ArrayList<Proyecto> proyecto = new ArrayList();
    private DefaultListModel proyectoModel = new DefaultListModel();

    public ArrayList<Proyecto> getProyecto() {
        return proyecto;
    }

    public void setProyecto(ArrayList<Proyecto> proyecto) {
        this.proyecto = proyecto;
    }

    public Empleado(String nombre, String apellido, String ci, String cargo, String telefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
        this.cargo = cargo;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    public boolean equals(String ci) {
        return this.ci.equals(ci);
    }
    
    public DefaultListModel getProyectoModel() {
        this.proyectoModel.removeAllElements(); 
        for(int i = 0;i < proyecto.size();i++) {
            this.proyectoModel.addElement(proyecto.get(i).toString());
        }
        return proyectoModel;
    }
    
    public void addProyecto(Proyecto proyecto) {
        this.proyecto.add(proyecto);
    }

    public void removeProyecto(int selectedIndex) {
        this.proyecto.remove(selectedIndex);
    }
    
    public void removeProyecto(Proyecto proyecto) {
        for(int i = 0;i < this.proyecto.size();i++) {
            if(this.proyecto.get(i).getNombre().equals(proyecto.getNombre())) {
                this.proyecto.remove(i);
            }
        }
    }
    
    public Proyecto getProyecto(int selectedIndex) {
        return this.proyecto.get(selectedIndex);
    }
    
    public ArrayList<Proyecto> getProyectos() {
        return this.proyecto;
    }
    
    
    
}
