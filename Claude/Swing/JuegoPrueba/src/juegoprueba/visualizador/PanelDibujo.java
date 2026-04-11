package juegoprueba.visualizador;

import juegoprueba.entidades.enemigo.Enemigo;
import juegoprueba.entidades.enemigo.Bot;
import juegoprueba.entidades.Hitbox;
import juegoprueba.entidades.jugador.Jugador1;
import juegoprueba.entidades.jugador.Jugador2;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import juegoprueba.entidades.enemigo.Bala;


public class PanelDibujo extends JPanel
{
    private Jugador1 jugador1;
    private Jugador2 jugador2;
    private Camara camara1;
    private ArrayList<Bot> enemigos;
    
    public PanelDibujo()
    {
        this.jugador1 = new Jugador1();
        this.jugador2 = new Jugador2();
        this.camara1 = new Camara(jugador1, Ventana.getAncho(), Ventana.getAlto());
        this.enemigos = new ArrayList<>();
        
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for(Chunk chunk : ChunkManager.getChunkActivos())
        {
            for(Bot e : chunk.getEnemigos())
            {
                e.dibujarConCamara(g,camara1.getX(), camara1.getY());
                
            }
        }
        
        if(!jugador1.isDeath())
            jugador1.dibujarConCamara(g, camara1.getX(), camara1.getY());
        
        if(!jugador2.isDeath())
            jugador2.dibujar(g);
        
        for(Bot b : enemigos)
        {
            b.dibujar(g);
                for(Bala b2 : b.getBalas())
                {
                    b2.dibujar(g);
                    b2.setDibujado(true);
                }
        }
    }
    
    public void moverJugador1(int dx, int dy)
    {
        jugador1.setY((jugador1.getY() + dy));
        jugador1.setX((jugador1.getX() + dx));
        camara1.seguir(Ventana.getAncho(), Ventana.getAlto());
        //jugador1.isOut(Ventana.getAncho(), Ventana.getAlto());
            
        if(Hitbox.colision(jugador1, jugador2) && jugador1.isDeath())
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
        //jugador2.isOut(Ventana.getAncho(), Ventana.getAlto());
        
        if(Hitbox.colision(jugador2, jugador1) && jugador2.isDeath())
        {
            jugador2.setY((jugador2.getY() - dy));
            jugador2.setX((jugador2.getX() - dx)); 
        }
        repaint();
    }
    
    public void actualizarDisparo()
    {
        for(Bot b : enemigos)
        {
            b.actualizar(jugador1, jugador2);
        
            if(Hitbox.colision(b, jugador1))
                jugador1.setDeath(true);
            if(Hitbox.colision(b, jugador2))
                jugador2.setDeath(true);
        }
        repaint();
    }
    
    public void actualizarBala()
    {
        for(Bot b : enemigos)
        {
            Iterator<Bala> it = b.getBalas().iterator();
            while(it.hasNext())
            {
                Bala b2 = it.next();
                b2.actualizar(jugador1, jugador2);
                if(Hitbox.colision(b2, jugador1))
                    jugador1.setDeath(true);
                if(Hitbox.colision(b2, jugador2))
                    jugador2.setDeath(true);
                if(Hitbox.isOut(Ventana.getAncho(), Ventana.getAlto(), b2.getX(), b2.getY()))
                {
                    it.remove();
                }
            }
        }
    }
    

    public Jugador1 getJugador1() {
        return jugador1;
    }

    public Jugador2 getJugador2() {
        return jugador2;
    }

    public ArrayList<Bot> getEnemigos() {
        return enemigos;
    }
}
