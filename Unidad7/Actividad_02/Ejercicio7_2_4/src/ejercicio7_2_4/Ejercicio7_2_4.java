package ejercicio7_2_4;

import java.util.Scanner;

public class Ejercicio7_2_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        
        String respuesta = "";
        int edad = 0;
        
        System.out.println("--- Introduce datos para la Persona 1 ---");
        System.out.print("Introduce el Nombre: ");
        respuesta = sc.nextLine();
        persona1.setNombre(respuesta);
        System.out.print("Introduce los Apellidos: ");
        respuesta = sc.nextLine();
        persona1.setApellidos(respuesta);
        System.out.print("Introduce el DNI: ");
        respuesta = sc.nextLine();
        persona1.setDni(respuesta);
        System.out.print("Introduce la Edad: ");
        edad = sc.nextInt();
        persona1.setEdad(edad);
        System.out.println("");
        sc.nextLine();
        
        System.out.println("--- Introduce datos para la Persona 2 ---");
        System.out.print("Introduce el Nombre: ");
        respuesta = sc.nextLine();
        persona2.setNombre(respuesta);
        System.out.print("Introduce los Apellidos: ");
        respuesta = sc.nextLine();
        persona2.setApellidos(respuesta);
        System.out.print("Introduce el DNI: ");
        respuesta = sc.nextLine();
        persona2.setDni(respuesta);
        System.out.print("Introduce la Edad: ");
        edad = sc.nextInt();
        persona2.setEdad(edad);
        System.out.println("");
        
        System.out.println("--- RESULTADOS ---");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
}
