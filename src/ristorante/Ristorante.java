package ristorante;
import java.util.Arrays;
/**
 *
 * @author Utente
 */
public class Ristorante {
    private Tavolo[] tavoli;
    private int capienza;
    
    public Ristorante(Tavolo[] t){
        this.tavoli=t;
        this.capienza=t.length;
    }
    
    public boolean siedi(){
        int i=0;
        boolean c=false;
        boolean ok=false;
        while(!c){
            if(tavoli[i].getNumPers()<tavoli[i].getCapienza()){
                c=true;
                ok=true;
            }else{
                i++;
                if(i==tavoli.length){
                    c=true;
                }
            }
        }
        return ok;
    }
    
    public boolean alzati(int numTav){
        boolean ok=true;
        if(numTav<=tavoli.length){
            tavoli[numTav-1].alzati();
        }
        return ok;
    }
    
    public int perSedute(){
        int tot=0;
        for(int i=0;i<tavoli.length;i++){
            tot+=tavoli[i].getNumPers();
        }
        return tot;
    }
    
    public boolean disdire(int numTav){
        boolean ok=false;
        if(tavoli[numTav-1].getPren()){
            tavoli[numTav-1].disdire();
            ok=true;
        }
        return ok;
    }
    
    public String prenotare(int numPers){
        int i=0;
        String t="";
        boolean ok=false;
        while(!ok){
            if(tavoli[i].getNumPers()==0){
                if(tavoli[i].getCapienza()>=numPers){
                    tavoli[i].prenotare();
                    ok=true;
                    t="\nTavolo numero: "+tavoli[i].getNumTav()+" prenotato";
                }
            }
            i++;
            if(i==tavoli.length){
                ok=true;
                t="\ntavolo non disponibile";
            }
        }
        return t;
    }
    
    public void aggiungiTav(Tavolo t){
        Tavolo[] tavolo=new Tavolo[tavoli.length+1];
        for(int i=0;i<tavoli.length;i++){
            tavolo[i]=new Tavolo(tavoli[i]);
        }
        tavolo[tavoli.length]=t;
        tavoli=tavolo;
    }
    
    public void togliTav(int numTav){
        Tavolo[] t=new Tavolo[tavoli.length];
        for(int i=0;i<t.length;i++){
            if(i<numTav){
                t[i]=new Tavolo(tavoli[i]);
            }else{
                t[i]=new Tavolo(tavoli[i+1]);
            }
        }
        t[t.length-1]=new Tavolo(tavoli[numTav-1]);
        tavoli=t;
    }

    public String stampa() {
        return "\nRistorante: \nTavoli: \n"+Arrays.toString(tavoli)+"\ncapienza: "+capienza;
    }
}

