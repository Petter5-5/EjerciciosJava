package torredemagos;

public enum Rango 
{
    APRENDIZ(10),
    OFICIAL(25),
    MAESTRO(45);
    
    private final int poderBase;
    
    Rango(int poderBase)
    {
        this.poderBase = poderBase;
    }
    
    public int getPoderBase()
    {
        return poderBase;
    }
}
