package ejercicio8_2_2;

public class Calificacion 
{
    private String asignatura;
    private double nota;
    
    public Calificacion(String asignatura, double nota)
    {
        this.asignatura = asignatura;
        this.nota = nota;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return asignatura + ": " + nota;
    }
    
}
