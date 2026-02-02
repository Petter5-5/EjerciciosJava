package sistema_gestion_personaje_rgp;

import java.util.Arrays;

public class Inventario 
{
    private final int capacidadMaxima = 10;
    private Arma[] armas;
    private int ocupadas;
    
    public Inventario()
    {
        this.armas = new Arma[capacidadMaxima];
        Arrays.fill(this.armas, null);
    }
    
    public boolean añadirArma(Arma weapon)
    {
        boolean añadir = true;
        boolean espacio = false;
        int contador = 0;
        
        while(!espacio && contador < 10);
        {
            if(this.armas[contador] == null)
            {
                this.armas[contador] = weapon;
                espacio = true;
            }
            contador++;
        }
        return añadir;
    }
    
    public Arma obtenerArma(int indice)
    {
        Arma devolver;
        
        if(indice > 10)
            devolver = null;
        devolver = this.armas[indice];
        
        return devolver;
    }
    
    public void mostrarInventario()
    {
        for(int i = 0; i < this.armas.length; i++)
        {
            System.out.printf("%s está en el indice [%d] %n", this.armas[i], i);
        }
    }
}
