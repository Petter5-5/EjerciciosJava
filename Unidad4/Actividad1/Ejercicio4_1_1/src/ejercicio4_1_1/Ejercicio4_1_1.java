package ejercicio4_1_1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio4_1_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        boolean numero10 = false;
        
        while (numero != -1)
        {
            System.out.print("Dime un nota (-1 para salir) ");
            try
            {
                numero = sc.nextInt();
            }catch (InputMismatchException e)
                {
                    System.out.println("La nota debe ser numero entero");
                    sc.nextLine();
                }
            if (numero > 10)
                System.out.println("La nota debe estar entre 0 y 10");
            if (numero == 10)
                numero10 = true;
        }
        if(numero10)
            System.out.println("Si habia un 10");
        else
            System.out.println("No habia un 10");
    }
}
