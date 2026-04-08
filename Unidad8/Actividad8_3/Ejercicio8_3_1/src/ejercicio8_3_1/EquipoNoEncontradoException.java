package ejercicio8_3_1;

public class EquipoNoEncontradoException extends RuntimeException 
{
    public EquipoNoEncontradoException(String nombre)
    {
        System.out.println("Error: el quipo " + nombre + " no se ha encontrado");
    }
}
