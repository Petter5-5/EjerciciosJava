package ejercicio7_1_5;

public class Alumno 
{
    private String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    
    public Alumno(String nombre)
    {
        this.nombre = nombre;
        this.nota1 = 1.0;
        this.nota2 = 1.0;
        this.nota3 = 1.0;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double calcularMedia()
    {
        return Math.round(((nota1 + nota2 + nota3) / 3)* 100.0) / 100.0;
    }
    
    @Override
    public String toString()
    {
        String texto = "Alumno: " + nombre + "\nNota Media: " + calcularMedia() + "\nEstado: ";
        
        if(calcularMedia() < 5)
            texto += "Debe Recuperar";
        else if(calcularMedia() >= 5 && calcularMedia() < 9)
            texto += "Aprobado";
        else
            texto += "Sobresaliente";
        return texto;
    }
}
