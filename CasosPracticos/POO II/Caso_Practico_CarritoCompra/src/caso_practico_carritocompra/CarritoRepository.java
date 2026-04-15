package caso_practico_carritocompra;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class CarritoRepository {
    
    public static void guardar(Carrito carrito, String fichero){
        try (ObjectOutputStream oos = new ObjectOutputStream(
                                       new FileOutputStream(fichero))) {

            oos.writeObject(carrito);
            System.out.println("Carrito guardado correctamente.");

        } catch (IOException e) {
            System.err.println("Error al serializar: " + e.getMessage());
        }
    }
    
    public static Carrito recuperar(String fichero){
        Carrito carrito = null;
        
        try (ObjectInputStream ois = new ObjectInputStream(
                                      new FileInputStream(fichero))) {

            carrito = (Carrito) ois.readObject();

            System.out.println("Carrito recuperado del fichero:");

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
        
        return carrito;
    }
}
