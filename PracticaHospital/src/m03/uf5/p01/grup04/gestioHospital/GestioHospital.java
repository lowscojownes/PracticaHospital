package m03.uf5.p01.grup04.gestioHospital;

import java.util.Iterator;
import java.util.Scanner;
import m03.uf5.p01.grup04.gestioHospital.Persona.ExceptionFalles;

public class GestioHospital {

    public static void main(String[] args) throws Exception {
        Hospital hospital = new Hospital("Hospital Terrassa", "Terrassa", "08227", "asd",
                2, "0", "0");
        Pacient SergioB = new Pacient("Sergio", "Borrell", "Flores", "01 76589765 28",
                "45933022", "+34 978819628", "Barcelona", "08224", "Carrer de Can Santfeliu", 25, "0", "B");
        Pacient SergioV = new Pacient("Sergio", "Vorrell", "Flores", "01 76589765 28",
                "45933021", "+34 978819628", "Barcelona", "08224", "Carrer de Can Santfeliu", 25, "0", "B");
        Metge ManuY = new Metge("Manu", "Yñesta", "Pérez", "01 76589765 28",
                "53298062", "+34 936755728", 1, 1200, "ES27-0001-0024-0035", "Barcelona", "08224", "Carrer de Can Santfeliu", 25, "0", "B");
        Malaltia Gripe = new Malaltia("Gripe", false, "Frenadol", 4);
        Malaltia Apendicitis = new Malaltia("Apendicitis", true, "Operación apendicitis", 20);
        hospital.getPacients().add(SergioB);
        hospital.getPacients().add(SergioV);
        hospital.getHistorials().add(SergioB.getHistorial());
        hospital.getHistorials().add(SergioV.getHistorial());
        hospital.getMetges().add(ManuY);
        hospital.getMalalties().add(Gripe);
        hospital.getMalalties().add(Apendicitis);
        Scanner sc = new Scanner(System.in);
        String eleccio = "0";
        while (!"6".equals(eleccio)) {
            System.out.println("1. Registrar visita.");
            System.out.println("2. Crear nou pacient.");
            System.out.println("3. Mostrar pacient.");
            System.out.println("4. Mostrar metge.");
            System.out.println("5. Veure historial.");
            System.out.println("6. Sortir");
            System.out.println("Tria una opció (1-6): ");
            eleccio = sc.nextLine();

            switch (eleccio) {
                case "1":
                    registrarVisita(hospital);
                    break;
                case "2":
                    nouPacient(hospital);
                    break;
                case "3":
                    mostrarPacient(hospital);
                    break;
                case "4":
                    mostrarMetge(hospital);
                    break;
                case "5":
                    veureHistorial(hospital);
                    break;
                case "6":
                    System.out.println("Sortir...");
                    break;
            }
            System.out.println(" ");
        }

    }

    static void veureHistorial(Hospital hospital) {
        Scanner sc = new Scanner(System.in);
        int codi = 0;
        boolean correcte = false;
        while (!correcte) {
            System.out.println("Introdueix el numero d'historial: ");
            try{
                codi = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("S'ha d'introduir un número.");
            }
            
            Historial historial;
            for (Iterator<Historial> coleccioHistorials = hospital.getHistorials().iterator(); coleccioHistorials.hasNext();) {
                historial = coleccioHistorials.next();
                if (historial.getCodi() == codi) {
                    System.out.println("Historial: ");
                    System.out.println(historial.toString());
                    Visita visita;
                    for (Iterator<Visita> coleccioVisites = historial.getVisites().iterator(); coleccioVisites.hasNext();) {
                        visita = coleccioVisites.next();
                        System.out.println("\nVisita: ");
                        System.out.println("Data: " + visita.getData());
                        System.out.println("Hora: " + visita.getHora());
                        System.out.println("Metge: " + visita.getMetge());
                        System.out.println(" ");
                        System.out.println("Diagnostic: ");
                        System.out.println("Codi:" + visita.getDiagnostic().getCodi());
                        System.out.println("Nom: " + visita.getDiagnostic().getNom());
                        System.out.println("Tractament: " + visita.getDiagnostic().getTractament());
                        System.out.println("Durada dies: " + visita.getDiagnostic().getDuradaDies());
                    }
                    correcte = true;
                    break;
                }
            }
            if (correcte == false) {
                System.out.println("Dada d'historial incorrecte");
            }
        }
    }

    static void mostrarPacient(Hospital hospital) {
        Scanner sc = new Scanner(System.in);
        int historial = 0;
        boolean correcte = false;
        while (!correcte) {
            System.out.println("Introdueix el numero del historial per indentificar al pacient: ");
            try{
                historial = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("S'ha d'introduir un número.");
            }
            
            Pacient pacient;
            for (Iterator<Pacient> coleccioPacients = hospital.getPacients().iterator(); coleccioPacients.hasNext();) {
                pacient = coleccioPacients.next();
                if (pacient.getHistorial().getCodi() == historial) {
                    System.out.println(pacient.toString());
                    correcte = true;
                    break;
                }

            }
            if (correcte == false) {
                System.out.println("Dada de pacient incorrecte");
            }
        }
    }

    static void mostrarMetge(Hospital hospital) {
        Scanner sc = new Scanner(System.in);
        String dni;
        boolean correcte = false;
        while (!correcte) {
            System.out.println("Introdueix el numero del DNI per indentificar al metge: ");
            dni = sc.nextLine();
            Metge metge;
            for (Iterator<Metge> coleccioMetges = hospital.getMetges().iterator(); coleccioMetges.hasNext();) {
                metge = coleccioMetges.next();
                if (metge.getNif().equals(dni)) {
                    System.out.println(metge.toString());
                    correcte = true;
                    break;
                }
            }
            if (correcte == false) {
                System.out.println(" Dada de metge incorrecte");
            }
        }
    }

    static void nouPacient(Hospital hospital) throws Exception {

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
        boolean correcte = false;
        while (!correcte) {
            System.out.println("Introduint nou Pacient: ");
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
            try {
                System.out.println("Introdueix el numero: ");
                numero = Integer.parseInt(sc.nextLine());
                System.out.println("Introdueix la planta: ");
                planta = sc.nextLine();
                System.out.println("Introdueix la porta: ");
                porta = sc.nextLine();
                Pacient Pacient = new Pacient(nom, cognom1, cognom2, numSegSocial,
                        dni, tlfn, ciutat, cPostal, carrer, numero, planta, porta);
                hospital.getPacients().add(Pacient);
                hospital.getHistorials().add(Pacient.getHistorial());
                correcte = true;
                System.out.println("Pacient creat correctament.");
            }catch (ExceptionFalles e) {
                System.out.println("Error al donar d'alta al pacient: " + e.getMessage());
            }catch (NumberFormatException e) {
                 System.out.println("S'ha d'introduir un número.");
            }
        }

    }

    static void registrarVisita(Hospital hospital) {
        Scanner sc = new Scanner(System.in);
        int numHistorial = 0;
        String DniMetge = "";
        int enfermetat = 0;
        Historial historialSeleccionat = null;
        Malaltia malaltiaSeleccionada = null;
        String metgeSeleccionat = null;
        boolean correcteHistorial = false;
        boolean correcteMetge = false;
        boolean correcteMalaltia = false;
        while (!correcteHistorial || !correcteMetge || !correcteMalaltia) {
            System.out.println("Introduint Visita: ");
            try{
                System.out.println(" Num. historial pacient: ");
                numHistorial = Integer.parseInt(sc.nextLine());
                System.out.println(" DNI Metge (Sense lletra): ");
                DniMetge = sc.nextLine();
                System.out.println(" Num codi malaltia: ");
                enfermetat = Integer.parseInt(sc.nextLine());
            }catch(NumberFormatException e){
                System.out.println("S'ha d'introduir un número.");
            }
            for (Iterator<Pacient> coleccioPacients = hospital.getPacients().iterator(); coleccioPacients.hasNext();) {
                historialSeleccionat = coleccioPacients.next().getHistorial();
                if (historialSeleccionat.getCodi() == numHistorial) {
                    System.out.println("Num Historial: " + numHistorial + " trobat.");
                    correcteHistorial = true;
                    break;
                }
            }
            if (correcteHistorial == false) {
                System.out.println("Num Historial: no trobat.");
            }
            for (Iterator<Metge> coleccioMetges = hospital.getMetges().iterator(); coleccioMetges.hasNext();) {
                metgeSeleccionat = coleccioMetges.next().getNif();
                if (metgeSeleccionat.equals(DniMetge)) {
                    System.out.println("DNI Metge: " + DniMetge + " trobat.");
                    correcteMetge = true;
                    break;
                }
            }
            if (correcteMetge == false) {
                System.out.println("DNI Metge: no trobat.");
            }
            for (Iterator<Malaltia> coleccioMalalties = hospital.getMalalties().iterator(); coleccioMalalties.hasNext();) {
                malaltiaSeleccionada = coleccioMalalties.next();
                if (malaltiaSeleccionada.getCodi() == enfermetat) {
                    System.out.println("Malaltia: " + malaltiaSeleccionada.getNom() + " trobada.");
                    correcteMalaltia = true;
                    break;
                }
            }
            if (correcteMalaltia == false) {
                System.out.println("Malaltia: no trobada.");
            }
        }
        historialSeleccionat.getVisites().add(new Visita(metgeSeleccionat, malaltiaSeleccionada));
        System.out.println("Visita registrada.");
    }
}
