package casopractico_arenapo;

public abstract class Personaje 
{
    private String nombre;
    private int poder;
    private int salud;

    public Personaje(String nombre, int poder, int salud)
    {
        this.nombre = nombre;
        this.poder = poder;
        this.salud = salud;
    }

    public final void presentarse()
    {
        System.out.println(nombre + " tiene poder: " + poder + " salud: " + salud);
    }

    public abstract void atacar(Personaje objetivo);

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getSalud() {
        return salud;
    }

    public int getPoder() {
        return poder;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
