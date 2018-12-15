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
        Malaltia Apendicitis = new Malaltia("Apendicitis", true, "Operación apendicitis", 20);
        hospital.pacients.add(SergioB);
        hospital.pacients.add(SergioV);
        hospital.metges.add(ManuY);
        hospital.malalties.add(Gripe);
        hospital.malalties.add(Apendicitis);
        registrarVisita(hospital);
        registrarVisita(hospital);
        //nouPacient(hospital);
        //mostrarPacient(hospital);
        //mostrarMetge(hospital);
        veureHistorial(hospital);
        veureHistorial(hospital);

    }
    
    //no muestra historial todavia
    static void veureHistorial(Hospital hospital){
        Scanner sc = new Scanner(System.in);
        int codi;
        System.out.println("Introdueix el numero d'historial: ");
        codi = Integer.parseInt(sc.nextLine());
        Historial historial;
        for (Iterator<Historial> il = hospital.historials.iterator(); il.hasNext();) {
            historial = il.next();
            if(historial.codi == codi){
                for (Iterator<Visita> vis = historial.visites.iterator(); vis.hasNext();){
                    System.out.println(vis.next().data);  
                    System.out.println(vis.next().hora); 
                    System.out.println(vis.next().metge); 
                    System.out.println(vis.next().diagnostic); 
                }
            }
        }
    }
    
    static void mostrarPacient(Hospital hospital){
        System.out.println("Pacients: ");
        for (Iterator<Pacient> il = hospital.pacients.iterator(); il.hasNext();) {
            System.out.println(il.next().toString());
        }
    }
    
    static void mostrarMetge(Hospital hospital){
        System.out.println("Metges: ");
        for (Iterator<Metge> il = hospital.metges.iterator(); il.hasNext();) {
            System.out.println(il.next().toString());
        }
    }
    
    static void nouPacient(Hospital hospital) throws Exception{
        System.out.println("Introduint nou Pacient: ");
        Scanner sc = new Scanner(System.in);
        String nom;
        String cognom1;
        String cognom2;
        String numSegSocial;
        String dni;
        String tlfn;
        String ciutat;
        String cPostal;
        String carrer;
        int numero;
        String planta;
        String porta;
        System.out.println("Introdueix el nom: ");
        nom = sc.nextLine();
        System.out.println("Introdueix el primer cognom: ");
        cognom1 = sc.nextLine();
        System.out.println("Introdueix el segon cognom: ");
        cognom2 = sc.nextLine();
        System.out.println("Introdueix el numero de la seguretat social: ");
        numSegSocial = sc.nextLine();
        System.out.println("Introdueix el DNI: ");
        dni = sc.nextLine();
        System.out.println("Introdueix el Telefon: ");
        tlfn = sc.nextLine();
        System.out.println("Introdueix la ciutat: ");
        ciutat = sc.nextLine();
        System.out.println("Introdueix el codi postal: ");
        cPostal = sc.nextLine();
        System.out.println("Introdueix el carrer: ");
        carrer = sc.nextLine();
        System.out.println("Introdueix el numero: ");
        numero = Integer.parseInt(sc.nextLine());
        System.out.println("Introdueix la planta: ");
        planta = sc.nextLine();
        System.out.println("Introdueix la porta: ");
        porta = sc.nextLine();
        Pacient Pacient = new Pacient(nom,cognom1,cognom2,numSegSocial,
            dni, tlfn,ciutat,cPostal,carrer,numero,planta,porta);
        hospital.pacients.add(Pacient);
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
