package ejercicio5_1_5;
public class Ejercicio5_1_5 
{
    
    public static String resultado (double nota)
    {
        String resultado;
        
        if (nota >= 5)
            resultado = "aprobado";
        else
            resultado = "suspenso";
        
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        double nota = 4.99;
        
        System.out.printf("Tienes un %s con un %.2f%n", resultado(nota), nota);
    }
}
