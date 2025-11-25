package ejercicio5_1_13;

import java.util.Scanner;

public class Ejercicio5_1_13 
{
    
    public static int comprobacion(int a, int b)
    {
        int resultado = a;
        if (a < b)
            resultado = b;
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, resultado = 0;
        
        System.out.print("Introduzca el primer valor: ");
        a = sc.nextInt();
        System.out.print("Introduzca el segundo valor: ");
        b = sc.nextInt();
        System.out.print("Introduzca el tercer valor: ");
        c = sc.nextInt();
        
        resultado = comprobacion(a, b);
        
        System.out.println("El numero mas grande de esos tres es el: " + comprobacion(c, resultado));
    }
}
