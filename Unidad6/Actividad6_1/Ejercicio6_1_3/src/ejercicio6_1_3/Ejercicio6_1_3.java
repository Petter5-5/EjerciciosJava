package ejercicio6_1_3;

import java.util.Scanner;

public class Ejercicio6_1_3 
{
    public static void mostrar(int[] numero)
    {
        for(int i = 0; i < numero.length; i++)
        {
            if(numero[i]%2 == 0)
                System.out.printf("%d par %n", numero[i]);
            else
                System.out.printf("%d impar %n", numero[i]);
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int tamaño = 8;
        int[] numero = new int[tamaño];
        
        System.out.println("Introduzca 8 números enteros, pulse INTRO después de cada número");
        for(int i = 0; i < tamaño; i++)
        {
            numero[i] = sc.nextInt();
        }
        System.out.println("");
        mostrar(numero);
    }
}
