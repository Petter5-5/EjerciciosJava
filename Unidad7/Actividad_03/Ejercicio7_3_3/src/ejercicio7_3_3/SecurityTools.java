package ejercicio7_3_3;
public class SecurityTools {
    private final static String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    
    public static String generarPassword(int longitud)
    {
        String password = "";
        
        for(int i = 0; i < longitud; i++)
        {
            password += CARACTERES.charAt((int) ((Math.random()) * CARACTERES.length() ));
        }
        return password;
    }
    
    public static String evaluarFuerza(String password)
    {
        String veredicto = "";
        
        if(password.length() < 4)
        {
            veredicto += "Contraseña DEBIL";
        }
        else if (password.length() > 8)
        {
            veredicto += "Contraseña FUERTE";
        }
        else
        {
            veredicto += "Contraseña MEDIA";
        }
        
        return veredicto;
    }
    
    public static String encriptarMensaje(String mensaje)
    {
        String encriptado = "";
        mensaje = mensaje.toLowerCase();
        
        for(int i = 0; i < mensaje.length(); i++)
        {
            switch (mensaje.charAt(i)) {
                case 'a' -> encriptado += '4';
                case 'e' -> encriptado += '3';
                case 'i' -> encriptado += '1';
                case 'o' -> encriptado += '0';
                case 's' -> encriptado += '5';
                default -> encriptado += mensaje.charAt(i);
            }
        }
        return encriptado;
    }
}
