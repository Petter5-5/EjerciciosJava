package ejercicio8_2_4;

import java.util.HashMap;

public class Parking 
{
    private HashMap<String, Integer> aparcamiento;
    private double totalRecaudado;

    public Parking() 
    {
        aparcamiento = new HashMap<>();
        this.totalRecaudado = 0;
    }
    
    public void entradaCoche(String matricula, int hora, int minuto)
    {
        aparcamiento.put(matricula, (minuto * 60 + minuto));
    }
}
