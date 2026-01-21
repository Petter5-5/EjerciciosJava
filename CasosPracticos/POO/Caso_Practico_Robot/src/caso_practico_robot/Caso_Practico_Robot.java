package caso_practico_robot;
public class Caso_Practico_Robot 
{
    public static void main(String[] args) 
    {
        Robot generico = new Robot();
        Robot terminator = new Robot("Termionator T-800", 50);
        
        generico.trabajar();
        generico.trabajar("Limpiar laboratorio");
        System.out.println("");
        
        terminator.trabajar("Levantar cajas pesadas", 40);
        terminator.trabajar();
        terminator.trabajar();
        terminator.cargarBateria();
        terminator.trabajar("Servir café");
        System.out.println("");
        
        System.out.println(generico.toString());
        System.out.println(terminator.toString());
    }
}
