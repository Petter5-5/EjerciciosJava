package caso_practico_carritocompra;


public class Caso_Practico_CarritoCompra 
{
    public static void main(String[] args) 
    {
        Carrito carrito = new Carrito("Fede");
        Producto p1 = new Producto("Memoria", 110.00, 5);
        Producto p2 = new Producto("Disco duro", 200.00, 2);
        Producto p3 = new Producto("Monitor", 550.00, 3);
        
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        
        System.out.println("1. - Carrito original");
        carrito.mostrar();
        System.out.println("");
        
        System.out.println("2.- Guardo el carrito original");
        CarritoRepository.guardar(carrito, "carrito.dat");
        carrito.vaciar();
        System.out.println("");
        
        System.out.println("4.- Muestro de nuevo el carrito original");
        carrito.mostrar();
        System.out.println("");
        
        System.out.println("5.- Muestro el carrito recuperado");
        carrito = CarritoRepository.recuperar("carrito.dat");
        carrito.mostrar();
    }
}
