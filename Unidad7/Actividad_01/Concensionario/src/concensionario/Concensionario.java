package concensionario;
public class Concensionario 
{
    public static void main(String[] args) 
    {
        Coche miCoche = new Coche("Seat", "Ateca", "Blanco", 234563, 0);
        
        //Devuelve la marca del coche
        System.out.println(miCoche.getMarca());
        
        //Acelero en 30km
        miCoche.acelerar(30);
        
        //Muestro ciertos datos del coche
        miCoche.mostrar();
    }
}
