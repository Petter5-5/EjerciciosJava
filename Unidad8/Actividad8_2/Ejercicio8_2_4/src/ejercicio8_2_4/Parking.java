package ejercicio8_2_4;

import java.util.HashMap;
import java.util.Map;

public class Parking 
{
    private HashMap<String, Integer> aparcamiento;
    private static double totalRecaudado;

    public Parking() 
    {
        aparcamiento = new HashMap<>();
        this.totalRecaudado = 0;
    }
    
    public void entradaCoche(String matricula, int hora, int minuto)
    {
        if(aparcamiento.containsKey(matricula))
        {
            System.out.println("Error: la matrícula " + matricula + " ya está aparcada");
        }
        else
        {
            aparcamiento.put(matricula, (hora * 60 + minuto));
        }
    }
    
    public double salidaCoche(String matricula, int  hora ,int minuto)
    {
        double importe = 0;
        
        if(!aparcamiento.containsKey(matricula))
        {
            System.out.println("Error: la matrícula " + matricula + " no había sido registrada");
        }
        else
        {
            int tiempo = (hora * 60) + minuto - aparcamiento.get(matricula);
            importe = tiempo * 0.03;
            totalRecaudado += importe;
            aparcamiento.remove(matricula);
        }
        return importe;
    }
    
    public void listar()
    {
        for(Map.Entry<String, Integer> palabra : aparcamiento.entrySet())
        {
            int hora = (int) (palabra.getValue() / 60);
            int minuto = palabra.getValue() % 60;
            System.out.println("--- LISTADO DE COCHES ---");
            System.out.println("Matrícula: " + palabra.getKey() + " | Entrada: " + hora + ":" + minuto);
        }
    }

    public static double getTotalRecaudado() 
    {
        return totalRecaudado;
    }
    
    public int cochesDentro()
    {
        return aparcamiento.size();
    }
}
