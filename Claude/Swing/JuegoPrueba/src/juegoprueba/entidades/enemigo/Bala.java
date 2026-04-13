package juegoprueba.entidades.enemigo;

import java.awt.Color;
import java.awt.Graphics;
import juegoprueba.entidades.jugador.Jugador;

public class Bala extends Enemigo
{

    private int ancho = 4;
    private int alto = 4;
    private int x = 0;
    private int y = 0;
    private boolean lockIn = false;
    private boolean dibujado = false;
    private double angleIn;
    
    public Bala(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void dibujar(Graphics g) 
    {
        g.setColor(Color.darkGray);
        g.fillRect(x, y, ancho, alto);
        setDibujado(true);
    }

    @Override
    public void actualizar(Jugador j1, Jugador j2) 
    {
        int movimiento = 7;
            if(!lockIn)
            {

                int cx = x + ancho / 2;
                int cy = y + alto / 2;
            
                int cx1 = j1.getX() + 25;
                int cy1 = j1.getY() + 25;
                int cx2 = j2.getX() + 25;
                int cy2 = j2.getY() + 25;
        
                double dist1 = Math.pow(cx - cx1, 2) + Math.pow(cy - cy1, 2);
                double dist2 = Math.pow(cx - cx2, 2) + Math.pow(cy - cy2, 2);
            
                int targetX;
                int targetY;
            
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
            
                setAngleIn(angle);
                setLockIn(true);
            }
            else
            {
                if(j1.isDeath() && j2.isDeath())
                {
                    movimiento = 0;
                }
            
                x += (int)(Math.cos(angleIn) * movimiento);
                y += (int)(Math.sin(angleIn) * movimiento);
            }
    }

    @Override
    public void setX(int xE) 
    {
        x = xE;
    }

    @Override
    public void setY(int yE) 
    {
        y = yE;
    }

    @Override
    public int getX() 
    {
        return x;
    }

    @Override
    public int getY() 
    {
        return y;
    }

    @Override
    public int getAncho() 
    {
        return ancho;
    }

    @Override
    public int getAlto() 
    {
        return alto;
    }

    public boolean isLockIn() {
        return lockIn;
    }

    public void setLockIn(boolean lockIn) {
        this.lockIn = lockIn;
    }

    public void setAngleIn(double angleIn) {
        this.angleIn = angleIn;
    }

    public void setDibujado(boolean input)
    {
        dibujado = input;
    }
}
