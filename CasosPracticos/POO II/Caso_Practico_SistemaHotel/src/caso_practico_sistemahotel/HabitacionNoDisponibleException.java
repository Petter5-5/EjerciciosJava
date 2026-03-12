package caso_practico_sistemahotel;

public class HabitacionNoDisponibleException extends RuntimeException
{

    public HabitacionNoDisponibleException(int numeroHabitacion)
    {
        super("❌ La habitación " + numeroHabitacion + " ya está ocupada.");
    }
    
}
