package ejercicio8_1_2;
public class Ejercicio8_1_2 
{
    public static void main(String[] args) 
    {
        Usuario user1 = new Usuario("Juan_Dev", 500);
        Usuario user2 = new Usuario("Maria_Gamer", 1200);
        
        Publicacion post = new Publicacion("Mi nuevo Stup", 5);
        
        post.añadirComentarios(user1, "¡Qué buena iluminación!");
        post.añadirComentarios(user2, "Me encanta el monitor");
        post.añadirComentarios(user1, "¿Qué silla usas?");
        
        post.mostrarPublicacion();
    }
}
