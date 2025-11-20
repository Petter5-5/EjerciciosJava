package ejercicio5_1_1;
public class Ejercicio5_1_1 
{
    public static String correcion(String nombre)
    {
        String resultado = "";
        
        for (int i = 0; i < nombre.length(); i++)
        {
            nombre = nombre.toLowerCase();
            if (i == 0)
                nombre = nombre.toUpperCase();
            resultado += nombre.charAt(i);
        }
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        String nombre = "mariA";
        System.out.println(correcion(nombre));
    }
}
