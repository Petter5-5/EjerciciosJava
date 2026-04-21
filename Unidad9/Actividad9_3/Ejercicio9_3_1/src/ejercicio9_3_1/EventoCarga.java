package ejercicio9_3_1;

public class EventoCarga extends Evento{
    private String nombreActivo;
    private double tamanoMB;

    public EventoCarga(String nombreActivo, double tamanoMB) {
        this.nombreActivo = nombreActivo;
        this.tamanoMB = tamanoMB;
    }

    public String getNombreActivo() {
        return nombreActivo;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }
    
    
}
