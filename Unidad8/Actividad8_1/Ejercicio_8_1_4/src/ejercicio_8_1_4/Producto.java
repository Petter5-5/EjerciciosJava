package ejercicio_8_1_4;

public class Producto 
{
    private String id;
    private double precio;
    
    public Producto(String id, double precio)
    {
        this.id = id;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", precio=" + precio + '}';
    }
}
