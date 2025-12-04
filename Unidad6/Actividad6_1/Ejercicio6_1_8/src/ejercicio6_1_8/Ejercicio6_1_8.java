package ejercicio6_1_8;
public class Ejercicio6_1_8 
{
    public static void rellenar(int[][] lista)
    {
        for (int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < lista[i].length; j++)
            {
               lista[i][j] = (int) (Math.random()*1001);
            }
        }
    }
    
    public static void mostrar(int[][] lista)
    {
        int maximo = 0, minimo = lista[0][0], maximoFila = 0, maximoColumna = 0, minimoFila = 0, minimoColumna = 0;
        
        for(int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < lista[i].length; j++)
            {
                System.out.printf("%6d", lista[i][j]);
                if(maximo < lista[i][j])
                {
                    maximo = lista[i][j];
                    maximoFila = i;
                    maximoColumna = j;
                }
                else if(minimo > lista[i][j])
                {
                    minimo = lista[i][j];
                    minimoFila = i;
                    minimoColumna = j;
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.printf("El máximo es %d y está en la fila %d, columna %d %n", maximo, maximoFila, maximoColumna);
        System.out.printf("El mínimo es %d y está en la fila %d, columna %d %n", minimo, minimoFila, minimoColumna);
    }
    
    public static void main(String[] args) 
    {
        int[][] lista = new int[6][10];
        
        rellenar(lista);
        mostrar(lista);
    }
}