package ejercicio5_1_10;

import java.util.Scanner;

public class Ejercicio5_1_10 
{
    
    public static String calculadora(double num1, double num2)
    {
        String division, resultado;
        
        if(num2 == 0)
            division = " Error: Division por 0";
        else
            division = " Division: " +(num1 / num2);
        
        return resultado = "suma: " + (num1 + num2) + " resta: "  + (num1 - num2) + " Multiplicación: "  + (num1 * num2) + division; 
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double num1, num2;
        
        System.out.print("Escriba el primer numero: ");
        num1 = sc.nextDouble();
        System.out.print("Escriba el segundo numero: ");
        num2 = sc.nextDouble();
        System.out.println(calculadora(num1, num2));
    }
}
