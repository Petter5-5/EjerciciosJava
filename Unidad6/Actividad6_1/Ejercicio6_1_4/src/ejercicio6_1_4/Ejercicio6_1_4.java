package ejercicio6_1_4;

import java.util.Scanner;

public class Ejercicio6_1_4 
{
    public static void mostrar(int[] numero)
    {
        int maximo = 0, minimo = 0;
        for(int i = 0; i < numero.length; i++)
        {
            if(maximo < numero[i])
                maximo = numero[i];
            else if(minimo > numero[i])
                minimo = numero[i];
        }
        for(int i = 0; i < numero.length; i++)
        {
            if(maximo == numero[i])
                System.out.println("" + maximo + " máximo");
            else if (minimo == numero[i])
                System.out.println("" + minimo + " mínimo");
            else
                System.out.println("" + numero[i]);
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int tamaño = 10;
        int[] numero = new int[tamaño];
        
        System.out.println("Vaya introduciendo números enteros y pulsando INTO;");
        for(int i = 0; i < tamaño; i++)
        {
            numero[i] = sc.nextInt();
        }
        System.out.println("");
        mostrar(numero);
    }
}
