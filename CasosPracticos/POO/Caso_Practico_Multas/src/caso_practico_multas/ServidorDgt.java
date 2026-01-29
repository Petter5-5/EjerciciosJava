package caso_practico_multas;
public class ServidorDgt {
    private static Vehiculo[] flota = new Vehiculo[5];

    public static void inicializar()
    {
       flota[0] = new Vehiculo("1234-ABC", "Seat Ibiza", "Juan Pérez");
       flota[1] = new Vehiculo("5678-DEF", "Ford Fiesta", "Maria Lopez");
       flota[2] = new Vehiculo("9012-GHI", "Audi A3", "Carlos Sainz");
       flota[3] = new Vehiculo("2212-GHI", "Audi Q7", "Pedro Martin");
       flota[4] = new Vehiculo("3456-JKL", "Toyota Prius", "Ana García");
    }
    
    public static String multar(String matricula, int velocidad)
    {
        String texto = "";
        boolean noEncontrado = true;
        int contador = 0;
        
        System.out.println("Buscando propietario de la matrícula: " + matricula + " Velocidad: " + velocidad);
        
        while (noEncontrado && contador < flota.length) 
        {
            if (flota[contador].getMatricula().equals(matricula)) 
            {
                if (velocidad >= 150) 
                {
                    texto += "Infracción Grave: Restando Puntos...\n";
                    flota[contador].quitarPuntos(6);
                } 
                else if(velocidad >= 120)
                {
                    texto += "Infracción Leve: No se restan puntos...\n";
                }
                else
                {
                    texto += "Falsa alarma: Velocidad correcta\n";
                }
                noEncontrado = false;
            }
            contador++;
        }
        if(noEncontrado)
            texto += "ERROR: La matrícula" + matricula + " no figura en la base de datos (Posible coche robado/extranjero).\n";
        return texto;
    }
    
    public static void listar()
    {
        for (Vehiculo vehiculo : flota) {
            System.out.println(vehiculo);
        }
    }
    
}
