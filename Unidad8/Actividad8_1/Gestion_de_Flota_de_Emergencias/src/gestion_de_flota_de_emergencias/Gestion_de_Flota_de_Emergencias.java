package gestion_de_flota_de_emergencias;
public class Gestion_de_Flota_de_Emergencias 
{
    public static void main(String[] args) 
    {
        Ambulancia ambulancia = new Ambulancia("7634YUE", 100, "Urgente");
        Bomberos bomberos = new Bomberos("8728DGH", 80, 1000);
        Taxi taxi = new Taxi("7623YRF", 120, "76234-L");
        
        Vehiculo[] vehiculo = {ambulancia, bomberos, taxi};
        
        System.out.println("=== ESTADO DE LA FLOTA ===");
        for(Vehiculo v : vehiculo)
        {
            v.mostrarInfo();
            v.acelerar();
            System.out.println("");
        }
        
        Emergencia[] emergencia = {ambulancia, bomberos};
        System.out.println("=== ACTIVANDO PROTOCOLO DE EMERGENCIA ===");
        
        for(Emergencia e : emergencia)
        {
            e.activarSirena();
        }
    }
}
