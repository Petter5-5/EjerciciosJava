package juegoprueba;

import java.awt.*;

public class Disparo 
{
    private static int xE = (Ventana.getAncho() / 2) - 25;
    private static int yE = (Ventana.getAlto() / 2) - 25;
    
    public static void dibujar(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect(xE, yE, 25, 25);
    }

    public static void setxE(int xE) {
        Disparo.xE = xE;
    }

    public static void setyE(int yE) {
        Disparo.yE = yE;
    }

    public static int getxE() {
        return xE;
    }

    public static int getyE() {
        return yE;
    }
}
