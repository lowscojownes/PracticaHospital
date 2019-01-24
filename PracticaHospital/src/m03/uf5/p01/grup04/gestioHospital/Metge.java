package m03.uf5.p01.grup04.gestioHospital;

public class Metge extends Persona {
    private int numEmpleat;
    private int salariMensual;
    private String codiCompteCorrent;
    
    public Metge(String nom, String cognom1, String cognom2, String numSegSocial,
            String nif, String telefon, int numEmpleat,int salariMensual,
            String codiCompteCorrent, String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta) throws Exception {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon,ciutat,codiPostal,
                carrer,numero, planta, porta);
        this.numEmpleat = numEmpleat;
        this.salariMensual = salariMensual;
        this.codiCompteCorrent = codiCompteCorrent;
    }
    
    public String toString(){
        return "nom: "+Metge.super.getNom()+" cognom1: "+Metge.super.getCognom1()+" cognom2: "+Metge.super.getCognom2()+
                " Num. Seguretat social: "+Metge.super.getNumSegSocial()+" DNI: "+Metge.super.getNif()+" Telefon: "
                +Metge.super.getTelefon()+" Num. Empleat: "+numEmpleat+" Salari Mensual: "
                +salariMensual+" Codi Compte Corrent: "+codiCompteCorrent+".\n"+
                "Direccio: Ciutat: "+Metge.super.getDireccio().getCiutat()+" Codi Postal: "
                +Metge.super.getDireccio().getCodiPostal()+" Carrer: "+Metge.super.getDireccio().getCarrer()+" Numero: "
                +Metge.super.getDireccio().getNumero()+" Planta: "+Metge.super.getDireccio().getPlanta()+" Porta: "+Metge.super.getDireccio().getPorta();
    }
}
