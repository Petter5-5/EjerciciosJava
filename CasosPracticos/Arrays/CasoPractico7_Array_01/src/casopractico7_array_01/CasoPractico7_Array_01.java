package casopractico7_array_01;

import java.util.Arrays;

public class CasoPractico7_Array_01 
{
    public static String sacarTexto(String[] lineas, int indice)
    {
        String texto = lineas[indice];
        return texto;
    }
    
    public static String[] textoSeparado(String texto)
    {
        String[] separado = texto.split(",");
        return separado;
    }
    
    
    public static void mostrar(String[] lineas, int tamaño)
    {
        String[] nombres = new String[tamaño];
        int[] edades = new int[tamaño];
        double[] notas = new double[tamaño];
        String texto = "";
        texto = sacarTexto(lineas, 0);
        String[] separado = new String [textoSeparado(texto).length];
        
        for(int i = 0; i < lineas.length; i++)
        {
            texto = sacarTexto(lineas, i);
            separado = textoSeparado(texto);
            for(int j = 0; j < lineas.length; j++)
            {
                switch(j)
                {
                    case 0 -> nombres[i] = separado[j];
                    case 1 -> edades[i] = Integer.parseInt(separado[j]);
                    case 2 -> notas[i] = Double.parseDouble(separado[j]);
                }
            }
        }
        System.out.println("Nombres: " + Arrays.toString(nombres));
        System.out.println("Edades: " + Arrays.toString(edades));
        System.out.println("Notas: " + Arrays.toString(notas));
    }
    
    public static void main(String[] args) 
    {
        String[] lineas = 
        {
         "Ana,20,8.5",
         "Luis,22,6.0",
         "Marta,19,9.2",
         "Sara,21,7.1"
        };
        
        int tamaño = lineas.length;
        mostrar(lineas, tamaño);
    }
}
