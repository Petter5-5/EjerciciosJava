package ejercicio2_3_2;
import java.util.Scanner;
public class Ejercicio2_3_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero:");
        double numero1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero:");
        double numero2 = sc.nextInt();
        
        System.out.println("x = " + numero1);
        System.out.println("y = " + numero2);
        System.out.printf("x + y = %.2f%n", numero1 + numero2);
        System.out.printf("x - y = %.2f%n", numero1 - numero2);
        System.out.printf("x / y = %.17f%n", numero1 / numero2);
        System.out.printf("x * y = %.2f%n", numero1 * numero2);
    }
}
