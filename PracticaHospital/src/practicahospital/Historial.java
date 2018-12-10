package practicahospital;

import java.util.ArrayList;


public class Historial {
    static int idHistorial = 1;
    int codi;
    String pacient;
    ArrayList<Visita> Visites = new ArrayList<Visita>();
    
    public Historial(String nif){
        codi = idHistorial;
        idHistorial ++;
        pacient = nif;
     
    }
    
    public String toString(){
        return "Historial: Codi: "+codi+"DNI Pacient: "+pacient+" Visites: "+Visites;
    }
    
   
}
