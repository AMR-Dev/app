/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designbosco;

import java.util.ArrayList;
import java.util.Objects;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ezequiel Melogno
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String ci;
    private String correo;
    private String telefono;
    private ArrayList<Producto> compras = new ArrayList();

    public Cliente(String nombre, String apellido, String ci, String correo, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ci = ci;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Producto> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Producto> compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
    
    public boolean equals(String ci) {
        return this.ci.equals(ci);
    }
    
    public void addCompra(Producto compra) {
        this.compras.add(compra);
    }
    
    public DefaultListModel getProductoModel() {
        DefaultListModel productoModel = new DefaultListModel();
        for(int i = 0;i < compras.size();i++) {
            productoModel.addElement(compras.get(i).toString());
        }
        return productoModel;
    }
    
    
    
}
