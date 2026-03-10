package ejercicio8_2_1;
public class Ejercicio8_2_1 
{
    public static void main(String[] args) 
    {
        Superheroe superHeroe1 = new Superheroe("Spiderman");
        superHeroe1.setDescripcion("Lanza tela de araña y viste de rojo.");
        
        Superheroe superHeroe2 = new Superheroe("Batman");
        superHeroe2.setDescripcion("Tiene los poderes de un murciélago.");
        superHeroe2.setCapa(true);
        
        Dimension dimension1 = new Dimension(10, 10, 10);
        Dimension dimension2 = new Dimension(5, 5, 5);
        
        Figura figura1 = new Figura("A-32", 150, dimension1, superHeroe1);
        Figura figura2 = new Figura("H-45", 100, dimension2, superHeroe2);
        
        Coleccion coleccion = new Coleccion("Colección Tienda Sur");
        coleccion.añadirFigura(figura1);
        coleccion.añadirFigura(figura2);
        
        System.out.println("Precio figura 1: " + figura1.getPrecio() + "€");
        System.out.println("Precio figura 2: " + figura2.getPrecio() + "€");
        figura2.subirPrecio(20);
        System.out.println("Subo precio de la figura 2 en 10 €");
        System.out.println("");
        System.out.println(coleccion.toString());
        System.out.println("");
        System.out.println("Figura mas valiosa: " + (coleccion.masValioso()).getCodigo());
        System.out.println("Valor total de la colección: " + coleccion.getValorColeccion() + " €");
        System.out.println("Volumen total de la colección: " + coleccion.getVolumen());
    }
}
