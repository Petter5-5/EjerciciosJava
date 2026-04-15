package juegoprueba.entidades.habilidades;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Collection;
import juegoprueba.entidades.enemigo.Bot;
import juegoprueba.entidades.jugador.Jugador;
import juegoprueba.visualizador.Chunk;

public class Basico extends Habilidad
{
    private int x;
    private int y;
    private int ancho = 4;
    private int alto = 4;
    private double angleIn;
    
    public Basico(Jugador j, Collection<Chunk> chunks)
    {
        
        this.x = j.getX();
        this.y = j.getY();
        
        int cx = x + j.getX() / 2;
        int cy = y + j.getX() / 2;
        
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
}
