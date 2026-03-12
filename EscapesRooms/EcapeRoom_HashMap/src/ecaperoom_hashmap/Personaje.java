package ecaperoom_hashmap;

public abstract class Personaje 
{
    private String nombre;
    private int nivel;
    private int codigoBase;

    public Personaje(String nombre, int nivel, int codigoBase) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.codigoBase = codigoBase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public int getCodigoBase() {
        return codigoBase;
    }
    
    
    
    public abstract int calcularAporte();
    
}
