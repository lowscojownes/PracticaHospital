package m03.uf5.p01.grup04.gestioHospital;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class Persona {
    public static final String TAULA_LLETRA ="TRWAGMYFPDXBNJZSQVHLCKE";
    private String nom;
    private String cognom1;
    private String cognom2;
    private String numSegSocial;
    private String nif;
    private String telefon;
    private String falles=" ";
    private Adreca direccio;
    
    public Persona(String nom,String cognom1,String cognom2,String numSegSocial,
            String nif, String telefon, String ciutat,String codiPostal,String carrer,
            int numero,String planta,String porta) throws Exception{
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.numSegSocial = numSegSocial;
        this.nif = nif;
        this.telefon = telefon;
        direccio = new Adreca(ciutat,codiPostal, carrer,numero,planta,porta);
        boolean alfabet_nom = comprobacioAlfabet(nom);
        boolean alfabet_cognom1 = comprobacioAlfabet(cognom1);
        boolean alfabet_cognom2 = comprobacioAlfabet(cognom2);
        boolean s_social = comprobacioSeguretatSocial(numSegSocial);
        boolean dni = verificarNif(Integer.parseInt(nif));
        boolean tlfn = verificarTelefon(telefon);
       
            

            if (alfabet_nom == false){
                falles += "Nom incorrecte, ";
            }
            if (alfabet_cognom1 == false){
                falles += "Cognom1 incorrecte, ";
            }
            if (alfabet_cognom2 == false){
                falles += "Cognom2 incorrecte, ";
            }
            if (s_social == false){
                falles += "NumSegSocial incorrecte, ";
            }
            if (dni == false){
                falles += "Num NIF incorrecte, ";
            }
            if (tlfn == false){
                falles += "Num Telefon incorrecte ";
        }
     
        if(falles.length()>1){
            throw new ExceptionFalles(falles); 
        }
       
    }
    
    public boolean comprobacioAlfabet(String frase) {
        Pattern regles = Pattern.compile("[a-zñl·l'çáéíóúàèòA-ZÑÇÁÉÍÓÚÀÈÒ]*");
        Matcher textAnalitzar = regles.matcher(frase);
        return textAnalitzar.matches()==true;
    }
    
    public boolean comprobacioSeguretatSocial(String frase) throws Exception{
        Pattern regles = Pattern.compile("([0-4][1-9]|10|20|30|40|50|53|66)[\\s][0-9]{8}[\\s][0-9]{2}");
        Matcher textAnalitzar = regles.matcher(frase);
        return textAnalitzar.matches()==true;
    }
    
    public static String lletraDNI(int dni){
        return String.valueOf(dni)+TAULA_LLETRA.charAt(dni%23);
    }
    
    public boolean verificarNif(int nif) throws Exception{
        Pattern regles = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher textAnalitzar = regles.matcher(lletraDNI(nif));
        return textAnalitzar.matches() == true;
    }
    
    public boolean verificarTelefon(String telefon) throws Exception{
        Pattern regles = Pattern.compile("\\+34[\\s][9][0-9]{8}");
        Matcher textAnalitzar = regles.matcher(telefon);
        return textAnalitzar.matches() == true;
    }

    
    public String getNom() {
        return nom;
    }

    
    public String getCognom1() {
        return cognom1;
    }

    
    public String getCognom2() {
        return cognom2;
    }

    
    public String getNumSegSocial() {
        return numSegSocial;
    }

    
    public String getNif() {
        return nif;
    }

    
    public String getTelefon() {
        return telefon;
    }

   
    public Adreca getDireccio() {
        return direccio;
    }
    public class ExceptionFalles extends Exception{
    public ExceptionFalles(String msg){
        super(msg);
    }

}
}
