package ejercicio6_1_13;

import java.util.Arrays;

public class Ejercicio6_1_13 
{
    public static int[] burbuja(int[] lista)
    {
        int buffer;
        
        for(int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < lista.length - 1; j++)
            {
                if (lista[j] > lista[j + 1])
                {
                    buffer = lista[j + 1];
                    lista[j + 1] = lista[j];
                    lista[j] = buffer;
                    i = 0;
                }
            }
        }
        
        return lista;
    }
    
    public static void main(String[] args) 
    {
        int[] lista = {2, 3, 5, 4, 1, 6, 9, 7, 8, 10};
        
        System.out.println("Desordenado: " + Arrays.toString(lista));
        System.out.println("Ordenado: " + Arrays.toString(burbuja(lista)));
    }
}
