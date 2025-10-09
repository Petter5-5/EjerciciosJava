package ejercicio2_2_4;
public class Ejercicio2_2_4 
{
    public static void main(String[] args) 
    {
        float baseImponible = 22.75f;
        float iva = baseImponible * 0.21f;
        float total = baseImponible + iva;
        System.out.printf("Base imponible: %.2f%nIVA %.2f%n--------%nTotal: %.2f%n", baseImponible, iva, total);
    }
}
