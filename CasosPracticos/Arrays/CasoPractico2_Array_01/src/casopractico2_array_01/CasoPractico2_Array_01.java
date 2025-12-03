package casopractico2_array_01;
public class CasoPractico2_Array_01 
{
    public static void main(String[] args) 
    {
        int numero = 0, suma = 0;
        
        for(int i = args.length - 1; i >= 1; i--)
        {
            numero =  Integer.parseInt(args[i]);
            suma += numero;
        }
        System.out.println(suma);
    }
}
