package juegoprueba;

import javax.swing.*;

public class Ventana extends JFrame 
{
    public Ventana()
    {
        //Ventana
        setTitle("LOCURAAAAAAA");
        setSize(1000,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Dibujado
        PanelDibujo sprite = new PanelDibujo();
        add(sprite);
        
        //Controles
        addKeyListener(new Controles(sprite));
        
        setVisible(true);
    }
}
