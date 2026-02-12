package ejercicio8_1_2;

public class Comentario
{
    private Usuario usuario;
    private String mensaje;
    
    public Comentario(Usuario usuario, String mensaje)
    {
        this.usuario = usuario;
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString()
    {
        return usuario.toString() + "dijo: " + mensaje;
    }
}
