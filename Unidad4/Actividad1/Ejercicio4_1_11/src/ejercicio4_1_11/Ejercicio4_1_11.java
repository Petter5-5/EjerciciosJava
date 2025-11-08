package ejercicio4_1_11;

import java.util.Scanner;

public class Ejercicio4_1_11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String numero;
        int cantidadNumero;
        
        System.out.println("Dime un numero");
        numero = sc.nextLine();
        
        cantidadNumero = numero.length();
        System.out.printf("El numero tiene %d digitos %n", cantidadNumero);
    }
}