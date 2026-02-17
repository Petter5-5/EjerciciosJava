package ejercicio8_1_3;

public class Coche extends Transporte
{
    private double factorTrafico;
    
    public Coche(String id, double velocidad, double factorTrafico)
    {
        super(id, velocidad);
        this.factorTrafico = factorTrafico;
    }
    
    @Override
    public double calcularTiempo(double distanciaKm)
    {
        return super.calcularTiempo(distanciaKm) * (factorTrafico / 100 + 1);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "El facotr de tráfico es un " + factorTrafico + "%";
    }
}
