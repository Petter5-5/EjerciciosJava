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

    public void reservar(int numero)
    {
        boolean encontrada = false;
        int contador = 0;
        while(!encontrada && contador < habitaciones.size())
        {
            if(habitaciones.get(contador).getNumero() == numero)
            {
                habitaciones.get(contador).reserva();
                encontrada = true;
                System.out.println("✅ Habitación " + numero + " reservada correctamente.");
            }
            contador++;
        }
    }
    
    public void cancelar(int numero) // revisa este codigo
    {
        boolean encontrada = false;
        int contador = 0;
        while(!encontrada && contador < habitaciones.size())
        {
            if(habitaciones.get(contador).getNumero() == numero)
            {
                habitaciones.get(contador).reserva();
                encontrada = true;
                System.out.println("✅ Habitación " + numero + " reservada correctamente.");
            }
            contador++;
        }
    }
}
