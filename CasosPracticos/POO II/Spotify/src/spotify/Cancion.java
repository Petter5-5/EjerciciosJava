package spotify;

public class Cancion 
{
    private String titulo;
    private String artista;
    
    public Cancion(String titulo, String artista)
    {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

     @Override
     public boolean equals(Object obj)
     {
        boolean resultado = false;
        if(obj instanceof Cancion)
        {
            Cancion otraCancion = (Cancion) obj;
            
            resultado = titulo.equals(otraCancion.titulo);
        }
        return resultado;
     }
    
    @Override
    public String toString() {
        return titulo + " - " + artista;
    }
}
