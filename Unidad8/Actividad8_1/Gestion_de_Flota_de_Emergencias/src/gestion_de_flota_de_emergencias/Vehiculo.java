package gestion_de_flota_de_emergencias;

public abstract class Vehiculo 
{
    private String matricula;
    private int velocidadMax;
    
    public Vehiculo(String matricula, int velocidadMax)
    {
        this.matricula = matricula;
        this.velocidadMax = velocidadMax;
    }
    
    public void acelerar()
    {
        System.out.println("Acelerando a " + velocidadMax + " km/h");
    }
    
    public abstract void mostrarInfo();

    public String getMatricula() {
        return matricula;
    }
 
}
