package caso_practicas_hamburguesas;
public class Caso_Practicas_Hamburguesas 
{
    public static void main(String[] args) 
    {
        Hamburguesa clasica = new Hamburguesa();
        
        Hamburguesa pedido1 = new Hamburguesa(clasica ,"Pedido1");
        Hamburguesa pedido2 = new Hamburguesa(clasica ,"Pedido2");
        
        pedido1.añadirQueso();
        pedido1.CambiarSalas("Mayonesa");
        
        System.out.println(clasica.toString());
        System.out.println(pedido1.toString());
        System.out.println(pedido2.toString());
        
        if(pedido1.equals(clasica))
            System.out.printf("[%s] si es clásica %n", pedido1.getNombre());
        else
            System.out.printf("[%s] no es clásica %n", pedido1.getNombre());
        
        if(pedido2.equals(clasica))
            System.out.printf("[%s] si es clásica %n", pedido2.getNombre());
        else
            System.out.printf("[%s] no es clásica %n", pedido2.getNombre());
    }
}
