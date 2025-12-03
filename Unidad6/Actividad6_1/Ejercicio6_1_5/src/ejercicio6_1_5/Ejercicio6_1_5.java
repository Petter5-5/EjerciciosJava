package ejercicio6_1_5;

import java.util.Scanner;

public class Ejercicio6_1_5 
{
    public static int repetido(String[] nombre, int i)
    {
        int repetido = 1;
        
        for (int j = 0; j < i; j++)
        {
            if(nombre[i].equals(nombre[j]))
            {
                repetido++;
            }
        }
        return repetido;
    }
    
    public static void mostrar(String[] nombre)
    {
        for(int i = 0; i < nombre.length; i++)
        {
            System.out.printf("%s %dº %n", nombre[i], repetido(nombre, i));
        }
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int tamaño;
        System.out.print("Introduzca el número total de nombres de reyes: ");
        tamaño = sc.nextInt();
        
        String[] nombre = new String[tamaño];
        
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        for (int i = 0; i < tamaño; i++)
        {
            nombre[i] = sc.next();
        }
        System.out.printf("%nLos reyes introducidos sono:");
        mostrar(nombre);
    }
}
