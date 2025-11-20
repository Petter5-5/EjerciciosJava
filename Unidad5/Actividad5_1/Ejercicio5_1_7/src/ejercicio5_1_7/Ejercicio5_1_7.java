package ejercicio5_1_7;
public class Ejercicio5_1_7 
{
    
    public static String siglas(String nombre)
    {
        String resultado = "";
        boolean espacio = false;
        
        resultado += nombre.charAt(0) + ". ";
        for (int i = 0; i < nombre.length(); i++)
        {
            if(nombre.charAt(i) != ' ' && espacio == true)
            {
                resultado += nombre.charAt(i) + ". ";
                espacio = false;
            }
            if(nombre.charAt(i) == ' ')
                espacio = true;
        }
        return resultado = resultado.toUpperCase();
    }
    
    public static void main(String[] args) 
    {
        String nombre = "Maria Jose Lopez";
        
        System.out.println(siglas(nombre));
    }
}
