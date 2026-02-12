package ejercicio8_1_1;

public class CuentaBancaria 
{
    private String iban;
    private double saldo;
    private Titular[] titulares;
    
    public CuentaBancaria(String iban, double saldo, Titular[] titulares)
    {
        this.iban = iban;
        this.saldo = saldo;
        this.titulares = titulares;
    }
    
    public void añadirTitular(Titular t)
    {
        int contador = 0;
        boolean terminado =  false;
        
        while(!terminado && contador < titulares.length)
        {
            if(titulares[contador] == null)
            {
                titulares[contador] = t;
                terminado = true;
            }
            contador++;
        }
    }
    
    public void mostrarDatos()
    {
        System.out.println("Iban: " + iban);
        System.out.println("Saldo: " + saldo + "€");
        System.out.printf("Titulares: [");
        
        int contador = 0;
        boolean terminado =  false;
        while(!terminado && contador < titulares.length)
        {
            if(contador + 1 != titulares.length)
                if(titulares[contador] != null)
                {
                    System.out.printf("%s , ", titulares[contador]);
                }
                else
                    terminado = true;
            else
            {
                System.out.printf("%s", titulares[contador]);
                terminado = true;
            }
            contador++;
        }
        
        System.out.printf(" ]%n");
    }
}
