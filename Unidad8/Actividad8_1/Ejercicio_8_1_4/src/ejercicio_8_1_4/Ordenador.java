package ejercicio_8_1_4;

public class Ordenador extends Producto 
{
    private HD hd;
    private Memoria memoria;
    private Cpu cpu;
    
    public Ordenador(String id, double precio, String nombreHD, int capacidadHD, int capacidadMemoria, String nombreCpu, double velocidadCpu)
    {
        super(id, precio);
        hd = new HD(nombreHD, capacidadHD);
        memoria = new Memoria(capacidadMemoria);
        cpu = new Cpu(nombreCpu, velocidadCpu);
    }

    @Override
    public String toString() {
        return "Ordenador{"+ hd + memoria + cpu + '}';
    }
}
