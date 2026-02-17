package ejercicio8_1_3;
public class Ejercicio8_1_3 
{
    public static void main(String[] args) 
    {
        Transporte[] transporte = new Transporte[3];
        
        transporte[0] = new Bicicleta("B1", false);
        transporte[1] = new Coche("C1", 80, 1.25);
        transporte[2] = new Autobus("A1", 60, 8);
        
        double distancia = 12;
        
        for(Transporte t : transporte)
        {
            System.out.println(t.getClass().getSimpleName() + " -> " + t.calcularTiempo(distancia));
        }
    }
}
