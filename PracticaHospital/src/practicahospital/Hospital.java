package practicahospital;

import java.util.HashSet;
import java.util.Set;

public class Hospital {
    String nom;
    Adreca adreca;
    private static Set<Historial>  historials;
    private static Set<Malaltia>  malaties;
    private static Set<Pacient> pacients;
    private static Set<Metge> metges;
    

    public Hospital(String nom,String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta){
        this.nom = nom;
        adreca = new Adreca(ciutat,codiPostal,carrer,numero,planta,porta);
        historials = new HashSet<Historial>();
        pacients = new HashSet<Pacient>();
        malaties = new HashSet<Malaltia>();
        metges = new HashSet<Metge>();
        
    }

   
    

}
