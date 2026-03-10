package ejercicio8_2_1;

public class Figura 
{
    private String codigo;
    private double precio;
    private Dimension dimension;
    private Superheroe superheroe;
    
    public Figura(String codigo, double precio, Dimension dimension, Superheroe superheroe)
    {
        this.codigo = codigo;
        this.precio = precio;
        this.dimension = dimension;
        this.superheroe = superheroe;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public Superheroe getSuperheroe() {
        return superheroe;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public void setSuperheroe(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public void subirPrecio(double cantidad)
    {
        this.precio += Math.abs(cantidad);
    }
    
    @Override
    public String toString() {
        return "Figura:\ncodigo=" + codigo + ", precio=" + precio + "\n" + superheroe.toString() + "\n" + dimension.toString() + '}';
    }
}
