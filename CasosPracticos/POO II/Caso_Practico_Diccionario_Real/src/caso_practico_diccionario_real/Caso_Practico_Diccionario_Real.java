package caso_practico_diccionario_real;

import java.util.HashMap;
import java.util.Scanner;

public class Caso_Practico_Diccionario_Real 
{
  
  public static void inicializar(HashMap<String, String> palabras)
  {
    palabras.put("mesa", "table");
    palabras.put("silla", "chair");
    palabras.put("casa", "house");
    palabras.put("agua", "water");
    palabras.put("fuego", "fire");
    palabras.put("comida", "food");
    palabras.put("libro", "book");
    palabras.put("escuela", "school");
    palabras.put("amigo", "friend");
    palabras.put("cielo", "sky");
  }
  
  public static boolean verificarRandom(int aleatorio, int[] repetido)
  {
      boolean resultado = false;
      int contador = 0;
      while(!resultado && contador < 5)
      {
                  if(repetido[contador] == aleatorio)
                  {
                      System.out.println("reptido");
                      resultado = true;
                  }
        contador++;     
      }
      
      return resultado;
  }
  
  public static int numeroRandom(int[] repetido)
  {
      int numero = 0;
      boolean hueco = false;
      int contador2 = 0;
      int aleatorio = (int) (Math.random()*10 + 1);
      
      if(!verificarRandom(aleatorio, repetido))
      {
          
          
          while(!hueco && contador2 < 5)
            {
                if(repetido[contador2] == 0)
                {
                    repetido[contador2] = aleatorio;
                    numero = aleatorio;
                    System.out.println("bien");
                    hueco = true;
                }
                contador2++;
            }
      }
      else
      {
          System.out.println("repetido");
          numeroRandom(repetido);
      }
      
      return numero;
  }
  
  public static String randomizador(HashMap<String, String> palabras, int[] repetido)
  {
      int numero = numeroRandom(repetido);
      for(int r : repetido)
      {
          System.out.println(r);
      }
      String clave = "";
      
      switch(numero)
      {
          case 1 -> clave = "mesa";  
          case 2 -> clave = "silla"; 
          case 3 -> clave = "casa"; 
          case 4 -> clave = "agua"; 
          case 5 -> clave = "fuego"; 
          case 6 -> clave = "comida"; 
          case 7 -> clave = "libro"; 
          case 8 -> clave = "escuela";
          case 9 -> clave = "amigo"; 
          case 10 -> clave = "cielo"; 
      }
      
      return clave;
  }
  
  public static boolean verificar(HashMap<String, String> palabras, String clave, String respuesta)
  {
      boolean resultado = false;
      for(HashMap.Entry<String, String> palabra: palabras.entrySet())
      {
          if(palabra.getValue().equals(respuesta))
          {
              resultado = true;
          }
          else
          {
              resultado = false;
          }
      }
      
      return resultado;
  }
  
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    HashMap<String, String> palabras = new HashMap<>();
    int[] repetido = new int[5];
    
    String clave = "";
    String respuesta = "";
    
    inicializar(palabras);
    
    for(int i = 0; i < 5; i++)
    {
        clave = randomizador(palabras, repetido);
        System.out.println("Pregunta " + i + ": Dime la traducción de " + clave);
        respuesta = sc.nextLine();
        if(verificar(palabras, clave, respuesta))
            System.out.println("Correcto");
        else
            System.out.println("Incorrecto");
        System.out.println("");
    }
  }
}
