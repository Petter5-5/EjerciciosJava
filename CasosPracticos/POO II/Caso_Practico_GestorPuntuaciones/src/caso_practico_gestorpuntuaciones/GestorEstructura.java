package caso_practico_gestorpuntuaciones;

import java.io.File;
import java.io.IOException;

public class GestorEstructura 
{
    private static File arcade = new File("arcade");
    private static File historial = new File("arcade\\historial");
    private static File ranking = new File("arcade\\ranking");
    private static File partidas = new File("arcade\\historial\\partidas.txt");
    private static File top_jugadores = new File("arcade\\ranking\\top_jugadores.txt");
    
    public static void crearEstrutura()
    {
        
        if(!arcade.exists())
            arcade.mkdir();
        else
            System.out.println("La carpeta " + arcade.getName() + " ya existe");
        if(!historial.exists())
            historial.mkdir();
        else
            System.out.println("La carpeta " + historial.getName() + " ya existe");
        if(!ranking.exists())
            ranking.mkdir();
        else
            System.out.println("La carpeta " + ranking.getName() + " ya existe");
        
        try
        {
            partidas.createNewFile();
            top_jugadores.createNewFile();
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void mostrarMetadatos(String ruta)
    {
        File[] contenido = arcade.listFiles();
        File ficheroEncontrado = null;
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
                            if(fi.getName().equals(ruta))
                            {
                                ficheroEncontrado = fi;
                            }
                        }
                    }
                }
            }
        }
        
        if(ficheroEncontrado != null)
        {
            System.out.println("--- Metadatos ---");
            System.out.println("Fichero: " + ficheroEncontrado.getName());
            System.out.println("Tamaño: " + ficheroEncontrado.length() + " bytes");
            System.out.println("¿Existe? " + ficheroEncontrado.exists());
        }
        else
        {
            System.out.println("El fichero con la ruta " + ruta + " no ha sido encontrado");
        }
        
    }
}
