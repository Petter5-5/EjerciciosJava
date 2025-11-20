package ejercicio5_1_3;
public class Ejercicio5_1_3 
{
    
    public static int horasMinutos(int horas, int minutos)
    {
        return horas * 60 + minutos;
    }
    
    public static void main(String[] args) 
    {
        int horas = 4, minutos = 34;
        System.out.printf("Hay %d minutos en %d horas + %d minutos %n", horasMinutos(horas, minutos), horas, minutos);
    }
}
