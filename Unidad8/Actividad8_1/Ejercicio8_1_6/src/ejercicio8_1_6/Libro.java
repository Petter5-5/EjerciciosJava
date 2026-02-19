package ejercicio8_1_6;

public class Libro extends Publicacion implements Prestable
{
    private boolean prestado;
    
    public Libro(String codigo, String titulo, int anyo)
    {
        super(codigo, titulo, anyo);
        this.prestado = false;
    }

    @Override
    public void prestar() 
    {
        prestado = true;
    }

    @Override
    public void devolver() 
    {
        prestado = false;
    }

    @Override
    public boolean prestado() 
    {
        return prestado;
    }
     
}

