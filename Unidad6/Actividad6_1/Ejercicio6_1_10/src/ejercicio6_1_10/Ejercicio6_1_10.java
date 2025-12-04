package ejercicio6_1_10;

import java.util.Arrays;

public class Ejercicio6_1_10 
{
    public static int[] concatenar(int[] a, int[] b)
    {
        int[] concatenao = new int[a.length + b.length];
        for(int i = 0; i < concatenao.length; i++)
        {
            if(a.length > i)
                concatenao[i] = a[i];
            else
                concatenao[i] = b[i - a.length];
        }
        
        Arrays.sort(concatenao);
        return concatenao;
    }
    
    public static void main(String[] args) 
    {
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        
        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        
        System.out.println("Array concatenado: " + Arrays.toString(concatenar(a, b)));
    }
}
