package juegoprueba.entidades.habilidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.util.Collection;
import javax.swing.ImageIcon;
import juegoprueba.entidades.enemigo.Bot;
import juegoprueba.entidades.jugador.Jugador;
import juegoprueba.visualizador.Chunk;

public class Basico extends Habilidad
{
    private int x;
    private int y;
    private int ancho = 4;
    private int alto = 4;
    private static double angleIn = 0;
    
    public Basico(Jugador j, Collection<Chunk> chunks)
    {
        this.x = j.getX() + j.getWidth()/ 2;
        this.y = j.getY() + j.getWidth()/ 2;
        
        int cx = x;
        int cy = y;
        
        double distFinal = 999999;
        int targetX = 0;
        int targetY = 0;
        
        for(Chunk ck : chunks)
        {
            for(Bot b : ck.getEnemigos())
            {
                int cx1 = b.getX() + 13;
                int cy1 = b.getY() + 13;
                
                double distB = Math.pow(cx - cx1, 2) + Math.pow(cy - cy1, 2);
                
                if(distFinal > distB)
                {
                    distFinal = distB;
                    targetX = cx1;
                    targetY = cy1;
                }
            }
        }
        double angle = Math.atan2(targetY - cy, targetX - cx);
                
        this.angleIn = angle;
    }
    
    @Override
    public void dibujarConCamara(Graphics g ,int camaraX, int camaraY) 
    {
        g.setColor(Color.RED);
        g.fillRect(x - camaraX, y - camaraY, ancho, alto);
    }
    
    public void actualizar()
    {
        x += (int)(Math.cos(angleIn) * 13);
        y += (int)(Math.sin(angleIn) * 13);
    }

    @Override
    public int getX() {return x;}
    @Override
    public int getY() {return y;}
    @Override
    public int getAlto() {return alto;}
    @Override
    public int getAncho() {return ancho;}
    public static double getAngleIn() {return angleIn;}
}
