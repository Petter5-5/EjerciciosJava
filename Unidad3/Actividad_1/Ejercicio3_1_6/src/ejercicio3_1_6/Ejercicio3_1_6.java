package ejercicio3_1_6;

import java.util.Scanner;

public class Ejercicio3_1_6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String jugador, ordenador2;
        int ordenador;
        
        System.out.print("Turno del jugador (introduzca piedra, papel o tijera): ");
        jugador = sc.next();
        
        ordenador = (int) (Math.random()*3);
        if (ordenador == 0)
            ordenador2 = "piedra";
        else if (ordenador == 1)
            ordenador2 = "papel";
        else
            ordenador2 = "tijera";
        
        System.out.println("Turno del ordenador: " + ordenador2);
        
        switch(ordenador)
        {
            case 0 ->
            {
                if (jugador.equals("piedra"))
                    System.out.println("Empate");
                else if (jugador.equals("papel"))
                    System.out.println("Gana el jugador");
                else if (jugador.equals("tijera"))
                    System.out.println("Gana el ordenador");
                else
                    System.out.println("El jugador ha introducido valores incorrectos");
            }
            case 1 ->
            {
                if (jugador.equals("piedra"))
                    System.out.println("Gana el ordenador");
                else if (jugador.equals("papel"))
                    System.out.println("Empate");
                else if (jugador.equals("tijera"))
                    System.out.println("Gana el jugador ");
                else
                    System.out.println("El jugador ha introducido valores incorrectos");
            }
            case 2 ->
            {
                if (jugador.equals("piedra"))
                    System.out.println("Gana el jugador");
                else if (jugador.equals("papel"))
                    System.out.println("Gana el ordenador ");
                else if (jugador.equals("tijera"))
                    System.out.println("Empate");
                else
                    System.out.println("El jugador ha introducido valores incorrectos");
            }
            default -> System.out.println("El ordenador ha introducido valores incorrectos");
        }
    }
}
