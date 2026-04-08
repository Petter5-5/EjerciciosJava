package caso_practico_gestorpuntuaciones;

public class Partida implements Comparable<Partida>
{
    private String jugador;
    private int nivel;
    private int puntos;

    public Partida(String jugador, int nivel, int puntos) {
        this.jugador = jugador;
        this.nivel = nivel;
        this.puntos = puntos;
    }

    public String getJugador() {
        return jugador;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public int compareTo(Partida o) {
        int resultado;
        
        if(this.getPuntos() < o.getPuntos())
            resultado = 1;
        else if(this.getPuntos() > o.getPuntos())
            resultado = -1;
        else
            resultado = 0;
        
        return resultado;
    }
    
}
