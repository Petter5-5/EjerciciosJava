package ejercicio9_2_1;

import java.io.Serializable;

public class Jugador implements Serializable  {
    private String nombre;
    private String posicion;
    private int dorsal;

    public Jugador(String nombre, String posicion, int dorsal) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    @Override 
    public String toString() {
        return String.format("[%s] %-15s | %s %n", dorsal, posicion, nombre);
    }
}
