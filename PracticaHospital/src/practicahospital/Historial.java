package practicahospital;

import java.util.HashSet;
import java.util.Set;


public class Historial {
    static int idHistorial = 1;
    int codi;
    String pacient;
    private static Set<Visita> visites;
    
    public Historial(String nif){
        codi = idHistorial;
        idHistorial ++;
        pacient = nif;
        visites = new HashSet<Visita>();
     
    }
    
    public String toString(){
        return "Historial: Codi: "+codi+"DNI Pacient: "+pacient+" Visites: "+visites;
    }
    
   
}
