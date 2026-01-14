package ejercicio7_2_2;
public class Ejercicio7_2_2 
{
    public static void main(String[] args) 
    {
        AireAcondicionado Aire_Samsung = new AireAcondicionado ("Aire Samsung", 18, 22);
        
        System.out.println("-- ESTADO INICIAL ---");
        System.out.println(Aire_Samsung);
        System.out.println("");
        
        System.out.println("-- BAJAMOS TEMPERATURA ---");
        Aire_Samsung.bajar();
        System.out.println(Aire_Samsung);
        Aire_Samsung.bajar();
        System.out.println(Aire_Samsung);
        System.out.println("");
        
        System.out.println("-- PROBAMOS EL MÍNIMO ---");
        Aire_Samsung.bajar();
        Aire_Samsung.bajar();
        Aire_Samsung.bajar();
        Aire_Samsung.bajar();
        Aire_Samsung.bajar();
        Aire_Samsung.bajar();
        Aire_Samsung.bajar();
        System.out.println(Aire_Samsung);
    }
}
