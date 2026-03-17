package ejercicio8_2_4;

import java.util.Scanner;

public class Ejercicio8_2_4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Parking parking = new Parking();
        
        String matricula;
        int hora;
        int minuto;
        int opcion;
        boolean salida = false;
        
        
        
        while(!salida)
        {
            System.out.println("-- MENU --");
            System.out.println("1. Entrada coche");
            System.out.println("2. Salida coche");
            System.out.println("3. Listado de coches");
            System.out.println("4. Total recaudado");
            System.out.println("5. Número de coches en el parking");
            System.out.println("6. Salir");
            System.out.println("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion)
            {
                case 1 -> 
                {
                    System.out.println("Introduce la matrícula:");
                    matricula = sc.nextLine();
                    System.out.println("Hora de entrada:");
                    hora = sc.nextInt();
                    System.out.println("Minuto de entrada:");
                    minuto = sc.nextInt();
                    parking.entradaCoche(matricula, hora, minuto);
                }
                case 2 ->
                {
                    System.out.println("Introduce la matrícula:");
                    matricula = sc.nextLine();
                    System.out.println("Hora de salida:");
                    hora = sc.nextInt();
                    System.out.println("Minuto de salida:");
                    minuto = sc.nextInt();
                    System.out.println("Importe total: " + parking.salidaCoche(matricula, hora, minuto));
                }
                case 3 ->
                {
                    parking.listar();
                }
                case 4 ->
                {
                    System.out.println("Total recaudado: " + Parking.getTotalRecaudado());
                }
                case 5 ->
                {
                    System.out.println("Número de coches en el parking: " + parking.cochesDentro());
                }
                case 6 ->
                {
                    salida = true;
                }
            }
        }      
    }
}
