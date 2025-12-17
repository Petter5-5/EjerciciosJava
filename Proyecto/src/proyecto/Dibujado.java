package proyecto;

public class Dibujado {
        public static void limpiarPantalla()
        {
            for(int i = 0; i < 50; i++)
            {
                System.out.println("");
            }
        }
    
         public static final String HIGH_INTENSITY = "\u001B[1m";
    
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String RESET = "\u001B[0m";
    
    
    public static void dibujarMuneco(String[][]dibujo, int puntuacion) {
        
        if (puntuacion >= 1){ dibujo[2][2] = WHITE + "0"; }
        if (puntuacion >= 2){ dibujo[3][2] = WHITE + "|"; }
        if (puntuacion >= 3){ dibujo[3][1] = WHITE + "/"; }
        if (puntuacion >= 4){ dibujo[3][3] = WHITE + "\\"; }
        if (puntuacion >= 5){ dibujo[4][3] = WHITE + "\\"; }
        if (puntuacion >= 6){ dibujo[4][1] = WHITE + "/"; }
        
        for (int i = 0; i < dibujo.length; i++) {
            for (int j = 0; j < dibujo[i].length; j++) {
                System.out.print(dibujo[i][j]);
            }
            try {
                System.out.println("");
                Thread.sleep(225);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void Ejecutor(int falladas) 
    {
        
        System.out.println("[ EL AHORCADO ]\n");
        String [][] muneco = {
            {CYAN+HIGH_INTENSITY+" "," ","+","-","-","-","+"," "," "+RESET},
            {CYAN+HIGH_INTENSITY+" "," ","|"," "," "," ","|"," "," "+RESET},
            {" "," "," "," "," "," ",CYAN+HIGH_INTENSITY+"|"," "," "+RESET},
            {" "," "," "," "," "," ",CYAN+HIGH_INTENSITY+"|"," "," "+RESET},
            {" "," "," "," "," "," ",CYAN+HIGH_INTENSITY+"|"," "," "+RESET},
            {CYAN+HIGH_INTENSITY+" "," "," "," "," "," ","|"," "," "+RESET},
            {CYAN+HIGH_INTENSITY+"=","=","=","=","=","=","=","=","="+RESET}
        };
        dibujarMuneco(muneco,falladas);
                
    }
}
