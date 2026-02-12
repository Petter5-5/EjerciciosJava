package tienda;
public class Tienda 
{
    public static void main(String[] args) 
    {
        Producto base = new Producto("Bolsa tela", 20);
        ProductoAlimentacion productoAlimento = new ProductoAlimentacion( "Granja", "Huevos", 3);
        ProductoTecnologico productoTecnologico = new ProductoTecnologico( "Energizer", "Pilas", 10);
        
        System.out.println(base.getClass().getSimpleName() + "" + base + "Precio Final: " + base.calcularPrecio());
        System.out.println("");
        System.out.println(productoAlimento.getClass().getSimpleName() + "" + productoAlimento + " Precio Final: " + productoAlimento.calcularPrecio());
        System.out.println("");
        System.out.println(productoTecnologico.getClass().getSimpleName() + "" + productoTecnologico + " Precio Final: " + productoTecnologico.calcularPrecio());
    }
}
