package escaperoomobjetos;
public class EscapeRoomObjetos 
{
    public static void main(String[] args) 
    {
        Nave dummy = new Nave(4004);
        
        String[] nombres = { "UNIT-100", "UNIT-101", "UNIT-102", "UNIT-103", "UNIT-104", "UNIT-105", "UNIT-106", "UNIT-107", "UNIT-108", "UNIT-109", "UNIT-110", "UNIT-111", "UNIT-112", "UNIT-113", "UNIT-114", "UNIT-115", "UNIT-116", "UNIT-117", "UNIT-118", "UNIT-119" };
        String[] roles = { "ATACANTE", "ATACANTE", "INGENIERO", "ATACANTE", "INGENIERO", "ATACANTE", "INGENIERO", "INGENIERO", "ATACANTE", "INGENIERO", "INGENIERO", "INGENIERO", "ATACANTE", "ATACANTE", "ATACANTE", "ATACANTE", "ATACANTE", "INGENIERO", "INGENIERO", "ATACANTE" };
        int[] poderes = { 57, 62, 31, 63, 42, 52, 38, 48, 60, 39, 54, 69, 40, 38, 42, 50, 70, 38, 58, 42 };
        int[] salud = { -1, 66, 100, 69, 90, 78, -1, 63, -1, 71, -1, -1, 85, 62, -1, -1, 89, 96, 87, 50 };

        Nave[] flota = new Nave[nombres.length];
        
        int acumulador = 0;
        
        for(int i = 0; i < flota.length; i++)
        {
            flota[i] = new Nave(nombres[i], roles[i], poderes[i], salud[i]);
            if(roles[i].equals("ATACANTE"))
            {
                dummy.atacar(flota[i]);
            }
            else
                dummy.reparar(flota[i]);
            
            acumulador += flota[i].getSalud();  
        }
        
        System.out.println((acumulador + dummy.getSalud())); 
    }
}
