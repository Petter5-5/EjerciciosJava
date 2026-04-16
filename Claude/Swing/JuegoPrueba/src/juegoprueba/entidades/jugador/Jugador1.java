package juegoprueba.entidades.jugador;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import juegoprueba.entidades.habilidades.Basico;
import juegoprueba.visualizador.Ventana;

public class Jugador1 extends Jugador
{
    private static int y = 100;
    private static int x = 100;
    private static int width = 50;
    private static int height = 50;
    public boolean death = false;
    private Color color = Color.BLUE;
    private ArrayList<Basico> basicos = new ArrayList<>();
    
    public void dibujarConCamara(Graphics g, int camaraX, int camaraY) 
    {
        g.setColor(color);
        g.fillRect(x - camaraX, y - camaraY, width, height);
    }
    
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
        Jugador1.y = y;
    }

    public void setX(int x) {
        Jugador1.x = x;
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

    public ArrayList<Basico> getBasicos() {
        return basicos;
    }
}
