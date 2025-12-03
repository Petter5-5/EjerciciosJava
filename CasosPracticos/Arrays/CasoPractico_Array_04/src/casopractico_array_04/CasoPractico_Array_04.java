package casopractico_array_04;
public class CasoPractico_Array_04 
{
    
    public static void buscador(String[] array, char letra)
    {
        boolean flag = false;
        
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i].toLowerCase();
            if (array[i].charAt(0) == letra)
            {
                System.out.println("Esta palabra empieza por L : " + array[i]);
                flag = true;
            }
        }
        if(!flag)
            System.out.println("No hay ninguna.");
    }
    
    public static void main(String[] args) 
    {
        String array[] = {"locura", "loca", "lolita", "lopez", "alvaro", "alvaricoque"};
        char letra = 'l';
        
        System.out.println("Palabras que empiezan con la letra L : ");
        buscador(array, letra);
    }
}
