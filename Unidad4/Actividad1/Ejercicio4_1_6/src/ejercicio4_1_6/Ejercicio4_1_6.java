package ejercicio4_1_6;

import java.util.Scanner;

public class Ejercicio4_1_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String palabra = "", palabraLarga = "";
        
        for(int i = 0; i < 5; i++)
        {
            System.out.print("Dime una palabra: ");
            palabra = sc.nextLine();
            
            if (palabra.length() > palabraLarga.length())
                palabraLarga = palabra;
        }
        
        System.out.println("La palabra con longitud mayor es: " + palabraLarga);
    }
}