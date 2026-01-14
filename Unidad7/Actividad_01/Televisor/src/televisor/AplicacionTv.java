package televisor;

public class AplicacionTv 
{
    public static void main(String[] args) 
    {
        Televisor tv1 = new Televisor(7, 98);
        Televisor tv2 = new Televisor(3, 2);
        
        //Texto inicial
        System.out.println("Estado inicial");
        System.out.println("--------------");
        System.out.println("tv1 ->" + tv1.mostrar());
        System.out.println("tv2 ->" + tv2.mostrar());
        System.out.println("");
        System.out.println("Estado final");
        System.out.println("------------");
        
        //Canal tv1
        tv1.subirCanal();
        tv1.subirCanal();
        tv1.subirCanal();
        tv1.subirCanal();
        
        //Volumen tv1
        tv1.subirVolumen(20);
        
        //Color tv1
        tv1.bajarColor();
        tv1.bajarColor();
        tv1.bajarColor();
        tv1.bajarColor();
        tv1.bajarColor();
        tv1.bajarColor();
        tv1.bajarColor();
        tv1.bajarColor();
        tv1.bajarColor();
        
        //Mostrar tv1
        System.out.println("tv1 ->" + tv1.mostrar());
        
        //Canal tv2
        tv2.bajarCanal();
        
        //Volumen tv2
        tv2.subirVolumen(2);
        
        //Color tv2
        tv2.subirColor();
        
        //Mostrar tv2
        System.out.println("tv2 ->" + tv2.mostrar());
        
        System.out.println(tv1);
    }
}
