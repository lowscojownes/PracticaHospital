package m03.uf5.p01.grup04.gestioHospital;

public class Adreca {
    private String ciutat;
    private String codiPostal;
    private String carrer;
    private int numero;
    private String planta;
    private String porta;
    
    public Adreca( String ciutat,String codiPostal, String carrer,int numero,String planta,String porta){
       this.ciutat = ciutat;
       this.codiPostal = codiPostal;
       this.carrer = carrer;
       this.numero = numero;
       this.planta = planta;
       this.porta = porta;
}


    public String getCiutat() {
        return ciutat;
    }


    public String getCodiPostal() {
        return codiPostal;
    }


    public String getCarrer() {
        return carrer;
    }


    public int getNumero() {
        return numero;
    }


    public String getPlanta() {
        return planta;
    }


    public String getPorta() {
        return porta;
    }
}
