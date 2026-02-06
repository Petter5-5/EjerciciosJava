package casopracticobomnilla;
public class Bombilla 
{
    private static int bombillasCreadas;
    private static int bombillasEncedidas;
    private static final boolean DEFAULT_ESTADO_INICIAL = false;
    
    private String nombre;
    private boolean estado;
    private int vecesEncendida;
    
    public Bombilla(boolean estado)
    {
        bombillasCreadas++;
        this.estado = estado;
        this.nombre = "Bombilla " + bombillasCreadas;
        if(estado)
        {
            vecesEncendida++;
            bombillasEncedidas++;
        }
    }
    
    public Bombilla()
    {
        this(DEFAULT_ESTADO_INICIAL);
    }
    
    public void encender()
    {
        if(estado)
            System.out.println("Intentando encender bombilla ya encendida");
        else
        {
            vecesEncendida++;
            estado = true;
            bombillasEncedidas++;
        }
    }
    
    public void apagar()
    {
        if(!estado)
            System.out.println("Intentando apagar bombilla ya apagada");
        else
        {
            estado = false;
            bombillasEncedidas--;
        }
    }
    
    public void conmutar()
    {
        if(!estado)
            this.encender();
        else
            this.apagar();
    }
    
    @Override
    public String toString()
    {
        String texto = nombre;
        
        if(estado)
            texto += " encendida. ";
        else
            texto += " apagada. ";
        texto += "Se ha encendido " + vecesEncendida + " veces";
            
        return texto;
    }

    public static int getBombillasCreadas() {
        return bombillasCreadas;
    }

    public static int getBombillasEncedidas() {
        return bombillasEncedidas;
    }
    
}
