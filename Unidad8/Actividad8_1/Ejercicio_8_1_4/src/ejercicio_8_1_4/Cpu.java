package ejercicio_8_1_4;

public class Cpu 
{
    private String modelo;
    private double velocidad;
    
    public Cpu(String modelo, double velocidad)
    {
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Cpu{" + "modelo=" + modelo + ", velocidad=" + velocidad + '}';
    }
}
