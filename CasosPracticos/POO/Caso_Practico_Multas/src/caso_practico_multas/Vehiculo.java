package caso_practico_multas;

public class Vehiculo {
    private String matricula;
    private String modelo;
    private String propietario;
    private int puntosCarne;
    
    public Vehiculo(String matricula, String modelo, String propietario)
    {
        this.matricula = matricula;
        this.modelo = modelo;
        this.propietario = propietario;
        this.puntosCarne = 12;
    }
    
    public void quitarPuntos(int puntos)
    {
        if(this.getPuntosCarne() - puntos < 0)
            this.puntosCarne = 0;
        else
            this.puntosCarne -= puntos;
    }
    
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getPuntosCarne() {
        return puntosCarne;
    }
    
    @Override
    public String toString()
    {
        return "Matrícula: " + this.getMatricula() + " | Modelo: " + this.getModelo() + " | Dueño: " + this.getPropietario() + "(" + this.getPuntosCarne() + " pts)";
    }
}
