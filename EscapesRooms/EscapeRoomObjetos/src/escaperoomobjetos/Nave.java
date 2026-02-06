package escaperoomobjetos;

public class Nave {
    
    private String nombre;
    private String rol;
    private int poder;
    private int salud;
    
    public Nave(String nombre, String rol, int poder, int salud)
    {
        this.nombre = nombre;
        this.rol = rol;
        this.poder = poder;
            if(salud == -1)
                this.salud = 100;
            else
                this.salud = salud;
    }
    
    public Nave(int salud)
    {
        this("TARGET_DUMMY", "DUMMY", 0, salud);
    }
    
    public void atacar(Nave objetivo)
    {
        salud -= objetivo.poder;
    }
    
    public void reparar(Nave objetivo)
    {
        salud += objetivo.poder;
    }

    public int getSalud() {
        return salud;
    }
}
