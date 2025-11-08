package ejercicio4_1_10;

import java.util.Scanner;

public class Ejercicio4_1_10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        System.out.print("Dime el numero: ");
        numero = sc.nextInt();
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d * %d = %d %n", numero, i, numero * i);
        }
    }
}