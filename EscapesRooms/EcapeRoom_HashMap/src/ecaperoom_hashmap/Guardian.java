package ecaperoom_hashmap;

public class Guardian extends Personaje
{

    public Guardian(String nombre, int nivel, int codigoBase) {
        super(nombre, nivel, codigoBase);
    }
    
    @Override
    public int calcularAporte() {
       return getCodigoBase() + getNivel();
    }
}
