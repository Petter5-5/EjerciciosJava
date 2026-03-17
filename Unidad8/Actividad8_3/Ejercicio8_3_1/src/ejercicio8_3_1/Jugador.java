package ejercicio8_3_1;

public class Jugador 
{
    private String nombre;
    private int puntuacion;
    private String nivel;

    public Jugador(String nombre, int puntuacion, String nivel) 
    {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return "[" + nivel + "] " + nombre + " - " + puntuacion + "pts"; 
    }

}
