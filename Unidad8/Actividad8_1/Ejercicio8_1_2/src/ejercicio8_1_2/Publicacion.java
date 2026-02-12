package ejercicio8_1_2;

public class Publicacion
{
    private String titulo;
    private Comentario[] comentario;
    private int contador;
    
    public Publicacion(String titulo, int tamaño)
    {
        this.titulo = titulo;
        this.comentario = new Comentario[tamaño];
    }
    
    public void añadirComentarios(Usuario usuario, String mensaje)
    {
        boolean terminado = false;
        while(!terminado && contador < comentario.length)
        {
            if(comentario[contador] == null)
            {
                comentario[contador] = new Comentario(usuario, mensaje);
                terminado = true;
            }
            contador++;
        }
    }
    
    public void mostrarPublicacion()
    {
        System.out.println("Post: " + titulo);
        boolean terminado = false;
        contador = 0;
        
        while(!terminado && contador < comentario.length)
        {
            if(comentario[contador] != null)
                System.out.println(comentario[contador]);
            else
                terminado = true;
            contador++;
        }
    }
}
