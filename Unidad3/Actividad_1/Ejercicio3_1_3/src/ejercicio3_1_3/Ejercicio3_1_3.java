package ejercicio3_1_3;

import java.util.Scanner;

public class Ejercicio3_1_3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3;
        int media;
        
        System.out.print("Por favor, introduzca la primera nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Ahora introduzca la segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("Por ultimo introduzca la tercera nota: ");
        nota3 = sc.nextDouble();
        
        //Saber si las notas introducidas son correctas
        if (nota1 <= 0 || nota1 >= 10)
            System.out.println("la primera nota no es valida: " + nota1);
        else if (nota2 <= 0 || nota2 >= 10)
            System.out.println("la segunda nota no es valida: " + nota2);
        else if (nota3 <= 0 || nota3 >= 10)
            System.out.println("la tercera nota no es valida: " + nota3);
        else{
            
        //Puntuacion de la media
            media = (int) (nota1 + nota2 + nota3) / 3;
            System.out.println("Nota numerica: " + media);
            switch(media){
                case 0,1,2,3,4 -> System.out.print("\u001B[33mNota Bletin: insuficiente");
                case 5 -> System.out.println("\u001B[33mNota Boletin: suficiente");
                case 6 -> System.out.println("\u001B[33mNota Boletin: Bien");
                case 7,8 -> System.out.println("\u001B[33mNota Boletin: Notable");
                case 9,10 -> System.out.println("\u001B[33mNota Boletin: Sobresaliente");
                default -> System.out.println("Error");
            }
        }   
    }
}
