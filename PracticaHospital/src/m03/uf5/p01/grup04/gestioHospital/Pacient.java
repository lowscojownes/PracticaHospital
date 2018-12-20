package m03.uf5.p01.grup04.gestioHospital;


public class Pacient extends Persona{
    Historial historial;
    public Pacient(String nom,String cognom1,String cognom2,String numSegSocial,
            String nif, String telefon, String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta) throws Exception {
        super(nom, cognom1, cognom2, numSegSocial, nif, telefon,ciutat,codiPostal,
                carrer,numero,planta,porta);
        historial = new Historial(nif);
        
    }
    
    public String toString(){
        return "nom: "+nom+" cognom1: "+cognom1+" cognom2: "+cognom2+
                " Num. Seguretat social: "+numSegSocial+" DNI: "+nif+" Telefon: "
                +telefon+".\n"+"Direccio: Ciutat: "+direccio.ciutat+" Codi Postal:"
                + " "+direccio.codiPostal+" Carrer: "+direccio.carrer+" Numero: "
                +direccio.numero+" Planta: "+direccio.planta+" Porta: "+direccio.porta;
    }
    
    
}
