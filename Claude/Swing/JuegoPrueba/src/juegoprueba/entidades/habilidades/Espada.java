package juegoprueba.entidades.habilidades;

import java.awt.Graphics;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Collection;
import javax.swing.ImageIcon;
import juegoprueba.entidades.enemigo.Bot;
import juegoprueba.entidades.jugador.Jugador;
import juegoprueba.visualizador.Chunk;
import juegoprueba.visualizador.ChunkManager;

public class Espada extends Habilidad {
    
    private int distancia = 40;
    private double angulo = 0;
    private int anchoSprite = 40;
    private int altoSprite = 40;
    private Image sprite;

    private int x;
    private int y;
    
    public Espada()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/juegoprueba/resource/sprite/stick.png"));
        sprite = icon.getImage();
    }
    
    public void actualizar(Jugador j, Collection<Chunk> chunks){
        int jCx = j.getX() + j.getWidth()/2;
        int jCy = j.getY() + j.getHeight()/2;
        
        Bot masCercano = null;
        double menorDist = Double.MAX_VALUE;
        
        for(Chunk chunk : chunks){
            for(Bot e : chunk.getEnemigos()){
                double dist = Math.pow(jCx - e.getX(), 2) + Math.pow(jCy - e.getY(), 2);
                if(dist < menorDist)
                {
                    menorDist = dist;
                    masCercano = e;
                }
            }
        }
        
        if(masCercano != null){
            int eCx = masCercano.getX() + masCercano.getAncho()/2;
            int eCy = masCercano.getY() + masCercano.getAlto()/2;
            angulo = Math.atan2(eCy - jCy, eCx - jCx);
        }
        
        x = (int)(jCx + Math.cos(angulo) * distancia);
        y = (int)(jCy + Math.sin(angulo) * distancia);
    }
    
    public boolean golpea(Bot e)
    {
         Rectangle hitboxEspada = new Rectangle(x - anchoSprite/2, y - altoSprite/2, anchoSprite, altoSprite);
         Rectangle hitboxEnemigo = new Rectangle(e.getX(), e.getY(), e.getAncho(), e.getAlto());
         return hitboxEspada.intersects(hitboxEnemigo);
    }
    
    @Override
    public void dibujarConCamara(Graphics g, int camaraX, int camaraY) {
        Graphics2D g2d = (Graphics2D) g;
        
        int drawX = x - camaraX - anchoSprite/2;
        int drawY = y - camaraY - altoSprite/2;
        
        AffineTransform original = g2d.getTransform();
        
        g2d.rotate(angulo, x - camaraX, y - camaraY);
        g2d.drawImage(sprite, drawX, drawY, anchoSprite, altoSprite, null);
        
        g2d.setTransform(original);
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getAlto() {
        return altoSprite;
    }

    @Override
    public int getAncho() {
        return anchoSprite;
    }
}
