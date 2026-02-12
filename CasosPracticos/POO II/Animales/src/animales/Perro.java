package animales;


public class Perro extends Animal
{
    private String raza;
    
    public Perro(String nombre, String raza)
    {
        super(nombre);
        this.raza = raza;
    }
    
    public void ladra()
    {
        System.out.println("¡Guau! (nuevo)");
    }
    
    @Override
    public void comer()
    {
        System.out.println(getNombre() + " de raza " + raza + " comiendo croquetas (@Override)");
    }
}
