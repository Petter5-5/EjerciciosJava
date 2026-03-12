package ecaperoom_hashmap;

public class Saboteador extends Personaje
{

    public Saboteador(String nombre, int nivel, int codigoBase) {
        super(nombre, nivel, codigoBase);
    }
    
    @Override
    public int calcularAporte() {
       return getCodigoBase() - getNivel();
    }
}
