/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ristorante;

/**
 *
 * @author hiba.elhali
 */
public class Sala {
    private Tavolo[] tavoli;
    private int capienza;
    
    public Sala(Tavolo[] t){
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
    
    public String stampa() {
        String t="\nSala: \ncapienza"+capienza;
        for(int i=0;i<tavoli.length;i++){
            t+="\n"+tavoli[i].stampa();
        }
        return t;
    }
    
}
