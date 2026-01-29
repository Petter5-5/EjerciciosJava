package ejercicio7_3_1;
public class Ejercicio7_3_1 
{
    public static void main(String[] args) 
    {
        Cuenta cuenta1 = new Cuenta("Juan Pérez", 100.5);
        Cuenta cuenta2 = new Cuenta("María García");
        
        System.out.println("--- ESTADO INICIAL ---");
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println("");
        
        cuenta1.ingresar(50);
        cuenta1.ingresar(-100);
        
        System.out.println("--- PRUEBAS INGRESAR ---");
        System.out.println("Juan tras ingresar: 50 y luego -100 (debe tener 150.5): " + cuenta1.getCantidad());
        System.out.println("");
        
        cuenta1.retirar(50.5);
        cuenta2.ingresar(20);
        cuenta1.retirar(10);
        
        System.out.println("--- PRUEBAS RETIRAR ---");
        System.out.println("Juan tras retirar 50.5 (debe quedar 100): " + cuenta1.getCantidad());
        System.out.println("María tenia 20, retira 10 (debe quedar 10): " + cuenta2.getCantidad());
        cuenta1.retirar(100);
        System.out.println("María vuelve a retirar 100 (debe quedar 0): " + cuenta2.getCantidad());
    }
}
