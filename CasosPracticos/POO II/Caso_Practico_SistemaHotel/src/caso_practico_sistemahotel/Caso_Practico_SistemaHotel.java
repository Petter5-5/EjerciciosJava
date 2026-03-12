package caso_practico_sistemahotel;
public class Caso_Practico_SistemaHotel 
{
    public static void main(String[] args) 
    {
        Hotel hotel = new Hotel();
        
        int[] numero = {101, 102, 101, 103, 102, 999, 104};
        String[] operacion = {"reservar", "reservar", "reservar", "cancelar", "check-in", "reservar", "check-in"};
        
        for(int i = 0; i < numero.length; i++)
        {
            try{
                switch(operacion[i])
                {
                    case "reservar" -> hotel.reservar(numero[i]);
                    case "cancelar" -> hotel.cancelar(numero[i]);
                    case "check-in" -> hotel.checkIn(numero[i]);
                }
            }catch(HabitacionNoDisponibleException e)
            {
                System.out.println(e.getMessage());
            }catch(HabitacionNoExisteException e)
            {
                System.out.println(e.getMessage());
            }catch(ReservaNoEncontradaException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
