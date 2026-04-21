package ejercicio9_2_1;

import java.io.Serializable;
import java.util.ArrayList;


public class Equipo implements Serializable{
    
    private String nombre;
    private String entrenador;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, String entrenador) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }
            
    public void fichar(Jugador j){
        jugadores.add(j);
    }        
    
    public void cambiarEntrenador(String entrenador){
        this.entrenador = entrenador;
    }

    public String getEntrenador() {
        return entrenador;
    }
    
    public void mostrar(){
        System.out.println("Equipo: " + nombre + " | Entrenador: " + entrenador);
        for(Jugador j : jugadores){
            System.out.print(j);
        }
    }
}
