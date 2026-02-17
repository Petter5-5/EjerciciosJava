package casopractico_cybershop;
public class CasoPractico_CyberShop 
{
    public static void main(String[] args) 
    {
        Pago[] pago = new Pago[4];
        
        pago[0] = new Pago(100);
        pago[1] = new PagoTarjeta(100);
        pago[2] = new PagoPaypal(100);
        pago[3] = new PagoBizum(100);
        
        double ventasTotales = 0;
        double comisionesTotales = 0;
        
        for(Pago p : pago)
        {
            ventasTotales += p.getImporte();
            comisionesTotales += p.calcularCoste();
        }
        
        System.out.println("Las ventas totales son: " + ventasTotales + "€");
        System.out.println("Las comisiones totales son: " + comisionesTotales + "€");
    }
}
