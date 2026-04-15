package caso_practico_carritocompra;

import java.io.Serializable;
import java.util.ArrayList;

public class Carrito implements Serializable {
    private String propietario;
    private ArrayList<Producto> productos;

    public Carrito(String propietario) {
        this.propietario = propietario;
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void vaciar()
    {
        productos.clear();
        System.out.println("Carrito vaciado");
    }
    
    public void mostrar()
    {
        if(productos != null)
        {
            double total = 0;
            System.out.println("Propietario: Fede");
            for(Producto p: productos)
            {
                System.out.println("  " + p);
                total += p.getPrecio() * p.getCantidad();
            }
            System.out.println("Total: " + total + "€");
        }
        else
            System.out.println("Carrito Vacio");
    }
}
