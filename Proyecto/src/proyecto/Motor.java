package proyecto;

import java.util.Arrays;

public class Motor {
    public static char[] rellenar(String palabra)
    {
        char[] letras = new char[palabra.length()];
      
      for (int i = 0; i < palabra.length(); i++) { //Descompone la palabra en letras en un array
        letras[i] = palabra.charAt(i);
      }
      
      return letras;
    }
    
    public static char[] revelador(char[] letras)
    {
      char[] revelado = new char[letras.length];
      Arrays.fill(revelado, '_');
      return revelado;
    }
    
    public static String laPalabra(String[] palabras)
    {
        int n = (int) Math.random() * palabras.length;
        String palabra = palabras[n];//Elije que palabra va a ser
        return palabra;
    }
    
    public static String[] libreriaPalabras() 
    {
      String[] palabras = {"jirafa", "perro", "avestruz", "suricato", "gato", "mono"}; //Opciones de palabra
      
      return palabras;
    }
    
    public static void adivinar(char[] letras, char[] revelado, char letraAdv) {
      for (int i = 0; i < letras.length; i++) 
      {
        if (letraAdv == letras[i]) 
        {
          revelado[i] = letras[i]; //Revela el "_" y lo combierte en la letra que es
        }
        System.out.print(revelado[i] + " "); //Imprime la palabra
      }
    }
    
    public static boolean terminado(char[] revelador)
    {
        boolean terminado = true;
        
        for(int i = 0; i < revelador.length; i++)
        {
            if(revelador[i] == '_')
                terminado = false;
        }
        
        return terminado;
    }
}
