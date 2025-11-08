package ejercicio4_1_13;

import java.util.Scanner;

public class Ejercicio4_1_13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int empleado = 0, dia, hora, acumulador = 0, acumuladorGeneral = 0;
        
        System.out.print("Cuantos empleados hay?: ");
        empleado = sc.nextInt();
        System.out.print("Cuantos dias trabajo cada uno?: ");
        dia = sc.nextInt();
        
        for(int i = 1; i <= empleado; i++)
        {
            System.out.printf("%nEmpleado %d:%n", i);
            for(int j = 1; j <= dia; j++)
            {
                hora = (int) (Math.random()*4 + 4);
                System.out.printf("Dia %d: %d %n", j, hora);
                acumulador += hora;
            }
            System.out.printf("Total horas del empleado %d: %d %n", empleado, acumulador);
            acumuladorGeneral += acumulador;
            acumulador = 0;
        }
        
        System.out.printf("%nTotal de horas de la empresa: " + acumuladorGeneral);
    }
}