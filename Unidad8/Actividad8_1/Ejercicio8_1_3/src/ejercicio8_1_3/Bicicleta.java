package ejercicio8_1_3;

public class Bicicleta extends Transporte
{
    private boolean electrica;
    
    public Bicicleta(String id, boolean electrica)
    {
        super(id, electrica ? 25 : 15);
        this.electrica = electrica;
    }
    
    @Override
    public String toString()
    {
        String esElectrica = electrica ? "Es eléctrica." : "No es eléctrica";
        
        return super.toString() + esElectrica;
    }
}
