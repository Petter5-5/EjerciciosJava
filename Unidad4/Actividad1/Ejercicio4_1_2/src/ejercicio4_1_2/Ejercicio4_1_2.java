package ejercicio4_1_2;

public class Ejercicio4_1_2 
{
    public static void main(String[] args) 
    {
       
        int numeroMinimo = 10;
        int numeroMaximo = 20;
        int acumuladorPar = 0;
        int acumuladorImpar = 0;
        
        for (int i = numeroMinimo; i <= numeroMaximo; i++ )
        {
            if (i % 2 == 0)
                acumuladorPar += i;
            else
                acumuladorImpar += i;
        }
        System.out.println("La suma de los pares es " + acumuladorPar);
        System.out.println("La suma de los Impares es " + acumuladorImpar);
    }
}
