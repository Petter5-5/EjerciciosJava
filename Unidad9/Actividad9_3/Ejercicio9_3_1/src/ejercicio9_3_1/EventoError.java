package ejercicio9_3_1;

public class EventoError extends Evento{
    private int codigoError;
    private String descripcion;

    public EventoError(int codigoError, String descripcion) {
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
