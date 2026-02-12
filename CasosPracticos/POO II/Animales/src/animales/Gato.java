package animales;

public class Gato extends Animal
{
    private int vidas;
    
    public Gato(String nombre, int vidas)
    {
        super(nombre);
        this.vidas = vidas;
    }
    
    public void maullar()
    {
        System.out.println("¡Miau! (nuevo)");
    }
    
    @Override
    public void comer()
    {
        System.out.println(getNombre() + " de " + vidas + " vidas comiendo pescado (@Override)");
    }
}
