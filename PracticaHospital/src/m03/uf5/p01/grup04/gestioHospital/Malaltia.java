package m03.uf5.p01.grup04.gestioHospital;

public class Malaltia {
    private static int idMalaltia = 1;
    private int codi;
    private String nom;
    private boolean baixa;
    private String tractament;
    private int duradaDies;
    public Malaltia(String nom,boolean baixa,String tractament,int duradaDies){
        codi = idMalaltia;
        idMalaltia ++;
        this.nom = nom;
        this.baixa = baixa;
        this.tractament = tractament;
        this.duradaDies = duradaDies; 
        
    }

    
    public int getCodi() {
        return codi;
    }

    
    public String getNom() {
        return nom;
    }

    
    public boolean isBaixa() {
        return baixa;
    }

    
    public String getTractament() {
        return tractament;
    }

    
    public int getDuradaDies() {
        return duradaDies;
    }
}
