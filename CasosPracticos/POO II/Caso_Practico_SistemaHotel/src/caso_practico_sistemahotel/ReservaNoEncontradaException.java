package caso_practico_sistemahotel;

public class ReservaNoEncontradaException extends RuntimeException
{

    public ReservaNoEncontradaException(int numeroHabitacion) 
    {
     super("❌ La habitación " + numeroHabitacion + " no tiene ninguna reserva activa.");   
    }
}
