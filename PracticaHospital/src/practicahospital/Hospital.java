package practicahospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Hospital {
    String nom;
    Adreca adreca;
    ArrayList<Historial> historials;
    ArrayList<Malaltia> malaties;
    private static Set<Pacient> pacients;
    private static Set<Metge> metges;
    

    public Hospital(String nom,String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta){
        this.nom = nom;
        adreca = new Adreca(ciutat,codiPostal,carrer,numero,planta,porta);
        historials = new ArrayList<Historial>();
        pacients = new HashSet<Pacient>();
        malaties = new ArrayList<Malaltia>();
        metges = new HashSet<Metge>();
        
    }

   
    

}
