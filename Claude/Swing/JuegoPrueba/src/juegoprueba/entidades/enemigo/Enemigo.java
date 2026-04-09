package juegoprueba.entidades.enemigo;

import java.awt.*;
import juegoprueba.visualizador.Ventana;

public class Enemigo
{
    public static void dibujar(Graphics g)
    {
        g.setColor(Color.RED);
        g.fillRect((Ventana.getAncho() / 2) - 50, (Ventana.getAlto() / 2) - 50, 50, 50);
    }
}
