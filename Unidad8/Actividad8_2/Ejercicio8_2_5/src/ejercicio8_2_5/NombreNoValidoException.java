package ejercicio8_2_5;

public class NombreNoValidoException extends RuntimeException
{
    public NombreNoValidoException(String nombre)
    {
        System.out.println("El nombre " + nombre + " no es válido");
    }
}
