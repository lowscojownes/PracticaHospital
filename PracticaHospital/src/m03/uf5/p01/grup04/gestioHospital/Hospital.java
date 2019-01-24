package m03.uf5.p01.grup04.gestioHospital;

import java.util.HashSet;
import java.util.Set;

public class Hospital {
    private String nom;
    private Adreca adreca;
    private Set<Historial>  historials;
    private Set<Malaltia>  malalties;
    private Set<Pacient> pacients;
    private Set<Metge> metges;
    

    public Hospital(String nom,String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta){
        this.nom = nom;
        adreca = new Adreca(ciutat,codiPostal,carrer,numero,planta,porta);
        historials = new HashSet<Historial>();
        pacients = new HashSet<Pacient>();
        malalties = new HashSet<Malaltia>();
        metges = new HashSet<Metge>();
        
    }

    
    public String getNom() {
        return nom;
    }

    public Adreca getAdreca() {
        return adreca;
    }

    public Set<Historial> getHistorials() {
        return historials;
    }

    public Set<Malaltia> getMalalties() {
        return malalties;
    }

    public Set<Pacient> getPacients() {
        return pacients;
    }

    public Set<Metge> getMetges() {
        return metges;
    }

   
    

}
