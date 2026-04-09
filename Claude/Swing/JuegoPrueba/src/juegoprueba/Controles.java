package juegoprueba;

import javax.swing.*;
import java.awt.event.*;
import java.util.Set;
import java.util.HashSet;

public class Controles implements KeyListener{
    
    private PanelDibujo sprite;
    int movimiento = 5;
    
    private Set<Integer> teclasPulsadas = new HashSet<>();
    
    public Controles(PanelDibujo sprite)
    {
        this.sprite = sprite;
        
        Timer gameLoop = new Timer(16, e -> procesarMovimentos());
        gameLoop.start();
    }
    
    private void procesarMovimentos() 
    {
        if(!sprite.getJugador1().isDeath())
        {
            int dx1 = 0;
            int dy1 = 0;
        
            if(teclasPulsadas.contains(KeyEvent.VK_W))
                dy1 -= movimiento;
            if(teclasPulsadas.contains(KeyEvent.VK_S))
                dy1 += movimiento;
            if(teclasPulsadas.contains(KeyEvent.VK_A))
                dx1 -= movimiento;
            if(teclasPulsadas.contains(KeyEvent.VK_D))
                dx1 += movimiento;
            if(dx1 != 0 || dy1 != 0)
                sprite.moverJugador1(dx1, dy1);
        }
        
        if(!sprite.getJugador2().isDeath())
        {
            int dx2 = 0;
            int dy2 = 0;
            if(teclasPulsadas.contains(KeyEvent.VK_UP))
                dy2 -= movimiento;
            if(teclasPulsadas.contains(KeyEvent.VK_DOWN))
                dy2 += movimiento;
            if(teclasPulsadas.contains(KeyEvent.VK_LEFT))
                dx2 -= movimiento;
            if(teclasPulsadas.contains(KeyEvent.VK_RIGHT))
                dx2 += movimiento;
            if(dx2 != 0 || dy2 != 0)
                sprite.moverJugador2(dx2, dy2);
        }
        
        
        sprite.actualizarDisparo();
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        teclasPulsadas.add(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        teclasPulsadas.remove(e.getKeyCode());
    }
}
