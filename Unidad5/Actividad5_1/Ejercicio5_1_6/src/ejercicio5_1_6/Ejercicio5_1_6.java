package ejercicio5_1_6;
public class Ejercicio5_1_6 
{
    
    public static String analisis(String texto)
    {
        String resultado;
        int vocales = 0, consonantes = 0, ASCII;
        
        texto = texto.toLowerCase();
        for (int i = 0; i < texto.length(); i++)
        {
            ASCII = texto.charAt(i);
            if(ASCII == 97 || ASCII == 101 || ASCII == 105 || ASCII == 111 || ASCII == 117)
                vocales++;
            else if (ASCII >= 97 && ASCII <= 122)
                consonantes++;
        }
        return resultado = "numero de vocales: " + vocales + " numero de consonates: " + consonantes;
    }
    
    public static void main(String[] args) 
    {
        String texto = "Hola que tal";
        
        System.out.println(analisis(texto));
    }
}
