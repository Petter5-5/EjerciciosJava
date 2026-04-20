package ejercicio9_1_5;

import java.util.ArrayList;

public class Alumno implements Comparable<Alumno>{

    private String nombre;
    private String apellido;
    private ArrayList<Integer> notas;

    public Alumno(String nombre, String apellido, ArrayList notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = notas;
    }

    public double notaMedai()
    {
        double notaMedia = 0;
        
        for(int a : notas){
            notaMedia += a;
        }
        
        return notaMedia / notas.size();
    }

    public String getNombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }
    
    @Override 
    public int compareTo(Alumno a) {
        int resultado;
        
        if(this.notaMedai() < a.notaMedai())
            resultado = 1;
        else if(this.notaMedai() > a.notaMedai())
            resultado = -1;
        else
            resultado = 0;
        
        return resultado;
    }
    
    @Override
    public String toString() {
        return nombre + " | " + apellido + " años | " + notaMedai();
    }
}