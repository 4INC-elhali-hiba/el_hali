
package ristorante;

/**
 *
 * @author Utente
 */
public class Tavolo {
    private int capienza;
    private int numTav;
    private int numPers;
    private boolean pren;
    
    public Tavolo(int capienza,int numTav,int numPers, boolean pren){
        this.capienza=capienza;
        this.numTav=numTav;
        this.numPers=numPers;
        this.pren=pren;
    }
    
    public Tavolo(Tavolo t){
        this.capienza=t.getCapienza();
        this.numTav=t.getNumTav();
        this.numPers=t.getNumPers();
        this.pren=t.getPren();
    }

    public int getCapienza() {
        return capienza;
    }

    public int getNumTav() {
        return numTav;
    }

    public int getNumPers() {
        return numPers;
    }
    
    public boolean getPren(){
        return pren;
    }
    
    public void disdire(){
        pren=false;
    }
    
    public void prenotare(){
        pren=true;
    }
    
    public void siedi(){
        numPers++;
    }
    
    public void alzati(){
        numPers--;
    }

    public String stampa() {
        return "\nTavolo: "+numTav+"\nPersone sedute: "+numPers+"\nCapienza: "+capienza+"\nprenotazione: "+pren;
    }
    
}

