package proyecto;

import static proyecto.Dibujado.*;
import static proyecto.Menu.*;
import static proyecto.Motor.*;
import static proyecto.LetrasFalladas.*;
import java.util.Scanner;

public class Proyecto 
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        
        String[] palabras = Motor.libreriaPalabras(); 
        String palabra = Motor.laPalabra(palabras);
        
        char[] letras = Motor.rellenar(palabra);
        char letraAdv;
        char[] letrasFalladas = new char[6];
        char[] relevado = Motor.revelador(letras);
        
        int fallos = 0;
        int vida = 6;
        
        boolean terminado = false;
        
        Dibujado.Ejecutor(fallos);
        
        while(!terminado)
        {
            terminado = Motor.terminado(relevado);
            System.out.println("Pon una letra");
            letraAdv = sc.next().charAt(0);
            System.out.println("\n");
            Motor.adivinar(letras, relevado, letraAdv);
            System.out.println();
            fallos = LetrasFalladas.Ejecutor(letras, letrasFalladas, letraAdv, fallos, vida);
            Dibujado.Ejecutor(fallos);
        }
        //Menu.dibujarMenu();
    }
}