package ejercicio5_1_2;
public class Ejercicio5_1_2 
{
    
    public static double mediaAritmética(int n1, int n2, int n3)
    {
        return (n1 + n2 + n3) / 3;
    }
    
    public static void main(String[] args) 
    {
        int numero1 = 4, numero2 = 5, numero3 = 6;
        System.out.println("La media aritmética es: " + mediaAritmética(numero1, numero2, numero3));
    }
}
