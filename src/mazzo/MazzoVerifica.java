/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mazzo;

/**
 *
 * @author hiba.elhali
 */
import java.util.Random;

/*mi sono accorta di aver aggiunto un metodo non necessario ovvero copiaInt()
 e di non aver cambiato il tipo dell'attributo nel costruttore che sarebbe dovuto essere String[]
ho inoltre tolto un parametro dal metodo shiftSx ed ho aggiunto il metodo stampa
*/
public class MazzoVerifica {
    private String[] nCarta;
    private String[] info;
    
    public MazzoVerifica(String[] carte, String[] info){
        this.nCarta=copiaStr(carte);
        this.info=copiaStr(info);
    }
    
    private String[] copiaStr(String[] arrP){
        String[] arrA=new String[arrP.length];
        for(int i=0; i<arrP.length; i++){
            arrA[i]=arrP[i];
        }
        return arrA;
    }
    
    private void shiftSx(int posP){
        String[] vett = new String[nCarta.length-1];
        for(int i=0; i<nCarta.length-1; i++){
            if(i>=posP){
                vett[i]=nCarta[i+1];
            }else{
                vett[i]=nCarta[i];
            }
        }
        nCarta=new String[vett.length];
        nCarta=vett;
    }
    
    public int cartePresenti(){
        return nCarta.length;
    }
    
    public String giraCarta(){
        String t="la prima carta e': ";
        int seme=nCarta[0].charAt(0)-'0';
        String temp=(nCarta[0].charAt(1)-'0')+""+(nCarta[0].charAt(2)-'0');
        int n=Integer.valueOf(temp);
        t+=n+" "+info[seme-1];
        return t;
    }
    
    public void eliminaCarta(){
        shiftSx(0);
    }
    
    public void estraiCarta(int indice){
        shiftSx(indice);
    }
    
    public String stampaMazzo(){
        String t="\n";
        for(int i=0; i<nCarta.length; i++){
            int seme=nCarta[i].charAt(0)-'0';
            String temp=(nCarta[i].charAt(1)-'0')+""+(nCarta[i].charAt(2)-'0');
            int n=Integer.valueOf(temp);
            t+=n+" "+info[seme-1]+"\n";
        }
        return t;
    }
    
    public String cercaCarta(int numero){
        String t="la carta con il numero inserito non e' presente nel mazzo\n";
        boolean trovato=false;
        for(int i=0; i<nCarta.length&&trovato==false; i++){
            String temp=(nCarta[i].charAt(1)-'0')+""+(nCarta[i].charAt(2)-'0');
            int n=Integer.valueOf(temp);
            if(n==numero){
                t="la carta con il numero indicato e' presente alla posizione: "+i+"\n";
                trovato=true;
            }
        }
        return t;
    }
    
    public void mescolaCarte(){
        int k;
        String temp;
        for(int c=0; c<30; c++){
            int n=nCarta.length+1;
            while(n<0||n>nCarta.length){
                Random rand=new Random();
                n=rand.nextInt(nCarta.length);
            }
            if(n+10>nCarta.length){
                k=nCarta.length-n;
                temp=nCarta[10-k];
                nCarta[10-k]=nCarta[n];
                nCarta[n]=temp;
            }else{
                temp=nCarta[n+10];
                nCarta[n+10]=nCarta[n];
                nCarta[n]=temp;
            }
        }
    }
    
    public String stampa(){
        String t="Classe Mazzo nCarta:";
        for(int i=0; i<nCarta.length; i++){
            t+="\nnCarta["+i+"]: "+nCarta[i];
        }
        t+="\n\nClasse Mazzo info:";
        for(int c=0; c<info.length; c++){
            t+="\ninfo["+c+"]: "+info[c];
        }
        return t;
    }
    
}
