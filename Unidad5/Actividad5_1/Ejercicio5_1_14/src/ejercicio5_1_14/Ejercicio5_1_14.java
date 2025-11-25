package ejercicio5_1_14;

import java.util.Scanner;

public class Ejercicio5_1_14 
{
    
    public static void comprobacion(int dia, int mes, int año)
    {
        boolean valido = false;
        if (dia > 30)
            System.out.println("Fecha no válida en el dia");
        else if (mes > 12)
                System.out.println("Fecha no válida en el mes");
        else if (año > 2025)
            System.out.println("Fecha no válida en el año");
        else
            System.out.println("Fecha válida");
            
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int dia, mes, año;
        
        System.out.print("Introduzca el dia: ");
        dia = sc.nextInt();
        System.out.print("Introduzca el mes: ");
        mes = sc.nextInt();
        System.out.print("Introduzca el año: ");
        año = sc.nextInt();
        
        comprobacion(dia, mes, año);
    }
}
