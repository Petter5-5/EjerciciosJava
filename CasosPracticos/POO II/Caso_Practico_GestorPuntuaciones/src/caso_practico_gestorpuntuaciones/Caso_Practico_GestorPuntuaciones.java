package caso_practico_gestorpuntuaciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Caso_Practico_GestorPuntuaciones 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Partida> partidas = new ArrayList<>();
        GestorEstructura.crearEstrutura();
        
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Introduce los datos de la partida " + (i + 1) + ":");
            System.out.printf("Jugador: ");
            String nombre = sc.nextLine();
            System.out.print("Nivel: ");
            int nivel = sc.nextInt();
            System.out.print("Puntuación: ");
            int puntuacion = sc.nextInt();
            sc.nextLine();
            
            partidas.add(new Partida(nombre, nivel, puntuacion));
            GestorPartidas.registrarPartida(partidas.get(i));
        }
        GestorRanking.generarRanking(partidas);
        GestorEstructura.mostrarMetadatos("partidas.txt");
        
    }
}
