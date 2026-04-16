package caso_practico_clienteveterinaria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Caso_Practico_ClienteVeterinaria 
{
    public static void main(String[] args) throws ClassNotFoundException 
    {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        String especie;
        int edad;
        int cantidad = 3;
        int cantidadCachorro = 0;
        
        System.out.println("LECTURA DE MASCOTAS");
        System.out.println("-------------------");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                                       new FileOutputStream("clinica.dat"))) {

                oos.writeObject(cantidad);
                for(int i = 0; i < cantidad; i++)
                {
                    System.out.print("Nombre de mascota: ");
                    nombre = sc.nextLine();
                    System.out.print("Especie: ");
                    especie = sc.nextLine();
                    System.out.print("Edad: ");
                    edad = sc.nextInt();
                    sc.nextLine();
                    System.out.println("");

                    oos.writeObject(new Mascota(nombre, especie, edad));
                }
            } catch (IOException e) {
                System.err.println("Error al serializar: " + e.getMessage());
            }
        
        //LECTURA
        System.out.println("MASCOTAS MENORES DE 5 AÑOS");
        System.out.println("--------------------------");
        try (ObjectInputStream ois = new ObjectInputStream(
                                new FileInputStream("clinica.dat"))) {

            int cantidad2 = (Integer) ois.readObject();
            Mascota mViejo = null; 
            for (int i = 0; i < cantidad2; i++) {
                Object obj = ois.readObject();
                if (obj instanceof Mascota m) {
                    if(m.getEdad() < 5)
                        System.out.println(m);
                    if(mViejo == null)
                        mViejo = m;
                    else if(mViejo.getEdad() < m.getEdad())
                        mViejo = m;
                    if(m.getEdad() <= 3){
                        cantidadCachorro++;
                    }
                    
            }
            
        }
            System.out.println("");
            System.out.println("MASCOTA MAS VIEJA");
            System.out.println("-----------------");
            System.out.println(mViejo);
            System.out.println("");
        }catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
        
        try (ObjectOutputStream oos = new ObjectOutputStream(
                                       new FileOutputStream("cachorro.dat"))) {

                    oos.writeObject(cantidadCachorro);
                    try (ObjectInputStream ois = new ObjectInputStream(
                                new FileInputStream("clinica.dat"))) {
                        int cantidad2 = (Integer) ois.readObject();
                        for (int i = 0; i < cantidad2; i++) {
                            Object obj = ois.readObject();
                            if (obj instanceof Mascota m) {
                                if(m.getEdad() <= 3)
                                    oos.writeObject(m);
                            }
                        }
                    }catch (IOException | ClassNotFoundException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                     
                } catch (IOException e) {
                    System.err.println("Error al serializar: " + e.getMessage());
                }
        
        try (ObjectInputStream ois = new ObjectInputStream(
                                new FileInputStream("cachorro.dat"))) {
            
            int cantidad3 = (Integer) ois.readObject();
            System.out.println("LOS CACHORROS");
            System.out.println("-------------");
            for (int i = 0; i < cantidad3; i++) {
                Object obj = ois.readObject();
                if (obj instanceof Mascota m) {
                    System.out.println(m);
                }
            }
            
        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
    }
}

