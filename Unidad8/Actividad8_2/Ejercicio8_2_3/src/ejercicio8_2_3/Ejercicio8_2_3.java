package ejercicio8_2_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio8_2_3 
{
    
    public static void main(String[] args) 
    {     
        Scanner sc = new Scanner(System.in);
        
        HashMap<String, Integer> almacen = new HashMap<>();
        String frase;
        
        System.out.print("Frase: ");
        frase = sc.nextLine();
        
        String[] palabras = frase.split(" ");
        
        for(String p : palabras)
        {
            if(almacen.containsKey(p))
                almacen.put(p, almacen.get(p) + 1);
            else
                almacen.put(p, 1);
        }
        
        System.out.println(" ----------------------");
        System.out.println("| RECUENTO DE PALABRAS |");
        System.out.println(" ----------------------");
        
        for(Map.Entry<String, Integer> palabra : almacen.entrySet())
        {
            if(palabra.getValue() == 1)
                System.out.println(palabra.getKey() + " aparece " + palabra.getValue() + " vez.");
            else
                System.out.println(palabra.getKey() + " aparece " + palabra.getValue() + " veces.");
        }
    }
}
