package ejercicio8_1_2;

public class Usuario 
{
    private String username;
    private int puntosReputacion;
    
    public Usuario(String username, int puntosReputacion)
    {
        this.username = username;
        this.puntosReputacion = puntosReputacion;
    }

    public String getUsername() {
        return username;
    }

    public int getPuntosReputacion() {
        return puntosReputacion;
    }
    
    @Override
    public String toString()
    {
        return "  @" + username + "(Rep: " + puntosReputacion + ") ";
    }
}
