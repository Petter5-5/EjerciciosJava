package concensionario;

public class Coche
    //Atributos
{
    private String marca;
    private String modelo;
    private String color;
    private int numeroBastidor;
    private int velocidad;
    
    //Constructor
    public Coche(String marca, String modelo, String color, int numeroBastidor, int velocidad)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.numeroBastidor = numeroBastidor;
        this.velocidad = velocidad;
    }
    
    //getter de marca
    public String getMarca()
    {
        return marca;
    }
    
    //setter de marca
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    
    //Método de clase
    public void acelerar(int incremento)
    {
        velocidad += incremento;
    }
    
    //Método
    public void mostrar()
    {
        System.out.println("Mi " + marca + " " + modelo + " de color" + color + " va a una velocidad de  " + velocidad + "km/h");
    }
}
