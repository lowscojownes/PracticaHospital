package m03.uf5.p01.grup04.gestioHospital;

import java.time.LocalDate;
import java.time.LocalTime;

public class Visita {
    String metge;
    Malaltia diagnostic;
    LocalDate data ;
    LocalTime hora ;
    
    public Visita(String metge,Malaltia malaltia){
        this.metge = metge;
        data = LocalDate.now();
        hora = LocalTime.now();
        diagnostic = malaltia;
    }
}
