package m03.uf5.p01.grup04.gestioHospital;

import java.util.HashSet;
import java.util.Set;


public class Historial {
    
    private static int idHistorial = 1;
    private int codi;
    private String pacient;
    private Set<Visita> visites;
    
    public Historial(String nif){
        codi = idHistorial++;
        pacient = nif;
        visites = new HashSet<Visita>();
     
    }
    
    public String toString(){
        return "Codi: "+getCodi()+" DNI Pacient: "+getPacient();
    }

    
    public static int getIdHistorial() {
        return idHistorial;
    }

    
    public int getCodi() {
        return codi;
    }

    
    public String getPacient() {
        return pacient;
    }

    
    public Set<Visita> getVisites() {
        return visites;
    }
    
    
    
    
    
   
}
