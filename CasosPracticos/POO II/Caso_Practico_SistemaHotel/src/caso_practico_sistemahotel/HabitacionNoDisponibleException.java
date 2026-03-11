package caso_practico_sistemahotel;

public class HabitacionNoDisponibleException extends RuntimeException
{

    public HabitacionNoDisponibleException(int numeroHabitacion)
    {
        super("Numero de habitacion: " + numeroHabitacion + " no disponible");
    }
    
}
