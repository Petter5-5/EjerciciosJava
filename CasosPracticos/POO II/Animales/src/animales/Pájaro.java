package animales;

public class Pájaro extends Animal
{
    private String color;
    
    public Pájaro(String nombre, String color)
    {
        super(nombre);
        this.color = color;
    }
    
    public void volar()
    {
        System.out.println("¡Pío! (nuevo)");
    }
    
    @Override
    public void comer()
    {
        System.out.println(getNombre() + " de " + color + " picoteando (@Override)");
    }
}
