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
public class Local {
    private int departamento;
    private String ciudad;
    private String direccion;
    private ArrayList<Equipo> equipo = new ArrayList();
    private DefaultListModel equipoModel = new DefaultListModel();
    private ArrayList<Empleado> empleado = new ArrayList();
    private DefaultListModel empleadoModel = new DefaultListModel();
    private ArrayList<Venta> venta = new ArrayList();

    public ArrayList<Equipo> getEquipo() {
        return equipo;
    }

    public void setEquipo(ArrayList<Equipo> equipo) {
        this.equipo = equipo;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Venta> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<Venta> venta) {
        this.venta = venta;
    }


    public Local(int departamento, String ciudad, String direccion) {
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        String departamento = "Error";
        switch(this.departamento) {
            case 0:
                departamento = "Error: falta depto";
                break;
            case 1:
                departamento = "Artigas";
                break;
            case 2:
                departamento = "Canelanos";
                break;
            case 3:
                departamento = "Cerro Largo";
                break;
            case 4:
                departamento = "Colonia";
                break;
            case 5:
                departamento = "Durazno";
                break;
            case 6:
                departamento = "Flores";
                break;
            case 7:
                departamento = "Florida";
                break;
            case 8:
                departamento = "Lavalleja";
                break;
            case 9:
                departamento = "Maldonado";
                break;
            case 10:
                departamento = "Montevideo";
                break;
            case 11:
                departamento = "Paysandu";
                break;
            case 12:
                departamento = "Rio Negro";
                break;
            case 13:
                departamento = "Rivera";
                break;
            case 14:
                departamento = "Rocha";
                break;
            case 15:
                departamento = "Salto";
                break;
            case 16:
                departamento = "San Jose";
                break;
            case 17:
                departamento = "Soriano";
                break;
            case 18:
                departamento = "Tacuarembo";
                break;
            case 19:
                departamento = "Treinta y Tres";
                break;
        }
        return  departamento + ", " + this.ciudad + ", " + this.direccion;
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
    
    public Empleado getEmpleado(int selectedIndex) {
        return this.empleado.get(selectedIndex);
    }
    
    public boolean verificarEmpleado(String ci) { // si existe un empleado con la misma cedula da verdadero
        boolean check = false;
        for(int i = 0;i < empleado.size();i++) {
            if(empleado.get(i).equals(ci)) {
                check = true;
            }
        }
        return check;
    }
    
    //
    
    public DefaultListModel getEquipoModel() {
        this.equipoModel.removeAllElements(); 
        for(int i = 0;i < equipo.size();i++) {
            this.equipoModel.addElement(equipo.get(i).toString());
        }
        return equipoModel;
    }
    
    public void addEquipo(Equipo equipo) {
        this.equipo.add(equipo);
    }

    public void removeEquipo(int selectedIndex) {
        this.equipo.remove(selectedIndex);
    }
    
    public Equipo getEquipo(int selectedIndex) {
        return this.equipo.get(selectedIndex);
    }
    
    
    
}
