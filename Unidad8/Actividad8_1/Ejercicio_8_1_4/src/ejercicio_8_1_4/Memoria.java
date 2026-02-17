package ejercicio_8_1_4;

public class Memoria 
{
    private int capacidad;
    
    public Memoria(int capacidad)
    {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Memoria{" + "capacidad=" + capacidad + '}';
    }
    
}
