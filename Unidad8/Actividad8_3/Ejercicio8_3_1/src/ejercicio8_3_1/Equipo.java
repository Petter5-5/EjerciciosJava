package ejercicio8_3_1;

import java.util.ArrayList;

public class Equipo 
{
    private ArrayList<Jugador> jugadores;
    
    public Equipo()
    {
        jugadores = new ArrayList<>();
    }
    
    public void añadirJugador(Jugador j)
    {
        if(jugadores.size() > 4)
            throw new EquipoLlenoException();
        else
            jugadores.add(j);
    }
    
    public int getPuntuacionTotal()
    {
        int total = 0;
        
        for(Jugador j : jugadores)
        {
            total += j.getPuntuacion();
        }
        
        return total;
    }
    
    public double getPuntuacionMedia()
    {
        double media = 0;
        
        media = getPuntuacionTotal() / jugadores.size();
        
        return media;
    }
    
    public Jugador getMejorJugador()
    {
        
    }
}
