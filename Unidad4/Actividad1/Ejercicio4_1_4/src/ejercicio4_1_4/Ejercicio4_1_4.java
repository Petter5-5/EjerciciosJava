package ejercicio4_1_4;

import java.util.Scanner;

public class Ejercicio4_1_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        int numero, billetes500 = 0, billetes200 = 0, billetes100 = 0, billetes50 = 0, billetes20 = 0, billetes10 = 0, billetes5 = 0;
        
        
        System.out.print("Dime la canatidad de dinero: ");
        numero = sc.nextInt();
        
        while (numero >= 500)
        {
            numero = numero - 500;
            billetes500++;
        }
        while (numero >= 200)
        {
            numero = numero - 200;
            billetes200++;
        }
        while (numero >= 100)
        {
            numero = numero - 100;
            billetes100++;
        }
        while (numero >= 50)
        {
            numero = numero - 50;
            billetes50++;
        }
        while (numero >= 20)
        {
            numero = numero - 20;
            billetes20++;
        }
        while (numero >= 10)
        {
            numero = numero - 10;
            billetes10++;
        }
        while (numero >= 5)
        {
            numero = numero - 5;
            billetes5++;
        }
        
        System.out.println("Billetes de 500 euros: " + billetes500);
        System.out.println("Billetes de 200 euros: " + billetes200);
        System.out.println("Billetes de 100 euros: " + billetes100);
        System.out.println("Billetes de 50 euros: " + billetes50);
        System.out.println("Billetes de 20 euros: " + billetes20);
        System.out.println("Billetes de 10 euros: " + billetes10);
        System.out.println("Billetes de 5 euros: " + billetes5);
    }
}
