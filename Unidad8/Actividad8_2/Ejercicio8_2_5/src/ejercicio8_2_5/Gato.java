package ejercicio8_2_5;

public class Gato 
{
    private String nombre;
    private int edad;
    
    public Gato(String nombre, int edad)
    {
        if(nombre.length() < 3)
        {
            throw new NombreNoValidoException(nombre);
        }
        else
        {
            this.nombre = nombre;
        }
        if(edad < 0)
        {
            throw new EdadNoValidaException(edad);
        }
        else
        {
            this.edad = edad;
        }
    }

    @Override
    public String toString() {
        return "Gato{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}
