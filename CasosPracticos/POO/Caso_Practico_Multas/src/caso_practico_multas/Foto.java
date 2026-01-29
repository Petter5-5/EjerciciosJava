package caso_practico_multas;

public class Foto {
    private String matricula;
    private int velocidad;
    
    public Foto(String matricula, int velocidad)
    {
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public  String getMatricula() {
        return matricula;
    }
    
    public int getVelocidad() {
        return velocidad;
    }
    
    
}
