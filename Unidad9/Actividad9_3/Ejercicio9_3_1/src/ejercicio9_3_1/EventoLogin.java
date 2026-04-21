package ejercicio9_3_1;

public class EventoLogin extends Evento{
    private String nombreUsuario;

    public EventoLogin(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
    
    
}
