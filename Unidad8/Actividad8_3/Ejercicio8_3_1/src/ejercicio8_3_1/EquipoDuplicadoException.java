package ejercicio8_3_1;

public class EquipoDuplicadoException extends RuntimeException
{
    public EquipoDuplicadoException(String nombre)
    {
        System.out.println("Error: el equipo " + nombre + " ya existe");
    }
}
