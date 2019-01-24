package m03.uf5.p01.grup04.gestioHospital;


public class Pacient extends Persona{
    private Historial historial;
    public Pacient(String nom,String cognom1,String cognom2,String numSegSocial,
            String nif, String telefon, String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta) throws Exception {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon,ciutat,codiPostal,
                carrer,numero,planta,porta);
        historial = new Historial(nif);
        
    }
    
    public String toString(){
        return "nom: "+Pacient.super.getNom()+" cognom1: "+Pacient.super.getCognom1()+" cognom2: "+Pacient.super.getCognom2()+
                " Num. Seguretat social: "+Pacient.super.getNumSegSocial()+" DNI: "+Pacient.super.getNif()+" Telefon: "
                +Pacient.super.getTelefon()+".\n"+"Direccio: Ciutat: "+Pacient.super.getDireccio().getCiutat()+" Codi Postal:"
                + " "+Pacient.super.getDireccio().getCodiPostal()+" Carrer: "+Pacient.super.getDireccio().getCarrer()+" Numero: "
                +Pacient.super.getDireccio().getNumero()+" Planta: "+Pacient.super.getDireccio().getPlanta()+" Porta: "+Pacient.super.getDireccio().getPorta();
    }

    
    public Historial getHistorial() {
        return historial;
    }
    
    
}
