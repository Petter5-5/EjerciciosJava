package caso_practico_robot;

public class Robot {
    private String modelo;
    private int bateria;
    
    public Robot(String modelo, int bateria)
    {
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public Robot()
    {
        this("Robot Genérico", 100);
    }
    
    public void trabajar()
    {
         if(bateria >= 10)
        {
            this.bateria -= 10;
            System.out.printf("%s: Realizando mantenimiento estándar. (Batería: %d%%) %n", modelo, bateria);
        }
        else
             System.out.printf("%s: Batería insuficiente %n", modelo);
    }
    
    public void trabajar(String tarea)
    {
        if(bateria >= 10)
        {
            this.bateria -= 10;
            System.out.printf("%s: Ejecutando tarea [%s]. (Batería: %d%%) %n", modelo, tarea, bateria);
        }
        else
        System.out.printf("%s: Batería insuficiente %n", modelo);
             
    }
    
    public void trabajar(String tarea, int consumoEnergia)
    {
        if(bateria >= consumoEnergia)
        {
            this.bateria -= consumoEnergia;
            System.out.printf("%s: Tarea pesada [%s] -%d%% energía (Batería: %d%%) %n", modelo, tarea, consumoEnergia, bateria);
        }
        else
            System.out.printf("%s: Batería insuficiente %n", modelo);
    }
    
    public void cargarBateria()
    {
        this.bateria = 100;
        System.out.printf("%s: Batería recargada al 100%% %n", modelo);
    }
    
    @Override
    public String toString()
    {
        return "Modelo: " + modelo + " Bateria: " + bateria + "%" ;
    }
}
