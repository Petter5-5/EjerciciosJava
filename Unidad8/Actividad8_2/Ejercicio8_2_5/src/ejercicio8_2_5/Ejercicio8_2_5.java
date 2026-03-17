package ejercicio8_2_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8_2_5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Gato> gatos = new ArrayList<>();
        
        String nombre;
        int edad;
        
        while(gatos.size() != 3)
        {   
                System.out.println("Dime el nombre del gato");
                nombre = sc.nextLine();
                System.out.println("Dime la edad");
                edad = sc.nextInt();
            try
            {
                gatos.add(new Gato(nombre, edad));
            }catch(NombreNoValidoException | EdadNoValidaException e)
            {
                System.out.println(e.getMessage());
            }finally
            {
                System.out.println("-----");
                sc.nextLine();

            }
        }
        
        gatos.forEach(g -> System.out.println(g));
    }
}
