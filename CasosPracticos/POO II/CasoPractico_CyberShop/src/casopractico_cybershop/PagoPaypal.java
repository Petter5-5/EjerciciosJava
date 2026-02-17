package casopractico_cybershop;

public class PagoPaypal extends Pago
{
    public PagoPaypal(double importe)
    {
        super(importe);
    }
    
    @Override
    public double calcularCoste()
    {
        return getImporte() * 0.06 + 2;
    }
}
