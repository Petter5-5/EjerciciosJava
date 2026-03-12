package caso_practico_sistemahotel;

import java.util.ArrayList;

public class Hotel 
{
    ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public Hotel() 
    {
        habitaciones.add(new Habitacion(101));
        habitaciones.add(new Habitacion(102));
        habitaciones.add(new Habitacion(103));
        habitaciones.add(new Habitacion(104));
        habitaciones.add(new Habitacion(105));
    }

    public Habitacion buscarHabitacion(int numero)
    {
        boolean encontrada = false;
        int contador = 0;
        Habitacion h = null;
        
        while(!encontrada && contador < habitaciones.size())
        {
            if(habitaciones.get(contador).getNumero() == numero)
            {
                h = habitaciones.get(contador);
                encontrada = true;
            }
            contador++;
        }
        
        if(h == null)
        {
            throw new HabitacionNoExisteException(numero);
        }
        
        return h;
    }
    
    public void reservar(int numero)
    {
        Habitacion h = buscarHabitacion(numero);
        if(h.isOcupada())
        {
            throw new HabitacionNoDisponibleException(numero);
        }
        h.reserva();
        System.out.println("✅ Habitación " + numero + " reservada correctamente.");
    }
    
    public void cancelar(int numero)
    {
        Habitacion h = buscarHabitacion(numero);
        if(!h.isOcupada())
        {
            throw new ReservaNoEncontradaException(numero);
        }
        h.liberar();
        System.out.println("✅ Reserva de habitación " + numero + " cancelada correctamente.");
    }
    
    public void checkIn(int numero)
    {
        Habitacion h = buscarHabitacion(numero);
        if(!h.isOcupada())
        {
            throw new ReservaNoEncontradaException(numero);
        }
        System.out.println("✅ Check-in realizado en habitación " + numero + ". ¡Bienvenido!");
    }
}
