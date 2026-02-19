package gestion_de_flota_de_emergencias;

public class Ambulancia extends Vehiculo implements Emergencia
{
    private String tipoServicio;
    
    public Ambulancia(String matricula, int velocidadMax, String tipoServicio)
    {
        super(matricula, velocidadMax);
        this.tipoServicio = tipoServicio;
    }

    @Override
    public void mostrarInfo() 
    {
        System.out.println("Ambulancia - Matrícula: " + this.getMatricula() + " - Tipo Servicio: " + tipoServicio);
    }

    @Override
    public void activarSirena() 
    {
        System.out.println("Ambulancia: Sirena activada - UUUH UUH");
    }

    @Override
    public void desactivarSirena() 
    {
        System.out.println("Ambulancia: Sirena desactivada...");
    }
    
}
