package juegoprueba.visualizador;

import java.util.ArrayList;
import java.util.Random;
import juegoprueba.entidades.enemigo.Bot;
import juegoprueba.entidades.enemigo.Enemigo;

public class Chunk 
{
    private int chunkX;
    private int chunkY;
    private ArrayList<Bot> enemigos = new ArrayList<>();
    
    public Chunk(int chunkX, int chunkY)
    {
        this.chunkX = chunkX;
        this.chunkY = chunkY;
        generar();
    }
    
    public void generar()
    {
        Random rand = new Random();
        int cantidad = rand.nextInt(5) + 3;
        for(int i = 0; i < cantidad; i++)
        {
            int ex = chunkX * 500 + rand.nextInt(500);
            int ey = chunkY * 500 + rand.nextInt(500);
            enemigos.add(new Bot(ex, ey));
        }
    }

    public int getChunkX() {
        return chunkX;
    }

    public int getChunkY() {
        return chunkY;
    }

    public ArrayList<Bot> getEnemigos() {
        return enemigos;
    }
    
    
}
