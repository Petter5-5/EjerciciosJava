package ejercicio5_1_12;
public class Ejercicio5_1_12 
{
    
    public static double area(double a)
    {
        return a * a;
    }
    
    public static double area(double a, double h)
    {
        return a * h / 2;
    }
    
    public static void main(String[] args) 
    {
        double a = 4, h = 3;
        System.out.println("El área de un cuadrado es igual a: " + area(a));
        System.out.println("El área de un triángulo es igual a: " + area(a, h));
    }
}
