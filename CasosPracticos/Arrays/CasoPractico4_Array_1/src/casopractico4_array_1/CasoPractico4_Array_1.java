package casopractico4_array_1;

import java.util.Scanner;

public class CasoPractico4_Array_1 
{
    
    public static void inicializarSala (char[][] sala)
    {
        for (int i = 0; i < sala.length; i++)
        {
            for (int j = 0; j < sala[i].length; j++)
                sala[i][j] = '-';
        }
    }
    
    public static void mostrarSala (char[][] sala)
    {
        int butacasLibres = 0, butacasOcupadas = 0;
        
        System.out.println("Estado de la sala:");
        for (int i = 0; i < sala.length; i++)
        {
            System.out.printf("Fila %d: ", i);
            for (int j = 0; j < sala[i].length; j++)
            {
                System.out.printf("%s", sala[i][j]);
                System.out.print(" ");
                if (sala[i][j] == 'O')
                    butacasOcupadas++;
                else
                    butacasLibres++;
            }
            System.out.println("");
        }
        System.out.println("Butacas libres: " + butacasLibres);
        System.out.println("Butacas ocupadas: " + butacasOcupadas);
        System.out.println("");
    }
    
    public static void reservarButaca(char[][] sala, int columna, int fila)
    {
        if (fila > sala.length || columna > sala[1].length)
            System.out.println("Fila o columna está fuera de rango.");
        else if (sala[fila][columna] == 'O')
            System.out.println("Esta butaca ya está ocupada");
        else
        {
            sala[fila][columna] = 'O';
            System.out.println("Butaca reservada correctamente");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        char[][] sala = new char[5][8];
        int columna, fila = 0; 
        
        inicializarSala(sala);
        mostrarSala(sala);
        
        while (fila >= 0)
        {
            System.out.print("Introduce la fila (negativa para terminar): ");
            fila = sc.nextInt();
            if(fila >= 0)
            {
                System.out.print("Introduce la columna: ");
                columna = sc.nextInt();
                reservarButaca(sala, fila, columna);
                mostrarSala(sala);
            }   
        }
        System.out.println("Programa terminado.");
    }
}
