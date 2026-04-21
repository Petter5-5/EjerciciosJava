package ejercicio9_3_1;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;

public class Ejercicio9_3_1 
{
    public static void escrituraA(File ruta, Evento[] eventos){
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                               new FileOutputStream(ruta))) {
            oos.writeInt(eventos.length);
            for(Evento e : eventos){
                oos.writeObject(e);
            }
        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
    }
    
    public static void lecturaA(File ruta){
        int logins = 0;
        int errores = 0;
        double totalMB = 0;
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ruta))) {
            int contador = ois.readInt();
            
            for(int i = 0; i < contador; i++){
                Evento e = (Evento) ois.readObject();
                if(e instanceof EventoLogin eL){
                    System.out.println("[LOGIN] Usuario: " + eL.getNombreUsuario().toUpperCase());
                    logins++;
                }
                if(e instanceof EventoError eE){
                    System.out.println("[ERROR] ¡ALERTA! Codigo: [" + eE.getCodigoError() + "] - Descripción: " + eE.getDescripcion());
                    errores++;
                }
                if(e instanceof EventoCarga eC){
                    double libre = 1000 - eC.getTamanoMB();
                    System.out.println("[CARGA] Espacio libre: " + libre + " MB");
                    totalMB += eC.getTamanoMB();
                }
            }
            System.out.println("");
            System.out.println("INFORME FINAL: ");
            System.out.println("Logins: " + logins);
            System.out.println("Errores: " + errores);
            System.out.println("Datos procesados: " + totalMB + " MB");
        
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
    }
    
    public static void escrituraB(File ruta, Evento[] eventos){
        try (ObjectOutputStream oos = new ObjectOutputStream(
                               new FileOutputStream(ruta))) {
            for(Evento e : eventos){
                oos.writeObject(e);
            }
        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
    }
    
    public static void lecturaB(File ruta){
        int logins = 0;
        int errores = 0;
        double totalMB = 0;
        
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(ruta))) {
            while(true){
                Evento e = (Evento) ois.readObject();
                if(e instanceof EventoLogin eL){
                    System.out.println("[LOGIN] Usuario: " + eL.getNombreUsuario().toUpperCase());
                    logins++;
                }
                if(e instanceof EventoError eE){
                    System.out.println("[ERROR] ¡ALERTA! Codigo: [" + eE.getCodigoError() + "] - Descripción: " + eE.getDescripcion());
                    errores++;
                }
                if(e instanceof EventoCarga eC){
                    double libre = 1000 - eC.getTamanoMB();
                    System.out.println("[CARGA] Espacio libre: " + libre + " MB");
                    totalMB += eC.getTamanoMB();
                }
            }
        } catch (EOFException e) { //Nos permite saber cuadno el archivo a terminado cerrando el bucle while
            System.out.println("Fin del archivo");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
            System.out.println("");
            System.out.println("INFORME FINAL: ");
            System.out.println("Logins: " + logins);
            System.out.println("Errores: " + errores);
            System.out.println("Datos procesados: " + totalMB + " MB");
    }
    
    public static void main(String[] args) throws IOException 
    { 
        File ruta = new File("Evento.dat");
        
        try
        {
          ruta.createNewFile();
        }  
        catch (IOException e)
        {
          System.out.println(e.getMessage());
        }  
        
        Evento[] eventos = {
            new EventoLogin("admin_root"),
            new EventoError(500, "Fallo en disco"),
            new EventoCarga("manual.pdf", 12.4),
            new EventoLogin("gestor"),
            new EventoCarga("datos.zip",850)
        };
        
        //escrituraA(ruta, eventos);
        //lecturaA(ruta);
        escrituraB(ruta, eventos);
        lecturaB(ruta);
    }
}