package ejercicio6_1_6;
public class Ejercicio6_1_6 
{
    public static char[][] crearMatriz(int n)
    {
        return new char[n][n];
    }
    
    public static void imprimirMatriz(char[][] m)
    {
        int posicionX = 0;
        
        for (int i = 0; i < m.length; i++)
        {
            for(int j = 0; j < m[i].length; j++)
            {
                if(posicionX == j )
                    m[i][j] = 'X';
                else
                    m[i][j] = '-';
                System.out.printf("%s ", m[i][j]);
            }
            System.out.println("");
            posicionX++;
        }
    }
    
    public static void main(String[] args) 
    {
        int n = 4;
        
        char[][] m = crearMatriz(n);
        imprimirMatriz(m);
    }
}