package juegoprueba;

import java.awt.*;
import java.util.ArrayList;

public class Hitbox 
{
    public static boolean colision(Jugador j1, Jugador j2)
    {
        boolean resultado = false;
        
        for (Point p : getPuntosMuestra(j1))
        {
            if(puntoEnCuadrado(p.x, p.y, j2))
                resultado = true;
        }
        
        for (Point p : getPuntosMuestra(j2))
        {
            if(puntoEnCuadrado(p.x, p.y, j1))
                resultado = true;
        }
        
        return resultado;
    }
    
    public static boolean puntoEnCuadrado(int px, int py, Jugador j)
    {
        return px >= j.getX() &&
               px <= j.getX() + j.getWidth() &&
               py >= j.getY() &&
               py <= j.getY() + j.getHeight();
    }
    
    public static ArrayList<Point> getPuntosMuestra(Jugador j)
    {
        int x = j.getX();
        int y = j.getY();
        int w = j.getWidth();
        int h = j.getHeight();
        ArrayList<Point> puntos = new ArrayList<>();
        
        //4 Esquinas
        puntos.add(new Point(x,y));
        puntos.add(new Point(x+w,y));
        puntos.add(new Point(x,y+h));
        puntos.add(new Point(x+w,y+h));
        
        //4 centros del lados
        puntos.add(new Point(x + w/2,y));
        puntos.add(new Point(x+w/2,y +h));
        puntos.add(new Point(x,y+h/2));
        puntos.add(new Point(x+w,y+h/2));
        
        //centro 
        puntos.add(new Point(x + w/2, y + h/2));
                
        return puntos;
    }
    
    // ENIMIGOOOOOOOOOOOOOOOOSSSSSSSSSSSSSS
    public static boolean colision(Disparo d, Jugador j2)
    {
        boolean resultado = false;
        
        for (Point p : getPuntosMuestra(d))
        {
            if(puntoEnCuadrado(p.x, p.y, j2))
                resultado = true;
        }
        
        for (Point p : getPuntosMuestra(j2))
        {
            if(puntoEnCuadrado(p.x, p.y, d))
                resultado = true;
        }
        
        return resultado;
    }
    
    public static ArrayList<Point> getPuntosMuestra(Disparo d)
    {
        int x = d.getX();
        int y = d.getY();
        int w = d.getAncho();
        int h = d.getAlto();
        ArrayList<Point> puntos = new ArrayList<>();
        
        //4 Esquinas
        puntos.add(new Point(x,y));
        puntos.add(new Point(x+w,y));
        puntos.add(new Point(x,y+h));
        puntos.add(new Point(x+w,y+h));
        
        //4 centros del lados
        puntos.add(new Point(x + w/2,y));
        puntos.add(new Point(x+w/2,y +h));
        puntos.add(new Point(x,y+h/2));
        puntos.add(new Point(x+w,y+h/2));
        
        //centro 
        puntos.add(new Point(x + w/2, y + h/2));
                
        return puntos;
    }
    
    public static boolean puntoEnCuadrado(int px, int py, Disparo d)
    {
        return px >= d.getX() &&
               px <= d.getX() + d.getAncho() &&
               py >= d.getY() &&
               py <= d.getY() + d.getAlto();
    }
}
