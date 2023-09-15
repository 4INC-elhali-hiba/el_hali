/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroBinario;

/**
 *
 * @author hiba.elhali
 */
public class NumeroBinario{

    private String numero; 

    public NumeroBinario(String numero) {
        this.numero=numero; 
    }

    public String getNumero() {
        return numero; 
    }

    public int decimale() {
        int numDec = 0; 
        for ( int i = 0; i < numero.length();i++){
            numDec += ((numero.charAt(i)-'0')*(int) Math.pow(2,i)); 
        }
        return numDec; 
    }

    public int classe (int indice) {
        int n = ((numero.charAt(indice)-'0') *(int) Math.pow(2,indice)) ;
        return n ; 
    }
    
    public String sommaBinario(String bin){
        String ris="";
        int rip=0;
        int c1;
        int c2;
        int s;
        for(int i=numero.length()-1; i>=0;i--){
            c1=numero.charAt(i)-'0';
            c2=bin.charAt(i)-'0';
            s=c1+c2+rip;
            rip=0;
            if(s>1){
                s-=2;
                rip=1;
            }
            ris=s+ris;
        }
        if(rip==1){
            ris=rip+ris;
        }
        return ris;
    }
    
    public String sottrazioneBinario(String bin){
        String ris="";
        int rip=0;
        int c1;
        int c2;
        int diff;
        for(int i=numero.length()-1; i>=0; i--){
            c1=numero.charAt(i)-'0';
            c2=bin.charAt(i)-'0';
            diff=c1-c2-rip;
            if(diff<0){
                diff+=2;
                rip=1;
            }
            ris=diff+ris;
        }
        return ris;
    }
}

