package casopractico2_array_2y3;
public class CasoPractico2_Array_2y3 
{
    
    public static int suma(String[] args)
    {
        int resultado = 0, numero;
        
        for(int i = args.length - 1; i >= 1; i--)
        {
            numero =  Integer.parseInt(args[i]);
            resultado += numero;
        }
        
        return resultado;
    }
    
    public static int maximo(String[] args)
    {
        int resultado = 0, numero;
        
        for(int i = args.length - 1; i >= 1; i--)
        {
            numero =  Integer.parseInt(args[i]);
            if(numero > resultado)
                resultado = numero;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        int resultado = 0;
        
        if("suma".equalsIgnoreCase(args[0]))
            resultado = suma(args);
        else if("maximo".equalsIgnoreCase(args[0]))
            resultado = maximo(args);
        
        System.out.println(resultado);
    }
}
