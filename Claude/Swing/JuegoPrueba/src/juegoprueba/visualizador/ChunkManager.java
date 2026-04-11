package juegoprueba.visualizador;

import java.util.Collection;
import java.util.HashMap;

public class ChunkManager 
{
    private static HashMap<String, Chunk> chunksActivo = new HashMap<>();
    private static final int TAMANO_CHUNK = 500;
    private static final int RADIO = 2;
    
    public void actualizar(int jugadorX, int jugadorY)
    {
        int cx = jugadorX / TAMANO_CHUNK;
        int cy = jugadorY / TAMANO_CHUNK;
        
        for(int dx = -RADIO; dx <= RADIO; dx++)
        {
            for(int dy = -RADIO; dy <= RADIO; dy++)
            {
                String key = (cx + dx) + "," + (cy +dy);
                if(!chunksActivo.containsKey(key))
                {
                    chunksActivo.put(key, new Chunk(cx + dx, cy + dy));
                }
            }
        }
        
        chunksActivo.entrySet().removeIf(entry -> {
            Chunk c = entry.getValue();
            return Math.abs(c.getChunkX() - cx) > RADIO + 1 ||
                   Math.abs(c.getChunkY() - cy) > RADIO +1;
        });
    }
    
    public static Collection<Chunk> getChunkActivos()
    {
        return chunksActivo.values();
    }
}
