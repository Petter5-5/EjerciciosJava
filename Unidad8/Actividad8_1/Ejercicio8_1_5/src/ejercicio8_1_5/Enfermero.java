package ejercicio8_1_5;

public class Enfermero extends Personal
{
    private String turno;
    
    public Enfermero(String nombre, int numeroEmpleado, int horasTrabajadas, double tarifaPorHora, String turno)
    {
        super(nombre, numeroEmpleado, horasTrabajadas, tarifaPorHora);
        this.turno = turno;
    }
    
    @Override
    public void atenderPaciente()
    {
        System.out.println("Enfermero/a " + nombre + " tomando constantes vitales del paciente (turno de " + turno + ")");
    }
    
    @Override
    public void realizarTareaEspecifica()
    {
        System.out.println("Administrando medicación y controlando signos vitales");
    }
    
    @Override
    public void ficharEntrada()
    {
        System.out.println(nombre + " ha fichado para el turno de " + turno);
    }
}
