package caso_practico_sistemahotel;

public class HabitacionNoExisteException extends RuntimeException
{

    public HabitacionNoExisteException(int numeroHabitacion) 
    {
        super("❌ La habitación " + numeroHabitacion + " no existe en este hotel.");
    }
}
