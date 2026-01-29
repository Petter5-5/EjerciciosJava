package ejercicio7_3_2;

public class Maquinaria {
    private final static double IVA = 21.0;
    private static int contador;
    private final String codigoIventario;
    
    private String modelo;
    private String tipo;
    private String numero_Serie;
    private double tarifa_dia;
    
    public Maquinaria(String numero_Serie, String modelo, String tipo, Double tarifa_dia)
    {
        this.numero_Serie = numero_Serie;
        this.modelo = modelo;
        this.tipo = tipo;
        this.tarifa_dia = tarifa_dia;
        contador++;
        this.codigoIventario = "MAQ-" + contador;
    }
    
    public Maquinaria(String numero_Serie, String modelo, String tipo)
    {
        this(numero_Serie, modelo, tipo, 20.0);
    }
   
    public double alquiler(int numeroDias)
    {
        double precio;
        
        if(numeroDias > 5)
            precio = ((numeroDias * tarifa_dia) * 0.9) *(1 + (getIVA()/100));
        else
            precio = (numeroDias * tarifa_dia) * (1 + (getIVA()/100));
        
        return Math.round(precio * 100.0) / 100.0;
    }

    public static double getIVA() {
        return IVA;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    @Override
    public String toString()
    {
        return  "--- FICHA MAQUINARIA --- \nCódigo (Final): " + this.codigoIventario + "\n" + 
                "Modelo:         " + this.getModelo() + "\n" +
                "Tipo:           " + this.tipo + "\n" +
                "Nº Serie:       " + this.numero_Serie + "\n" +
                "Tarifa/día:     " + this.tarifa_dia + " + IVA\n";
    }
}
