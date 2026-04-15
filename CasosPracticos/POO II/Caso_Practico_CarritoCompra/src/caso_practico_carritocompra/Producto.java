package caso_practico_carritocompra;

import java.io.Serializable;

public class Producto implements Serializable{
    
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return String.format("%-10s |%.2f | %d uds", nombre, precio, cantidad);
    }
}
