package ejercicio6_1_7;
public class Ejercicio6_1_7 
{
    public static void rellenar(int[][] lista)
    {
        for (int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < lista[i].length; j++)
            {
               lista[i][j] = (int) (Math.random()*201);
            }
        }
    }
    
    public static void mostrar(int[][] lista, int tamañoX, int tamañoY)
    {
        int sumaFila = 0, sumaColumna = 0, sumaTotal = 0;
        
        for (int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < lista[i].length; j++)
            {
                System.out.printf("%7d", lista[i][j]);
                sumaFila += lista[i][j];
            }
            System.out.printf("  | %5d %n", sumaFila);
            sumaTotal += sumaFila;
            sumaFila = 0;
        }
        
        System.out.println("---------------------------------------------");
  
        int[][] listaInvertida = invertirMatriz(lista, tamañoX, tamañoY);
    
        for (int i = 0; i < listaInvertida.length; i++)
        {
            for(int j = 0; j < listaInvertida[i].length; j++)
            {
                sumaColumna += listaInvertida[i][j];
            }
            System.out.printf("  %5d", sumaColumna);
            sumaTotal += sumaColumna;
            sumaColumna = 0;
        }
        System.out.printf("  | %5d %n", sumaTotal);
    }
    
    public static int[][] invertirMatriz(int[][] lista, int tamañoX, int tamañoY)
    {
        int[][] listaInvertida = new int[tamañoY][tamañoX];
        for (int i = 0; i < lista.length; i++)
        {
            for(int j = 0; j < lista[i].length; j++)
            {
                listaInvertida[j][i] = lista[i][j];
            }
        }
        return listaInvertida;
    }
    
    public static void main(String[] args) 
    {
        int tamañoX = 4, tamañoY = 5;
        int[][] lista = new int[tamañoX][tamañoY];
        
        rellenar(lista);
        mostrar(lista, tamañoX, tamañoY);
    }
}