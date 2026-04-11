package juegoprueba.visualizador;

import juegoprueba.entidades.jugador.Jugador;

public class Camara 
{
    private int x;
    private int y;
    private Jugador j;
    
    public Camara(Jugador j, int pantallaX, int pantallaY)
    {
        this.j = j;
        x = j.getX() - pantallaX / 2;
        y = j.getY() - pantallaY / 2;
    }
    
    public void seguir(int xV, int yV)
    {
        x = j.getX() - xV / 2;
        y = j.getY() - yV / 2;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
