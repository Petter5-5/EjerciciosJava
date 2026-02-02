package sistema_gestion_personaje_rgp;

public class Arma 
{
    enum TipoArma
    {
        ESPADA,
        ARCO,
        BASTON,
        DAGA
    }
    
    private TipoArma arma;
    private String nombre;
    private int bonoAtaque;
    private int durabilidad;
    
    public Arma(String nombre, TipoArma arma, int bonoAtaque)
    {
        this.nombre = nombre;
        this.arma = arma;
        this.bonoAtaque = bonoAtaque;
        this.durabilidad = 100;
    }
    
    public void usar()
    {
        this.durabilidad -= 10;
        if(this.durabilidad <= 0)
            System.out.printf("¡%s se ha roto!", this.nombre);
    }
    
    public void reparar()
    {
        this.durabilidad = 100;
    }
    
    public boolean estaRota()
    {
        boolean rota = true;
        if(this.durabilidad > 0)
            rota = false;
        return rota;
    }

    public String getNombre() {
        return nombre;
    }
}
