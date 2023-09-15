/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo_setteemezzo;
import java.util.Random;
/**
 *
 * @author hiba.elhali
 */
public class Mazzo {
    private Carta[] mazzo;
    private int dimL;
    
    public Mazzo(int nCarte, String[] info){
        mazzo=new Carta[nCarte*info.length];
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
                mazzo[dimL] = new Carta(carta, info[seme]);
                dimL++;
            }
        }
    }
    
    public String stampa(){
        String t="\nMazzoCarte: ";
        for(int i=0; i<dimL; i++){
            t+="\n"+"carte["+i+"]: "+mazzo[i].getCarta();
        }
        return t;
    }
}
