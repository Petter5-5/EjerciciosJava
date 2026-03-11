package caso_practico_sistemahotel;

public class ReservaNoEncontradaException extends RuntimeException
{

    public ReservaNoEncontradaException(int numeroHabitacion) 
    {
     super("Numero de habitacion: " + numeroHabitacion + " no encontrada");   
    }
}
