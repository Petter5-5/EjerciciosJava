package ejercicio4_1_11;

import java.util.Scanner;

public class Ejercicio4_1_11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int cantidadNumero = 0, numero;
        
        System.out.println("Dime un numero");
        numero = sc.nextInt();
        
        while(numero != 0)
        {
            numero = numero / 10;
            cantidadNumero++;
        }
        System.out.println(cantidadNumero);
    }
}