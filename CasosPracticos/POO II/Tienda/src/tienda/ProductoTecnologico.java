package tienda;

public class ProductoTecnologico extends Producto
{
    private String fabricante;
    
    public ProductoTecnologico(String fabricante, String nombre, double precioBase)
    {
        super(nombre, precioBase);
        this.fabricante = fabricante;
    }
    
    @Override
    public double calcularPrecio()
    {
        return super.calcularPrecio() + 5;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "[fabricante=" + fabricante + "]";
    }
}
