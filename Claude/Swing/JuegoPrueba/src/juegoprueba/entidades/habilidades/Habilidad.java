package juegoprueba.entidades.habilidades;

import java.awt.Graphics;

public abstract class Habilidad 
{
    public abstract void dibujarConCamara(Graphics g ,int camaraX, int camaraY);
    
    public abstract int getX();
    
    public abstract int getY();
    
    public abstract int getAlto();
    
    public abstract int getAncho();
}
