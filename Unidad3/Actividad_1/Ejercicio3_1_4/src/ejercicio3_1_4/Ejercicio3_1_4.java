package ejercicio3_1_4;

import java.util.Scanner;

public class Ejercicio3_1_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double baseImponible, iva2, promocion2;
        String iva, promocion;
        
        System.out.print("Introduzca la base imponible: ");
        baseImponible = sc.nextByte();
        
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        iva = sc.next();
        iva = iva.toLowerCase();
        
        System.out.print("Introduzca el codigo proporcional (nopro, mitad, meno5 o 5porc): ");
        promocion = sc.next();
        promocion = promocion.toLowerCase();
        
        switch(iva){
            case "general" -> iva2 = 0.21;
            case "reducido" -> iva2 = 0.10;
            case "superreducido" -> iva2 = 0.04;
            default -> System.out.println("IVA introducido incorrecto");
        }
    }
}
