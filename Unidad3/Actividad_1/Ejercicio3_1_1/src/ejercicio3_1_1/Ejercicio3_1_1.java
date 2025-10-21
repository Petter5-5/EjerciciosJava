package ejercicio3_1_1;

import java.util.Scanner;

public class Ejercicio3_1_1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String dia;
        System.out.println("Por favor, introduzca un dia de la semana: ");
        dia = sc.next();
        dia = dia.toLowerCase();
        
        switch(dia){
            case "lunes" -> System.out.println("\u001B[33mSistemas informaticos");
            case "martes" -> System.out.println("\u001B[33mSostenibilidad");
            case "miercoles" -> System.out.println("\u001B[33mProgramacion");
            case "jueves" -> System.out.println("\u001B[33mProgramacion");
            case "viernes" -> System.out.println("\u001B[33mLenguajes de marca");
            case "sabado", "domingo" -> System.out.println("\u001B[33mNo hay clases");
            default -> System.out.println("\u001B[33mEl dia introducido no es correcto");
    }
        
        
    }
}
