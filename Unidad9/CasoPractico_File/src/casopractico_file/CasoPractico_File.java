package casopractico_file;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CasoPractico_File 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        File biblioteca = new File("biblioteca");
        File novela = new File("biblioteca\\novela");
        File ciencia  = new File("biblioteca\\ciencia");
        File poesia = new File("biblioteca\\poesia");
        File quijote = new File("biblioteca\\novela\\quijote.txt");
        File cien_años_soledad = new File("biblioteca\\novela\\cien_años_soledad.txt"); 
        File breve_historia_del_tiempo  = new File("biblioteca\\ciencia\\breve_historia_del_tiempo.txt");
        
        biblioteca.mkdir();
        novela.mkdir();
        ciencia.mkdir();
        poesia.mkdir();
        
        try
        {
            quijote.createNewFile();
            cien_años_soledad.createNewFile();
            breve_historia_del_tiempo.createNewFile();
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        
        File[] contenido = biblioteca.listFiles();
        if(contenido != null && contenido.length > 0)
        {
            for(File f : contenido)
            {
                if(f.isDirectory())
                {
                    File[] carpeta = f.listFiles();
                    System.out.println(f.getName().toUpperCase() + "( Libros " + carpeta.length +")");
                    if(carpeta != null && carpeta.length > 0)
                    {
                        for(File fi : carpeta)
                        {
                            System.out.printf("\t%s %n", fi.getName());
                        }
                    }
                }
            }
        }
        else
        {
            System.out.println("Carpeta vacia");
        }
        
        System.out.print("Nombre del libro (sin extensión): ");
        String nombre = sc.nextLine();
        String carpetaEncontrada = "";
        if(contenido != null && contenido.length > 0)
        {
            for(File f : contenido)
            {
                if(f.isDirectory())
                {
                    File[] carpeta = f.listFiles();
                    if(carpeta != null && carpeta.length > 0)
                    {
                        for(File fi : carpeta)
                        {
                            if(fi.getName().equals(nombre))
                            {
                                carpetaEncontrada = f.getName();
                            }
                        }
                    }
                }
            }
        }
        
        if(!carpetaEncontrada.equals(""))
        {
            System.out.println("Encontrado en: " + carpetaEncontrada);
        }
        else
        {
            System.out.println("El libro " + nombre + " no se ha encontrado");
        }
    }
}
