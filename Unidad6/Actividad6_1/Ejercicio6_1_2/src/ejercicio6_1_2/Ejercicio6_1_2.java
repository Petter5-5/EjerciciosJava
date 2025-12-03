package ejercicio6_1_2;
public class Ejercicio6_1_2 
{
    public static void grafica(int[] temperatura, String[] año)
    {
        
        for(int i = 0; i < temperatura.length; i++)
        {
            System.out.printf("%10s |", año[i]);
            for(int j = 0; j <= temperatura[i]; j++)
            {
                System.out.print("=");
            }
            System.out.printf(" %dºC", temperatura[i]);
            System.out.println("");
        }
    }
    
    public static void main(String[] args) 
    {
        int[] temperatura = {6, 10, 15, 20, 24, 30, 35, 36, 31, 21, 12, 7};
        String[] año = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        grafica(temperatura, año);
    }
}
