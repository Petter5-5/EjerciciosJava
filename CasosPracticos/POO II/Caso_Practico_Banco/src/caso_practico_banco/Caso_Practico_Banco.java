package caso_practico_banco;

public class Caso_Practico_Banco 
{
    public static void cajero(CuentaBancaria cuenta, String operacion, double cantidad)
    {
        switch (operacion) 
        {
            case "Retirar"->
                cuenta.retirar(cantidad);
            case "Ingresar"->
                cuenta.ingresar(cantidad);
            default->
                System.out.println("Operacion no valdida");
        }
    }
    
    public static void main(String[] args) 
    {
        CuentaBancaria cuenta = new CuentaBancaria (500);
        
        Operacion[] operacion = new Operacion[5];
        
        operacion[0] = new Operacion("Retirar", 500);
        operacion[1] = new Operacion("Retirar", 1000);
        operacion[2] = new Operacion("Ingresar", -10);
        operacion[3] = new Operacion("Ingresar", 400);
        operacion[4] = new Operacion("Ingresar", 100);
        
        for(Operacion op : operacion)
        {
            
            System.out.printf("%s %.2f €%n", op.getOp(), op.getCantidad());
            try
            {
                cajero(cuenta, op.getOp(), op.getCantidad());
            }catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
                System.out.println("🔒 Cuenta bloqueada por operación no permitida.");
            }catch(IllegalStateException e)
            {
                System.out.println(e.getMessage());
                System.out.println("⚠️ Operación cancelada. Corrija el dato e inténtelo de nuevo.");
            }finally
            {
                System.out.println("");
            }
        }
    }
}
