package ejercicio2_2_13;
public class Ejercicio2_2_13 
{
    public static void main(String[] args) 
    {
        int precioSinIva = 1243;
        double precioFinal = (double) (precioSinIva * 0.21) + precioSinIva;
        System.out.printf("Precio sin IVA: %d%nPrecio final con IVA: %.2f%n", precioSinIva, precioFinal);
    }
}
