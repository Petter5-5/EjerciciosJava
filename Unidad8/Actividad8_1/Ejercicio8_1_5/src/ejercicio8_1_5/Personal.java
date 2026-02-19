package ejercicio8_1_5;

public abstract class Personal 
{
    protected String nombre;
    protected int numeroEmpleado;
    protected int horasTrabajadas;
    protected double tarifaPorHora;
    
    public Personal(String nombre, int numeroEmpleado, int horasTrabajadas, double tarifaPorHora)
    {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    public final double calcularSalrio()
    {
        return horasTrabajadas * tarifaPorHora;
    }
    
    public void ficharEntrada()
    {
        System.out.println(nombre + " ha fichado a las 8:00");
    }
    
    public abstract void atenderPaciente();
    public abstract void realizarTareaEspecifica();

}
