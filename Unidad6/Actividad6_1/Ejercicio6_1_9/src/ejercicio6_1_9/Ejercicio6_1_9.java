package ejercicio6_1_9;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Ejercicio6_1_9 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int numeroAlumnos;
        String buscar;
        
        System.out.print("Número de alumnos; ");
        numeroAlumnos = sc.nextInt();
        
        String[] clase = new String[numeroAlumnos];
        double[] nota = new double[numeroAlumnos];
        
        for(int i = 1; i <= numeroAlumnos; i++)
        {
            System.out.print("Nombre del alumno " + i + ": ");
            clase[i - 1] = sc.next();
            System.out.print("Nota de " + clase[i - 1] + ": ");
            nota[i - 1] = sc.nextDouble();
        }
        
        System.out.println("");
        System.out.print("Introduce el nombre del alumno a buscar: ");
        buscar = sc.next();
        
        if(!Arrays.asList(clase).contains(buscar))
            System.out.println("Alumno no registrado.");
        else
            System.out.println("La nota de luis es: " + nota[Arrays.asList(clase).indexOf(buscar)]);
    }
}