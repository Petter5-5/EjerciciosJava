package ejercicio8_1_6;

public class Revista extends Publicacion
{
    private int numero;
    
    public Revista(String codigo, String titulo, int anyo, int numero)
    {
        super(codigo, titulo, anyo);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString() + "Revista{" + "numero=" + numero + '}';
    }
}
