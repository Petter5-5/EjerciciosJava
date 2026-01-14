package televisor;

public class Televisor 
{
    private int canal;
    private int volumen;
    private int color;
    
    public Televisor(int canal, int volumen)
    {
        this.canal = canal;
        this.volumen = volumen;
        this.color = 5;
    }
    
    public void subirCanal()
    {
        if(canal == 10)
            canal = 0;
        else
            canal++;
    }
    
    public void bajarCanal()
    {
        if(canal == 0)
            canal = 10;
        else
            canal--;
    }
    
    public void subirVolumen(int valor)
    {
        if(valor + volumen > 100)
            volumen = 100;
        else
            volumen += valor;
    }
    
    public void bajarVolumen(int valor)
    {
        if(volumen - valor < 0)
            volumen = 0;
        else
            volumen -= valor;
    }
    
    public void subirColor()
    {
        if(color == 7)
            color = 7;
        else
            color ++;
    }
    
    public void bajarColor()
    {
        if(color == 1)
            color = 1;
        else
            color --;
    }
    
    public String mostrar()
    {
        String texto = " Canal:" + canal + " Volumen:" + volumen + " Color:" + color;
        return texto;
    }
    
    @Override
    public String toString()
    {
        return "Tv Canal:" + canal + " Volumen:" + volumen + " Color:" + color;
    }
}
