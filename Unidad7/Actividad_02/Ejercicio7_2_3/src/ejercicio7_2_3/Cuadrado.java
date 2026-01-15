package ejercicio7_2_3;

public class Cuadrado 
{
    private double x1;
    private double x2;
    private double y1;
    private double y2;
    
    public Cuadrado(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    public double perimetro()
    {
        return Math.abs((x2 - x1) * 4);
    }
    
    public double area()
    {
        return Math.pow((x2-x1),2);
    }
    
    public double diagonal()
    {
        return Math.sqrt((Math.pow((x1 - x2), 2))+(Math.pow((y1 - y2), 2)));
    }
    
    public void setCuadrado(double x1, double y1, double x2, double y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    
    @Override
    public String toString()
    {
        return "Cuadrado definido por (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ")"; 
    }
}
