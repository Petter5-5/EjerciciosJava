package ejercicio8_1_1;
public class Ejercicio8_1_1 
{
    public static void main(String[] args) 
    {
        Titular[] titulares = new Titular[3];
        
        titulares[0] = new Titular("33358687A", "Alberto");
        titulares[1] = new Titular("30363687T", "Silvia");
        
        CuentaBancaria cuentaBancaria = new CuentaBancaria("ES726-234-2323", 1500, titulares);
        
        cuentaBancaria.mostrarDatos();
        System.out.println("");
        System.out.println("");
        
        System.out.println("--- Añadiendo un nuevo titular ---");
        Titular titular = new Titular("33384325R", "Fernando");
        cuentaBancaria.añadirTitular(titular);
        cuentaBancaria.mostrarDatos();
    }
}
