package ejercicio6_1_11;
public class Ejercicio6_1_11 
{
    public static void main(String[] args) 
    {
        int vocales = 0, vocalesTotal = 0;
        
        System.out.print("Argumentos recibidos:");
        for (String palabra : args)
        {
            System.out.print(" " + palabra);
        }
        
        System.out.printf("%n%n");
        for (String palabra : args)
        {
            palabra = palabra.toLowerCase();
            for(int i = 0;i < palabra.length(); i++)
            {
                switch(palabra.charAt(i))
                {
                    case 'a','e','i','o', 'u' -> vocales++;
                }
            }
            vocalesTotal += vocales;
            System.out.printf("%s -> vocales: %d %n", palabra, vocales);
            vocales = 0;
        }
        System.out.printf("%nTotal de vocales: %d %n", vocalesTotal);
    }
}
