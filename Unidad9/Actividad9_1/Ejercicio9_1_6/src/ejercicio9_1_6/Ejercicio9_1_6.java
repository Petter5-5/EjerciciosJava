package ejercicio9_1_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio9_1_6 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos nombres: ");
        int numeroNombres = sc.nextInt();
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("personas.txt"))) {

            String conteido_nombre = new String(Files.readAllBytes(Path.of("usa_nombres.txt"))); //lo convierto todo a String
            String contenido_apellido = new String(Files.readAllBytes(Path.of("usa_apellidos.txt")));
            

            String[] nombres = conteido_nombre.split("\\n"); // lo paso a un array con el tamaño del .txt separado por los enters
            String[] apellidos = contenido_apellido.split("\\n");
            for(int i = 0; i < numeroNombres; i++){
                int randN =(int)(Math.random() * nombres.length); 
                int randA =(int)(Math.random() * apellidos.length); 
                bw.write(nombres[randN] + " " + apellidos[randA]);
                bw.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al procesar el fichero: " + e.getMessage());
        }
    }
    
    
}
