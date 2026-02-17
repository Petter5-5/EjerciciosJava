package ejercicio8_1_3;

public class Autobus extends Transporte 
{
    private int paradas;
    
    public Autobus(String id, double velocidad, int paradas)
    {
        super(id, velocidad);
        this.paradas = paradas;
    }
    
    @Override
    public double calcularTiempo(double distanciaKm)
    {
        return super.calcularTiempo(distanciaKm) + paradas * 2;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " Numero paradas = " + paradas;
    }
}
