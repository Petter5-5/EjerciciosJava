package ejercicio4_1_12;

import java.util.Scanner;

public class Ejercicio4_1_12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String numero;
        int numeroPar = 0, numeroImpar = 0;
        
        System.out.println("Dime un numero");
        numero = sc.nextLine();
        
        for (int i = 0; i <= numero.length() - 1; i++)
        {
            if(numero.charAt(i) == '1' || numero.charAt(i) == '3' || numero.charAt(i) == '5' || numero.charAt(i) == '7' || numero.charAt(i) == '9')
                numeroImpar++;
            else
                numeroPar++;
        }
        System.out.printf("El numero tiene %d digitos pares %n", numeroPar);
        System.out.printf("El numero tiene %d digitos impares %n", numeroImpar);
    }
}