package ejercicio5_1_4;
public class Ejercicio5_1_4 
{
    public static double calcularPrecioFinal(double precioBase)
        {
            return precioBase;
        }
    public static double calcularPrecioFinal(double precioBase, double IVA)
        {
            return precioBase + (precioBase * IVA);
        }
    public static double calcularPrecioFinal(double precioBase, double IVA, double descuento)
        {
            return precioBase + (precioBase * IVA) - (precioBase * descuento);
        }
    public static void main(String[] args) 
    {
        double precioBase = 34.54, IVA = 0.21, descuento = 0.05;
        
        System.out.printf("Precio base: %.2f%n", calcularPrecioFinal(precioBase));
        System.out.printf("Precio base + IVA: %.2f%n", calcularPrecioFinal(precioBase, IVA));
        System.out.printf("Precio base + IVA + descuento: %.2f%n", calcularPrecioFinal(precioBase, IVA, descuento));
    }
}
