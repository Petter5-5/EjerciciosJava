package ejercicio8_1_3;

public class Transporte 
{
    private String id;
    private double velocidad;
    
    public Transporte(String id, double velocidad)
    {
        this.id = id;
        this.velocidad = velocidad;
    }
    
    public double calcularTiempo(double distanciaKm)
    {
        return Math.floor(distanciaKm / (velocidad * 60) * 100) / 100;
    }
    
    @Override
    public String toString()
    {
        return "ID: " + id + " Velocidad: " + velocidad;
    }
}
