package casopractico_array_03;
public class CasoPractico_Array_03 
{
    
    public static String palabraLarga(String[] palabras)
    {
        String palabraLarga = "hola";
        
        for(int i = 0; i < palabras.length; i++)
        {
            if(palabras[i].length() >= palabraLarga.length())
                palabraLarga = palabras[i];
        }
        
        return palabraLarga;
    }
    
    public static void main(String[] args) 
    {
        String[] palabras = {"Hola", "adios" ,"seudonimo", "encuentro", "locura"};
        
        System.out.println("La palabra mas larga del array es: " + palabraLarga(palabras));
    }   
}
