package juegoprueba.visualizador;

import javax.swing.*;
import juegoprueba.controles.Controles;

public class Ventana extends JFrame 
{
    private static final int ancho = 1000;
    private static final int alto = 800;
    
    public Ventana()
    {
        //Ventana
        setTitle("LOCURAAAAAAA");
        setSize(ancho,alto);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Dibujado
        PanelDibujo sprite = new PanelDibujo();
        add(sprite);
        
        //Controles
        addKeyListener(new Controles(sprite));
        
        setVisible(true);
    }

    public static int getAncho() {
        return ancho;
    }

    public static int getAlto() {
        return alto;
    }
}
