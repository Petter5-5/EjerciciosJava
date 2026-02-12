package animales;

public class Animal 
{
    private String nombre;
    
    public Animal(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void comer()
    {
        System.out.println("El animal come");
    }
    
    public void dormir()
    {
        System.out.println(nombre + "durmiendo (heredado)");
    }

    public String getNombre() {
        return nombre;
    }
}
