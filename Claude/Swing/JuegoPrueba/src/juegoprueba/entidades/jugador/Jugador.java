package juegoprueba.entidades.jugador;

import java.awt.*;

public abstract class Jugador 
{    
    public abstract void dibujar (Graphics g);
    
    public abstract void isOut(int dx ,int dy);
    
    public abstract int getX();
    
    public abstract int getY();
    
    public abstract int getWidth();
    
    public abstract int getHeight();
    
    public abstract boolean isDeath();
    
    public abstract void setDeath(boolean muerte);
}
