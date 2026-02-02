package sistema_gestion_personaje_rgp;
public class ClasePersonaje {
    
    enum ClassPersonaje
        {
            GUERRERO,
            MAGO,
            ARQUERO,
            ASESINO
        }
    
    public final int VIDA_MAXIMA_BASE = 100;
    private final String id;
    
    private static int contadorPersonajes;
    
    public String nombre;
    
    private ClassPersonaje clase;
    private int nivel;
    private int puntosExperiencia;
    private double vidaActual; 
    private int ataque;
    private int defensa;
    
    public ClasePersonaje(String nombre, ClassPersonaje clase, int ataque, int defensa)
    {
        contadorPersonajes++;
        this.id = "PJ-" + contadorPersonajes;
        this.nivel = 1;
        this.nombre = nombre;
        this.vidaActual = VIDA_MAXIMA_BASE;
        this.clase = clase;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    
    public ClasePersonaje(String nombre, ClassPersonaje clase)
    {
        contadorPersonajes++;
        this.id = "PJ-" + contadorPersonajes;
        this.nivel = 1;
        this.nombre = nombre;
        this.clase = clase;
        
        switch(clase)
        {
            case GUERRERO ->
            {
                this.ataque = 15;
                this.defensa = 20;
            }
            case MAGO ->
            {
                this.ataque = 25;
                this.defensa = 10;
            }
            case ARQUERO ->
            {
                this.ataque = 20;
                this.defensa = 12;
            }
            case ASESINO ->
            {
                this.ataque = 22;
                this.defensa = 8;
            }
        }
    }
    
    public void atacar(ClasePersonaje enemigo)
    {
        double daño = this.ataque - (enemigo.defensa * 0.5);
        
        if(daño < 5)
            daño = 5;
        enemigo.vidaActual -= daño;
        System.out.printf("%s ataca a %s causando %.2f puntos de daño.%n", this.nombre, enemigo.nombre, daño);
        if(enemigo.vidaActual <= 0)
            ganarExperiencia(50);
    }
    
    public void recibirDaño(double cantidad)
    {
        this.vidaActual -= cantidad;
        if(this.vidaActual <= 0)
        {
            this.vidaActual = 0;
            System.out.printf("%s ha sido derrotado%n", this.nombre);
        }       
    }
    
    public void curar(double cantidad)
    {
        if(cantidad > 0)
        {
            this.vidaActual += cantidad;
            if(this.vidaActual > VIDA_MAXIMA_BASE)
            {
                this.vidaActual = VIDA_MAXIMA_BASE;
            }
        }
    }
    
    public void ganarExperiencia(int puntos)
    {
        this.puntosExperiencia += puntos;
        while(this.puntosExperiencia >= 100)
        {
            this.nivel++;
            this.ataque += 5;
            this.defensa += 3;
            this.vidaActual = VIDA_MAXIMA_BASE;
            System.out.printf("¡%s ha subido de al nivel %d! %n", this.nombre, this.nivel);
        }
    }
    
    public boolean estarVivo()
    {
        boolean vivo = true;
        if(this.vidaActual <= 0)
            vivo = false;
        return vivo;
    }
    
    public static int getTotalPersonajes()
    {
        return contadorPersonajes;
    }
    
    public static String obtenerMehorClaseContra(ClassPersonaje clase)
    {
        String personaje = "";
            switch(clase)
            {
                case GUERRERO -> personaje = "ASESINO";
                case MAGO -> personaje = "GUERRERO";
                case ARQUERO -> personaje = "MAGO";
                case ASESINO -> personaje = "ARQUERO";
            }
        return personaje;
    }
    
    @Override
    public String toString()
    {
        return "--- Ficha de Personaje --- "
                + "\nID:       " + this.id
                + "\nNombre:   " + this.nombre
                + "\nClase:    " + this.clase
                + "\nNivel:    " + this.nivel + " | XP:       " + this.puntosExperiencia
                + "\nVida:     " + this.vidaActual + "/100" + " | Ataque:   " + this.ataque + " | Defensa:  " + this.defensa;
    }
}
