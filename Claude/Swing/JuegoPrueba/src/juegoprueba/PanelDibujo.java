package juegoprueba;

import javax.swing.*;
import java.awt.*;


public class PanelDibujo extends JPanel
{
    int y = 100;
    int x = 100;
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.fillRect(x, y, 50, 50);
    }
    
    public void mover(int dx, int dy)
    {
        y += dy;
        x += dx;
        
        repaint();
    }
}
