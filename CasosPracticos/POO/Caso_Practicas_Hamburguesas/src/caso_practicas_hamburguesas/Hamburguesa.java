package caso_practicas_hamburguesas;

public class Hamburguesa {
    private String nombre;
    private String ingredientesPrincipal;
    private String salsa;
    private boolean tieneQueso;
    
    public Hamburguesa()
    {
        this.nombre = "Clásica";
        this.ingredientesPrincipal = "Ternera";
        this.salsa = "Ketchup";
        this.tieneQueso = false;
    }
    
    public Hamburguesa(Hamburguesa otra, String nombre)
    {
        this.nombre = nombre;
        this.ingredientesPrincipal = otra.ingredientesPrincipal;
        this.salsa = otra.salsa;
        this.tieneQueso = otra.tieneQueso;
    }
    
    public void añadirQueso()
    {
        this.tieneQueso = true;
    }
    
    public void CambiarSalas(String salsa)
    {
        this.salsa = salsa;
    }
    
    public void setNombre (String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    @Override
    public String toString()
    {
        String texto = "[" + nombre + "] " + ingredientesPrincipal + " con " + salsa;
        
        if(tieneQueso)
            texto += " (Con queso)";
        else
            texto += " (Sin queso)";
        
        return texto;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        boolean resultado = false;
        
        if(obj instanceof Hamburguesa)
        {
            Hamburguesa otraHamburgesa = (Hamburguesa) obj;
            
            resultado = this.ingredientesPrincipal.equals(otraHamburgesa.ingredientesPrincipal) && this.tieneQueso == otraHamburgesa.tieneQueso && this.salsa.equals(otraHamburgesa.salsa);
                    
        }
        
        return resultado;
    }
}
