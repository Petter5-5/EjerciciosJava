package casopractico_arenapo;
public class CasoPractico_ArenaPO 
{
    public static void main(String[] args) 
    {
        Personaje tor = new Guerrero("Tor", 6, 100);
        Personaje merlin = new Mago("Merlin", 4, 100);
        
        tor.presentarse();
        merlin.presentarse();
        System.out.println("");
        
        tor.atacar(merlin);
        tor.atacar(merlin);
        tor.atacar(merlin);
        merlin.atacar(tor);
        
        System.out.println("");
        tor.presentarse();
        merlin.presentarse();
    }
}
