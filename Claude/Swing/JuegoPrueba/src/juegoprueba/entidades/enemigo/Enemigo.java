package juegoprueba.entidades.enemigo;

import java.awt.*;
import juegoprueba.entidades.jugador.Jugador;

public abstract class Enemigo
{
    public abstract void dibujar(Graphics g);
    
    public abstract void actualizar(Jugador j1,Jugador j2);
    
    public abstract void setX(int xE);
    
    public abstract void setY(int yE);
    
    public abstract int getX();
    
    public abstract int getY();
    
    public abstract int getAncho();
    
    public abstract int getAlto();
}
