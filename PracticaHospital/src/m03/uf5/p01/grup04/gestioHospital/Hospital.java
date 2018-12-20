package m03.uf5.p01.grup04.gestioHospital;

import java.util.HashSet;
import java.util.Set;

public class Hospital {
    String nom;
    Adreca adreca;
    Set<Historial>  historials;
    Set<Malaltia>  malalties;
    Set<Pacient> pacients;
    Set<Metge> metges;
    

    public Hospital(String nom,String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta){
        this.nom = nom;
        adreca = new Adreca(ciutat,codiPostal,carrer,numero,planta,porta);
        historials = new HashSet<Historial>();
        pacients = new HashSet<Pacient>();
        malalties = new HashSet<Malaltia>();
        metges = new HashSet<Metge>();
        
    }

   
    

}
