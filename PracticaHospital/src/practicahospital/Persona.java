package practicahospital;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class Persona {
    public static final String TABLA_LETRA ="TRWAGMYFPDXBNJZSQVHLCKE";
    String nom;
    String cognom1;
    String cognom2;
    String numSegSocial;
    String nif;
    String telefon;
    String falles=" ";
    private Adreca direccio;
    
    public Persona(String nom,String cognom1,String cognom2,String numSegSocial,
            String nif, String telefon) throws Exception{
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.numSegSocial = numSegSocial;
        this.nif = nif;
        this.telefon = telefon;
        boolean alfabet_nom = comprobacioAlfabet(nom);
        boolean alfabet_cognom1 = comprobacioAlfabet(cognom1);
        boolean alfabet_cognom2 = comprobacioAlfabet(cognom2);
        boolean s_social = comprobacioSeguretatSocial(numSegSocial);
        boolean dni = verificarNif(Integer.parseInt(nif));
        boolean tlfn = verificarTelefon(telefon);
        try{
            

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
        }catch(Exception e){
            System.out.println(falles);
        }
        if(falles.length()>1){
            throw new Exception(falles); 
        }
       
    }
    
    public boolean comprobacioAlfabet(String frase) {
        Pattern regles = Pattern.compile("[a-zñl·l'çáéíóúàèòA-ZÑÇÁÉÍÓÚÀÈÒ]*");
        Matcher textAnalitzar = regles.matcher(frase);
        if (textAnalitzar.matches()==true){
            System.out.println("Frase "+frase +" correcta");
            return true;
        }
        return false;
    }
    
    public boolean comprobacioSeguretatSocial(String frase) throws Exception{
        Pattern regles = Pattern.compile("([0-4][1-9]|10|20|30|40|50|53|66)[\\s][0-9]{8}[\\s][0-9]{2}");
        Matcher textAnalitzar = regles.matcher(frase);
        if (textAnalitzar.matches()==true){
            System.out.println("Num. Seguretat Social "+frase +" correcta");
            return true;
        }
        return false;
    }
    
    public static String lletraDNI(int dni){
        return String.valueOf(dni)+TABLA_LETRA.charAt(dni%23);
    }
    
    public boolean verificarNif(int nif) throws Exception{
        boolean correcto = false;
        Pattern regles = Pattern.compile("[0-9]{8}[A-Z]");
        Matcher textAnalitzar = regles.matcher(lletraDNI(nif));
        if (textAnalitzar.matches() == true){
            System.out.print("Num NIF correcto ");
            System.out.println(lletraDNI(nif));
            return true;
        }
        return false;
    }
    
    public boolean verificarTelefon(String telefon) throws Exception{
        Pattern regles = Pattern.compile("\\+34[\\s][9][0-9]{8}");
        Matcher textAnalitzar = regles.matcher(telefon);
        if (textAnalitzar.matches() == true){
            System.out.println("Num Telefon "+telefon +" correcto");
            return true;
        }
        return false;
    }
    
}
