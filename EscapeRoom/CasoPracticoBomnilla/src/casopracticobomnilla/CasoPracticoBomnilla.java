package casopracticobomnilla;
public class CasoPracticoBomnilla 
{
    public static void main(String[] args) 
    {
        
        Bombilla bombilla1 = new Bombilla();
        Bombilla bombilla2 = new Bombilla(true);
        Bombilla bombilla3 = new Bombilla(true);
        
        System.out.println("--- Estado inicial ---");
        System.out.println(bombilla1);
        System.out.println(bombilla2);
        System.out.println(bombilla3);
        System.out.println("");
        
        System.out.println("--- Conmutar la bombilla 2 cuatro veces ---");
        bombilla2.conmutar();
        bombilla2.conmutar();
        bombilla2.conmutar();
        bombilla2.conmutar();
        System.out.println(bombilla2);
        System.out.println("");
        
        System.out.println("--- Encender bombilla 2 ---");
        bombilla2.encender();
        System.out.println(bombilla2);
        System.out.println("");
        
        System.out.println("--- Apagar bombilla 2 ---");
        bombilla2.apagar();
        System.out.println(bombilla2);
        System.out.println("");
        
        System.out.println("--- Encender bombilla 1 ---");
        bombilla1.encender();
        System.out.println(bombilla1);
        System.out.println("");
        
        System.out.println("--- Estado FINAL ---");
        System.out.println("Número de bombillas creadas hasta el momento: " + Bombilla.getBombillasCreadas());
        System.out.println("Número de bombillas encendidas en este momento: " + Bombilla.getBombillasEncedidas());
    }
}
