package juegoprueba;

import javax.swing.*;
import java.awt.*;


public class PanelDibujo extends JPanel
{
    int y = 100;
    int x = 100;
    int xE = Disparo.getxE();
    int yE = Disparo.getyE();
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.BLUE);
        g.fillRect(x, y, 50, 50);
        
        Enemigo.dibujar(g);
    }
    
    public void mover(int dx, int dy)
    {
        y += dy;
        x += dx;
        
        repaint();
    }
    
    public void moverEnemigo(int dx, int dy)
    {
        
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getX() {
        return x;
    }
}
