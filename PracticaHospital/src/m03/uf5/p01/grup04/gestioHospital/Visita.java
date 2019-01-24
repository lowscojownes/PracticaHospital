package m03.uf5.p01.grup04.gestioHospital;

import java.time.LocalDate;
import java.time.LocalTime;

public class Visita {
    private String metge;
    private Malaltia diagnostic;
    private LocalDate data ;
    private LocalTime hora ;
    
    public Visita(String metge,Malaltia malaltia){
        this.metge = metge;
        data = LocalDate.now();
        hora = LocalTime.now();
        diagnostic = malaltia;
    }

    
    public String getMetge() {
        return metge;
    }

    
    public Malaltia getDiagnostic() {
        return diagnostic;
    }

    
    public LocalDate getData() {
        return data;
    }

    
    public LocalTime getHora() {
        return hora;
    }
}
