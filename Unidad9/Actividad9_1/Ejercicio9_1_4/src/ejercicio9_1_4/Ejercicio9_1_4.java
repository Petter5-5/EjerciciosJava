package ejercicio9_1_4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio9_1_4 
{
    public static void main(String[] args) 
    {
        String fichero = "numeros.txt";
        int max = Integer.MIN_VALUE;
        boolean hayNumeros = false;
        
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) 
        {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                if(linea.isEmpty()) continue;
                int numero = Integer.parseInt(linea);
                if(numero > max){
                    max = numero;
                }
                hayNumeros = true;
            }
            if(hayNumeros){
                System.out.println("El valor máximo es: " + max);
            }else{
                System.out.println("El fichero está vacío.");
            }
                
            
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
