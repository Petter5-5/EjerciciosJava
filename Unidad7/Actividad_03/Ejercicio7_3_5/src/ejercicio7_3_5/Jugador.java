package ejercicio7_3_5;

public class Jugador {
    enum Rango
        {
            RECLUTA, 
            SOLDADO, 
            VETERANO, 
            MAESTRO
        }
    
    private String nombre;
    private Rango rango;
    private int fuerza;
    
    public Jugador(String nombre, Rango rango, int fuerza)
    {
        this.nombre = nombre;
        this.rango = rango;
        this.fuerza = fuerza;
    }
    
    public void combatir(Jugador oponente)
    {
        if(this.rango.ordinal() > oponente.rango.ordinal())
            System.out.println("Gana  " + this.nombre);
        else if(oponente.rango.ordinal() > this.rango.ordinal())
            System.out.println("Gana " + oponente.nombre);
        else
        {
            if(this.fuerza > oponente.fuerza)
                System.out.println("Gana  " + this.nombre);
            else
                System.out.println("Gana " + oponente.nombre);
        }
    }
    
    public Jugador fusionarCon(Jugador compañero)
    {
        this.nombre = this.nombre.substring(0, 3) + compañero.nombre.substring(compañero.nombre.length() - 5, compañero.nombre.length());
        this.rango = this.rango.ordinal() > compañero.rango.ordinal() ? this.rango : compañero.rango;
        this.fuerza += compañero.fuerza;
        
        return this;
    }
    
    @Override
    public String toString()
    {
        return "Jugador{nombre=" + nombre + ", rango=" + rango + ", fuerza=" + fuerza + "}";
    }
}
