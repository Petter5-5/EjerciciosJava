package casopractico_array_01;

import java.util.Scanner;

public class CasoPractico_Array_01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int tamaño = 0;

        System.out.print("Escribe el tamaño del array: ");
        tamaño = sc.nextInt();
        
        int[] array = new int [tamaño];
        
        for (int i = 0; i < tamaño; i++)
        {
            System.out.print("Escribe los valores de los arrays en orden: ");
            array[i] = sc.nextInt();
        }
        for (int i = tamaño - 1; i >= 0; i--)
        {
            System.out.printf("Indice %d tiene el valor %d %n", i, array[i]);
        }
    }
}
