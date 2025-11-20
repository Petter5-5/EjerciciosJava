package ejercicio5_1_8;
public class Ejercicio5_1_8 
{
    
    public static void mayorDeEdad(int edad)
    {
        if (edad >= 18)
            System.out.println("Usted es mayor de edad");
        else
            System.out.println("Usted es menor de edad");
    }
    
    public static void main(String[] args) 
    {
        int edad = 17;
        
        mayorDeEdad(edad);
    }
}
