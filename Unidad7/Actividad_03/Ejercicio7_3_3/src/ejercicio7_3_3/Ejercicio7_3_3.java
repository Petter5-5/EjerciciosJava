package ejercicio7_3_3;
public class Ejercicio7_3_3 
{
    public static void main(String[] args) 
    {
        String password = SecurityTools.generarPassword(10);
        String mensaje = "La contraseña es secreta";
        
        System.out.println("--- SISTEMA DE SEGURIDAD ---");
        System.out.println("Clave generada: " + password);
        System.out.println("Nivel de seguriadad: " + SecurityTools.evaluarFuerza(password));
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje encriptado: " + SecurityTools.encriptarMensaje(mensaje));
    }
}
