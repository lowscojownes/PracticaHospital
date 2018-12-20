package m03.uf5.p01.grup04.gestioHospital;

public class Malaltia {
    static int idMalaltia = 1;
    int codi;
    String nom;
    boolean baixa;
    String tractament;
    int duradaDies;
    public Malaltia(String nom,boolean baixa,String tractament,int duradaDies){
        codi = idMalaltia;
        idMalaltia ++;
        this.nom = nom;
        this.baixa = baixa;
        this.tractament = tractament;
        this.duradaDies = duradaDies; 
        
    }
}
