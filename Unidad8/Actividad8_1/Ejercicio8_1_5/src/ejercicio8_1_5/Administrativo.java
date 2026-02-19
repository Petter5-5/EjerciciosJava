package ejercicio8_1_5;

public final class Administrativo extends Personal 
{
    private String departamente;
    
    public Administrativo(String nombre, int numeroEmpleado, int horasTrabajadas, double tarifaPorHora, String departamente)
    {
        super(nombre, numeroEmpleado, horasTrabajadas, tarifaPorHora);
        this.departamente = departamente;
    }
    
    @Override
    public void atenderPaciente()
    {
        System.out.println("Administrativo " + nombre + " gestionando documentación del paciente (" + departamente + ")");
    }
    
    @Override
    public void realizarTareaEspecifica()
    {
        System.out.println("Procesando formularios y actualizando base de datos");
    }
}
