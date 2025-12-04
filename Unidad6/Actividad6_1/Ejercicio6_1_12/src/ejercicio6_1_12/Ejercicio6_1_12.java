package ejercicio6_1_12;

import java.util.Scanner;

public class Ejercicio6_1_12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int n, contador = 1;
        
        System.out.print("Introduce n (1-10): ");
        n = sc.nextInt();
        
        int[][] tri = new int[n][];
        
        System.out.println("");
        for(int i = 0; i < tri.length; i++)
        {
            tri[i] = new int[i + 1];
            for(int j = 0; j < tri[i].length; j++)
            {
                tri[i][j] = contador;
                System.out.print(tri[i][j] + " ");
                contador++;
            }
            System.out.println("");
        }
    }
}
