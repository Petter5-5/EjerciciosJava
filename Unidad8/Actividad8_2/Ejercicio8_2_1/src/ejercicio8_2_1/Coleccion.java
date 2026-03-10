package ejercicio8_2_1;

import java.util.ArrayList;

public class Coleccion 
{
    private String nombreColeccion;
    private ArrayList<Figura> listaFiguras;
    
    public Coleccion(String nombre)
    {
        this.nombreColeccion = nombre;
        this.listaFiguras = new ArrayList<>();
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    
    public void añadirFigura(Figura fig)
    {
        listaFiguras.add(fig);
    }
    
    public void subirPrecio(double cantidad, String id)
    {
        boolean encontrado = false;
        int contador = 0;
        while(!encontrado && contador < listaFiguras.size())
        {
            if(listaFiguras.get(contador).getCodigo().equals(id))
            {
                encontrado = true;
                listaFiguras.get(contador).subirPrecio(cantidad);
            }
            contador++;
        }
    }

    public void conCapa()
    {
        for(Figura f : listaFiguras)
        {
            if(f.getSuperheroe().isCapa())
            {
                System.out.println(f);
            }
        }
    }
    
    public Figura masValioso()
    {
        Figura figuraCara = listaFiguras.get(0);
        
        for(Figura f : listaFiguras)
        {
            if(f.getPrecio() > figuraCara.getPrecio())
            {
                figuraCara = f;
            }
            else if(f.getPrecio() > figuraCara.getPrecio())
            {
                figuraCara = f;
            }   
        }
        
        return figuraCara;
    }
    
    public double getValorColeccion()
    {
        double valor = 0;
        
        for(Figura f : listaFiguras)
        {
            valor += f.getPrecio();
        }
        
        return valor;
    }
    
    public double getVolumen()
    {
        double volumenMax = 0;
        
        for(Figura f : listaFiguras)
        {
            volumenMax += f.getDimension().getVolumen();
        }
        
        return volumenMax + 200;
    }
    
    @Override
    public String toString() {
        String figuras = "";
        
        for(Figura f : listaFiguras)
        {
            figuras += f.toString() + "\n";
        }
        
        return "Coleccion: " + nombreColeccion + "\n---------\n" + figuras;
    }
}
