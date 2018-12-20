package m03.uf5.p01.grup04.gestioHospital;

public class Metge extends Persona {
    int numEmpleat;
    int salariMensual;
    String codiCompteCorrent;
    
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
        return "nom: "+nom+" cognom1: "+cognom1+" cognom2: "+cognom2+
                " Num. Seguretat social: "+numSegSocial+" DNI: "+nif+" Telefon: "
                +telefon+" Num. Empleat: "+numEmpleat+" Salari Mensual: "
                +salariMensual+" Codi Compte Corrent: "+codiCompteCorrent+".\n"+
                "Direccio: Ciutat: "+direccio.ciutat+" Codi Postal: "
                +direccio.codiPostal+" Carrer: "+direccio.carrer+" Numero: "
                +direccio.numero+" Planta: "+direccio.planta+" Porta: "+direccio.porta;
    }
}
