package juegoprueba.visualizador;

import juegoprueba.entidades.enemigo.Enemigo;
import juegoprueba.entidades.enemigo.Disparo;
import juegoprueba.entidades.Hitbox;
import juegoprueba.entidades.jugador.Jugador1;
import juegoprueba.entidades.jugador.Jugador2;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class PanelDibujo extends JPanel
{
    private Jugador1 jugador1;
    private Jugador2 jugador2;
    private Disparo disparo;
    
    public PanelDibujo()
    {
        this.jugador1 = new Jugador1();
        this.jugador2 = new Jugador2();
        this.disparo = new Disparo();
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        if(!jugador1.isDeath())
            jugador1.dibujar(g);
        
        if(!jugador2.isDeath())
            jugador2.dibujar(g);
        
        
        Enemigo.dibujar(g);
        Disparo.dibujar(g);
    }
    
    public void moverJugador1(int dx, int dy)
    {
        jugador1.setY((jugador1.getY() + dy));
        jugador1.setX((jugador1.getX() + dx));
        jugador1.isOut(Ventana.getAncho(), Ventana.getAlto());
            
        if(Hitbox.colision(jugador1, jugador2))
        {
            jugador1.setY((jugador1.getY() - dy));
            jugador1.setX((jugador1.getX() - dx)); 
        }
        repaint();
    }
    
    public void moverJugador2(int dx, int dy)
    {
        jugador2.setY((jugador2.getY() + dy));
        jugador2.setX((jugador2.getX() + dx));
        jugador2.isOut(Ventana.getAncho(), Ventana.getAlto());
        
        if(Hitbox.colision(jugador2, jugador1))
        {
            jugador2.setY((jugador2.getY() - dy));
            jugador2.setX((jugador2.getX() - dx)); 
        }
        repaint();
    }
    
    public void actualizarDisparo()
    {
        Disparo.actualizar(jugador1, jugador2);
        
        if(Hitbox.colision(disparo, jugador1))
            jugador1.setDeath(true);
        if(Hitbox.colision(disparo, jugador2))
            jugador2.setDeath(true);
        
        repaint();
    }
    

    public Jugador1 getJugador1() {
        return jugador1;
    }

    public Jugador2 getJugador2() {
        return jugador2;
    }
}
