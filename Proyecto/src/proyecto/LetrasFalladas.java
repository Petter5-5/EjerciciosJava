package proyecto;

import java.util.Arrays;

public class LetrasFalladas 
{
    public static int letrasFalladas (char letraAdv, char[] letras, int fallos, char[] letrasFalladas) {
      int contador = 0; //contador de aciertos
      
      for (int i = 0; i < letras.length; i++) 
      {
        if (letraAdv == letras[i]) 
        {
          contador++; //cuenta si esa letra está alguna vez en la palabra
        }
    }
      if (contador == 0) 
      {
        contador = 1; //reutilizo la variable haciendo que si no ha contado ninguna letra en comun, sume un fallo 
        letrasFalladas[fallos] = letraAdv; //Mete en el array de fallos la letra que ha fallado
      } 
      else 
      {
        contador = 0; //si la letra si estaba en la palabra, no se sumaran fallos
      }
      String RED = "\u001B[31m";
      String RESET = "\u001B[0m";
      System.out.println("FALLADAS: " + RED + Arrays.toString(letrasFalladas) + RESET); //Imprime cuantas letras has fallado
      return contador;
    }
    
    public static int Ejecutor(char[] letras, char[] letrasFalladas, char letraAdv, int fallos, int vidas) 
    {
      //Array que tiene las letras que no están en la palabra
      fallos += letrasFalladas(letraAdv, letras, fallos, letrasFalladas);
      vidas = vidas - fallos;
      System.out.println("VIDAS: " + vidas + "/6");
      return fallos;
    }
}
