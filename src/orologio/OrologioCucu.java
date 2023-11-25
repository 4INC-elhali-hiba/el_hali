/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author Hiba
 */
public class OrologioCucu extends Orologio{
    private boolean accensione;

    public OrologioCucu(boolean accensione, int ora, int minuti, int secondi) {
        super(ora, minuti, secondi);
        this.accensione = accensione;
    }

    public boolean getAccensione() {
        return accensione;
    }
    
    public boolean accensioneC(boolean a){
        accensione=a;
        return accensione;
    }
    
    public String stampa(){
        return "\nClasse OrologioCucu"+"\nora: "+getOra()+"\nminuti: "+getMinuti()+"\nsecondi: "+getSecondi()+"\naccensione: "+accensione;
    }
}
