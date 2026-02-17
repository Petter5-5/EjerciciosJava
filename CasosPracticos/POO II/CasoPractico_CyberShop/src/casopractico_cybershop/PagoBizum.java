package casopractico_cybershop;

public class PagoBizum extends Pago
{
    public PagoBizum(double importe)
    {
        super(importe);
    }
    
    @Override
    public double calcularCoste()
    {
        return 0.5;
    }
}
