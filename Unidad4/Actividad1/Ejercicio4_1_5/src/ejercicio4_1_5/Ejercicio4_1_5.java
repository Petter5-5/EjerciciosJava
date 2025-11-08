package ejercicio4_1_5;

import java.util.Scanner;

public class Ejercicio4_1_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String palabra = "";
        System.out.print("Dime una palabra: ");
        palabra = sc.nextLine();
        
        for(int i = 0; i <= palabra.length() - 1; i++)
        {
            System.out.print(palabra.charAt(i) + " ");
        }
        System.out.println("");
    }
}