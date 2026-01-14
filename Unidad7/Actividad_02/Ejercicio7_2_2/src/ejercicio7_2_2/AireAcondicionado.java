package ejercicio7_2_2;
public class AireAcondicionado 
{
    private String nombre;
    private int t_Mínima;
    private int t_Máxima;
    private int t_Actual;
    
    public AireAcondicionado(String nombre, int min, int max)
    {
        this.nombre = nombre;
        this.t_Mínima = min;
        this.t_Máxima = max;
        this.t_Actual = max;
    }
    
    public void subir()
    {
        if(t_Actual == t_Máxima)
            t_Actual = t_Máxima;
        else
            t_Actual++;
    }
    public void bajar()
    {
        if(t_Actual == t_Mínima)
            t_Actual = t_Mínima;
        else
            t_Actual--;
    }
    
    @Override
    public String toString()
    {
        String texto = nombre + "[" + t_Actual + "ºC] ";
        if(t_Actual == t_Máxima)
            texto += "MODO ECO";
        else if(t_Actual == t_Mínima)
            texto += "MÁXIMO FRÍO";
        else
            texto += "Normal";
        return texto;
    }
}
