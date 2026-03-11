package caso_practico_sistemahotel;

public class HabitacionNoExisteException extends RuntimeException
{

    public HabitacionNoExisteException(int numeroHabitacion) 
    {
        super("Numero de habitacion: " + numeroHabitacion + " no existe");
    }
}
