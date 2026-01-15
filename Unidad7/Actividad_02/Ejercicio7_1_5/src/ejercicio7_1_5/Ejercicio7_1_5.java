package ejercicio7_1_5;
public class Ejercicio7_1_5 
{
    public static void main(String[] args) 
    {
        Alumno alumno1 = new Alumno("Luis Torres");
        Alumno alumno2 = new Alumno("Ana Ruiz");
        Alumno alumno3 = new Alumno("Sofía Mendiola");
        
        System.out.println("--- FICHA ALUMNO 1 ---");
        alumno1.setNota1(3.5);
        alumno1.setNota2(4.0);
        alumno1.setNota3(2.5);
        System.out.println(alumno1.toString());
        System.out.println("");
        
        System.out.println("--- FICHA ALUMNO 2 ---");
        alumno2.setNota1(6.0);
        alumno2.setNota2(7.5);
        alumno2.setNota3(5.5);
        System.out.println(alumno2.toString());
        System.out.println("");
        
        System.out.println("--- FICHA ALUMNO 3 ---");
        alumno3.setNota1(10.0);
        alumno3.setNota2(9.5);
        alumno3.setNota3(9.0);
        System.out.println(alumno3.toString());
        System.out.println("");
    }
}
