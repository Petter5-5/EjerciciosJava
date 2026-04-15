package caso_practico_carritocompra;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Caso_Practico_CarritoCompra 
{
    public static void main(String[] args) 
    {
        try (ObjectInputStream ois = new ObjectInputStream(
                                      new FileInputStream("alumnos.dat"))) {

            // Recuperamos la lista y hacemos un casting
            ArrayList<Alumno> alumnos = (ArrayList<Alumno>) ois.readObject();

            System.out.println("Alumnos recuperados del fichero:");
            for (Alumno a : alumnos) {
                System.out.println("  " + a);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
    
   
    }
}
