package caso_practico_banco;

public class Operacion 
{
    private String operacion;
    private double cantidad;
    
    public Operacion(String operacion, double cantidad)
    {
        this.operacion = operacion;
        this.cantidad = cantidad;
    }

    public String getOp() {
        return operacion;
    }

    public double getCantidad() {
        return cantidad;
    }
    
    
}
