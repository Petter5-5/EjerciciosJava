package ejercicio2_3_1;
import java.util.Scanner;
public class Ejercicio2_3_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero:");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero:");
        int numero2 = sc.nextInt();
        int resultado = numero1 * numero2;
        System.out.println("La multiplicacion: " + resultado);
    }
}
