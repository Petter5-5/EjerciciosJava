package ejercicio9_1_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio9_1_3 
{
    public static void reemplazarPalabra(String rutaVieja, String rutaNueva,String palabraMal, String palabraBuena){
        
        //Mientra leemos el fichero viejo escribimos el fichero nuevo, en la instruccion de escribir utilizamos el metodo replaceAll;
        try (BufferedReader br = new BufferedReader(new FileReader(rutaVieja)); 
             BufferedWriter bw = new BufferedWriter(new FileWriter(rutaNueva))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea.replaceAll(palabraMal, palabraBuena));
                bw.newLine();
            }

            System.out.println("Fichero creado: " + rutaNueva);

        } catch (IOException e) {
            System.err.println("Error al procesar el fichero: " + e.getMessage());
        }
        
    }
    
    public static void main(String[] args) 
    {
        reemplazarPalabra("C:\\Users\\ytresan889\\Desktop\\DAM\\EjerciciosJava\\Unidad9\\Actividad9_1\\Ejercicio9_1_3\\Carptea\\viejo.txt", "C:\\Users\\ytresan889\\Desktop\\DAM\\EjerciciosJava\\Unidad9\\Actividad9_1\\Ejercicio9_1_3\\Carptea\\nuevo.txt", "la", "en");
    }
}
