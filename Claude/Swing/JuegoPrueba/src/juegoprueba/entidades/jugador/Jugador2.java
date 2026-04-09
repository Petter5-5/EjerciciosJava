package juegoprueba.entidades.jugador;

import java.awt.*;
import juegoprueba.visualizador.Ventana;

public class Jugador2 extends Jugador
{
    private static int y = 200;
    private static int x = 200;
    private static int width = 50;
    private static int height = 50;
    public boolean death = false;
    private Color color = Color.GREEN;

    @Override
    public void dibujar(Graphics g) 
    {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }

    @Override
    public void isOut(int dx, int dy) {
        int x = getX();
        int y = getY();
        
        if(x >= dx)
        {
            setX(0);
        }
        
        if(x <= 0)
        {
            setX(Ventana.getAncho());
        }
        
        if(y >= dy)
        {
            setY(0);
        }
        
        if(y <= 0)
        {
            setY(Ventana.getAlto());
        }
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setY(int y) {
        Jugador2.y = y;
    }

    public void setX(int x) {
        Jugador2.x = x;
    }
    
    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public boolean isDeath() {
        return death;
    }

    @Override
    public void setDeath(boolean muerte) {
        death = muerte;
    }
}
