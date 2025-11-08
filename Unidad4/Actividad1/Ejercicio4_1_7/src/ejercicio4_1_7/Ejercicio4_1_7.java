package ejercicio4_1_7;

import java.util.Scanner;

public class Ejercicio4_1_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String frase = "";
        int espacio = 0;
        boolean dobleEspacio = true;

        System.out.println("Dime una frase");
        frase = sc.nextLine();

        for (int i = 0; i <= frase.length() - 1; i++)
        {
            if (frase.charAt(i) == ' ')
                dobleEspacio = true;
            if (frase.charAt(i) != ' ' && dobleEspacio == true)
            {
                dobleEspacio = false;
                espacio++;
            }
        }
        System.out.printf("La frase tiene %d palabras %n", espacio);
    }
}