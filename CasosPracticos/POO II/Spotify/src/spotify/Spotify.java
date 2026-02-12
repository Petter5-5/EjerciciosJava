package spotify;
public class Spotify 
{
    public static void main(String[] args) 
    {
        Cancion[] almacen = new Cancion[10];
        
        almacen[0] = new Cancion("Bohemian Rhapsody", "Queen");
        almacen[1] = new Cancion("Blinding Lights", "The Weekend");
        almacen[2] = new Cancion("Thriller", "Michael Jackson");
        
        Playlist playlist = new Playlist("Joyas del Pop", almacen);
        
        playlist.reproducir();
        //Crear nueva cancion
        Cancion cancion = new Cancion("Sonata C menor", "Linking Park");
        playlist.agregarCancion(cancion);
        //añadir nueva cancion
        System.out.println("");
        playlist.reproducir();
        //crear nueva cancion
        System.out.println("");
        Cancion cancion2 = new Cancion("waka waka", "Shakira");
        //eliminar nueva cancion
        playlist.eliminarCancion(almacen[0]);
        System.out.println("");
        playlist.reproducir();
       
        playlist = null;
        
        System.out.println("");
        System.out.println("--- Borrando la playlist de la cuenta del usuario ---");
        System.out.println("La playlist ya no existe, pero la canción sigue en el");
        System.out.println("sistema: " + almacen[0]);
    }
}
