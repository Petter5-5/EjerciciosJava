package ejercicio2_2_11;
public class Ejercicio2_2_11 
{
    public static void main(String[] args) 
    {
        String nombre = "Ana";
        nombre = nombre.toLowerCase();
        String apellido1 = "Zagal";
        String apellido2 = "Hegel";
        
        if (nombre.charAt(0) == nombre.charAt(nombre.length() - 1) && apellido1.length() == apellido2.length()){
            System.out.println("Persona APTA para participar en el concurso.");
        }
        else{
            System.out.println("Persona NO APTA para participar en el consurso.");
        }
    }
}
