package casopractica_array_02;
public class CasoPractica_Array_02 
{
    
    public static int buscador (int[] array, int buscar)
    {
        int resultado = 0;
        for(int i = 0; i < array.length; i++)
        {
            if (array[i] == buscar)
                resultado++;
        }
        
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        int[] array = {3, 4, 5, 6, 7, 8, 8, 2, 3, 8, 8};
        int buscar = 8;
        
        System.out.printf("El numero %d se repite %d %n", buscar, buscador(array, buscar));
    }
}
