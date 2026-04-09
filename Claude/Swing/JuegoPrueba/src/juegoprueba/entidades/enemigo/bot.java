package juegoprueba.entidades.enemigo;

import juegoprueba.entidades.jugador.Jugador;
import java.awt.*;
import juegoprueba.visualizador.Ventana;

public class Bot extends Enemigo
{
    private int ancho = 26;
    private int alto = 26;
    private int x = (Ventana.getAncho() / 2) - 37;
    private int y = (Ventana.getAlto() / 2) - 37;
    
    public Bot()
    {
        
    }
    
    public Bot(int x ,int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void dibujar(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, ancho, alto);
    }

    @Override
    public void actualizar(Jugador j1,Jugador j2)
    {
        int movimiento = 4;
        
        int cx = x + ancho / 2;
        int cy = y + alto / 2;
        
        int cx1 = j1.getX() + 25;
        int cy1 = j1.getY() + 25;
        int cx2 = j2.getX() + 25;
        int cy2 = j2.getY() + 25;
        
        double dist1 = Math.pow(cx - cx1, 2) + Math.pow(cy - cy1, 2);
        double dist2 = Math.pow(cx - cx2, 2) + Math.pow(cy - cy2, 2);
        
        int targetX = 0;
        int targetY = 0;
        
        if(j1.isDeath())
        {
            targetX = cx2;
            targetY = cy2;
        }
        else if(j2.isDeath())
        {
            targetX = cx1;
            targetY = cy1;
        }
        else
        {
            targetX = (dist1 <= dist2) ? cx1 : cx2;
            targetY = (dist1 <= dist2) ? cy1 : cy2;
        } 
        
        double angle = Math.atan2(targetY - cy, targetX - cx);
        
        if(j1.isDeath() && j2.isDeath())
        {
            movimiento = 0;
        }
        
        x += (int)(Math.cos(angle) * movimiento);
        y += (int)(Math.sin(angle) * movimiento);
        
    }
    
    @Override
    public void setX(int xE) {
        y = xE;
    }

    @Override
    public void setY(int yE) {
        x = yE;
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
    public int getAncho() {
        return ancho;
    }

    @Override
    public int getAlto() {
        return alto;
    }

}
