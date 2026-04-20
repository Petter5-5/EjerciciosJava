package ejercicio9_1_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio9_1_2 
{
    public static void buscarPalabras(String ruta, String palabra){
        int contador = 0;
        
         try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
                String[] palabras = linea.split("\\W+");//Esto nos permite separar todos los caracteres y dejar solo las palarbas sin poner las comas
                
                for(String p : palabras){
                    if(p.equalsIgnoreCase(palabra)){
                        contador++;
                    }
                }
            }
            
             System.out.println("La palabra " + palabra + " aparece un totla de -> " + contador);

        } catch (IOException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) 
    {
        buscarPalabras("C:\\Users\\ytresan889\\Desktop\\DAM\\EjerciciosJava\\Unidad9\\Actividad9_1\\Ejercicio9_1_2\\Carpeta\\primero.txt", "la");
    }
}
