package caso_practico_banco;

public class CuentaBancaria 
{
    private double saldo;
    
    public CuentaBancaria(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void ingresar(double cantidad)
    {
        if(cantidad == 0)
            throw new IllegalArgumentException("\033[0;1m❌  El ingreso no puede ser cero\033[0;0m");
        else if(cantidad < 0)
            throw new IllegalArgumentException("\033[0;1m❌ El ingreso no puede ser negativo\033[0;0m");
        saldo += cantidad;
        System.out.println("✅ Ingreso de " + cantidad + "€ realizada. Saldo: " + saldo + "€");
    }
    
    public void retirar(double cantidad)
    {
        if(cantidad == 0)
            throw new IllegalArgumentException("\033[0;1m❌  La retirada no puede ser cero\033[0;0m");
        else if(cantidad < 0)
            throw new IllegalArgumentException("\033[0;1m❌  La retirada no puede ser negativa\033[0;0m");
        else if(cantidad > saldo)
            throw new IllegalStateException("\033[0;1m❌ Saldo insuficiente. Disponible: " + saldo + " €\033[0;0m");
        saldo -= cantidad;
        System.out.println("✅ Retirada de " + cantidad + "€ realizada. Saldo: " + saldo + "€");
    }
}
