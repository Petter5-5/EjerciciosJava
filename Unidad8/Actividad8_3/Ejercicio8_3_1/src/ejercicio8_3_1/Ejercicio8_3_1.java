package ejercicio8_3_1;

import java.util.HashMap;

public class Ejercicio8_3_1 
{
    public static void main(String[] args) 
    {
        //Paso 1 — Crea los jugadores
        Jugador jugador1 = new Jugador("Carlos", 1250, "ORO");
        Jugador jugador2 = new Jugador("Laura", 1100, "ORO");
        Jugador jugador3 = new Jugador("Marcos", 780, "PLATA");
        Jugador jugador4 = new Jugador("Sofia", 640, "PLATA");
        Jugador jugador5 = new Jugador("Ryu", 920, "ORO");
        Jugador jugador6 = new Jugador("Nadia", 430, "BRONCE");
        Jugador jugador7 = new Jugador("Tomas", 310, "BRONCE");
        Jugador jugador8 = new Jugador("Elena", 870, "PLATA");
        Jugador jugador9 = new Jugador("Kira", 560, "BRONCE");
        Jugador jugador10 = new Jugador("Dani", 990, "ORO");
        
        //Paso 2 — Crea los equipos y añade jugadores
        Equipo equipo1 = new Equipo("Los Invictos");
        equipo1.añadirJugador(jugador1);
        equipo1.añadirJugador(jugador5);
        equipo1.añadirJugador(jugador8);
        equipo1.añadirJugador(jugador3);
        
        Equipo equipo2 = new Equipo("Team Alpha");
        equipo2.añadirJugador(jugador2);
        equipo2.añadirJugador(jugador10);
        equipo2.añadirJugador(jugador4);
        equipo2.añadirJugador(jugador9);
        
        Equipo equipo3 = new Equipo("Dragons");
        equipo3.añadirJugador(jugador6);
        equipo3.añadirJugador(jugador7);
        
        //Paso 3 — Crea el torneo y registra los equipos
        Torneo torneo = new Torneo("Verano");
        torneo.registrarEquipo(equipo1);
        torneo.registrarEquipo(equipo2);
        torneo.registrarEquipo(equipo3);
        
        //Paso 4 — Muestra la clasificación
        torneo.mostrarClasificacion();
        System.out.println("");
        
        //Paso 5 — Estadísticas
        System.out.println("\u001B[1mEl equipo campeón y su puntuación total\u001B[0m");
        System.out.printf("%s %d pts %n", torneo.getEquipoCampeon(), torneo.getEquipoCampeon().getPuntuacionTotal());
        System.out.println("");
        
        System.out.println("\u001B[1mEl mejor jugador del torneo\u001B[0m");
        System.out.printf("%s %n", torneo.getMejorJugadorDelTorneo());
        System.out.println("");
        
        System.out.println("\u001B[1mLos equipos que superan 2.000 puntos totales\u001B[0m");
        torneo.getEquipoPorEncimaDe(2000).forEach(e -> System.out.printf("%s %d pts %n", e, e.getPuntuacionTotal()));
        System.out.println("");
        
        System.out.println("\u001B[1mCuántos jugadores hay de cada nivel (usa getEstadisticasPorNivel())\u001B[0m");
        for(HashMap.Entry<String, Integer> estadistica : torneo.getEstadisticasPorNivel().entrySet())
        {
            System.out.printf("%s - %d %n", estadistica.getKey(), estadistica.getValue());
        }
        
        //Paso 6 — Eliminar un equipo
        torneo.eliminarEquipo("Dragons");
        
    }
}
