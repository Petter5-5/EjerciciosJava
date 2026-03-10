package caso_practico_calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Caso_Practico_Calculadora 
{
    public static int operar(String operador, int a, int b)
    {
        double resultado = 0;
        
        switch(operador)
        {
            case "+" -> resultado = a + b;
            case "-" -> resultado = a - b;
            case "*" -> resultado = a * b;
            case "/" -> resultado = a / b;
        }
        
        return (int) resultado;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        String operador;
        String titulo = "";
        boolean error = false;
        
        for(int i = 0; i < 3; i++)
        {
            switch(i)
            {
                case 0 -> titulo = "\033[0;1m--- Caso sin error ---\033[0m";
                case 1 -> titulo = "\033[0;1m--- División entre cero ---\033[0m";
                case 2 -> titulo = "\033[0;1m--- Dato incorrecto ---\033[0m";
            }
            System.out.println(titulo);
            
            try
            {
                System.out.println("Introduce el primer número: ");
                a = sc.nextInt();
                System.out.println("Introduce el segundo número: ");
                b = sc.nextInt();
                sc.nextLine();
                System.out.println("Introduce el operador: ");
                operador = sc.nextLine();
                System.out.println("El resultado: " + operar(operador, a, b));
            }catch(ArithmeticException e)
            {
                System.out.println("División entre cero no permitida");
                error = true;
            }catch(InputMismatchException e)
            {
                System.out.println("Datos introducidos incorrectos");
                error = true;
            }finally
            {
                if(error)
                {
                    System.out.println("Ha ocurrido error. No se calcula nada");
                }
                System.out.println("Calculadora finalizada");
            }
            System.out.println("");
        }
    }
}
