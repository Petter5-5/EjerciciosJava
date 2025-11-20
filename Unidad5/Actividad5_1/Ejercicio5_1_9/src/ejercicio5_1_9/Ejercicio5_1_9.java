package ejercicio5_1_9;
public class Ejercicio5_1_9 
{
    
    public static String calculadoraBase2(int numero)
    {
        String binarioInverso = "", resultado = "";
        int base2;
        
        while(numero > 1)
        {
            base2 = numero % 2;
            binarioInverso += base2;
            numero = numero/2;
        }
        binarioInverso += numero;
        for(int i = binarioInverso.length() - 1; i != -1; i--)
        {
            resultado += binarioInverso.charAt(i);
        }
        
        return resultado;
    }
    
    public static void main(String[] args) 
    {
        int numero = 5763;
        System.out.printf("El numero %d de base 10 en base 2 es %s %n", numero, calculadoraBase2(numero));
    }
}
