package ejercicio4_1_8;

import java.util.Scanner;

public class Ejercicio4_1_8 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String palabra, palabraInversa = "";
        
        System.out.print("Dime la palabra: ");
        palabra = sc.nextLine();
        
        for (int i = palabra.length() - 1; i >= 0; i--)
        {
            palabraInversa += palabra.charAt(i) ;
        }
        if(palabra.equals(palabraInversa))
            System.out.println(palabra + " es un palindromo");
        else
            System.out.println(palabra + " no es un palindromo");
    }
}