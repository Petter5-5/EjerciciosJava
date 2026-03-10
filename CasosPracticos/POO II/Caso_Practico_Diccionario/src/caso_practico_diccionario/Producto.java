package caso_practico_diccionario;

import java.util.ArrayList;
import java.util.Collections;

public class Producto implements Comparable<Producto>
{
    private String nombre;
    private double precio;
    
    public Producto(String nombre, double precio)
    {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public static void productoMasCaro(ArrayList<Producto> producto)
    {
        Producto productoCaro = producto.get(0);
        
        for(Producto p : producto)
        {
            if(p != null)
            {
                if(p.compareTo(p) == -1)
                    productoCaro = p;
            }
        }
        
        producto.remove(productoCaro);
    }
    
    public static void ordenarMayorMenor(ArrayList<Producto> producto)
    {
        Collections.reverse(producto);
        System.out.print("[");
        for(Producto p : producto)
        {
            System.out.print(p);
            System.out.print(" ");
        }
        System.out.print("]");
        System.out.println("");
    }
    
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Producto: " + nombre + " - " + precio + "€";
    }

    @Override
    public int compareTo(Producto p) 
    {
        int resultado;
        
        if(precio < p.getPrecio())
            resultado = -1;
        else if(precio > p.getPrecio())
            resultado = 1;
        else
            resultado = 0;
        
        return resultado;
    }
}
