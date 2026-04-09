package juegoprueba;

import java.awt.*;

public class Enemigo
{
    public static void dibujar(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect((Ventana.getAncho() / 2) - 50, (Ventana.getAlto() / 2) - 50, 50, 50);
    }
}
