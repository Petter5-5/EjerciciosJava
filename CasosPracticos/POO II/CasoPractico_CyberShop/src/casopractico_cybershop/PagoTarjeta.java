package casopractico_cybershop;

public class PagoTarjeta extends Pago 
{
    public PagoTarjeta(double importe)
    {
        super(importe);
    }
    
    @Override
    public double calcularCoste()
    {
        return getImporte() * 0.05;
    }
}
