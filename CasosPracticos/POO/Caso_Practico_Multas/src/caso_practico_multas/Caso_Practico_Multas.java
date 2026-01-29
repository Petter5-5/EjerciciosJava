package caso_practico_multas;
public class Caso_Practico_Multas 
{
    public static void main(String[] args) 
    {
        Foto[] galeria = new Foto[4];
        
        galeria[0] = new Foto("1234-ABC", 190);
        galeria[1] = new Foto("5678-DEF", 155);
        galeria[2] = new Foto("5638-DEF", 170);
        galeria[3] = new Foto("5678-DEF", 80);
        
        ServidorDgt.inicializar();
        
        for (Foto foto : galeria) {
            System.out.println(ServidorDgt.multar(foto.getMatricula(), foto.getVelocidad()));
        }
        
        ServidorDgt.listar();
    }
}
