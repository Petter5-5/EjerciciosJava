package ejercicio3_1_5;

import java.util.Scanner;

public class Ejercicio3_1_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String jugador1, jugador2;
        
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        jugador1 = sc.next();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        jugador2 = sc.next();
        
        jugador1 = jugador1.toLowerCase();
        jugador2 = jugador2.toLowerCase();
        
        switch(jugador1)
        {
            case "piedra" ->
            {
                if (jugador2.equals("piedra"))
                    System.out.println("Empate");
                else if (jugador2.equals("papel"))
                    System.out.println("Gana jugador 2");
                else if (jugador2.equals("tijera"))
                    System.out.println("Gana jugador 1");
                else
                    System.out.println("El jugador 2 ha introducido valores incorrectos");
            }
            case "papel" ->
            {
                if (jugador2.equals("piedra"))
                    System.out.println("Gana jugador 1");
                else if (jugador2.equals("papel"))
                    System.out.println("Empate");
                else if (jugador2.equals("tijera"))
                    System.out.println("Gana jugador 2");
                else
                    System.out.println("El jugador 2 ha introducido valores incorrectos");
            }
            case "tijera" ->
            {
                if (jugador2.equals("piedra"))
                    System.out.println("Gana jugador 2");
                else if (jugador2.equals("papel"))
                    System.out.println("Gana jugador 1 ");
                else if (jugador2.equals("tijera"))
                    System.out.println("Empate");
                else
                    System.out.println("El jugador 2 ha introducido valores incorrectos");
            }
            default -> System.out.println("El jugador 1 ha introducido valores incorrectos");
        }
    }
}
