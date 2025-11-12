package ejercicio4_1_4;

import java.util.Scanner;

public class Ejercicio4_1_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int numero, billete = 500;
        
        
        System.out.print("Dime la canatidad de dinero: ");
        numero = sc.nextInt();
        
       if (numero%5 == 0)
       {
           while(numero != 0)
           {
               System.out.printf("Billetes de %d€: %d %n", billete, numero / billete);
                numero = numero % billete;
                switch (billete)
                {
                    case 500 -> billete = 200;
                    case 200 -> billete = 100; 
                    case 100 -> billete = 50; 
                    case 50 -> billete = 20; 
                    case 20 -> billete = 10;
                    case 10 -> billete = 5; 
                    case 5 -> billete = 0; 
                }
           }
       }
       else
       {
           System.out.println("La cantidad debe ser multiplo de 5");
       }
    }
}
