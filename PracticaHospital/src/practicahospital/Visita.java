package practicahospital;

import java.time.LocalDate;
import java.time.LocalTime;

public class Visita {
    String metge;
    Malaltia diagnostic;
    LocalDate data;
    LocalTime hora;
    
    public Visita(String nom,boolean baixa,String tractament,int duradaDies){
        diagnostic = new Malaltia(nom,baixa,tractament,duradaDies);
    }
}
