package ejercicio4_1_12;

import java.util.Scanner;

public class Ejercicio4_1_12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numeroPar = 0, numeroImpar = 0, numero, separado;
        
        System.out.println("Dime un numero");
        numero = sc.nextInt();
        
        
        while (numero != 0)
        {
           
            separado = numero % 10;
            numero = numero / 10;
            
            if(separado == 1 || separado == 3 || separado == 5 || separado == 7 || separado == 9)
            {
                numeroImpar++;
            }
            else
            {
                numeroPar++;
            }
        }
        
        
        System.out.printf("El numero tiene %d digitos pares %n", numeroPar);
        System.out.printf("El numero tiene %d digitos impares %n", numeroImpar);
    }
}