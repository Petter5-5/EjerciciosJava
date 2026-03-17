package ejercicio8_2_5;

public class EdadNoValidaException extends RuntimeException
{
    public EdadNoValidaException(int edad)
    {
        System.out.println("La edad " + edad + " no es válida");
    }
}
