package istat;

/**
 *
 * @author Utente
 */
public class Istat1 {
    private Regione1[] regioni;
    
    public Istat1(String[] nome, double[][] valori, String[] info){
        regioni= new Regione1[nome.length];
        for(int i=0; i<nome.length; i++){
            regioni[i]= new Regione1(info, valori[i], nome[i]);
        }
    }
    
    public String maxBeneRegione(int indice){
        int iMaxC=regioni[indice].maxValore();
        String t="";
        t+="Regione: "+regioni[indice].getNome()+"\nmax costo: "+regioni[indice].getInfo()[iMaxC]+"\nprezzo: "+regioni[indice].getValori()[iMaxC];
        return t;
    }
    
    public String stampa(){
        String t ="";
        for(int i=0; i<regioni.length; i++){
            t+="Regione ["+i+"] "+regioni[i].stampa()+"\n";
        }
        return t;
    }
    
}
