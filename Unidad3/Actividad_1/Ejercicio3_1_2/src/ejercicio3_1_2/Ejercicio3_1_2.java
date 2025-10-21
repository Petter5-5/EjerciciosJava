package ejercicio3_1_2;

import java.util.Scanner;

public class Ejercicio3_1_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int hora;
        System.out.print("Por favor, introduzca una hora del dia (0 - 23): ");
        hora = sc.nextInt();
       
        if (hora >= 6 && hora <= 12)
            System.out.println("Buenos dias");
        else if (hora >= 13 && hora <= 20)
            System.out.println("Buenas tardes");
        else if (hora >= 0 || hora <= 23)
            System.out.println("Buenas noches");
        else
            System.out.println("La hora introducida no es correcta.");
    }
}
