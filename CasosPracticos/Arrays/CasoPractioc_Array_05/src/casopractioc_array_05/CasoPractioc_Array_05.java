package casopractioc_array_05;
public class CasoPractioc_Array_05 
{
    
    public static int[] valoresMaximos(int[] array1, int[] array2)
    {
        int[] array3 = new int[array1.length];
        
        for(int i = 0; i < array1.length; i++)
        {
            if(array1[i] > array2[i])
                array3[i] = array1[i];
            else
                array3[i] = array2[i];
        }
        
        return array3;
    }
    
    public static void main(String[] args) 
    {
        int[] array1 = {2,3,5,8};
        int[] array2 = {3,4,2,1};
        int[] array3 = valoresMaximos(array1, array2);
        
        for (int i = 0; i < array3.length; i++)
        {
            System.out.printf("Indice %d tiene el valor %d %n", i, array3[i]);
        }
    }
}
