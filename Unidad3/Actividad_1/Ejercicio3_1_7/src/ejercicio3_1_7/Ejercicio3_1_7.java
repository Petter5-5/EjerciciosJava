package ejercicio3_1_7;
public class Ejercicio3_1_7 
{
    public static void main(String[] args) 
    {
        int i = 1, nota, suspenso = 0, suficiente = 0, bien = 0, notable = 0, sobresaliente = 0;
        
        while(i < 6)
        {
            nota = (int) (Math.random()*11);
            System.out.printf("Nota%d->%d ",i,nota);
            
            if(nota <= 4)
                suspenso++;
            else if (nota == 5)
                suficiente++;
            else if (nota == 6)
                bien++;
            else if (nota == 7 || nota == 8)
                notable++;
            else
                sobresaliente++;
            i++;
        }
        System.out.printf("%nSuspenso: %d%n", suspenso);
        System.out.println("Suficiente: " + suficiente);
        System.out.println("Bien: " + bien);
        System.out.println("Notable: " + notable);
        System.out.println("Sobresaliente: " + sobresaliente);
    }
}
