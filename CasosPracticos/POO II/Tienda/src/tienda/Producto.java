package tienda;

public class Producto 
{
    private String nombre;
    private double precioBase;
    
    public Producto(String nombre, double precioBase)
    {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
    
    public double calcularPrecio()
    {
        return Math.floor((precioBase * 1.21) * 100) / 100;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    @Override
    public String toString() {
        return"->[" + "nombre=" + nombre + ", precioBase=" + precioBase + "€]";
    } 
    
}
