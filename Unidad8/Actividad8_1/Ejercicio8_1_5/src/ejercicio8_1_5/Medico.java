package ejercicio8_1_5;

public class Medico extends Personal 
{
    private String especializacion;
    
    public Medico(String nombre, int numeroEmpleado, int horasTrabajadas, double tarifaPorHora, String especializacion)
    {
        super(nombre, numeroEmpleado, horasTrabajadas, tarifaPorHora);
        this.especializacion = especializacion;
    }
    
    public void realizarCirugia()
    {
        System.out.println("Dr." + nombre + " realizando cirugía de " + especializacion);
    }
    
    @Override
    public void atenderPaciente()
    {
        System.out.println("Dr." + nombre + " (especialidad: " + especializacion + ") diagnosticando paciente..." );
    }
    
    @Override
    public void realizarTareaEspecifica()
    {
        System.out.println("Revisando historiales clínicos y recetando medicamentos");
    }
}
