package ejercicio8_3_1;

import java.util.ArrayList;

public class Equipo 
{
    private ArrayList<Jugador> jugadores;
    private String nombre;
    
    public Equipo(String nombre)
    {
        this.nombre = nombre;
        jugadores = new ArrayList<>();
    }

    public ArrayList<Jugador> getJugadores() 
    {
        return jugadores;
    }
    
    public void añadirJugador(Jugador j)
    {
        if(jugadores.size() > 4)
            throw new EquipoLlenoException(nombre);
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
        Jugador jugadorTop = jugadores.getFirst();
        
        for(Jugador j : jugadores)
        {
            if(j.getPuntuacion() >= jugadorTop.getPuntuacion())
            {
                jugadorTop = j;
            }
        }
        return jugadorTop;
    }
    
    public ArrayList<Jugador> getJugadoresPorNivel(String nivel)
    {
        ArrayList<Jugador> jugadoresNivel = new ArrayList<>();
        for(Jugador j : jugadores)
        {
            if(j.getNivel().equals(nivel))
            {
                jugadoresNivel.add(j);
            }
        }
        
        return jugadoresNivel;
    }
    
    public boolean tieneJugador(String nombre)
    {
        boolean esNombre = false;
        int contador = 0;
        while(!esNombre && contador < jugadores.size())
        {
            if(jugadores.get(contador).getNombre().equals(nombre))
            {
                esNombre = true;
            }
            contador++;
        }
        
        return esNombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
