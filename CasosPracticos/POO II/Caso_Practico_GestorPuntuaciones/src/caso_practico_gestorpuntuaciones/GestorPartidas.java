package caso_practico_gestorpuntuaciones;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.*;

public class GestorPartidas 
{
    public static void registrarPartida(Partida p)
    {
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("arcade\\historial\\partidas.txt", true))))
        {
            pw.println(p.getJugador() + " | Nivel: " + p.getNivel() + " | Puntos: " + p.getPuntos() + " | " + LocalDate.now());
            System.out.println("✔ Partida registrada: " + p.getJugador() + " | Nivel: " + p.getNivel() + " | Puntos: " + p.getPuntos() + " | " + LocalDate.now());
        }catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
