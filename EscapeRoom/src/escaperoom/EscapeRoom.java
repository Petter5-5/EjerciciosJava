//x9#caB7-PlanEtA42zZq
package escaperoom;


public class EscapeRoom {

    public static void main(String[] args) {
        String claveOriginal = "x9#caB7-PlanEtA42zZq";
        int longitud = claveOriginal.length();
        String clave1 = claveOriginal.substring(3,9);
        String clave2 = clave1.toUpperCase();
        String clave3 = "-";
        char clave4 = claveOriginal.charAt(2);
        char clave5 = claveOriginal.charAt(longitud - 2);
        String claveFinal = longitud + clave1 + clave2 + clave3 + clave4 + clave5;
        
        System.out.println(claveFinal);
    }
    
}
