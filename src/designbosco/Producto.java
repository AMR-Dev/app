/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designbosco;

/**
 *
 * @author Ezequiel Melogno
 */
public class Producto {
    private String nombre;
    private int precio;
    private int tipo; // 1 = pag web 2 = app 3 = otro
    private String descripcion;

    public Producto(String nombre, int precio, int tipo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre + ", " + precio + "$";
    }
    
    public boolean equals(String nombre) {
        return this.nombre.equals(nombre);
    }

    
    
    
}
