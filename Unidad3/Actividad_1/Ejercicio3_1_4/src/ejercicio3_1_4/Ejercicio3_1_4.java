package ejercicio3_1_4;

import java.util.Scanner;

public class Ejercicio3_1_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double baseImponible, iva2 = 0, promocion2 = 0;   
        
        boolean mal = false;
        String iva, promocion;
        
        //Input
        System.out.print("Introduzca la base imponible: ");
        baseImponible = sc.nextByte();
        
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        iva = sc.next();
        iva = iva.toLowerCase();
        
        System.out.print("Introduzca el codigo proporcional (nopro, mitad, meno5 o 5porc): ");
        promocion = sc.next();
        promocion = promocion.toLowerCase();
        
        //Calculo
        switch(iva){
            case "general" -> iva2 = baseImponible * 0.21;
            case "reducido" -> iva2 = baseImponible * 0.10;
            case "superreducido" -> iva2 = baseImponible * 0.04;
            default -> {System.out.println("IVA introducido incorrecto");
                        mal = true;
            }
        }
        switch(promocion){
            case "nopro" -> promocion2 = 0;
            case "mitad" -> promocion2 = -(baseImponible + iva2)/2;
            case "meno5" -> promocion2 = -5;
            case "5porc" -> promocion2 = -(baseImponible + iva2) * 0.05 ;
            default -> {System.out.println("promocion introducida incorrecto");
                        mal = true;
            }
        }
        
        //Output
        
        if (mal == false)
        {
            System.out.printf("Base imponible%8.2f eruos%n", baseImponible);
            System.out.printf("IVA%19.2f eruos%n", iva2);
            System.out.printf("Precio con IVA%8.2f eruos%n", baseImponible + iva2);
            System.out.printf("Promo%17.2f eruos%n", promocion2);
            System.out.printf("Total%17.2f eruos%n", iva2 + baseImponible + promocion2);
        }    
    }
}
