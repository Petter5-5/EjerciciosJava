package casopractico_arenapo;

public class Guerrero extends Personaje
{
    public Guerrero(String nombre, int poder, int salud)
    {
        super(nombre, poder, salud);
    }
    
    @Override
    public void atacar(Personaje objetivo)
    {
        System.out.printf("¡¡¡ %s ataca a %s con la espada !!! %n", this.getNombre(), objetivo .getNombre());
        objetivo.setSalud(objetivo.getSalud() - this.getPoder() * 2);
    }
}
