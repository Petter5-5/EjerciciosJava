package juegoprueba;

import javax.swing.*;
import java.awt.event.*;

public class Controles extends JFrame implements KeyListener{
    
    private PanelDibujo sprite;
    int movimiento = 10;
    
    public Controles(PanelDibujo sprite)
    {
        this.sprite = sprite;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Tecla presionada: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode())
        {
            case KeyEvent.VK_W -> {
                sprite.mover(0, -movimiento);
            }
            case KeyEvent.VK_S -> {
                sprite.mover(0, movimiento);
            }
            case KeyEvent.VK_A -> {
                sprite.mover(-movimiento, 0);
            }
            case KeyEvent.VK_D -> {
                sprite.mover(movimiento, 0);
            }
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
