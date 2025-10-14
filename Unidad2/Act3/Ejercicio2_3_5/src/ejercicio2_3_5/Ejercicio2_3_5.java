package ejercicio2_3_5;
import java.util.Scanner;
public class Ejercicio2_3_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la nota del primer examen: ");
        double examen1 = sc.nextDouble();
        System.out.println("Que nota quiere sacar en el trimestre?");
        double trimestre = sc.nextDouble();
        System.out.printf("Para tener un %.2f en el trimestre necesita sacar un %.2f en el segundo examen.%n", trimestre, (trimestre - examen1 * 0.4) / 0.6);
    }
}
