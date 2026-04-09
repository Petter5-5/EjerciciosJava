package gestionbiblioteca;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Biblioteca 
{
    private static ArrayList<Libro> biblio = new ArrayList<>();
    
    public static void guardaLibro(Libro libro, String fichero)
    {
        File biblioteca = new File(fichero);
        
        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(biblioteca, true)))) {
            pw.println(libro.toString());
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public static void cargarLibros(String fichero)
    {
        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) 
        {
            String linea;
            br.readLine();

            while ((linea = br.readLine()) != null) 
            {
                String[] campos = linea.split(";");
                String titulo = campos[0];
                String autor = campos[1];
                int anio = Integer.parseInt(campos[2]);
                boolean prestado = Boolean.parseBoolean(campos[3]);

                biblio.addLast(new Libro(titulo, autor, anio, prestado));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public static void mostrarLibros()
    {
        System.out.println("LIBROS DE LA BIBLIOTECA");
        System.out.println("----------------");
        for(Libro l : biblio)
        {
            System.out.printf("Título: %s | Autor: %s | Año: %d %n", l.getTitulo(), l.getAutor(), l.getAnio());
        }
    }
    
    public static void mostrarLibrosPrestados()
    {
        System.out.println("LIBROS PRESTADOS");
        System.out.println("----------------");
        for(Libro l : biblio)
        {
            if(l.isPrestado())
            {
                System.out.printf("Título: %s %n", l.getTitulo());
            }
        }
    }
    
    public static void borrarBiblioteca(String fichero)
    {
        File biblioteca = new File(fichero);
        
        if(biblioteca.exists())
        {
            if(biblioteca.delete())
            {
                System.out.println("Fichero borrado correctamente");
            }
        }
    }
}
