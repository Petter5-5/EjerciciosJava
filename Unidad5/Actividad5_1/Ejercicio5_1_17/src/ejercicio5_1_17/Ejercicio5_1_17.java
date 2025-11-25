package ejercicio5_1_17;

import java.util.Scanner;

public class Ejercicio5_1_17 
{
    
    public static int menu ()
    {
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        System.out.printf("1. Circunferencia%n2. Area%n3. Salir%n");
        System.out.print("Dime la opción: ");
        opcion = sc.nextInt();
        return opcion;
    }
    
    public static double circunferencia(double r)
    {
        return 2 * r * 3.141592653589793238462643383279;
    }
    
    public static double radio(double r)
    {
        return r * r * 3.141592653589793238462643383279;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int salida = 0, r = 0;
        double resultado = 0;
        
        while(salida != 3)
        {
            salida = menu();
            if (salida != 3)
            {
                if(salida < 3)
                {
                    System.out.print("Dime el radio: ");
                    r = sc.nextInt();
                }
                switch(salida)
                {
                    case 1 -> resultado = circunferencia(r); 
                    case 2 -> resultado = radio(r);
                    default -> System.out.printf("opcion no válida%n%n");
                }
                if(salida < 3)
                System.out.printf("Resultado: %.2f %n%n", resultado);
            }  
        }
        System.out.println("Programa finalizado");
    }
}
