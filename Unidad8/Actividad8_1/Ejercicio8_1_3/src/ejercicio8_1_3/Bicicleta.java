package ejercicio8_1_3;

public class Bicicleta extends Transporte
{
    private boolean electrica;
    
    public Bicicleta(String id, boolean electrica)
    {
        double velocidad = electrica ? 25 : 15; 
        super(id, velocidad);
        this.electrica = electrica;
    }
}
