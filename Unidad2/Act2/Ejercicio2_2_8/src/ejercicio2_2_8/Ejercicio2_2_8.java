package ejercicio2_2_8;
public class Ejercicio2_2_8 
{
    public static void main(String[] args) 
    {
        double numero1 = 2;
        double numero2 = 3;
        System.out.println("Primer numero: " + numero1);
        System.out.println("Segundo numero: " + numero2);
        System.out.println("RESULTADO");
        System.out.println("---------");
        System.out.println("Dobel del primer numero: " + numero1 * 2);
        System.out.println("Mitad del segundo numero: " + numero2 / 2);
        System.out.println("Cuadrado de la suma de ambos numeros: " + (numero1 + numero2)*(numero1 + numero2));
        System.out.println("Decima parte de la suma de los cuadrados de ambos numeros: " + ((numero1 * numero1) + (numero2 * numero2)) / 10);    
    }
}
