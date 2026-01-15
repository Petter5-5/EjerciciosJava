package ejercicio7_2_3;
public class Ejercicio7_2_3 
{
    public static void main(String[] args) 
    {
        Cuadrado cuadrado = new Cuadrado(2.0, 2.0, 6.0, 6.0);
        
        System.out.println("=== ESTADO INICIAL ===");
        System.out.println(cuadrado.toString());
        System.out.printf("%-10s %.2f %n", "Área:", cuadrado.area());
        System.out.printf("%-10s %.2f %n", "Perímetro:", cuadrado.perimetro());
        System.out.printf("%-10s %.2f %n%n", "Diagonal:", cuadrado.diagonal());
        
        System.out.println("... Modificando coordenadas con Setters (Haciéndolo más grande) ...");
        
        cuadrado.setCuadrado(2.0, 2.0, 12.0, 12.0);
        System.out.println("");
        System.out.println("=== ESTADO FINAL ===");
        System.out.println(cuadrado.toString());
        System.out.printf("%-10s %.2f %n", "Área:", cuadrado.area());
        System.out.printf("%-10s %.2f %n", "Perímetro:", cuadrado.perimetro());
        System.out.printf("%-10s %.2f %n", "Diagonal:", cuadrado.diagonal());
    }
}
