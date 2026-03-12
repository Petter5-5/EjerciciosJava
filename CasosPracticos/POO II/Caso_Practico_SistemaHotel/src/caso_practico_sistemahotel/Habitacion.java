package caso_practico_sistemahotel;

public class Habitacion 
{
    private int numero;
    private boolean ocupada;

    public Habitacion(int numero) 
    {
        this.numero = numero;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void reserva()
    {
        ocupada = true;
    }
    
    public void liberar()
    {
        ocupada = false;
    }
    
    
}
