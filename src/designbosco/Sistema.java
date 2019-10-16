/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designbosco;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ezequiel Melogno
 */
public class Sistema {
    
    private ArrayList<Local> local = new ArrayList();
    private DefaultListModel localModel = new DefaultListModel();
    private ArrayList<Proyecto> proyecto = new ArrayList();
    private DefaultListModel proyectoModel = new DefaultListModel();
    private ArrayList<Producto> producto = new ArrayList();
    private DefaultListModel productoModel = new DefaultListModel();
    private ArrayList<Cliente> cliente = new ArrayList();
    private DefaultListModel clienteModel = new DefaultListModel();
    private ArrayList<Venta> venta = new ArrayList();
    private String[] columnNames = {"Cliente", "Fecha", "Producto", "$$$"};
    private DefaultTableModel ventaModel = new DefaultTableModel(new String[0][0], columnNames);

    public DefaultListModel getClienteModel() {
        this.clienteModel.removeAllElements(); 
        for(int i = 0;i < cliente.size();i++) {
            this.clienteModel.addElement(cliente.get(i).toString());
        }
        return clienteModel;
    }
    
    public void addCliente(Cliente cliente) {
        this.cliente.add(cliente);
//        this.clienteModel.addElement(cliente.toString());
    }

    public void removeCliente(int selectedIndex) {
        this.cliente.remove(selectedIndex);
//        this.clienteModel.remove(selectedIndex);
    }
    
    public Cliente getCliente(int selectedIndex) {
        return this.cliente.get(selectedIndex);
    }
    
    public boolean verificarCliente(String ci) { // si existe un cliente con la misma cedula da verdadero
        boolean check = false;
        for(int i = 0;i < cliente.size();i++) {
            if(cliente.get(i).equals(ci)) {
                check = true;
            }
        }
        return check;
    }
    
    public ArrayList<Integer> buscarCliente(String nombre, String apellido, String ci, String email, String telefono) {
        ArrayList<Integer> clienteBuscado = new ArrayList();
        for(int i = 0;i < cliente.size();i++) {
            if(cliente.get(i).getNombre().contains(nombre) && cliente.get(i).getApellido().contains(apellido) && cliente.get(i).getCi().contains(ci) && cliente.get(i).getTelefono().contains(telefono) && cliente.get(i).getCorreo().contains(email)) {
                clienteBuscado.add(i);
            }
        }
        return clienteBuscado;
    }
    
    public DefaultListModel getProductoModel() {
        this.productoModel.removeAllElements(); 
        for(int i = 0;i < producto.size();i++) {
            this.productoModel.addElement(producto.get(i).toString());
        }
        return productoModel;
    }
    
    public DefaultComboBoxModel getProductoComboBoxModel() {
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        for(int i = 0;i < producto.size();i++) {
            comboBoxModel.addElement(producto.get(i).toString());
        }
        return comboBoxModel;
    }
    
    
    public void addProducto(Producto producto) {
        this.producto.add(producto);
    }

    public void removeProducto(int selectedIndex) {
        this.producto.remove(selectedIndex);
    }
    
    public Producto getProducto(int selectedIndex) {
        return this.producto.get(selectedIndex);
    }
    
    public boolean verificarProducto(String nombre) { // si existe un producto con el mismo nombre da 1
        boolean check = false;
        for(int i = 0;i < producto.size();i++) {
            if(producto.get(i).equals(nombre)) {
                check = true;
            }
        }
        return check;
    }
    
    public ArrayList<Integer> buscarProducto(String nombre, int tipo) {
        ArrayList<Integer> productoBuscado = new ArrayList();
        for(int i = 0;i < producto.size();i++) {
            if(producto.get(i).getNombre().contains(nombre) && (producto.get(i).getTipo() == tipo || tipo == 0)) {
                productoBuscado.add(i);
            }
        }
        return productoBuscado;
    }
    
    //
    
    public DefaultListModel getLocalModel() {
        this.localModel.removeAllElements(); 
        for(int i = 0;i < local.size();i++) {
            this.localModel.addElement(local.get(i).toString());
        }
        return localModel;
    }
    
    public ArrayList<Integer> buscarLocal(int departamento, String ciudad, String direccion) {
        ArrayList<Integer> localBuscado = new ArrayList();
        for(int i = 0;i < local.size();i++) {
            if(local.get(i).getCiudad().contains(ciudad) && local.get(i).getDireccion().contains(direccion) && (local.get(i).getDepartamento() == departamento || departamento == 0)) {
                localBuscado.add(i);
            }
        }
        return localBuscado;
    }
    
    public void addLocal(Local local) {
        this.local.add(local);
    }

    public void removeLocal(int selectedIndex) {
        this.local.remove(selectedIndex);
    }
    
    public Local getLocal(int selectedIndex) {
        return this.local.get(selectedIndex);
    }
    
    //
    
    public DefaultListModel getProyectoModel() {
        this.proyectoModel.removeAllElements(); 
        for(int i = 0;i < proyecto.size();i++) {
            this.proyectoModel.addElement(proyecto.get(i).toString());
        }
        return proyectoModel;
    }
    
    public DefaultComboBoxModel getProyectoComboBoxModel() {
        DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
        for(int i = 0;i < proyecto.size();i++) {
            comboBoxModel.addElement(proyecto.get(i).toString());
        }
        return comboBoxModel;
    }
    
    public ArrayList<Integer> buscarProyecto(String nombre, String estado) {
        ArrayList<Integer> proyectoBuscado = new ArrayList();
        for(int i = 0;i < proyecto.size();i++) {
            if(proyecto.get(i).getNombre().contains(nombre) && proyecto.get(i).getEstado().contains(estado)) {
                proyectoBuscado.add(i);
            }
        }
        return proyectoBuscado;
    }
    
    public void addProyecto(Proyecto proyecto) {
        this.proyecto.add(proyecto);
    }

    public void removeProyecto(int selectedIndex) {
        this.proyecto.remove(selectedIndex);
    }
    
    public Proyecto getProyecto(int selectedIndex) {
        return this.proyecto.get(selectedIndex);
    }
    
    public int getIndexProyecto(Proyecto proyecto) {
        for(int i = 0;i < this.proyecto.size();i++) {
            if(this.proyecto.get(i).equals(proyecto)) {
                return i;
            }
        }
        return -1;
    }
    
    public ArrayList<Proyecto> getProyectos() {
        return this.proyecto;
    }
    
    public boolean verificarProyecto(String nombre) { // si existe un proyecto con el mismo nombre da 1
        boolean check = false;
        for(int i = 0;i < proyecto.size();i++) {
            if(proyecto.get(i).equals(nombre)) {
                check = true;
            }
        }
        return check;
    }
    
    public Empleado getEmpleado(Empleado empleado) {
        for(int i = 0;i < local.size();i++) {
            for(int j = 0;i < local.get(i).getEmpleado().size();i++) {
                if(local.get(i).getEmpleado(j).getCi().equals(empleado.getCi())) {
                    return local.get(i).getEmpleado(j);
                }
            }
        }
        return null;
    }
    
    public int getEmpleadoLocal(Empleado empleado) {
        for(int i = 0;i < local.size();i++) {
            for(int j = 0;i < local.get(i).getEmpleado().size();i++) {
                if(local.get(i).getEmpleado(j).getCi().equals(empleado.getCi())) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public ArrayList<Integer> buscarEmpleado(int indexLocal, String nombre, String apellido, String ci, String email, String telefono) {
        ArrayList<Integer> empleadoBuscado = new ArrayList();
        for(int i = 0;i < local.get(indexLocal).getEmpleado().size();i++) {
            if(local.get(indexLocal).getEmpleado(i).getNombre().contains(nombre) && local.get(indexLocal).getEmpleado(i).getApellido().contains(apellido) && local.get(indexLocal).getEmpleado(i).getCi().contains(ci) && local.get(indexLocal).getEmpleado(i).getTelefono().contains(telefono) && local.get(indexLocal).getEmpleado(i).getCorreo().contains(email)) {
                empleadoBuscado.add(i);
            }
        }
        return empleadoBuscado;
    }
    
    public int getEmpleadoIndex(Empleado empleado) {
        for(int i = 0;i < local.size();i++) {
            for(int j = 0;i < local.get(i).getEmpleado().size();i++) {
                if(local.get(i).getEmpleado(j).getCi().equals(empleado.getCi())) {
                    return j;
                }
            }
        }
        return -1;
    }
    
    public Empleado getEmpleado(int indexLocal, int indexEmpleado) {
        return this.getLocal(indexLocal).getEmpleado(indexEmpleado);
    }
    
    public DefaultTableModel getVentaModel() {
        return ventaModel;
    }
    
    public void addVenta(Venta venta) {
        this.venta.add(venta);
        String[] data = {venta.getCliente().getCi(), venta.getFecha(), venta.getProducto().getNombre(), String.valueOf(venta.getProducto().getPrecio())};
        this.ventaModel.addRow(data);
    }

    public void removeVenta(int selectedIndex) {
        this.venta.remove(selectedIndex);
        this.ventaModel.removeRow(selectedIndex);
    }
    
    public Venta getVenta(int selectedIndex) {
        return this.venta.get(selectedIndex);
    }
    
}
