package casopractico6_array_01;

import java.util.Arrays;

public class CasoPractico6_Array_01 
{
    public static int aciertos(int[] combGana, int[] miCombinacion)
    {
        int aciertos = 0;
        Arrays.sort(combGana);
        
        for(int i = 0; i < combGana.length; i++)
        {
            if(Arrays.binarySearch(combGana, miCombinacion[i]) > -1)
                    aciertos++;
        }
        
        return aciertos;
    }
    
    public static void main(String[] args) 
    {
        int[] combGana = {41, 5, 1, 36, 12, 49};
        int[] miCombinacion = {21, 12, 45, 10, 5, 2};
        
        System.out.println("Combinación ganadora: " + Arrays.toString(combGana));
        System.out.println("Mi combinación: " + Arrays.toString(miCombinacion));
        
        System.out.printf("Tienes %d aciertos %n", aciertos(combGana, miCombinacion));
    }
}
