package caso_practico_diccionario;

import java.util.ArrayList;
import java.util.Iterator;

public class Caso_Practico_Diccionario 
{
    public static void main(String[] args) 
    {
       
       ArrayList<Producto> producto = new ArrayList<>();
       
       Producto p0 = new Producto("Ratón", 25.5);
       Producto p1 = new Producto("Teclado", 45);
       Producto p2 = new Producto("Monitor", 150);
       
       producto.add(p0);
       producto.add(p1);
       producto.add(p2);
       
       Producto p3 = new Producto("Smartphone", 300);
       producto.addFirst(p3);
       
       Producto p4 = new Producto("Auriculares", 15);
       producto.add(1, p4);
       
       System.out.println("=== ESTADO DEL INVENTARIO ===");
       System.out.println("Primer producto: " + producto.getFirst());
       System.out.println("Último producto: " + producto.getLast());
       System.out.println(""); 
       
       Producto.productoMasCaro(producto);
       
       //Simplificado
       //producto.removeIf(Producto -> Producto.getNombre().equals("Auriculares"));
       
       //Metodo extendido
       Iterator<Producto> it = producto.iterator();
       while (it.hasNext()) 
       {
            Producto p = it.next();
            if (p.getNombre().equals("Auriculares"))
                it.remove();
        }
       
       System.out.println("--- Inventario ordenado por precio ---");
       for(int i = 0; i < producto.size(); i++)
       {
           System.out.println(i + ": " + producto.get(i));
       }
        System.out.println("");
        System.out.println("=== TRAS LAS VENTAS ===");
        System.out.println("Productos restantes en tienda: " + producto.size());
        System.out.print("Vista de mayor a menor precio: ");
        Producto.ordenarMayorMenor(producto);
    }
}
