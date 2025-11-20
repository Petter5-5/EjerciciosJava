package ejercicio5_1_11;
public class Ejercicio5_1_11 
{
    
    public static int comportamiento(int num1, int num2)
    {
        int resultado;
        
        if(num1 > num2)
            resultado = 1;
        else if (num1 < num2)
            resultado = -1;
        else
            resultado = 0;
        
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        int num1 = 34, num2 = 3;
        
        System.out.println(comportamiento(num1, num2));
    }
}
