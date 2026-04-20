package ejercicio9_1_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9_1_5 
{
    public static void main(String[] args) 
    {
        
        
        try (BufferedReader br = new BufferedReader(new FileReader("alumnos_notas.txt"))) 
        {
            String linea;
            br.readLine();
            ArrayList<Alumno> alumnos = new ArrayList<>();
            while ((linea = br.readLine()) != null) 
            {
                int contador = 2;
                String[] campos = linea.split(" ");
                String nombre = campos[0];
                String apellido = campos[1];
                ArrayList<Integer> notas = new ArrayList<>();
                while(campos.length > contador){
                    notas.add(Integer.parseInt(campos[contador]));
                    contador++;
                }
                alumnos.add(new Alumno(nombre, apellido, notas));
                Collections.sort(alumnos);
            }
            for(Alumno a : alumnos){
                System.out.println(a);
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
