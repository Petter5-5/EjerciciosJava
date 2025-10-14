package ejercicio2_3_3;
import java.util.Scanner;
public class Ejercicio2_3_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        double imponible = sc.nextDouble();
        System.out.printf("Base imponible %.2f€%n", imponible);
        System.out.printf("IVA(21 porciento) %.2f€%n", imponible * 0.21);
        System.out.println("----------------");
        System.out.printf("Total %.2f€%n", imponible * 0.21 + imponible);
    }
}
