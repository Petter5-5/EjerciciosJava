package gestionbiblioteca;

public class GestionBiblioteca 
{
    public static void main(String[] args) 
    {
        Biblioteca.borrarBiblioteca("biblioteca.csv");
        
        Libro java = new Libro ("Java en Profundidad", "Mc-Graw", 2020, false);
        Libro python = new Libro ("Python básico", "Smith", 2021, true);
        Libro cpp = new Libro ("C++", "Norton", 2019, true);
        Libro c = new Libro ("C#", "Introducción a Unity", 2004, true);
        
        
        Biblioteca.guardaLibro(java, "biblioteca.csv");
        Biblioteca.guardaLibro(python, "biblioteca.csv");
        Biblioteca.guardaLibro(cpp, "biblioteca.csv");
        Biblioteca.guardaLibro(c, "biblioteca.csv");
        
        Biblioteca.cargarLibros("biblioteca.csv");
        Biblioteca.mostrarLibros();
        Biblioteca.mostrarLibrosPrestados();
    }
}
