package ejercicio5_1_15;

import java.util.Scanner;

public class Ejercicio5_1_15 
{
    
    public static void esPrimo(int numero)
    {
        int contador = 0, divisor = numero - 1;
        
        while (divisor != 1)
        {
            if (numero%divisor == 0)
                contador++;
            divisor--;
        }
        
        if (contador == 0)
            System.out.printf("El numero %d es primo %n", numero);
        else
            System.out.printf("El numero %d no es primo %n", numero);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numero = 5;
        
        while(numero != 0)
        {
            System.out.println("Escriba un numero (Para salir ponga 0): ");
            numero = sc.nextInt();
            if (numero != 0)
                esPrimo(numero);
        }
    }
}
