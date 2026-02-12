package animales;
public class Animales 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal("gusano");
        Perro perro = new Perro("Max", "pitbull");
        Gato gato = new Gato("Luna", 7);
        Pájaro pájaro = new Pájaro("Piolín", "Amarillo");
        
        System.out.println("=== PERRO ===");
        perro.comer();
        perro.dormir();
        perro.ladra();
        System.out.println("");
        
        System.out.println("=== GATO ===");
        gato.comer();
        gato.dormir();
        gato.maullar();
        System.out.println("");
        
        System.out.println("=== PÁJARO ===");
        pájaro.comer();
        pájaro.dormir();
        pájaro.volar();
        System.out.println("");
    }
}
