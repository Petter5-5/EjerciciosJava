package ejercicio8_2_2;
public class Ejercicio8_2_2 
{
    public static void main(String[] args) 
    {
        Instituto instituto = new Instituto("UMA");
        Alumno carmen = new Alumno("Carmen Torres", 31553);
        Alumno alberto = new Alumno("Alberto Martín", 23453);
        
        String[] asignaturas = {"Matemáticas", "Lengua", "Inglés", "Física", "Educación física", "Biología y geología"};
        
        carmen.añadirCalificacionesAlazar(asignaturas);
        alberto.añadirCalificacionesAlazar(asignaturas);
        
        instituto.añadirAlumno(carmen);
        instituto.añadirAlumno(alberto);
        
        instituto.alumnosInstituto();
    }
}
