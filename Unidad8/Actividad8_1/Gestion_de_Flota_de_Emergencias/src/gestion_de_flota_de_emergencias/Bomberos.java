package gestion_de_flota_de_emergencias;

public class Bomberos extends Vehiculo implements Emergencia
{
    private int capacidadAgua;
    
    public Bomberos(String matricula, int velocidadMax, int capacidadAgua)
    {
        super(matricula, velocidadMax);
        this.capacidadAgua = capacidadAgua;
    }
    
    @Override
    public void mostrarInfo() 
    {
        System.out.println("Bomberos - Matrícula: " + this.getMatricula() + " - Capacidad: " + capacidadAgua + " litros");
    }

    @Override
    public void activarSirena() 
    {
        System.out.println("Bomberos: Sirena activada - NIINOO NIINOO");
    }

    @Override
    public void desactivarSirena() 
    {
        System.out.println("Bomberos: Sirena desactivada...");
    }
}
