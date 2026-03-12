package ejercicio8_2_2;

import java.util.ArrayList;

public class Instituto 
{
    private String nombre;
    private ArrayList<Alumno> alumnos = new ArrayList<>();

    public Instituto(String nombre) {
        this.nombre = nombre;
    }
    
    public void añadirAlumno(Alumno alumno)
    {
        alumnos.add(alumno);
    }
    
    public void alumnosInstituto()
    {
        for(Alumno a : alumnos)
        {
            double media = 0;
            System.out.println("------------------------------");
            System.out.printf("ALUMNO ( %s %d ) %n", a.getNombre(), a.getMatriculo());
            System.out.println("------------------------------");
            for(Calificacion c : a.getCalificaciones())
            {
                System.out.println(c.toString());
                media += c.getNota();
            }
            System.out.println("NOTA MEDIA: " + (Math.floor((media/a.getCalificaciones().size()) * 10) / 10));
        }
    }
}
