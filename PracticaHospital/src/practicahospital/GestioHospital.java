package practicahospital;

import java.util.Iterator;
import java.util.Scanner;


public class GestioHospital {
    public static void main(String[] args) throws Exception {
        Hospital hospital = new Hospital("Hospital Terrassa","Terrassa","08227","asd",
            2,"0","0");
        Pacient SergioB = new Pacient("Sergio","Borrell","Flores","01 76589765 28",
            "45933022", "+34 978819628","Barcelona","08224","Carrer de Can Santfeliu",25,"0","B");
        Pacient SergioV = new Pacient("Sergio","Vorrell","Flores","01 76589765 28",
            "45933021", "+34 978819628","Barcelona","08224","Carrer de Can Santfeliu",25,"0","B");
        Metge ManuY = new Metge("Manu","Yñesta","Pérez","01 76589765 28",
            "53298062", "+34 936755728",1,1200,"ES27-0001-0024-0035","Barcelona","08224","Carrer de Can Santfeliu",25,"0","B");
        Malaltia Gripe = new Malaltia("Gripe", false, "Frenadol y sonarse mucho la tocha", 4);

        hospital.pacients.add(SergioB);
        hospital.pacients.add(SergioV);
        hospital.metges.add(ManuY);
        hospital.malalties.add(Gripe);
        registrarVisita(hospital);

    }
    
    static void registrarVisita(Hospital hospital){
        Scanner sc = new Scanner(System.in); 
        int numHistorial; 
        String DniMetge;
        int enfermetat;
         Historial historialSeleccionado = null;
         System.out.println("Introduint Visita: ");
         System.out.println(" Num. historial pacient: ");
         numHistorial = Integer.parseInt(sc.nextLine());
         System.out.println(" DNI Metge (Sense lletra): ");
         DniMetge = sc.nextLine();
         System.out.println(" Num codi malaltia: ");
         enfermetat = Integer.parseInt(sc.nextLine());
        for (Iterator<Pacient> it = hospital.pacients.iterator(); it.hasNext();) {
            historialSeleccionado = it.next().historial;
            if(historialSeleccionado.codi == numHistorial){
                System.out.println(numHistorial+" trobat.");
                break;
            }
            
        }
        String medicoSeleccionado = null;
       for (Iterator<Metge> il = hospital.metges.iterator(); il.hasNext();) {
           medicoSeleccionado = il.next().nif;
            if(medicoSeleccionado.equals(DniMetge)){
                System.out.println(DniMetge+" trobat.");
                break;
            }
        }
       Malaltia malaltiaSeleccionada = null;
       for (Iterator<Malaltia> il = hospital.malalties.iterator(); il.hasNext();) {
           malaltiaSeleccionada = il.next();
            if( malaltiaSeleccionada.codi == enfermetat){
                System.out.println("1"+" encontrado.");
                 break;
            }
        }
       historialSeleccionado.visites.add(new Visita(medicoSeleccionado,malaltiaSeleccionada));
        System.out.println("Visita registrada.");
    } 
    
}
