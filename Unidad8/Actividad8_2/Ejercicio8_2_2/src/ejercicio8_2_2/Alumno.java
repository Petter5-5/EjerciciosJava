package ejercicio8_2_2;

import java.util.ArrayList;

public class Alumno 
{
    private String nombre;
    private int matriculo;
    private ArrayList<Calificacion> calificaciones = new ArrayList<>();

    public Alumno(String nombre, int matriculo) {
        this.nombre = nombre;
        this.matriculo = matriculo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public int getMatriculo() {
        return matriculo;
    }

    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatriculo(int matriculo) {
        this.matriculo = matriculo;
    }
    
    public void añadirCalificacionesAlazar(String[] asignaturas)
    {
        for(String a : asignaturas)
        {
            this.calificar(a, Math.floor((Math.random() * 10) * 10) / 10);
        }
    }
    
    public void calificar(String asignatura, double nota)
    {
        calificaciones.add(new Calificacion(asignatura, nota));
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", matriculo=" + matriculo + ", calificaciones=" + calificaciones + '}';
    }
}
