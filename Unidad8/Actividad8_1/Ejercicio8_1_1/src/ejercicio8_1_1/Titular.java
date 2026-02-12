package ejercicio8_1_1;

public class Titular 
{
    private String nombre;
    private String dni;
    
    public Titular(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    @Override 
    public String toString()
    {
        return dni + " (" + nombre + ")";
    }
}
