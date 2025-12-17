package ecotrivial;

import java.util.Scanner;

public class EcoTrivial 
{
    public static void menu()
    {
        System.out.println("=========================================");
        System.out.println("       🌱 ECO-TRIVIAL JAVA: TORNEO 🌱");
        System.out.println("            Creado por: Yeray");
        System.out.println("=========================================\n");        
    }   
    
    public static void mostrarPregunta(String[][] preguntas,int indice, String nombre)
    {
        System.out.println("------------------------------------------------");
        System.out.printf("Pregunta %d:%n", indice + 1);
        System.out.printf("%s%na) %s%nb) %s%nc) %s%n", preguntas[indice][0], preguntas[indice][1], preguntas[indice][2] , preguntas[indice][3]);
        System.out.printf(">>> %s, tu respuesta (a/b/c): ", nombre);
    }
    
    public static int comprobacion(char respuesta, char[] solucion, String nombre, int indice)
    {
        int puntos = 0;
            if(respuesta == solucion[indice])
            {
                System.out.printf(">>> %s, tu respuesta (a/b/c): \u001B[32m%s%n\u001B[0m", nombre, respuesta);
                System.out.println("✅ ¡CORRECTO! Muy bien. (+20 Ptos)");
                puntos = 20;
            }
            else
            {
                System.out.printf(">>> %s, tu respuesta (a/b/c): \u001B[31m%s%n\u001B[0m", nombre, respuesta);
                System.out.println("❌ INCORRECTO. La respuesta correcta era la opción " + solucion[indice]);
            }
        return puntos;
    }
    
    public static void resultado(String nombre, int puntuacion)
    {
        System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
        System.out.println("=========================================");
        System.out.printf("RESULTADO FINAL DE %s%n", nombre);
        System.out.printf("PUNTUACIÓN: %d / 100%n", puntuacion);
        if(puntuacion >= 80)
            System.out.println("🏆️ NIVEL: HÉROE DEL RECICLAJE");
        else if(puntuacion >= 50)
            System.out.println("🌱 NIVEL: CIUDADANO CONSCIENTE");
        else
            System.out.println("🗑️ NIVEL: GENERADOR DE BASURA");
        System.out.println("=========================================");
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        
        String nombre;
        String[][] preguntas = {
            {"El transporte público efectivo y de bajo costo es fundamental para la reducción de la pobreza y la desigualdad urbana porque...", "Facilita el acceso a empleos, atención médica, servicios educativos y otros bienes públicos.", "La gente llega más rápido a su trabajo promoviendo la eficiencia laboral.", "Es más seguro y reduce el riesgo de asaltos."},
            {"Existe ________ cuando todas las personas tienen en todo momento acceso físico y económico a suficientes alimentos nutritivos para satisfacer sus necesidades alimenticias a fin de llevar una vida activa y sana.", "sostenibilidad de los sistemas de producción", "subalimentación", "seguridad alimentaria"},
            {"El consumo promedio de agua de una persona que vive en una zona residencial en los países desarrollados es de:", "Entre 300 y 500 litros diarios.", "Entre 150 y 299 litros diarios.", "Mil litros diarios."},
            {"¿Cuánto es el suministro mínimo diario de agua por persona que podría cubrir las necesidades básicas de higiene personal y de alimentos?", "50 litros", "75 litros", "20 litros"},
            {"¿Qué es la economía circular?", "Un sistema que promueve la extracción de nuevos recursos sin restricciones", "Un modelo de producción que maximiza el valor de los recursos mediante su reutilización y reciclaje", "Un modelo que ignora la minimización de residuos en la producción"}
        };
        char[] solucion = {'b','c','a','c','b'};
        char respuesta;
        int puntuacion = 0;
        
        menu();
        System.out.print("Nombre del jugador (o clase): ");
        nombre = sc.nextLine();
        System.out.printf("%n¡Hola %s! Prepárate para el examen...%n", nombre);
        
        for(int i = 0; i < preguntas.length; i++)
        {
            mostrarPregunta(preguntas,i, nombre);
            respuesta = sc.nextLine().charAt(0);
            System.out.printf("%n%n%n%n%n%n%n%n%n%n%n%n%n%n%n");
            puntuacion += comprobacion(respuesta,solucion,nombre,i);
            Thread.sleep(1500);
        }
        resultado(nombre, puntuacion);
    }
}
