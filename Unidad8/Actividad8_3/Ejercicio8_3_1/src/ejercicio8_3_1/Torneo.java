package ejercicio8_3_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Torneo 
{
    private HashMap<String, Equipo> equipos;
    private String nombre;
    
    public Torneo(String nombre)
    {
        this.nombre = nombre;
        equipos = new HashMap<>();
    }
    
    public Equipo getEquipo(String nombre)
    {
        Equipo e = null;
        for(HashMap.Entry<String, Equipo> equipo : equipos.entrySet())
        {
            if(equipo.getKey().equals(nombre))
                e = equipo.getValue();
        }
        
        return e;
    }
    
    public void registrarEquipo(Equipo e)
    {
        if(getEquipo(e.getNombre()) != null)
            throw new EquipoDuplicadoException(e.getNombre());
        else
            equipos.put(e.getNombre(), e);
    }
    
    public void eliminarEquipo(String nombre)
    {
        if(getEquipo(nombre) == null)
            throw new EquipoNoEncontradoException(nombre);
        else
            equipos.remove(nombre);
    }
    
    public Equipo getEquipoCampeon()
    {
        Equipo e = null;
        
        for(HashMap.Entry<String, Equipo> equipo : equipos.entrySet())
        {
            if(e == null)
            {
                e = equipo.getValue();
            }
            else
            {
                if(equipo.getValue().getPuntuacionTotal() >= e.getPuntuacionTotal())
                {
                    e = equipo.getValue();
                }
            }
            
        }
        return e;
    }
    
    public Equipo getEquipoUltimo()
    {
        Equipo e = null;
        
        for(HashMap.Entry<String, Equipo> equipo : equipos.entrySet())
        {
            if(e == null)
            {
                e = equipo.getValue();
            }
            else
            {
                if(equipo.getValue().getPuntuacionTotal() < e.getPuntuacionTotal())
                {
                    e = equipo.getValue();
                }
            }
            
        }
        return e;
    }
    
    public ArrayList<Equipo> getEquipoPorEncimaDe(int pts)
    {
        ArrayList<Equipo> equipoTop = new ArrayList<>();
        
        for(HashMap.Entry<String, Equipo> equipo : equipos.entrySet())
        {
            if(equipo.getValue().getPuntuacionTotal() > pts)
            {
                equipoTop.add(equipo.getValue());
            }
        }
        
        return equipoTop;
    }
    
    public Jugador getMejorJugadorDelTorneo()
    {
        Jugador jugadorTop = null;
        
        for(HashMap.Entry<String, Equipo> equipo : equipos.entrySet())
        {
            if(jugadorTop == null)
            {
                jugadorTop = equipo.getValue().getMejorJugador();
            }
            else
            {
               if(equipo.getValue().getMejorJugador().getPuntuacion() > jugadorTop.getPuntuacion())
                {
                    jugadorTop = equipo.getValue().getMejorJugador();
                } 
            }
            
        }
        
        return jugadorTop;
    }
    
    
    public HashMap<String, Integer> getEstadisticasPorNivel()
    {
        HashMap<String, Integer> jugadores = new HashMap<>();
        jugadores.put("ORO", 0);
        jugadores.put("PLATA", 0);
        jugadores.put("BRONCE", 0);
        for(HashMap.Entry<String, Equipo> equipo : equipos.entrySet())
        {
            for (Jugador j : equipo.getValue().getJugadores()) 
            {
                switch(j.getNivel())
                {
                    case "BRONCE" -> jugadores.put("BRONCE", jugadores.get("BRONCE") + 1);
                    case "PLATA" -> jugadores.put("PLATA", jugadores.get("PLATA") + 1);
                    case "ORO" -> jugadores.put("ORO", jugadores.get("ORO") + 1);
                }
            }
        }
        return jugadores;
    }
    
    private Equipo getEquipoMasCercaDe(Equipo e)
    {
        if(e == null)
        {
            System.out.println("hola");
            return null;
        }
        Equipo eDebajo = null;
        Equipo resultado = null;
        
        for(HashMap.Entry<String, Equipo> equipo : equipos.entrySet())
        {
            if(!equipo.getValue().getNombre().equals(e.getNombre()))
            {
                if(eDebajo == null)
                {
                    eDebajo = equipo.getValue();
                }
                else
                {
                    if(e.getPuntuacionTotal() > equipo.getValue().getPuntuacionTotal())
                    {
                        eDebajo = equipo.getValue();
                        if(resultado == null)
                        {
                            resultado = eDebajo;
                        }
                        else
                        {
                            if(eDebajo.getPuntuacionTotal() > resultado.getPuntuacionTotal())
                            {
                                resultado = eDebajo;
                            }
                        }
                        
                    }
                }
                
            }
        }
        
        return resultado;
    }
    
    public void mostrarClasificacion()
    {
        System.out.println("========================================");
        System.out.println("   CLASIFICACIÓN - Torneo " + nombre);
        System.out.println("========================================");
        
        int contador = 1;
        Equipo mejor = getEquipoCampeon();
        System.out.printf("#%d %-20s %10d pts %n", contador, mejor, mejor.getPuntuacionTotal());
        System.out.printf("%18s [%s] %s - %s pts %n", "Mejor Jugador: ", mejor.getMejorJugador().getNivel(), mejor.getMejorJugador().getNombre(), mejor.getMejorJugador().getPuntuacion());
        Equipo siguiente = getEquipoMasCercaDe(mejor);
        
        for(int i = 0; i < equipos.size(); i++)
        {
            if(siguiente != null)
            {
                contador++;
                System.out.printf("#%d %-20s %10d pts %n", contador, siguiente, siguiente.getPuntuacionTotal());
                System.out.printf("%18s [%s] %s - %s pts %n", "Mejor Jugador: ", siguiente.getMejorJugador().getNivel(), siguiente.getMejorJugador().getNombre(), siguiente.getMejorJugador().getPuntuacion());
                siguiente = getEquipoMasCercaDe(siguiente);
            }
        }
        siguiente = getEquipoUltimo();
        System.out.printf("#%d %-20s %10d pts %n", contador + 1, siguiente, siguiente.getPuntuacionTotal());
        System.out.printf("%18s [%s] %s - %s pts %n", "Mejor Jugador: ", siguiente.getMejorJugador().getNivel(), siguiente.getMejorJugador().getNombre(), siguiente.getMejorJugador().getPuntuacion());
    }
}
