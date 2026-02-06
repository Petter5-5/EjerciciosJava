package ejercicio7_3_5;
public class Ejercicio7_3_5 
{
    public static void main(String[] args) 
    {
        Jugador jugador1 = new Jugador("Boromir", Jugador.Rango.SOLDADO, 50);
        Jugador jugador2 = new Jugador("Gandalf", Jugador.Rango.RECLUTA, 80);
        
        System.out.println(jugador1);
        System.out.println(jugador2);
        jugador1.combatir(jugador2);
        System.out.println("");
        System.out.println("El nuevo jugador fusionado es:");
        System.out.println(jugador1.fusionarCon(jugador2));
        
    }
}
