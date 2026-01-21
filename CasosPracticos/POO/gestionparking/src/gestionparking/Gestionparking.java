package gestionparking;
public class Gestionparking 
{
    public static void main(String[] args) 
    {
        Parking parking1 = new Parking("Larios", 3);
        Parking parking2 = new Parking("El Palo");
        
        System.out.printf("--- GESTIÓN PARKING %s ---%n", parking1.getNombre());
        parking1.entrarCoche("4732KPC");
        parking1.entrarCoche("2732KPC");
        parking1.salirCoche("4732KPC");
        parking1.entrarCoche("8752ABC");
        parking1.entrarCoche("1121RST");
        parking1.entrarCoche("1984AAA");
        System.out.println("");
        System.out.printf("Estado del Parking %s %n", parking1.getNombre());
        System.out.println(parking1.toString());
        System.out.printf("--- GESTIÓN PARKING %s --- %n", parking2.getNombre());
        parking2.entrarCoche("8280DGH");
        parking2.entrarCoche("6732KPC");
        parking2.salirCoche("1732KPC");
        parking2.salirCoche("8280DGH");
        System.out.println("");
        System.out.printf("Estado del Parking %s %n", parking2.getNombre());
        System.out.println(parking2.toString());
        System.out.println("Recaudación Total Empresa: " + Parking.getRecaudacionTotal());
    }
}
