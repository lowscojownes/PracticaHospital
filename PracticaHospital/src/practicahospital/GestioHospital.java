package practicahospital;


public class GestioHospital {
    public static void main(String[] args) throws Exception {
        Pacient pacient1 = new Pacient("Sergio","Borrell","Flores","01 76589765 28",
            "45933022", "+34 97881962","Barcelona","08224","Carrer de Can Santfeliu",25,"0","B");
        Metge metge1 = new Metge("Sergio","Borrell","Flores","01 76589765 28",
            "45933022", "+34 97881962",1,1200,"ES27-0001-0024-0035","Barcelona","08224","Carrer de Can Santfeliu",25,"0","B");
        Malaltia malaltia1 = new Malaltia("Gripe", false, "Frenadol y sonarse mucho la tocha", 4);
        
        
        

    }
    
}
