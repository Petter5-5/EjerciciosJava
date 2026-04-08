package ejercicio8_3_1;

public class EquipoLlenoException extends RuntimeException
{
    public EquipoLlenoException(String nombre)
    {
        System.out.println("Error: el equipo " + nombre + " está lleno");
    }
}
