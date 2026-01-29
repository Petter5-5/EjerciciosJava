package ejercicio7_3_4;
public class Ejercicio7_3_4 
{
    public static void main(String[] args) 
    {
        int longitud = 5;
        
        Coche[] flota = new Coche[longitud];
        
        for(int i = 0; i < longitud; i++)
        {
            flota[i] = new Coche("Seat", Coche.aleatorio());
            System.out.println(flota[i]);
        }
    }
}
