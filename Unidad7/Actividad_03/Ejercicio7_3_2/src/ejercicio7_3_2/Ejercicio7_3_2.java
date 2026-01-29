package ejercicio7_3_2;
public class Ejercicio7_3_2 
{
    public static void main(String[] args) 
    {
        Maquinaria maquina1 = new Maquinaria("H-5000-X", "Hormigonera Industrial", "Elñectrica", 40.0);
        Maquinaria maquina2 = new Maquinaria("GEN-200-Z", "Generador Diesel", "Gasolina", 80.0);
        Maquinaria maquina3 = new Maquinaria("MN-99-A", "Martillo Neumático", "Manual", 25.0);
        
        System.out.println("=== SISTEMA DE GESTIÓN DE ALQUILERES ===");
        System.out.println("");
        System.out.println("INFO: El IVA aplicado en el sistema es del " + Maquinaria.getIVA() + "%");
        System.out.println("");
        System.out.println(maquina1);
        System.out.println(maquina2);
        System.out.println(maquina3);
        
        System.out.println(maquina1.getModelo() + "Alquiler 1 día: " + maquina1.alquiler(1));
        System.out.println(maquina2.getModelo() + "Alquiler 2 día: " + maquina2.alquiler(2));
        System.out.println(maquina3.getModelo() + "Alquiler 7 día: " + maquina3.alquiler(7));
    }
}
