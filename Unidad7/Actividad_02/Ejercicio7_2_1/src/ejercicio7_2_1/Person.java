package ejercicio7_2_1;

public class Person 
{
    private String nombre;
    private String direccion;
    
    public Person(String nombre, String direccion)
    {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    @Override
    public String toString()
    {
        return nombre + "" + "\n  " + direccion;
    }
}
