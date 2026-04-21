package ejercicio9_2_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio9_2_1 
{
    public static void main(String[] args) 
    {
        Equipo eq = new Equipo("FC Ejemplo", "Pep Gomez");
        Jugador j1 = new Jugador("Carlos Ruiz", "Portero", 1);
        Jugador j2 = new Jugador("Mario Lopes", "Defensa", 4);
        Jugador j3 = new Jugador("Ivan Roca", "Centrocampista", 8);
        Jugador j4 = new Jugador("Luis Vera", "Delantero", 9);
        
        eq.fichar(j1);
        eq.fichar(j2);
        eq.fichar(j3);
        eq.fichar(j4);
        System.out.println("=== PLANTILLA INICIAL ===");
        eq.mostrar();
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                                       new FileOutputStream("equipo.dat"))) {

            oos.writeObject(eq);
            System.out.println("Equipo guardado correctamente.");

        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
        
       
        Equipo equipoRecuperado = null;
        
        
        try (ObjectInputStream ois = new ObjectInputStream(
                                      new FileInputStream("equipo.dat"))) {
            equipoRecuperado = (Equipo) ois.readObject();
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
        Jugador j5 = new Jugador("Ahmed Nouri", "Centrocampista", 10);
        Jugador j6 = new Jugador("Bruno Silva", "Delantero", 11);
        
        equipoRecuperado.cambiarEntrenador("Pep Gomez");
        equipoRecuperado.fichar(j5);
        equipoRecuperado.fichar(j6);
        
        System.out.println("");
        System.out.println("-- Mercado de verano --");
        System.out.println("Nuevo entrenador: " + equipoRecuperado.getEntrenador());
        System.out.print(j5);
        System.out.print(j6);
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                                       new FileOutputStream("equipo.dat"))) {

            oos.writeObject(equipoRecuperado);
            System.out.println("Equipo guardado correctamente.");

        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
        
        System.out.println("");
        System.out.println("=== PLANTILLA FINAL ===");
        try (ObjectInputStream ois = new ObjectInputStream(
                                      new FileInputStream("equipo.dat"))) {
            Equipo equipoFinal = (Equipo) ois.readObject();
            equipoFinal.mostrar();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
    }
}