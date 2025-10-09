package ejercicio2_2_9;
public class Ejercicio2_2_9 
{
    public static void main(String[] args) 
    {
        double altura = 137;
        double base = 227;
        System.out.println("La altura de la piramide (metros): " + altura);
        System.out.println("La longitud del lado de la base (netros): " + 277);
        System.out.println("Volumen de la piramide: " + (base * base * altura) / 3);
        double piscinas = ((base * base * altura) / 3) / 2500;
        System.out.printf("Equivale aproximadamente a %.2f piscinas olimpicas%n", piscinas);
    }
}
