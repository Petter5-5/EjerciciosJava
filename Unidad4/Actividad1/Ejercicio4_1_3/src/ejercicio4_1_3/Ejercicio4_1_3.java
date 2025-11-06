package ejercicio4_1_3;

import java.util.Scanner;
import java.util.InputMismatchException;


public class Ejercicio4_1_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numero = 0;
        int numeroSecreto = 94; 
                
        while(numero != 94)
        {
            System.out.print("Dime un numero entre el 1 y el 100: ");
            if(sc.hasNextInt())
            {
                numero = sc.nextInt();
                if (numero < 1 || numero > 100)
                    System.out.println("El numero debe estar entre 1 y 100");
                else
                    if (numero > numeroSecreto)
                        System.out.println("El numero es menor");
                    if (numero < numeroSecreto)
                        System.out.println("El numero es mayor");
            }        
            else
            {
                System.out.println("Tienes que introducir un numero entero.");
                sc.nextLine();
            }
        }
        System.out.println("Acertastes");
    }
}
