package tienda;

public class ProductoAlimentacion extends Producto
{
    private String categoria;
    
    public ProductoAlimentacion(String categoria, String nombre, double precioBase)
    {
        super(nombre, precioBase);
        this.categoria = categoria;
    }
    
    @Override
    public double calcularPrecio()
    {
        return Math.floor((getPrecioBase() * 1.1) * 100) / 100;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "[categoria=" + categoria + "]";
    }
}
