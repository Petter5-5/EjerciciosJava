package ecaperoom_hashmap;


public class Hacker extends Personaje
{

    public Hacker(String nombre, int nivel, int codigoBase) {
        super(nombre, nivel, codigoBase);
    }

    
    
    @Override
    public int calcularAporte() {
       return getCodigoBase() * getNivel();
    }
    
}
