package ejercicio4_1_9;

import java.util.Scanner;

public class Ejercicio4_1_9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numero1 = 0, numero2 = 0, opcion, resultado; 
        boolean salir = false;
        
        while(salir == false)
        {
            System.out.println("CALCULADORA");
            System.out.println("-----------");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Salir");
            System.out.print("Introduce la opcion: ");
            opcion = sc.nextInt();
            opcion--;
            if(opcion < 2)
            {
                System.out.println("Numero 1");
                numero1 = sc.nextInt();
                System.out.println("Numero 2");
                numero2 = sc.nextInt();
            }
            
            switch(opcion)
            {
                case 0 -> 
                {
                    resultado = numero1 + numero2;
                    System.out.println("La suma es: " + resultado);
                }
                case 1 -> 
                {
                    resultado = numero1 - numero2;
                    System.out.println("La resta es: " + resultado);
                }
                case 2 -> salir = true;
                
                default -> System.out.println("Opcion incorrecta"); 
            }
        }
        System.out.println("Fin del programa");
    }
}