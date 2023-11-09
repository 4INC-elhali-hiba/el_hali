/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package orologio;

/**
 *
 * @author Hiba
 */
public class Orologio {
    private int ora;
    private int minuti;
    private int secondi;

    public Orologio(int ora, int minuti, int secondi) {
        setOra(ora);
        setMinuti(minuti);
        setSecondi(secondi);
    }

    public int getOra() {
        return ora;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public final void setOra(int ora) {
        this.ora = ora;
    }

    public final void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public final void setSecondi(int secondi) {
        this.secondi = secondi;
    }
    
    public String dammiOrario(){
        return ora+" : "+minuti+" : "+secondi;
    }
    
    public String stampa(){
        return "\nClasse Orologio\nora: "+ora+"\nminuti: "+minuti+"\nsecondi: "+secondi;
    }
}
