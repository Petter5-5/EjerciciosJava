package caso_practico_carritocompra;

import java.io.Serializable;

public class Alumno implements Serializable {

    // Identificador de versión (muy recomendado)
    private static final long serialVersionUID = 1;

    private String nombre;
    private int edad;
    private double nota;

    public Alumno(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad   = edad;
        this.nota   = nota;
    }

    @Override
    public String toString() {
        return nombre + " | " + edad + " años | " + nota;
    }
}