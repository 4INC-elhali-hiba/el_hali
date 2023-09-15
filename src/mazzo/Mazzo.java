/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo;

import java.util.Random;


/**
 *
 * @author hiba.elhali
 */
public class Mazzo {
    private Carta[] carte;
    private int dimL;
    
    public Mazzo(int nCarte, String[] info){
        carte=new Carta[nCarte*info.length];
        caricaCarte(info.length, nCarte, info);
        
    }
    
    private void caricaCarte(int semi, int nCarte, String[] info){
        boolean[][] controllo=new boolean[semi][nCarte];
        Random rand=new Random();
        int carta;
        int seme;
        while (dimL < nCarte * semi) {
            carta = 1 + rand.nextInt(nCarte);
            seme = rand.nextInt(semi);
            if (!controllo[seme][carta-1]) {
                controllo[seme][carta-1] = true;
                carte[dimL] = new Carta(carta, info[seme]);
                dimL++;
            }
        }
    }
    
    private void shiftSx(int posP){
        for(int i=0; i<carte.length-1; i++){
            if(i>=posP){
                carte[i]=carte[i+1];
            }else{
                carte[i]=carte[i];
            }
        }
        dimL--;
    }
    
    public int cartePresenti(){
        return dimL;
    }
    
    public String giraCarta(){
        return"\nLa prima carta e': "+carte[0].getCarta();
    }
    
    public void eliminaCarta(){
        shiftSx(0);
    }
    
    public String estraiCarta(int indice){
        String t= "\nLa carta estratta e': "+carte[indice].getCarta();
        shiftSx(indice);
        return t;
    }
    
    public String stampaMazzo(){
        String t="";
        for(int i=0; i<carte.length; i++){
            t+=carte[i].getCarta()+"\n";
        }
        return t;
    }
    
    public String cercaCarta(int numero){
        String t="la carta con il numero inserito non e' presente nel mazzo\n";
        boolean trovato=false;
        for(int i=0; i<carte.length&&trovato==false; i++){
            int n=carte[i].getNumero();
            if(n==numero){
                t="la carta con il numero indicato e' presente alla posizione: "+i+"\n";
                trovato=true;
            }
        }
        return t;
    }
    
    public void mescolaCarta() {
        Random rand = new Random();
        int indice;
        for (int i = 0; i < dimL; i++) {
            indice = rand.nextInt(dimL);
            Carta memCarta = carte[indice];
            int in = (indice + 10) % dimL;
            carte[indice] = carte[in];
            carte[in] = memCarta;
        }
    }
    
    public String stampa(){
        String t="\nMazzoCarte: ";
        for(int i=0; i<dimL; i++){
            t+="\n"+"carte["+i+"]: "+carte[i].getCarta();
        }
        return t;
    }
}
