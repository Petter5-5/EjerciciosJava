package ejercicio7_3_4;

public class Coche {
    public enum Modelo {IBIZA, ATECA, CUPRA}
    
    private String marca;
    private Modelo modelo;
    
    public Coche(String marca, Modelo modelo)
    {
        this.marca = "Seat";
        this.modelo = modelo;
    }
    
    public static Modelo aleatorio()
    {
        int numero = (int) (Math.random() * (Modelo.values().length));
        Modelo nombre = null;
        
        for(Modelo m : Modelo.values())
        {
            if(m.ordinal() == numero)
            {
                nombre = m;
            }
        }
        return nombre;
    }
    
    @Override
    public String toString()
    {
        return this.marca + " " + this.modelo;
    }
}
