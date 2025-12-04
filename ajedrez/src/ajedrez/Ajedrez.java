package ajedrez;
//casilla blaca \u25A0 Casilla negra \u25A1

public class Ajedrez 
{
    public static void rellenar (String[][] tablero)
    {
        for(int i = 0; i < tablero.length; i++)
        {
            System.out.print((tablero.length - i) + " ");
            for(int j = 0; j < tablero[i].length; j++)
            {
                if (i % 2 == 0)
                {
                    if(j % 2 == 0)
                    {
                        tablero[i][j] = "\u25A0";
                        System.out.print(tablero[i][j] + " ");
                    }
                    else
                    {
                        tablero[i][j] = "\u25A1";
                        System.out.print(tablero[i][j] + " ");
                    }
                }
                else
                {
                    if(j % 2 == 0)
                    {
                        tablero[i][j] = "\u25A1";
                        System.out.print(tablero[i][j] + " ");
                    }
                    else
                    {
                        tablero[i][j] = "\u25A0";
                        System.out.print(tablero[i][j] + " ");
                    }
                }
            }
            System.out.println("");
        }
        System.out.printf("  a  b c  d e f  g h %n");
    }
    
    public static void main(String[] args) 
    {
        String[][] tablero = new String[8][8];
        
        rellenar(tablero);
    }
}
