package practicahospital;

import java.time.LocalDate;
import java.time.LocalTime;

public class Visita {
    String metge;
    Malaltia diagnostic;
    LocalDate data;
    LocalTime hora;
    
    public Visita(String metge, LocalDate data, LocalTime hora,Malaltia malaltia){
        this.metge = metge;
        this.data = data;
        this.hora = hora;
        diagnostic = malaltia;
    }
}
