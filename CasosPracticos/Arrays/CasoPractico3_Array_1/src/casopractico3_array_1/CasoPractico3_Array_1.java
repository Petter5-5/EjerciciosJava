package casopractico3_array_1;
public class CasoPractico3_Array_1 
{
    
    public static int nombreLargos(String[] listaCompra)
    {
        int resultado = 0;
        
        for (String producto : listaCompra) {
            if (producto.length() >= 5) {
                resultado++;
            }
        }
        return resultado;
    }
    
    public static int buscar(String[] listaCompra, char letra)
    {
        int resultado = 0;
        
        for (String producto : listaCompra) {  
            if(producto.indexOf(letra) >= 0)
                resultado++;
        }
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        String[] listaCompra = {"Pan", "Leche", "Huevos", "Fruta", "Arroz"};
        char letra = 'a';
        
        System.out.println("Lista de la compra");
        System.out.println("------------------");
        for (String producto : listaCompra)
        {
            System.out.println("- " + producto);
        }
        System.out.println("Productos con nombre largo: " + nombreLargos(listaCompra));
        System.out.println("Productos que contienen '" + letra + "': " + buscar(listaCompra, letra));
    }
}
