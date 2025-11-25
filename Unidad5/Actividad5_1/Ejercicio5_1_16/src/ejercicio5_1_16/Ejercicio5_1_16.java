package ejercicio5_1_16;

import java.util.Scanner;

public class Ejercicio5_1_16 
{
    
    public static char letraDNI(int numero)
    {
        char letra = ' ';
        switch(numero%23)
        {
            case 0 -> letra = 'T';
            case 1 -> letra = 'R';
            case 2 -> letra = 'W';
            case 3 -> letra = 'A';
            case 4 -> letra = 'G';
            case 5 -> letra = 'M';
            case 6 -> letra = 'Y';
            case 7 -> letra = 'F';
            case 8 -> letra = 'P';
            case 9 -> letra = 'F';
            case 10 -> letra = 'X';
            case 11 -> letra = 'B';
            case 12 -> letra = 'N';
            case 13 -> letra = 'J';
            case 14 -> letra = 'Z';
            case 15 -> letra = 'S';
            case 16 -> letra = 'Q';
            case 17 -> letra = 'V';
            case 18 -> letra = 'H';
            case 19 -> letra = 'L';
            case 20 -> letra = 'C';
            case 21 -> letra = 'K';
            case 22 -> letra = 'E';
            default -> System.out.println("Error");
        }
        return letra;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int DNI;
        System.out.printf("Escribe tu DNI sin la letra: ");
        DNI = sc.nextInt();
        
        System.out.println("Tu letra asociad es la " + letraDNI(DNI));
    }
}
