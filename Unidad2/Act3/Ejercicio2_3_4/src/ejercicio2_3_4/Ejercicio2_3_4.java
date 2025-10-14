package ejercicio2_3_4;
import java.util.Scanner;
public class Ejercicio2_3_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba las horas semanales que trabajas: ");
        int horas = sc.nextInt();
        System.out.printf("Su salario semanal es de %d euros %n", horas * 12);
    }
}
