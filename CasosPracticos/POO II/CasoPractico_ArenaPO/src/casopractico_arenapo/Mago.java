package casopractico_arenapo;

public final class Mago extends Personaje
{
    public Mago(String nombre, int poder, int salud)
    {
        super(nombre, poder, salud);
    }
    
    @Override
    public void atacar(Personaje objetivo)
    {
        System.out.printf("¡¡¡ %s lanza bola de fuego mágica a %s !!! %n", this.getNombre(), objetivo .getNombre());
        objetivo.setSalud(objetivo.getSalud() - (this.getPoder() + 10));
    }
}
