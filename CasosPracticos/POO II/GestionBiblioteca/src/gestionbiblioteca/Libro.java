package gestionbiblioteca;

public class Libro 
{
    private String titulo;
    private String autor;
    private int anio;
    private boolean prestado;

    public Libro(String titulo, String autor, int anio, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public boolean isPrestado() {
        return prestado;
    }

    @Override
    public String toString() {
        return getTitulo() + ";" + getAutor() + ";" +getAnio() + ";" + isPrestado();
    }
}
