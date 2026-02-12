package spotify;

public class Playlist 
{
        private String nombre;
        private Cancion[] listaCanciones;
        
        
        public Playlist(String nombre, Cancion[] listaCanciones)
        {
            this.nombre = nombre;
            this.listaCanciones = listaCanciones;
        }
        
        public Playlist(String nombre, int tamaño)
        {
            this(nombre, new Cancion[tamaño]);
        }
        
        public void reproducir()
        {
            System.out.println("Reproduciendo Playlis: " + nombre);
            for(int i = 0; i < listaCanciones.length; i++)
            {
                if(listaCanciones[i] != null)
                {
                    System.out.println("Cargando... " + listaCanciones[i]);
                }
            }
        }
        
        public void agregarCancion(Cancion cancion)
        {
            boolean terminado = false;
            int contador = 0;
            
            while(!terminado)
            {
                
                if(listaCanciones[contador] == null)
                {
                    listaCanciones[contador] = cancion;
                    terminado = true;
                }
                else
                    contador++;
            }
        }
        
        public void eliminarCancion(Cancion cancion)
        {
            boolean eliminado = false;
            
            for(int i = 0; i < listaCanciones.length; i++)
            {
                if(listaCanciones[i] != null)
                {
                    if(listaCanciones[i].equals(cancion))
                    {
                        listaCanciones[i] = null;
                        eliminado = true;
                    }
                }
            }
            if(!eliminado)
                System.out.println("No se ha encontrado la cancion");
        }
}
