package gestionparking;

import java.util.Arrays;

public class Parking {
    public static final double PRECIO_POR_COCHE = 2.5;
    private static double recaudacionTotal;
    private String nombre;
    private String[] plazas;
    
    
    public Parking(String nombre, int numeroPlazas)
    {
        this.nombre = nombre;
        this.plazas = new String[numeroPlazas];
        Arrays.fill(plazas, 0, numeroPlazas, "LIBRE");
    }
    
    public Parking(String nombre)
    {
        this(nombre, 5);
    }
    
    public void entrarCoche(String matricula)
    {
        boolean noEncontrado = true;
        boolean noLleno = true;
        
        if(matricula.length() < 7)
            System.out.printf("Error: la matricula [%s] no es válida %n", matricula);
        else
        {
            int indice = -1;
            while(noEncontrado && noLleno)
            {
                indice++;
                if(plazas[indice].equals("LIBRE"))
                    noEncontrado = false;
                else if(plazas.length - 1 == indice)
                    noLleno = false;
            }
            if(indice < plazas.length && noLleno == true)
            {
                matricula = matricula.toUpperCase();
                plazas[indice] = matricula;
                recaudacionTotal += PRECIO_POR_COCHE;
                System.out.printf("[Parking %s]: Coche #%s# aparcado en la plaza[%d] %n", nombre, matricula, indice);
            }
            else
                System.out.println("PARKING COMPLETO");
        }
        
    }
    
    public void salirCoche(String matricula)
    {
            boolean noEncontrado = true;
            boolean noLleno = true;
            
            int indice = -1;
            while(noEncontrado && noLleno)
            {
                indice++;
                if(plazas[indice].equals(matricula))
                    noEncontrado = false;
                else if(plazas.length - 1 == indice)
                    noLleno = false;
            }
            if(indice < plazas.length && noLleno == true)
            {
                plazas[indice] = "LIBRE";
                System.out.printf("[Parking %s]: Coche [%s] saliendo...Plaza liberada %n", nombre, matricula);
            }
            else
                System.out.printf("[Parking %s]: Error: El Coche [%s] no está en el parking %n",nombre , matricula);
    }
    
    public static double getRecaudacionTotal()
    {
        return recaudacionTotal;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    @Override
    public String toString()
    {
        String texto = "";
        
        for(int i = 0; i < plazas.length; i++)
        {
            texto += "Plaza [" + i + "] " + plazas[i] + "\n";
        }
        
        return texto;
    }
}
