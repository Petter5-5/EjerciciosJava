package ejercicio2_2_10;
public class Ejercicio2_2_10 
{
    public static void main(String[] args) 
    {
        int numero = 100;
        System.out.println("ANALISIS DE UN NUMERO");
        System.out.println("---------------------");
        System.out.println("Un numero entero: " + numero);
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("El numero es cero: " + (numero == 0 ? "true" : "false"));
        System.out.println("El numero es positivo: " + (numero >= 0 ? "true" : "false"));
        System.out.println("El numero es menor que 100: " + (numero < 100 ? "true" : "false"));
        System.out.println("El numero es par: " + (numero%2 == 0 ? "true" : "false"));
    }
}
