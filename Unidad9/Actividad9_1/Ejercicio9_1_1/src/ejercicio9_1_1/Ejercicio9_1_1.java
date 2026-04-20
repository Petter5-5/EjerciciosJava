package ejercicio9_1_1;

import java.io.File;

public class Ejercicio9_1_1 
{
    public static void listarPorExtension(String ruta, String extension){
            File carpeta = new File(ruta);
            
            File[] archivos = carpeta.listFiles();
            
            if(archivos != null){
                for(File archivo : archivos){
                    if(archivo.isFile() && archivo.getName().endsWith(extension)){
                        System.out.println(archivo.getName());
                    }
                }
            }else{
                System.out.println("Los archivos no se pueden listar");
            }
            
        }
    
    public static void main(String[] args) 
    {
        listarPorExtension("C:\\Users\\ytresan889\\Desktop\\DAM\\EjerciciosJava\\Unidad9\\Actividad9_1\\Ejercicio9_1_1\\Prueba", ".txt");
    }
}
