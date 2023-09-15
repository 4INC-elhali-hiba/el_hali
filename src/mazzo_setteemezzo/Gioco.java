/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo_setteemezzo;

/**
 *
 * @author hiba.elhali
 */
public class Gioco {
    private Giocatore[] giocatori;
    private Mazzo mazzo;
    private int partiteG;
    
    public Gioco(int nGiocatore, String[] nomi, int nCarte, String[] info){
        giocatori=new Giocatore[nGiocatore];
        for(int i=0; i<giocatori.length; i++){
            giocatori[i]=new Giocatore(nomi[i], 0);
        }
        mazzo=new Mazzo(nCarte, info);
        copiaG();
    }
    
    private void copiaG(){
        Giocatore[] arrA = new Giocatore[giocatori.length];
        for(int i=0; i<arrA.length; i++){
            arrA[i]=giocatori[i];
        }
        giocatori=arrA;
    }
    
    
}
