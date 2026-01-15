package ejercicio7_2_4;

public class Persona 
{
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString()
    {
        String texto = nombre + " " + apellidos + " con DNI " + dni;
        
            if(edad >= 18)
                texto += " es mayor de edad";
            else
                texto += " no es mayor de edad";
        
        return texto;
    }
}
