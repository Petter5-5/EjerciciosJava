package ejercicio2_3_6;
import java.util.Scanner;
public class Ejercicio2_3_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad en stock: ");
        int stock = sc.nextInt();
        sc.nextLine();
        System.out.println("El nombre del producto: ");
        String nombre = sc.next();
        System.out.println("El precio unitario: ");
        double precio = sc.nextDouble();
        System.out.printf("Producto: %s - Cantidad: %d - Precio unitario: %.2f euros - Precio total: %.2f euros%n", nombre, stock, precio, stock * precio);
        
    }
}
