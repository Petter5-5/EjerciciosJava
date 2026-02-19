package gestion_de_flota_de_emergencias;

public class Taxi extends Vehiculo
{
    private String numeroLicencia;
    
    public Taxi(String matricula, int velocidadMax, String numeroLicencia)
    {
        super(matricula, velocidadMax);
        this.numeroLicencia = numeroLicencia;
    }

    @Override
    public void mostrarInfo() 
    {
        System.out.println("Taxi - Matrícula: " + this.getMatricula() + " - Número de licencia: " + numeroLicencia);
    }
    
}
