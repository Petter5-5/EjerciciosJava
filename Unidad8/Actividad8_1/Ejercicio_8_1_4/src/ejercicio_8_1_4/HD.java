package ejercicio_8_1_4;

public class HD
{
    private String tipo;
    private int capacidad;
    
    public HD(String tipo, int capacidad)
    {
        this.tipo = tipo;
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "HD{" + "tipo=" + tipo + ", capacidad=" + capacidad + '}';
    }
}
