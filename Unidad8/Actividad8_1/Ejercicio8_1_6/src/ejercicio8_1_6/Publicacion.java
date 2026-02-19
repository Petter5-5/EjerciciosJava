package ejercicio8_1_6;

public class Publicacion 
{
    private String codigo;
    private String titulo;
    private int anyo;
    
    public Publicacion(String codigo, String titulo, int anyo)
    {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyo = anyo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnyo() {
        return anyo;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo + '}';
    }
}
