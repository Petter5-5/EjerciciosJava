package ejercicio6_1_1;
public class Ejercicio6_1_1 
{
    
    public static void inicializar (int[] numero, int[] cuadrado, int[] cubo )
    {
        System.out.printf("%6s | %6s | %6s %n", "n", "n^2", "n^3");
        System.out.println("-------------------------");
        for(int i = 0; i < numero.length; i++)
        {
            numero[i] = (int) (Math.random()* 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
            System.out.printf("%6d | %6d | %6d %n", numero[i], cuadrado[i], cubo[i]);
        }
    }
    
    public static void main(String[] args) 
    {
        int[] numero = new int[5];
        int[] cuadrado = new int[5];
        int[] cubo = new int[5];
        
        inicializar(numero, cuadrado, cubo);
    }
}
