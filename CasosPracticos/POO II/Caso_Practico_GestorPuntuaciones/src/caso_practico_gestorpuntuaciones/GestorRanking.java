package caso_practico_gestorpuntuaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class GestorRanking 
{
    public static void generarRanking(ArrayList<Partida> lista)
    {
        Collections.sort(lista);
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("arcade\\ranking\\top_jugadores.txt")))
        {
            bw.write("========================");
            bw.newLine();
            bw.write("RANKING TOP JUGADORES");
            bw.newLine();
            bw.write("========================");
            bw.newLine();
            bw.write("JUGADOR NIVEL PUNTOS");
            bw.newLine();
            bw.write("-------------------------");
            bw.newLine();
            for(Partida p : lista)
            {
                bw.write(p.getJugador() + " " + p.getNivel() + " " + p.getPuntos());
                bw.newLine();
            }
            bw.write("========================");
            bw.newLine();
            
            System.out.println("✔ Ranking generado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir: " + e.getMessage());
        }
    }
}
